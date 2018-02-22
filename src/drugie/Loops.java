package drugie;
import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {


        //0. wyświetlić n kolejnych liczb (0,1,2,3,4,5,6...)
        System.out.println("Liczby kolejno n");
        int n = 4;
        for (int i = 0; i < n; i++) {
            System.out.println(i);
        }
        //i ++ = i+1, i+1+1 ...
        //1. wyświetlić kolejnych n liczb *2 (2,4,6,8,...)
        System.out.println("n liczby * 2");
        for (int i = 0; i < n; i++) {
            System.out.println(2 * (i + 1));
        }

        // || for (int i = 0; i < 2 * n; i += 2)
        // System.out.println(i + 2);


        // || for (int i = 2; i <= 2 * n; i += 2)
        //System.out.println(i);


        //2. wyświetlić tylko parzyste liczby od 1 do n włącznie
        System.out.println("Parzyste liczby");
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                System.out.println(i + 2);
            }
            // ||  for (int i = 1; i < n + 1; i++) {
            //        if ( i % 2 == 0 ) {
            //            System.out.println(i);

            // ||  for (int i = 0; i < n + 1; i += 2) {
            //       {System.out.println(i);

            // ||  for (int i = 2; i <= n + 1; i += 2) {
            //       {System.out.println(i);

            //3. wyświetlić tylko liczby podzielne przez 3
        }
            System.out.println("liczby podzielne przez 3");
            for (int i = 0; i < n; i ++) {
            if ( i != 0 && i % 3 == 0) {
                System.out.println(i);
            }
            }
            // 4. wyświetlić n litera "a"
            for (int i = 0; i < n; i ++) {
                System.out.println("a");
                // 0 1 2 3 system.out.print(i + " " )
            }
            //5. wyświetlić kwadraty kolejnych liczb
            for (int i = 0; i < n; i ++) {
                System.out.println(i * i);
            }
            //*. obliczyć kolejne sumy n liczb (1 + 2 + 3 + 4 + ... )
        System.out.println(" Suma n kolejnych liczb");
        int addresult = 0;

        for (int i=0; i < n ; i ++) {
            if ((i != 0) && (i + 1) != n) {
                System.out.print((i + 1) + " + ");
            }else if ((i == 0) && ( i + 1 ) != n ){

                System.out.print((i + 1) + " + ");
            } else {
                System.out.print( (i + 1) + " = ");
            }
            addresult += (i + 1);
        }System.out.print( addresult);
          //  System.out.println(firstValue + " + " + secondValue + " = " + (firstValue + secondValue));


            // System.out.println(i + " + " + (i + 1) + " = " + (i + ( i + 1 )));
        }




    private static void forLoopExample() {
        System.out.println("Hello world");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert number of elements to multiply");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i = i++) {
            int number = scanner.nextInt();
            if (number >= 5 && number <= 20) {
                System.out.println((i + 1) + ". Pow(" + number + ") = " + (number * number));
            } else {
                System.out.println("Number not supported. Upgrade to full version");
            }
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
