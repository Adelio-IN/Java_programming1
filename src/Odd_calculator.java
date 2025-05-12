import java.util.Scanner;

public class Odd_calculator
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("숫자를 입력하세요: ");
        int number = sc.nextInt();

        if (number <= 0) {
            System.out.println("양의 정수를 입력하세요.");
            return;
        }
        int sum = 0;

        for (int i = 1; i <= number; i++)
        {
            if (i % 2 != 0)
            {
                sum += i;
            }
        }
        System.out.println("홀수의 합: [" + sum + "]");
        sc.close();
    }
}