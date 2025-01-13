package assignment2;
import java.util.Scanner;
public class Exercise5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = scanner.nextInt();
        System.out.print("Enter b: ");
        int b = scanner.nextInt();
        System.out.print("Enter c: ");
        int c = scanner.nextInt();
        if(a>=b && a>=c){
            System.out.print(a + " la so lon nhat");
        }else if(b>=a && b>=c){
            System.out.print(b + " la so lon nhat");
        }else{
            System.out.print(c + " la so lon nhat");
        }
    }
}
