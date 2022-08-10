package epam.com.st.time;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Time time = new Time(13, 40, 05);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите час");
        int hour = scanner.nextInt();

        System.out.println("Введите минут");
        int minute = scanner.nextInt();

        System.out.println("Введите секунд");
        int second = scanner.nextInt();

        if (!time.validationOfInputValues(hour, minute, second)) {
            System.out.println("Wrong input time.");
            return;
        }

        time.timeChanges(hour, minute, second);
        System.out.println(time);
    }
}
