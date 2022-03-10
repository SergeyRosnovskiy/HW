package HW91;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        String charnumber = reader.readLine();

//        int number1;
//        int number2;
//        int number3;
//
//        number1 = Integer.valueOf(charnumber);
//        charnumber = reader.readLine();
//        number2 = Integer.valueOf(charnumber);
//
//        System.out.println(Math.max(number1, number2));
//
//        number1 = Integer.parseInt(reader.readLine());
//        number2 = Integer.parseInt(reader.readLine());
//        number3 = Integer.parseInt(reader.readLine());
//
//        System.out.println(Math.min(Math.min(number1, number2), number3));
//
//        int[] numbers = new int[3];
//        number1 = Integer.parseInt(reader.readLine());
//        number2 = Integer.parseInt(reader.readLine());
//        number3 = Integer.parseInt(reader.readLine());
//
//        numbers[0] = number1;
//        numbers[1] = number2;
//        numbers[2] = number3;
//
//        Arrays.sort(numbers);
//
//        System.out.println(numbers[1]);

        int number = Integer.parseInt(reader.readLine());
        compare(number);

        number = Integer.parseInt(reader.readLine());
        compare(number);

        number = Integer.parseInt(reader.readLine());
        compare(number);

    }

    static void compare(int number) {

        if (number < 5) {
            System.out.println("Less than 5");
        } else if (number > 5) {
            System.out.println("More then 5");
        } else {
            System.out.println("Count 5");
        }
    }

}
