import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int hour;
        int minute;
        int result;

        Clock clock = new Clock();
        Scanner read = new Scanner(System.in);

        System.out.printf("Informe um valor para hora: \n");
        hour = read.nextInt();

        while (hour < 0 || hour > 12) {
            System.out.println("Por favor, informe um valor entre 0 e 12, para hora: ");
            hour = read.nextInt();
        }

        System.out.printf("Informe um valor para minuto: \n");
        minute = read.nextInt();

        while (minute < 0 || minute > 60) {
            System.out.println("Por favor, informe um valor entre 0 e 60, para minuto: ");
            minute = read.nextInt();
        }

        result = clock.returnClockAngle(hour, minute);

        System.out.printf("O ângulo para a hora é: " + result + "º graus.");
    }
}
