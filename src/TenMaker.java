public class TenMaker {
    public static void main(String[] args) {
        int numberA = 6;
        int numberB = 5;

        String checker = makes10(numberA, numberB);
        if (checker.equals("true") ){
            System.out.println(numberA + " + " + numberB + " is equal to 10.");
        } else {
            System.out.println(numberA + " + " + numberB + " is not equal to 10.");
        }
    }

    public static String makes10(int numberA, int numberB) {
        if (numberA + numberB == 10) {
            return "true";
        } else {
            return "false";
        }
    }
}
