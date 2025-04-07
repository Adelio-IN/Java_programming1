import java.util.Scanner;

public class Sub
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        double kor = 0;
        double eng = 0;
        double math = 0;
        double sci = 0;

        double sum = 0.0;

        int intAvg = 0;
        double doubleAvg = 0.0;

        boolean boolResult = false;

        kor = sc.nextDouble();
        eng = sc.nextDouble();
        math = sc.nextDouble();
        sci = sc.nextDouble();

        sum = kor + eng + math + sci;
        intAvg = (int)sum / 4;
        doubleAvg = (double)intAvg / 4;

        boolResult = intAvg == doubleAvg;

        System.out.println("총점은 " + sum + ", 평균은 " + intAvg + ", 평균 실수는 " + doubleAvg + ", 비교하면 " + boolResult + "입니다.");
    }
}
