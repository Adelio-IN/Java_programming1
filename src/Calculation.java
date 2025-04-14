import java.util.Scanner;

public class Calculation
{
    public static void main(String[] args)
    {
        final double PI = 3.14;
        double radius = 10.0;
        double area = PI * radius * radius;

        System.out.println("반지름은 " + radius + " 넓이는 " + area + " 입니다.");
    }

    public static class Add2_2
    {
        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
            int num1;
            int num2;

            System.out.println("숫자1 입력:");
            num1 = sc.nextInt();
            System.out.println("숫자2 입력:");
            num2 = sc.nextInt();

            System.out.println(num1 + num2);
        }
    }

    public static class TypeCastingCalculator
    {
        public static void main(String[] args)
        {
            double doubleValue = 2.71828;

            System.out.println("\n=== double 형변환 ===");
            System.out.println("1. double -> byte: " + (byte)doubleValue);
            System.out.println("2. double -> short: " + (short)doubleValue);
            System.out.println("3. double -> int: " + (int)doubleValue);
            System.out.println("4. double -> long: " + (long)doubleValue);
            System.out.println("5. double -> float: " + (float)doubleValue);
        }
    }
}

