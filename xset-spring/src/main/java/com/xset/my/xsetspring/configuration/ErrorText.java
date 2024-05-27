package com.xset.my.xsetspring.configuration;

import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.io.*;

@Component
public class ErrorText {

    private static String GET_ANSWER;
    private static String POST_ANSWER;

    public static String getGetAnswer() {
        return GET_ANSWER;
    }

    public static String getPostAnswer() {
        return POST_ANSWER;
    }

    @PostConstruct
    public void initGetAnswer() {
        try (InputStream inputStream = getClass().getResourceAsStream("/getAnswer.txt");
             BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {

            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                sb.append(line).append("\n");
            }

            GET_ANSWER = sb.toString();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @PostConstruct
    public void initPostAnswer() {
        try (InputStream inputStream = getClass().getResourceAsStream("/postAnswer.txt");
             BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {

            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                sb.append(line).append("\n");
            }

            POST_ANSWER = sb.toString();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
