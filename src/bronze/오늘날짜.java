package bronze;

import java.util.*;

public class 오늘날짜 {
    public static void main(String[] args) {
        Calendar date = Calendar.getInstance();
        date.set(2015, 1,24);
        System.out.println(toString(date));
    }

    public static String toString(Calendar date) {
        return date.get(Calendar.YEAR) + "-" + date.get(Calendar.MONTH) + "-" + date.get(Calendar.DATE);
    }
}
