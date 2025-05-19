import java.util.Scanner;

public class negative_number
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int count = 0;

        System.out.println("점수를 입력하세요 (종료하려면 음수를 입력): ");
        int score;

        while(true)
        {
            if (sc.hasNextInt())
            {
                score = sc.nextInt();
            }
            else
            {
                System.out.println("정수를 입력해주세요.");
                continue;
            }

            if (score < 0)
            {
                break;
            }
            sum += score;
            count++;
        }

        if (count > 0)
        {
            System.out.println("점수의 총합은: [" + sum + "]");
        }
        else
        {
            System.out.println("입력된 점수가 없습니다.");
        }
        sc.close();
    }
}

