import java.util.Scanner;

public class Library_Seat
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("좌석의 행 수를 입력하세요 : ");
        int row = sc.nextInt();

        System.out.println("좌석의 열 수를 입력하세요 : ");
        int col = sc.nextInt();

        int[][] seats = new int[row][col];

        while(true)
        {
            System.out.println("좌석을 예약하세요. (0 0 입력 시, 종료)");

            System.out.println("어떤 행의 좌석을 예약하실지 입력하세요 : ");
            int r = sc.nextInt();

            System.out.println("어떤 열의 좌석을 예약하실지 입력하세요 : ");
            int c = sc.nextInt();

            System.out.println("당신이 예약한 좌석은 " + r + "행 " + c + "열에 있습니다.");

            if (r == 0 && c == 0)
            {
                break;
            }
            if (r < 1 || r > row || c < 1 || c > col)
            {
                System.out.println("좌석 번호가 잘못 입력되었습니다. 다시 입력해주세요.");
                continue;
            }
            int rowIndex = r - 1;
            int colIndex = c - 1;

            if (seats[rowIndex][colIndex] == 1)
            {
                System.out.println("이미 사용중인 좌석입니다.");
            }
            else
            {
                seats[rowIndex][colIndex] = 1;
                System.out.println("예약 완료되었습니다.");
            }
        }
        System.out.println("\n=== 현재 좌석 배치도 (0: 빈 좌석, 1: 예약중) ===");
        for(int i = 0; i <row; i++)
        {
            for(int j = 0; j < col; j++)
            {
                System.out.print(seats[i][j] + " ");
            }
                System.out.println();
        }
    }
}
