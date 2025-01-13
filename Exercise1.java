package assignment2;
import java.util.Scanner;
public class Exercise1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter x: ");
        int x = scanner.nextInt();
        if(x % 2 == 0){
            System.out.println(x + " la so chan ");
        }else{
            System.out.println(x + " la so le ");
        }
    }
}
