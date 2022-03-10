package HW81;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите сумму зп");
        String n = bufferedReader.readLine();
        System.out.println("Я зарабатываю " + n + " в час");
        System.out.println("Введите имя");

        String name = bufferedReader.readLine();
        System.out.println("Введите зп");
        n = bufferedReader.readLine();

        System.out.println("Введите количество лет");

        String count = bufferedReader.readLine();

        System.out.println("" + name + " будет получать " + n + " через " + count + " лет");


    }
}
