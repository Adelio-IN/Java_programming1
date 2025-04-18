import java.util.Scanner;

public class Cafe
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("음료를 선택하세요: 1-아메리카노, 2-카페라떼, 3-카푸치노");
        int coffee = sc.nextInt();
        int price1 = 0;
        if(coffee == 1)
        {
            price1 = 3000;
        }
        else if(coffee == 2)
        {
            price1 = 4000;
        }
        else if(coffee == 3)
        {
            price1 = 4500;
        }
        else
        {
            System.out.println("존재하지 않는 항목입니다.");
        }

        System.out.println("크기를 선택하세요: 1-Small, 2-Medium, 3-Large");
        int size = sc.nextInt();
        int price2 = sc.nextInt();
        if (size == 1)
        {
            price2 = 0;
        }
        else if (size == 2)
        {
            price2 = 500;
        }
        else if (size == 3)
        {
            price2 = 1000;
        }
        else
        {
            System.out.println("존재하지 않는 항목입니다.");
        }

        System.out.println("옵션을 선택하세요: 1-기본, 2-샷추가, 3-시럽추가, 4-샷+시럽추가");
        int price3 = sc.nextInt();
        int option = sc.nextInt();
        if (option == 1)
        {
            price3 = 0;
        }
        else if (option == 2)
        {
            price3 = 500;
        }
        else if (option == 3)
        {
            price3 = 300;
        }
        else if (option == 4)
        {
            price3 = 800;
        }
        else
        {
            System.out.println("존재하지 않는 항목입니다.");
        }
        int finalPrice = price1 + price2 + price3;
        System.out.println("최종 결제하실 금액은 " + finalPrice + "원 입니다.");
    }
}
