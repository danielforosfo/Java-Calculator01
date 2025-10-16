import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean continu = true;
        Scanner sc = new Scanner(System.in);
        while (continu) {
            System.out.println("-------------------------");
            System.out.print("JAVA - CALCULATOR: \n" +
                    "-choose an operation-\n" +
                    "-------------------------\n" +
                    "|1| - add\n" +
                    "|2| - subtract\n" +
                    "|3| - multiply\n" +
                    "|4| - divide\n" +
                    "answer: \n");
            int answer = sc.nextInt();
            double number1, number2, result;

            System.out.println("-------------------------");
            switch (answer) {
                case 1:
                    System.out.print("|add operation|\n");
                    System.out.print("enter a number: ");
                    number1 = sc.nextDouble();
                    System.out.print("enter another number: ");
                    number2 = sc.nextDouble();
                    result = number1 + number2;
                    System.out.println("|RESULT|\n"
                            +result);
                    break;
                case 2:
                    System.out.print("|subtract operation|\n");
                    System.out.print("enter a number: ");
                    number1 = sc.nextDouble();
                    System.out.print("enter another number: ");
                    number2 = sc.nextDouble();
                    result = number1 - number2;
                    System.out.println("|RESULT|\n"
                            +result);
                    break;
                case 3:
                    System.out.print("|multiply operation|\n");
                    System.out.print("enter a number: ");
                    number1 = sc.nextDouble();
                    System.out.print("enter another number: ");
                    number2 = sc.nextDouble();
                    result = number1 * number2;
                    System.out.println("|RESULT|\n"
                            +result);
                    break;
                case 4:
                    System.out.println("|divide operation|\n");
                    System.out.print("enter a number: ");
                    number1 = sc.nextDouble();
                    System.out.print("enter another number: ");
                    number2 = sc.nextDouble();
                    if (number2 == 0) {
                        System.out.println("cannot divide by zero!");
                    } else {
                        result = number1 / number2;
                        System.out.println("|RESULT|\n" +result);}
                    break;
                default:
                    System.out.println("invalid option");
                    break;
            }
            System.out.println("Do you want to do another operation?\n" +
                    "|1| - yes\n" +
                    "|0| - No");
            int restart = sc.nextInt();
            if ( restart == 0) {
                continu = false;
                break;

            } else if (restart == 1) {


            }else {
                System.out.println("invalid option\n");
                break;

            }


        }
        System.out.println("PROGRAM CLOSED");
        sc.close();
    }
}