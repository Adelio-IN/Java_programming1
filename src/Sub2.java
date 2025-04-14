import java.util.Scanner;

public class Sub2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int kor = sc.nextInt();
        int eng = sc.nextInt();
        int math = sc.nextInt();
        int sci = sc.nextInt();

        int totalSubjects = 4;

        int sum = kor + eng + math + sci;
        int intAvg = sum / totalSubjects;

        System.out.println("\n=== 형변환 없는 평균 계산 ===");
        System.out.println("총점: " + sum);
        System.out.println("정수 나눗셈 평균: " + intAvg);

        double doubleAvg = (double)sum / 4;

        System.out.println("\n=== 형변환을 사용한 평균 계산 ===");
        System.out.println("실수 나눗셈 평균: " + doubleAvg);
        System.out.println("소수점 둘째 자리까지: %.2f\n" + doubleAvg);

        System.out.println("\n=== 자료형 논리 비교 ===");
        System.out.println("정수 평균 == 실수 평균?" + (intAvg + doubleAvg));

        boolean boolResult = intAvg >= 80;
        System.out.println("평균 80점 이상 합격 여부: " + (boolResult ? "합격" : "불합격"));
    }
}