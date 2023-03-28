class Clock {
    public static int halfAngle = 180;
    public static int fullAngle = 360;
    public static int totalMinutes = 60;
    public static int hourNotation24hours = 12;

    public static int returnClockAngle(int hour, int minute) {
        Clock clock = new Clock();

        int hourConverted = hour % hourNotation24hours;

        int h = clock.findPositionOfHourHand(hourConverted);
        int m = clock.findPositionOfMinutesHand(minute);

        int angleDifference = clock.calculateAngleDifference(h, m);

        int angle = clock.considerShorterAngleAndReturnIt(angleDifference);

        return angle;
    }

    public static int findPositionOfHourHand(int hour) {
        return (hour * fullAngle) / hourNotation24hours;
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