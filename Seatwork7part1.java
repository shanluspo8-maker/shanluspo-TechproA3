public class Seatwork7part1 {

    public static void main(String[] args) {

        try {

            int yum = 10;
            int you = 0;

            int result = yum / you;   // This will cause ArithmeticException
            System.out.println(result);

        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        }

    }
}