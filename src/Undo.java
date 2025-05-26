import java.util.Scanner;

public class Undo
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num1, num2, num3;

        System.out.println("숫자 1 입력: ");
        num1 = sc.nextInt();
        System.out.println("숫자 2 입력: ");
        num2 = sc.nextInt();
        System.out.println("숫자 3 입력: ");
        num3 = sc.nextInt();

        System.out.println(num1 - num2 - num3);
    }
}

