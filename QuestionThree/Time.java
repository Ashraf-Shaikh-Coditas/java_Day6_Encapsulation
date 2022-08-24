package Week2.Day6.QuestionThree;

public class Time {
    final int MAX_HOURS = 23;
    final int MAX_MIN_SECS = 59;

    private int hour;    // current hour in military time
    private int minute;  // current minute in military time
    private int second;  // current second in military time

    // set the time to the time specified by the parameters
//    void setTime (int newHour, int newMinute, int newSecond) {
//        hour = newHour;
//        minute = newMinute;
//        second = newSecond;
//    }

    public Time() {
        this.hour = 23;
        this.minute = 59;
        this.second = 59;
    }

    void setTime(int newHour, int newMinute, int newSecond) {
        if (newHour >= 0 && newHour <= MAX_HOURS) {
            hour = newHour;
        }
        else {
            System.out.println("Error: hour must be between 0 and 23 inclusive");
            hour = 0;
        }

        if (newMinute >= 0 && newMinute <= MAX_MIN_SECS) {
            minute = newMinute;
        }
        else {
            System.out.println("Error: minute must be between 0 and 59 inclusive");
            minute = 0;
        }

        if (newSecond >= 0 && newSecond <= MAX_MIN_SECS) {
            second = newSecond;
        }
        else {
            System.out.println("Error: second must be between 0 and 59 inclusive");
            second = 0;
        }
    }

    // return the time to the calling method in a three-membered array
    int[] getTime() {
        return new int[] {hour, minute, second};
    }

    // increment the current time by one second
    void incrementTime() {
        ++second;
    }
}
