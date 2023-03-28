import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int hour;
        int minute;
        int result;

        Scanner read = new Scanner(System.in);
        Clock clock = new Clock();

        System.out.printf("Informe um valor para hora: \n");
        hour = read.nextInt();

        System.out.printf("Informe um valor para minuto: \n");
        minute = read.nextInt();

        result = clock.returnClockAngle(hour, minute);

        System.out.printf("O ângulo para a hora é: " + result);
    }
}
