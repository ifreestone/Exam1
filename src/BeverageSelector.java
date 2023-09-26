import java.util.Scanner;
public class BeverageSelector {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please select a beverage: (1) Water, (2) Coke, (3) Coffee.");
        int selection = sc.nextInt();
        if (selection == 1) {
            System.out.println("You choose water.");
        } else if (selection == 2){
            System.out.println("You choose coke.");
        } else if (selection == 3){
            System.out.println("You choose coffee.");
        } else {
            System.out.println("Error");
        }
    }
}
