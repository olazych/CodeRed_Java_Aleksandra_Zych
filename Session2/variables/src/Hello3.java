import java.sql.SQLOutput;

public class Hello3 {
    public static void main (String[] args){
        String firstLine;
        firstLine = "Hello, again!";
        System.out.println(firstLine);
        double hour, minute;
        hour = 11;
        minute = 59;
        System.out.print( "The current time is ");
        System.out.print(hour);
        System.out.print(":");
        System.out.print(minute);
        System.out.println(".");

        System.out.println(minute/60);

        int numHours =3;
        int numMinutes = 24;
        int seconds;
        seconds = (numHours*60*60) + (numMinutes *60);

        System.out.println("Total seconds in "+ numHours
                + " hours and " + numMinutes
                + " minutes is:" + seconds);



    }
}
