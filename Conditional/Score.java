import java.util.Scanner;

public class Score
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("점수를 입력하세요.");
        int score = sc.nextInt();
        String Grade;

        if(score >= 90)
        {
            Grade = "A";
        }
        else if(score >= 80)
        {
            Grade = "B";
        }
        else if(score >= 70)
        {
            Grade = "C";
        }
        else if(score >= 60)
        {
            Grade = "D";
        }
        else
        {
            Grade = "F";
        }
        System.out.println("당신의 학점은 " + Grade + "입니다.");
    }
}
