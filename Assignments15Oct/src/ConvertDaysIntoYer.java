import java.util.Scanner;

public class ConvertDaysIntoYer {
     public static void main(String args[]) {
    	 int i, year,week,day;
    	 
    	 Scanner sc = new Scanner(System.in);
    	 
    	 System.out.println("Numbers Of Days");
    	 i= sc.nextInt();
    	 year = i/365;
    	 i = i%365;
    	 
    	 System.out.println("Years:" +year);
    	 week = i/7;
    	 i=i%7;
    	 
    	 System.out.println("Weeks:"+week);
    	 day=i;
    	 
    	 System.out.println("Days:"+day);
    	 
    	 sc.close();
     }

}
