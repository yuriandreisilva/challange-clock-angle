import java.util.Scanner;

class Clock {
    public static int halfAngle = 180;
    public static int fullAngle = 360;
    public static int totalMinutes = 60;
    public static int hourNotation24hours = 12;

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

    public static int returnClockAngle(int hour, int minute) {
        Clock clock = new Clock();

        int hourConverted = hour % hourNotation24hours;

        int h = clock.findPositionOfHourHand(hourConverted, minute);
        int m = clock.findPositionOfMinutesHand(minute);

        int angleDifference = clock.calculateAngleDifference(h, m);

        int angle = clock.considerShorterAngleAndReturnIt(angleDifference);

        return angle;
    }

    public static int findPositionOfHourHand(int hour, int minute) {
        return (hour * fullAngle) / hourNotation24hours;
        // + (minute * fullAngle) / (hourNotation24hours * totalMinutes);
    }

    public static int findPositionOfMinutesHand(int minute) {
        return (minute * fullAngle) / (totalMinutes);
    }

    public static int calculateAngleDifference(int hour, int minute) {
        return Math.abs(hour - minute);
    }

    public static int considerShorterAngleAndReturnIt(int angle) {
        if (angle > halfAngle) {
            angle = fullAngle - angle;
        }
        return angle;
    }
}