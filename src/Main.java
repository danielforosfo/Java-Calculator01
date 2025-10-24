import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean continu = true;
        Scanner sc = new Scanner(System.in);
        Operation op = new Operation();
        while (continu) {

            String answer = JOptionPane.showInputDialog("JAVA - CALCULATOR: \n" +
                    "-choose an operation-\n" +
                    "-------------------------\n" +
                    "|1| - add\n" +
                    "|2| - subtract\n" +
                    "|3| - multiply\n" +
                    "|4| - divide\n" +
                    "answer: \n");
            int answerr = Integer.parseInt(answer);
            String number1, number2;
            double result;
            switch (answerr) {
                case 1:

                    number1 = JOptionPane.showInputDialog("|add operation|\n" + "enter a number: ");
                    number2 = JOptionPane.showInputDialog("enter another number: ");
                    double dNumber1 = Double.parseDouble(number1);
                    double dNumber2 = Double.parseDouble(number2);
                    result = op.add(dNumber1, dNumber2);
                    JOptionPane.showMessageDialog(null, "|RESULT| = "
                            + result);
                    break;
                case 2:
                    number1 = JOptionPane.showInputDialog("|subtract operation|\n" + "enter a number: ");
                    number2 = JOptionPane.showInputDialog("enter another number: ");
                    double cNumber1 = Double.parseDouble(number1);
                    double cNumber2 = Double.parseDouble(number2);
                    result = op.subtract(cNumber1, cNumber2);
                    JOptionPane.showMessageDialog(null, "|RESULT| = "
                            + result);
                    break;
                case 3:
                    number1 = JOptionPane.showInputDialog("|multiply operation|\n" + "enter a number: ");
                    number2 = JOptionPane.showInputDialog("enter another number: ");
                    double aNumber1 = Double.parseDouble(number1);
                    double aNumber2 = Double.parseDouble(number2);
                    result = op.multiply(aNumber1, aNumber2);
                    JOptionPane.showMessageDialog(null, "|RESULT| = "
                            + result);
                    break;
                case 4:
                    number1 = JOptionPane.showInputDialog("|divide operation|\n" + "enter a number: ");
                    number2 = JOptionPane.showInputDialog("enter another number: ");
                    double bNumber1 = Double.parseDouble(number1);
                    double bNumber2 = Double.parseDouble(number2);
                    result = op.divide(bNumber1, bNumber2);
                    JOptionPane.showMessageDialog(null, "|RESULT| = "
                            + result);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "invalid option, try again!");

                    break;
            }
            String restart = JOptionPane.showInputDialog("Do you want to do another operation?\n" +
                    "|1| - yes\n" +
                    "|0| - No");
            int restartt = Integer.parseInt(restart);
            if (restartt == 0) {
                continu = false;
                break;

            } else if (restartt == 1) {


            } else {
                JOptionPane.showMessageDialog(null, "invalid option\n");
                break;

            }


        }
        JOptionPane.showMessageDialog(null,"PROGRAM CLOSED");
    }
}