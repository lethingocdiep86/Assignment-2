package assignment2;
import java.util.Scanner;
public class Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = scanner.nextInt();
        if(year % 4 == 0 && year /100 != 0 || year % 400 == 0){
            System.out.println(year + " la nam nhuan");
        }else{
            System.out.println(year + " La nam khong nhuan");
        }
    }
}
