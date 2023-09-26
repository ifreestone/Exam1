import java.util.Scanner;

public class Summer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num = 1;
        double sum = 0;

        while (!(num == 0)){
            System.out.println("Please input a number (A zero(0) will sum inputted numbers and end the program): ");
            num = sc.nextDouble();
            sum = sum + num;
        }
        System.out.println(sum + " is your sum.");

    }
}
