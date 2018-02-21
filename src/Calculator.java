import com.sun.org.apache.xpath.internal.SourceTree;
import sun.plugin2.os.windows.SECURITY_ATTRIBUTES;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Calculator");
        // int firstValue = 5;
        // int secondValue = 10 ;

        Scanner reader = new Scanner(System.in);
        // int someValue = reader.nextInt();
        //System.out.println(someValue);

        //1. pobrać liczbę od użytkownika (2x liczby)
        System.out.println("Insert first value");
        int firstValue = reader.nextInt();
        System.out.println("Insert second value");
        int secondValue = reader.nextInt();

        //2. wykonać działania (4x działania)

        int addresult = firstValue + secondValue;
        int subtractResult = firstValue - secondValue;
        int multiplyResult = firstValue * secondValue;
        // potrzebujemy tego jako domyślną wartość by poza {} była też divideResult
        double divideResult = 0;
        // != 0 jest różne od zera
        // usunąć double lub int przed divide... wkleić wszędzie gdzie może być dzielenie przez 0
        if (secondValue != -0) {
            divideResult = (double) firstValue / secondValue;
        }

        ///3. wyświetlić wyniki

        System.out.println("add = " + addresult);
        System.out.println("subtract = " + subtractResult);
        System.out.println("multiply = " + multiplyResult);
        if (secondValue != 0) {
            System.out.println(" divide = " + divideResult);
        }
//4. ładne wyświetlenie wyników
        // 5 + 8 = 13
        // 5 - 8 = -3
        // 5 * 8 = 40
        // 5 / 8 = 0.625
        System.out.println("sum = " + (firstValue + secondValue));

        System.out.println(firstValue + " + " + secondValue + " = " + (firstValue + secondValue));
        System.out.println(firstValue + " - " + secondValue + " = " + (firstValue - secondValue));
        System.out.println(firstValue + " * " + secondValue + " = " + (firstValue * secondValue));
        if (secondValue != 0) {
            System.out.println(firstValue + " / " + secondValue + " = " + (firstValue / (double) secondValue));
        }

        //5. wyświetlić informację o liczbach
        // czy liczby sa równe firstValue == secondValue
        // wyświetlić większą liczbę firstValue  != secondValue
        //wyświetlić większą liczbę firstValue >= secondValue --> firstValue
        // wyświetlić większą liczbę firstValue <= secondValue --> secondValue
        // czy jest dzielenie z resztą
        // wyświetlić parzyste liczby
        if (firstValue == secondValue) {
            System.out.println("Values are equal");
        } else {
            System.out.println("Values are not equal");
        }
        // else to jest to samo co:  if (firstValue != secondValue){
        //            System.out.println("Values are not equal");
        //        }

        if (firstValue >= secondValue) {
            System.out.println("First value is bigger than second");
        } else if (firstValue < secondValue)
            System.out.println("Second value is bigger than first one");
        if (firstValue <= secondValue) {
            System.out.println("Second value is bigger than first one");
        } else {
            System.out.println("Value's are equal");
        }
        if (firstValue % secondValue != 0) {
            System.out.println("Liczby podzielne z resztą");
        } else {
            System.out.println("Liczby podzielne bez reszty");
        }
        if (firstValue % 2 == 0) {
            System.out.println("First value is even");
        } else {
            System.out.println("First value is odd");
        }
        if (secondValue % 2 == 0) {
            System.out.println("Second value is even");
        } else {
            System.out.println("Second value is odd");
        }



    }
}