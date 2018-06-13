import java.util.*;

public class CenturiesLeapYear {

    public static void main(String args[]){
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter year: ");
        int year = reader.nextInt();

        System.out.println("Century: " + getCentury(year));
        System.out.println("Leap Year: " + isLeapYear(year));
    }

    public static int getCentury(int year){
        if (year % 10 == 0) {
            return year / 100;
        } else {
            return (year / 100) + 1;
        }
    }

    public static boolean isLeapYear(int year){
        if (year % 4 == 0) {
            if (year % 100 == 0){
                if (year % 400 == 0){
                    return true;
                }
            } else {
                return true;
            }
        }
        return false;
    }
}
