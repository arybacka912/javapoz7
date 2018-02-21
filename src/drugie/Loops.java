package drugie;
import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        System.out.println("Hello world");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert number of elements to multiply");
        int n = scanner.nextInt();

        //loop

        for (int i = 0; i < n; i = i++) {
            int number = scanner.nextInt();
            if (number >= 5 && number <= 20) {
                System.out.println((i + 1) + ". Pow(" + number + ") = " + (number * number));
            } else {
                System.out.println("Number not supported. Upgrade to full version");
            }
            //i + 1 = kolejno numerowane liczby skrót i++ || i+=1 || i+=3
            System.out.println("End of program");

//        System.out.println("Inser 1 number");
//        int a = scanner.nextInt ();
//        System.out.println("Inser 2 number");
//        int b = scanner.nextInt();
//        System.out.println("Inser 3 number");
//        int c = scanner.nextInt();
//        System.out.println("Inser 4 number");
//        int d = scanner.nextInt();
//        System.out.println("Inser 5 number");
//        int e = scanner.nextInt();
//
//        System.out.println("Sum = " + (a + b + c + d + e));


        }
    }
}
