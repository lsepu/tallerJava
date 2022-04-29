package com.sofka.exercise13;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class thirteenExercise {
    public static void main(String[] args) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime currentDate = LocalDateTime.now();

        System.out.println(dateTimeFormatter.format(currentDate));
    }
}
