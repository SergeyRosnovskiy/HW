package HW51;

public class Main {

    public static void main(String[] args) {

        System.out.println("sum");
        System.out.println(sum(10, 5));
        System.out.println("multy");
        System.out.println(multy(10, 5));
        System.out.println("subt");
        System.out.println(subt(10, 5));
        System.out.println("div");
        System.out.println(div(10, 3));
        System.out.println("convert");
        System.out.println(convert(10));
        System.out.println("percent");
        System.out.println(percent(11));
        print("test");
    }

    static int sum(int number1, int number2) {

        return number1 + number2;

    }
    static int multy(int number1, int number2) {

        return number1 * number2;
    }
    static int subt(int number1, int number2) {

        return number1 - number2;
    }
    static float div(int number1, int number2) {

        return (float)number1 / number2;
    }
    static float convert(int eurocount) {

        float course = 1.13f;
        return eurocount / course;
    }
    static float percent(int number) {

        return (float) (number + number * 0.1);
    }
    static void print(String text) {

        System.out.println(text);
        System.out.println(text);
        System.out.println(text);
        System.out.println(text);
    }
}
