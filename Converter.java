import java.util.*;
import java.io.*;
public class Converter {
    public static void main(String[] args) {
        String[] hourArray={"one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve"}; 
        String[] minuteArray={"o'clock","five","ten","quater","twenty","twenty-five","half","twenty-five","twenty","quarter","ten","five","o'clock"};
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter a time or 'quit':");
        String input= scanner.nextLine();
        int hour=0;
        int minute=0;
        while(!input.equalsIgnoreCase("Quit")) {
            System.out.println("Enter a time or 'quit':");
            input= scanner.nextLine();
            String[] splitTime=input.split(":");//splits the time strings into hours and minutes
            hour= Integer.parseInt(splitTime[0]);//the hour part converted to an int
            minute= Integer.parseInt(splitTime[1]);//converts the minutes of the time into in
            /*
             * our clock uses 5 minute intervals
             * that is any time below 5 is 'O'clock'
             * anytime above a 5 mutiple uses the next multiple of five or the previous depending on how far it is
             */
        
        
            int i;
            String hourString="";//initiates the hour string to an empty string
            for(i=0;i<hourArray.length;i++){
                if(i==hour){
                    hourString=hourArray[i-1];//if we have looped to the hour value, then that is the string hour value we are looking for
                }
            
            }
            String minuteString="";//empty string before finance

        }    
       
        
    }
    
}
