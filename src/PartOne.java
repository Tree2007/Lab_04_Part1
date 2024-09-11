import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Variables
        int intOperandA = 10;
        int intOperandB = 5;
        int intSum;
        int intDifference;
        int intProduct;
        int intQuotient;
        int intModulo;
        double doubleOperandA = 1.5;
        double doubleOperandB = 5.67;
        double doubleSum;
        double doubleProduct;
        double doubleDifference;
        double doubleQuotient;
        double doubleModulo;

        //process of integers
        intSum = intOperandA + intOperandB;
        intDifference = intOperandA - intOperandB;
        intProduct = intOperandA * intOperandB;
        intQuotient = intOperandA / intOperandB;
        intModulo = intOperandA % intOperandB;
        //process of Doubles
        doubleSum = doubleOperandA + doubleOperandB;
        doubleProduct = doubleOperandA * doubleOperandB;
        doubleDifference = doubleOperandA - doubleOperandB;
        doubleQuotient = doubleOperandA / doubleOperandB;
        doubleModulo = doubleOperandA % doubleOperandB;

        //output of Integers
        System.out.println("The sum of ints " + intOperandA + " and " + intOperandB + " is " + intSum);
        System.out.println("The difference of ints " + intOperandA + " and " + intOperandB + " is " + intDifference);
        System.out.println("The product of ints " + intOperandA + " and " + intOperandB + " is " + intProduct);
        System.out.println("The quotient of ints " + intOperandA + " and " + intOperandB + " is " + intQuotient);
        System.out.println("The modular of ints " + intOperandA + " and " + intOperandB + " is " + intModulo);
        System.out.println("");
        break;
        //output of doubles
        System.out.println("The sum of doubles " + doubleOperandA + " and " + doubleOperandB + " is " + doubleSum);
        System.out.println("The difference of doubles " + doubleOperandA + " and " + doubleOperandB + " is " + doubleDifference);
        System.out.println("The product of doubles " + doubleOperandA + " and " + doubleOperandB + " is " + doubleProduct);
        System.out.println("The quotient of doubles " + doubleOperandA + " and " + doubleOperandB + " is " + doubleQuotient);
        System.out.println("The modular of doubles " + doubleOperandA + " and " + doubleOperandB + " is " + doubleModulo);


    }
}