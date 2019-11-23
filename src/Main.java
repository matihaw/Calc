import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static float scanFloat(Scanner scanner) {
        try {
            return scanner.nextFloat();
        }catch(InputMismatchException e) {
            System.out.println("Nie podales liczby!");
            System.out.println("Przechwycono wyjatek: " + e);
            return scanFloat(new Scanner(System.in));
        }
    }

    public static int scanInt(Scanner scanner) {
        try {
            return scanner.nextInt();
        }catch(InputMismatchException e) {
            System.out.println("Nie podales liczby!");
            System.out.println("Przechwycono wyjatek: " + e);
            return scanInt(new Scanner(System.in));
        }
    }

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczby do kalkulatora");
        Kalkulator kalkulator = new Kalkulator(scanFloat(scanner),scanFloat(scanner));
        boolean loopVariable = true;
        while (loopVariable){
            System.out.println("1 - Dodawanie");
            System.out.println("2 - Odejmowanie");
            System.out.println("3 - Mnozenie");
            System.out.println("4 - Dzielenie");
            System.out.println("5 - Potega");
            System.out.println("6 - Pierwiastek");
            System.out.println("7 - Zmien liczby");
            System.out.println("8 - Wyjscie z kalkulatora");
            switch (scanInt(scanner)){
                case 1: {
                    System.out.println("Wynik: " + kalkulator.addition());
                    break;
                }
                case 2: {
                    System.out.println("1: Odejmowanie liczby 1 od liczby 2");
                    System.out.println("2: Odejmowanie liczby 2 od liczby 1");
                    System.out.println("Wynik: " + kalkulator.substract(scanInt(scanner)));
                    break;
                }
                case 3: {
                    System.out.println("Wynik:" + kalkulator.multiplication());
                    break;
                }
                case 4:{
                    System.out.println("1: Dzielenie liczby 1 od liczby 2");
                    System.out.println("2: Dzielenie liczby 2 od liczby 1");
                    System.out.println("Wynik: " + kalkulator.division(scanInt(scanner)));
                    break;
                }
                case 5:{
                    System.out.println("1: Potega liczby 1");
                    System.out.println("2: Potega liczby 2");
                    System.out.println("Podaj wykladnik poegi");
                    System.out.println("Wynik: " +  kalkulator.power(scanInt(scanner), scanInt(scanner)));
                    break;
                }
                case 6:{
                    System.out.println("1: Pierwiastek z liczby 1");
                    System.out.println("2: Pierwiastek z liczby 2");
                    System.out.println("Wynik: " + kalkulator.sqrt(scanInt(scanner)));
                    break;
                }
                case 7:{
                    kalkulator = new Kalkulator(scanFloat(scanner), scanFloat(scanner));
                    break;
                }
                case 8:{
                    System.out.println("Dziekuje za uzywanie kalkulatora firmy: \"XY\"");
                    loopVariable=false;
                    scanner.close();
                    break;
                }
                default:{
                    System.out.println("bledne liczby");
                    break;
                }
            }
        }
    }
}
