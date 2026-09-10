public class Switch{
    public static void main(String[] args){
        int a = 30;
        int b = 6;
        int choice = 3;

        switch (choice){

            case 1:
                System.out.println("Addition = " + (a + b));
                break;

            case 2:
                System.out.println("Subtraction = " + (a - b));
                break;

            case 3:
                System.out.println("Multiplication = " + (a * b));
                break;

            case 4:
                System.out.println("Division = " + (a / b));
                break;

            case 5:
                System.out.println("Remainder = " + (a % b));
                break;

            default:
                System.out.println("Invalid choice");
        }
    }
}