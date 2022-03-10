package HW31;

public class Main {

    public static void main(String[] args) {

        byte b = 2;
        short sh = 32767;
        char ch = 'g';
        int i = 2556;
        long l = 255655455L;
        float f = 1.4f;
        double d = 2.2;
        boolean boo = true;

        System.out.println(b);
        System.out.println(sh);
        System.out.println(ch);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(boo);

        int number1 = 10;
        int number2 = 18;
        int number3 = 21;

        int memory = number1;

        number1 = number2;
        number2 = number3;
        number3 = memory;

        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);

    }
}
