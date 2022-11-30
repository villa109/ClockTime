/**
 * Name:  Joseph Villalobos (villaloj)
 * Course:  CSCI-241 - Computer Science I
 * Section: 002
 * Assignment: 9
 * 
 * Project/Class Description:
 * This class will create instantiable Java class that keeps track of information for a clock time.
 * Known Bugs:  none.
 */

public class ClockTime
{
    // Instance variables
    private int hour;
    private int minute;
    private int second;

    // Constructor with no parameters
    /**
     * Constructor for objects of class ClockTime
     */
    public ClockTime()
    {
        // Initialise instance variables
        hour = 0;
        minute = 0;
        second = 0;

    }

    // Contructor with parameters and additional checking
    public ClockTime(int h, int m, int s)
    {
        // initialise instance variables
        hour = h;
        minute = m;
        second = s;

        if(second > 59){
            second = (second % 60);
            minute = minute + (second / 60);

        }    else if (second < 0)
            second = 0;

        if(minute > 59){
            minute = (minute % 60);
            hour = hour + (minute /60);

        }   else if (minute < 0)
            minute = 0;

        if(hour > 24){
            hour = (hour % 24);

        } else if (hour < 0)
            hour = 0;
    }

    // Return hour
    public int getHour()
    {
        return hour;
    }

    // Return minute
    public int getMinute()
    {
        return minute;
    }

    // Return second
    public int getSecond()
    {
        return second;
    }

    // Set second to new second along with condition checks
    public void setHour(int hh)
    {
        hour = hh;

        if(hour > 24){
            hour = (hour % 24);

        } else if (hour < 0)
            hour = 0;
    }

    // Set minute to new minute along with condition checks
    public void setMinute(int mm)
    {
        minute = mm;

        if(minute > 59){
            minute = (minute % 60);
            hour = hour + (minute /60);

        }   else if (minute < 0)
            minute = 0;
    }

    // Set second to new second along with condition checks
    public void setSecond(int ss)
    {
        second = ss;

        if(second > 59){
            second = (second % 60);
            minute = minute + (second / 60);

        }    else if (second < 0)
            second = 0;
    }

    // 24 hour clock format
    public String toString(){
        String twentyFourString = String.format("%02d:%02d:%02d",hour, minute ,second);
        return twentyFourString;
    }

    // 12 hour clock format including A.M./P.M.
    public String toString12(){
        String twelveString = String.format("%02d:%02d:%02d %s",((hour == 0 || hour == 12)?12:hour%12), minute, second, (hour < 12? "A.M.": "P.M."));

        return twelveString;
    }

    // Advances time by 20,000 seconds 
    public void advance(int advanceSeconds){
        int tempSecond = advanceSeconds + second;
        second = tempSecond % 60;

        int tempMinute = tempSecond / 60;
        minute += tempMinute % 60;

        int tempHour = tempMinute /60;
        hour += tempHour % 60;
    }

    // Checks if clock1 now equals clock2 after adujustment
    public boolean equals(ClockTime clock2){
        return (hour == clock2.hour) 
        && (minute == clock2.minute) 
        && (second == clock2.second);
    }
}