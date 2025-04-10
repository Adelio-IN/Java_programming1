import java.util.Scanner;

public class Score
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int game_hour;
        game_hour = sc.nextInt();

        if (game_hour >= 4)
        {
            System.out.println("게임 중독입니다");
        }
        else
        {
            System.out.println("게임 중독이 아닙니다");
        }
    }
}
