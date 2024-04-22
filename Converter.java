import java.util.*;
import java.io.*;
public class Converter {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter a time or 'quit':");
        String input= scanner.nextLine();
        while (!input.equalsIgnoreCase("Quit")) {
            String[] splitTime=input.split(":");//splits the time strings into hours and minutes
            int hour= Integer.parseInt(splitTime[0]);//the hour part converted to an int
            int minute= Integer.parseInt(splitTime[1]);//converts the minutes of the time into in
            /*
             * our clock uses 5 minute intervals
             * that is any time below 5 is 'O'clock'
             * anytime above a 5 mutiple uses the next multiple of five or the previous depending on how far it is
             */
        }
    }
    
}
