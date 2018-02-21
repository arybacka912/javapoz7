import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class AgeChecker {
    public static void main(String[] args) {
// pobrali od usera liczbę - jego wiek
        // jeżeli wiek < 6 "powinieneś iść do przedszkola"
        // jeżeli wiek <12 "Powinieneś iść do podstawówki"
        //jeżeli wiek < 16 gimnazjum
        //jeżeli wiek,20 średnia
        //else uczelnia
        System.out.println("Age checker");

        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Insert your age:");
        int age = scanner.nextInt();

        if (age < 6) {
            System.out.println("Go to kindergarden");
        } else if (age < 12) {
            System.out.println("Go to primary school");
        }else if (age < 16) {
            System.out.println("Go to middle school");
        }else if (age < 20) {
            System.out.println("Go to high school");
        }else {
            System.out.println("Go to University");
        }
        // and &&    or ||
        //if (age >= 20 && age < 30) {
          //  System.out.println("Specyfic value");
      //  }
        //&& troszkke jak z mnożeniem
     //   if ( age >= 0 && (age < 18 || age >= 65)) {
    //}

        // ZADANIE
        //1. wyświetlić wiadomość "a" jeżeli wiek jest większy od 30 i podzielny przez 3
        if (age > 30 && age % 3 ==0 ) {
            System.out.println("A");
        }
        //2. wyświetlić wiadomość "b" jeżeli wiek jest mniejszy od 15 lub większy od 60 i wiek / 5 ma reszte 2
        if ((age < 15 || age > 60) && age % 5 == 2 ) {
            System.out.println("B");
        }





    }

}

