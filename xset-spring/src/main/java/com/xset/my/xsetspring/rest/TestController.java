package com.xset.my.xsetspring.rest;

import com.xset.my.xsetspring.configuration.ErrorText;
import com.xset.my.xsetspring.data.PostRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;

@RestController
@RequestMapping("/app/v1")
public class TestController {

    @GetMapping("getRequest")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<String> getRequest(@RequestParam Integer id, @RequestParam String name) throws InterruptedException {
        Objects.requireNonNull(id);
        Objects.requireNonNull(name);

        if (id > 10 && id < 50) {
            Thread.sleep(1000);
        } else {
            Thread.sleep(500);
        }

        if (id < 10 && name.length() < 5) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Invalid parameters");
        }

        String answer = ErrorText.getGetAnswer();
        answer = answer.replaceAll("\\{id}", String.valueOf(id));
        answer = answer.replaceAll("\\{name}", name);

        return ResponseEntity.ok(answer);
    }

    @PostMapping("postRequest")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<String> postRequest(@RequestBody PostRequest postRequest) {
        String name = postRequest.getName();
        String surname = postRequest.getSurname();
        if (surname == null || surname.isBlank()) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Invalid surname");
        }

        if (name == null || name.isBlank()) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Invalid name");
        }

        Integer age = postRequest.getAge();
        if (age == null) {
            age = 123;
        }

        Integer age2 = age * 2;
        String answer = ErrorText.getPostAnswer();
        answer = answer.replaceAll("\\{surname}", surname);
        answer = answer.replaceAll("\\{name}", name);
        answer = answer.replaceAll("\\{age}\\*2", String.valueOf(age2));
        answer = answer.replaceAll("\\{age}", String.valueOf(age));

        return ResponseEntity.ok(answer);
    }
}
