import java.util.Scanner;

public class Age_Or_Score
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int age;
        int score;

        age = sc.nextInt();
        score = sc.nextInt();

        if(age >= 20 && score >= 90)
        {
            System.out.println("사용자가 성인이면서 우수한 성적을 보유하고 있습니다.");
        }
        if(age <= 18 || score >= 80)
        {
            System.out.println("사용자가 미성년자이거나 탁월한 성적을 보유하고 있습니다.");
        }
        if(age <= 30)
        {
            System.out.println("사용자가 30세 미만입니다")
        }
    }
}
