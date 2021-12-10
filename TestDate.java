import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

import java.util.Date;
import java.util.Scanner; 

class TestDate {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please fill a day (1-31) :");
        int day = sc.nextInt();
        System.out.println("Please fill a month (1-12) :");
        int month = sc.nextInt();
        System.out.println("Please fill a year :");
        int year = sc.nextInt();
        sc.close();

     
        
        
        // initialize gregorianCalendar with desired parameters
        Calendar calendar = new GregorianCalendar(year, month - 1, day);
        //format date 
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        //get the date from the calendar 
        Date date = calendar.getTime();
        // get the exact day of the week 
        SimpleDateFormat daySdf = new SimpleDateFormat("EEE"); 
        // format dayOfWeek
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);  
        //print the result 
        System.out.println("The date is : " + sdf.format(date));
        System.out.println("The day of the week is : " +daySdf.format(dayOfWeek));
        
        
    }
}