import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num1, num2, num3;

        String input = sc.nextLine();
        String[] value =  input.split(" ");
        num1 = Integer.parseInt(value[0]);
        num2 = Integer.parseInt(value[1]);
        num3 = Integer.parseInt(value[2]);

        System.out.println(num1 + num2 + num3);
    }
}

