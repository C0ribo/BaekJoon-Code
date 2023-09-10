package 브론즈;

import java.time.*;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalTime currentTime = LocalTime.now();

        String dayOfWeek = now.getDayOfWeek().toString(); // 요일
        String dayMonth = now.getMonth().toString(); // 달
        int dayOfMonth = now.getDayOfMonth();// 날짜
        int year = now.getYear();

        System.out.println(dayOfWeek+ " " + dayMonth + " " + dayOfMonth +" " +
                currentTime + " " + year);
    }
}

