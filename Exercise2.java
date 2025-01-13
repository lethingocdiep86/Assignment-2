package assignment2;
import java.util.Scanner;
public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Math score: ");
        double Math = scanner.nextDouble();
        System.out.print("Enter Physics score: ");
        double Physics = scanner.nextDouble();
        System.out.print("Enter Chemistry score: ");
        double Chemistry = scanner.nextDouble();
        double averageScore = (Math + Physics + Chemistry)/3;
        if(averageScore >= 8){
            System.out.println("Exellent");
        }else if(averageScore >= 6.5 && averageScore < 8){
            System.out.println("Good");
        }else if(averageScore >= 5 && averageScore < 6.5){
            System.out.println("Average");
        }else{
            System.out.println("Poor");
        }
    }
}
