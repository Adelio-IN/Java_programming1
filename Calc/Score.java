import java.util.Scanner;

public class Score
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int my_score;
        my_score = sc.nextInt();

        if (my_score >= 60)
        {
            System.out.println("PASS");
        }
        else
        {
            System.out.println("NONE-PASS");
        }
    }
}
