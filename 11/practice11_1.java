import java.util.Scanner;

public class practice11_1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        while (true)
        {
            System.out.print("1부터 100 사이의 숫자를 입력하세요: ");

            if (sc.hasNextInt())
            {
                int number = sc.nextInt();

                if (number >= 1 && number <= 100)
                {
                    System.out.println("입력 완료! 프로그램을 종료합니다.");
                    break;
                }
                else
                {
                    System.out.println("⚠️ 입력된 숫자가 범위를 벗어났습니다. 다시 시도하세요.");
                }
            }
        }
        sc.close();
    }
}