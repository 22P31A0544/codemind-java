import java.util.Scanner;
public class Second{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Double kmph = sc.nextDouble();
        Double mps = kmph*5/18;
        System.out.printf("%.2f",mps);
    }
}