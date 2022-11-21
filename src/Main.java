import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int c;
        Scanner sc=new Scanner(System.in);
        do {
            System.out.println("MENU\n1.ADDITION\n2.SUBTRACTION\n3.MULTIPLICATION\n4.DIVISION");
            System.out.println("ENTER YOUR CHOICE:");
            c=sc.nextInt();
        }while(c!=4);
    }
}
