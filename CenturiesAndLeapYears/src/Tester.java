import java.util.*;

public class Tester {

    public static void main(String args[]){
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter year: ");
        int year = reader.nextInt();
        LeapYears function = new LeapYears();
        System.out.println("Century: " + function.getCentury(year));
        System.out.println("Leap Year? " + function.isLeapYear(year));
    }
}
