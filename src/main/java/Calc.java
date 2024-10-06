import java.util.Scanner;
public class Calc {
    public static void main(String[] args){

        Scanner scan1 = new Scanner(System.in);

        // Display
        System.out.println("Please enter a number: ");
        // Read user input
        double num1 = scan1.nextDouble();
        // Display user input
        System.out.println("You entered" + num1);

        System.out.println("Please enter a second number");
        double num2 = scan1.nextDouble();
        System.out.println("You entered" + num2);

        System.out.println("Choose an operation (add, subtract, multiply, divide): ");
        // Reads user input
        String Operation = scan1.next();

        // If user inputs 0 and divide an error pops up and the program ends
        if (num2 == 0 && Operation.equals("divide")) {
            System.out.println("Warning");
            System.exit(0);
        }

        boolean validOperation = true;
        // finds what operation is and assigns the correct case
        double result = switch (Operation) {

            case "add" -> {
                add(num1,num2);
            }

            case "subtract" -> {
                subtract(num1,num2);
            }

            default -> {
                System.out.println("Invalid operation");
                yield 0;
            }
        };

    }
            public static void add(double num1, double num2){
             double ADD = num1 + num2;
             System.out.println("The total is "+ ADD);
        }

        public static void subtract(double num1, double num2){
        double SUB = num1 - num2;
        System.out.println("The total is "+ SUB);
        }

}
