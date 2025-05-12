import java.util.Scanner;

public class switch1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int score;
        String Grade;

        System.out.println("점수를 입력하세요");
        score = sc.nextInt();

        switch(score/10)
        {
            case 10:
                Grade = "A";
                break;
            case 9:
                Grade = "A";
                break;
            case 8:
                Grade = "B";
                break;
            case 7:
                Grade = "C";
                break;
            case 6:
                Grade = "D";
                break;
            default:
                Grade = "F";
        }
        System.out.println("당신의 학점은 " + Grade + "입니다");
    }
}
