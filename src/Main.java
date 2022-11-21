import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int c,a,b,x;
        Scanner sc=new Scanner(System.in);
        do {
            System.out.println("MENU\n1.ADDITION\n2.SUBTRACTION\n3.MULTIPLICATION\n4.DIVISION");
            System.out.println("ENTER YOUR CHOICE:");
            c=sc.nextInt();
            switch (c){
                case 1:
                    System.out.println("ENTER 2 NUMBERS:");
                    a= sc.nextInt();
                    b= sc.nextInt();
                    x=a+b;
                    System.out.println(a+"+"+b+"="+x);
                case 2:
                    System.out.println("ENTER 2 NUMBERS:");
                    a= sc.nextInt();
                    b= sc.nextInt();
                    x=a-b;
                    System.out.println(a+"-"+b+"="+x);
                case 3:
                    System.out.println("ENTER 2 NUMBERS:");
                    a= sc.nextInt();
                    b= sc.nextInt();
                    x=a*b;
                    System.out.println(a+"*"+b+"="+x);
            }
        }while(c!=4);
    }
}
