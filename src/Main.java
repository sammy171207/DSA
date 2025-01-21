
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class Main {
    public static void main(String args[] ) throws Exception {
        //BufferedReader
        int month,day,year;
        Scanner sc=new Scanner(System.in);
        month=sc.nextInt();
        day=sc.nextInt();
        year=sc.nextInt();

       Calendar calendar=Calendar.getInstance();
       calendar.set(year,month-1,day);
       int dayOfWeek=calendar.get(Calendar.DAY_OF_WEEK);
       String  []days={"SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY"};
       
    }
}

