class Clock {
    public int halfAngle = 180;
    public int fullAngle = 360;
    public int totalMinutes = 60;
    public int hourNotation24hours = 12;

    public int returnClockAngle(int hour, int minute) {
        int hourConverted = hour % hourNotation24hours;

        int h = findPositionOfHourHand(hourConverted);
        int m = findPositionOfMinutesHand(minute);
        int angleDifference = calculateAngleDifference(h, m);

        return considerShorterAngleAndReturnIt(angleDifference);
    }

    public int findPositionOfHourHand(int hour) {
        return (hour * fullAngle) / hourNotation24hours;
    }

    public int findPositionOfMinutesHand(int minute) {
        return (minute * fullAngle) / (totalMinutes);
    }

    public int calculateAngleDifference(int hour, int minute) {
        return Math.abs(hour - minute);
    }

    public int considerShorterAngleAndReturnIt(int angle) {
        if (angle > halfAngle) {
            angle = fullAngle - angle;
        }
        return angle;
    }
}