import java.util.Scanner;

public class Main
{
    int radius;

    public void setRadius(int r)
    {
        radius = getRadius();
    }
    public int getRadius()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("반지름 값을 지정하세요: ");
        return sc.nextInt();
    }
    public double calculateArea()
    {
        return 3.14 * radius * radius;
    }
    public void printCircleInfo()
    {
        System.out.println("반지름 : " + radius);
        System.out.println("넓이 : " + calculateArea());
    }
    public static void main(String[] args)
    {
        Main main = new Main();
        main.setRadius(5);
        main.printCircleInfo();
    }
}

