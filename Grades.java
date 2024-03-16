import java.util.Scanner;
public class Color{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int p=sc.nextInt();
        int c=sc.nextInt();
        int b=sc.nextInt();
        int m=sc.nextInt();
        int cs=sc.nextInt();
        int tot=p+c+b+m+cs;
        double percentage=(tot/500.0)*100;
        if(percentage>=90){
            System.out.println("Grade A");
        }
        else if(percentage>=80){
          System.out.println("Grade B");
        }
         else if(percentage>=70){
             System.out.println("Grade C");
         }
          else if(percentage>=60){
              System.out.println("Grade D");
          }
           else if(percentage>=40){
               System.out.println("Grade E");
           }
           else{
               System.out.println("Grade F");
           }
    }
}