public class Clock {
    private int halfAngle = 180;
    private int fullAngle = 360;
    private int totalMinutes = 60;
    private int hourNotation24hours = 12;

    public int returnClockAngle(int hour, int minute) {
        int hourConverted = hour % hourNotation24hours;

        int h = findPositionOfHourHand(hourConverted);
        int m = findPositionOfMinutesHand(minute);
        int angleDifference = calculateAngleDifference(h, m);

        return considerShorterAngleAndReturnIt(angleDifference);
    }

    private int findPositionOfHourHand(int hour) {
        return (hour * fullAngle) / hourNotation24hours;
    }

    private int findPositionOfMinutesHand(int minute) {
        return (minute * fullAngle) / (totalMinutes);
    }

    private int calculateAngleDifference(int hour, int minute) {
        return Math.abs(hour - minute);
    }

    private int considerShorterAngleAndReturnIt(int angle) {
        if (angle > halfAngle) {
            angle = fullAngle - angle;
        }
        return angle;
    }
}