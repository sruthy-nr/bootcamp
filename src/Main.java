import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int c,a,b,x;
        Scanner sc=new Scanner(System.in);
        do {
            System.out.println("MENU\n1.ADDITION\n2.SUBTRACTION\n3.MULTIPLICATION\n4.DIVISION\n5.EXIT");
            System.out.println("ENTER YOUR CHOICE:");
            c=sc.nextInt();
            switch (c){
                case 1:
                    System.out.println("ENTER 2 NUMBERS:");
                    a= sc.nextInt();
                    b= sc.nextInt();
                    x=a+b;
                    System.out.println(a+"+"+b+"="+x);
                    break;
                case 2:
                    System.out.println("ENTER 2 NUMBERS:");
                    a= sc.nextInt();
                    b= sc.nextInt();
                    x=a-b;
                    System.out.println(a+"-"+b+"="+x);
                    break;
                case 3:
                    System.out.println("ENTER 2 NUMBERS:");
                    a= sc.nextInt();
                    b= sc.nextInt();
                    x=a*b;
                    System.out.println(a+"*"+b+"="+x);
                    break;
                case 4:
                    System.out.println("ENTER 2 NUMBERS:");
                    float y= sc.nextFloat();
                    float z= sc.nextFloat();
                    float f=y/z;
                    System.out.println(y+"/"+z+"="+f);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice...Please Enter other choice... ");
                    break;
            }
        }while(c!=5);
    }
}
