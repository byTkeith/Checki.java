import java.util.*;
import java.io.*;
public class Convertor {
    public static void main(String[] args) {
        String[] hourArray={"one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen"}; 
        String[] minuteArray={"o'clock","five","ten","quarter","twenty","twenty-five","half","twenty-five","twenty","quarter","ten","five","o'clock"};
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter a time or 'quit':");
        String input=scanner.nextLine();
        int hour=0;
        int minute=0;
        while(!input.equalsIgnoreCase("Quit")) {
            // System.out.println("Enter a time or 'quit':");
            // input= scanner.nextLine();
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
            int j;
            int minuteCount=0;
            for(j=0;j<minuteArray.length;j++){
                if(j==(minute/5)){//divided by five because seconds is a multiple of 5
                    minuteString=minuteArray[j];
                    minuteCount++;

                }
            }
            if(minuteString.equals(minuteArray[0]) && minute!=0){
                System.out.println("about "+hourString+" "+minuteArray[0]);
            }
            else if(minuteString.equals(minuteArray[0]) && minute==0){
             System.out.println(hourString+" "+minuteArray[0]);
            }
            else if(minuteCount>0 && minuteCount<7 && minute%5!=0 && minute<32){
                if(minute%5>=3){
                    System.out.println("about "+minuteArray[minute+(minute%5)]+" past "+hourString);
                }
                else if(minute%5<=3){System.out.println("about "+minuteString+" past "+hourString);}
            }
            else if(minuteCount>0 && minuteCount<7 && minute%5==0 && minute<32){
                System.out.println(minuteString+" past "+hourString);
            }
            else if(minuteCount>0 && minute%5!=0 && minute>31){
                if(minute%5>=2 && !minuteArray[minuteCount+1].equals(minuteArray[0]) && minute!=59){//if the mood is greater or equal to 3 but the next string not equal to o clock the move to the next value
                    System.out.println("about "+minuteArray[minuteCount]+" to "+hourArray[hour]);//the the moode is cgraeter or equal to the value then we can move to the neext valu in the string of the time in minutes

                }
                else if(minute%5>=3 && minuteArray[minuteCount+2].equals(minuteArray[0]) || minute==59){System.out.println("about "+hourArray[hour]+" "+minuteArray[0]);}//if the next value is in fact o' clock the the entire valu changes
                else if (minute%5<2){
                    System.out.println("about "+minuteString+" to "+hourArray[hour]);
                }
            }
            else if(minuteCount>0 && minute%5==0 && minute>31){
                System.out.println(minuteString+" to "+(hourArray[hour]));
            }








            System.out.println("Enter a time or 'quit':");
            input= scanner.nextLine();

        }System.out.println("Done");   
       
        
    }
}    
    

