package Week2.Day6.QuestionThree;

public class Main {
    public static void main(String[] args) {
        Time currTime = new Time();  // object that stores the current time
        int hr;         // current hour obtained from currTime
        int min;        // current minute obtained from currTime
        int sec;        // current second obtained from currTime

        int[] temp;		// for using getTime()

//        currTime.setTime(20, 15, 43);
//        currTime.setTime(-55, 99, 1025);
        currTime.setTime(23, 59, 59);
        temp = currTime.getTime();
        hr = temp[0];
        min = temp[1];
        sec = temp[2];

        System.out.println(
                "The current military time is set to: "
                        + hr + ":" + min + ":" + sec
        );


        currTime.incrementTime();
        temp = currTime.getTime();
        hr = temp[0];
        min = temp[1];
        sec = temp[2];

        System.out.println(
                "After incrementing the time, the current military time is: "
                        + hr + ":" + min + ":" + sec
        );


//        currTime.hour = 31;
//        currTime.minute = -10;
//        currTime.second = 450;
//
//        temp = currTime.getTime();
//        hr = temp[0];
//        min = temp[1];
//        sec = temp[2];
//
//        System.out.println(
//                "After direct assignment, the current military time is: "
//                        + hr + ":" + min + ":" + sec
//        );

    }
}
/*
Q1:Type Program 1 above into the 2 separate files specified by the header comments.
 Compile and run the program.
Q2:Look at the output. Does it make sense? Why or why not?

OUTPUT :
The current military time is set to: 20:15:43
After incrementing the time, the current military time is: 20:15:44

 Getters and setters are used but are of no use as instance variables are declared as public .
 This doesn,t make any sense.

*/

/*


Q3.Change the call to currTime.setTime() in main.java to the following:
currTime.setTime(-55, 99, 1025);
Compile and run the program.
Q4.Look at the new output. Does it make sense? Why or why not?

OUTPUT:
The current military time is set to: -55:99:1025
After incrementing the time, the current military time is: -55:99:1026

This doesn,t make any sense because any how time can never be negative .
So , it should not be accepted.
* */

/*
Q5. Add the following lines to Main.java just before the end of the main() method:
		currTime.hour = 31;
		currTime.minute = -10;
		currTime.second = 450;

		temp = currTime.getTime();
		hr = temp[0];
		min = temp[1];
		sec = temp[2];

		System.out.println(
				"After direct assignment, the current military time is: "
						+ hr + ":" + min + ":" + sec
				);
Compile and run the program.
Q6. Look at the last line of output. Does it make sense? Why or why not?

OUTPUT:
The current military time is set to: -55:99:1025
After incrementing the time, the current military time is: -55:99:1026
After direct assignment, the current military time is: 31:-10:450

Here as instance variables are set as public . They are directly modified using instance of Class.
So, this doesn,t make any sense.
* */

/*


Q7.We need to fix the problem caused by declaring the data in the Time class as public.
Change Time.java to make the 3 data declarations private. Compile the program. What happens? Why?
Q8.Remove the lines that were added to Main.java in step 5 above. Compile and run the program.

OUTPUT:
Error: hour must be between 0 and 23 inclusive
Error: minute must be between 0 and 59 inclusive
Error: second must be between 0 and 59 inclusive
The current military time is set to: 0:0:0
After incrementing the time, the current military time is: 0:0:1

This makes sense because condition for max values for hours and minutes is satisfied after making above
changes .

 */

/*

/*
Q9. Now, let’s fix the setTime() method. Change it as shown below:
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
Compile and run the program.

10.Why is this version of the setTime() method more secure than the previous version?
11.Look at the new output. Does it make sense? Why or why not?
12.Change the call to currTime.setTime() in Main.java to the following:
currTime.setTime(23, 59, 59);
Compile and run the program.
13.Look at the new output. Does it make sense? Why or why not?

OUTPUT :
The current military time is set to: 23:59:59
After incrementing the time, the current military time is: 23:59:60


 This version is more secure as instance variables cannot be changed directly as they are made private .
And can be only accessed using getters and setters.
 */


