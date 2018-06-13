public class LeapYears {

    public int getCentury(int year){
        if (year % 10 == 0) {
            return year % 100;
        } else {
            return (year % 100) + 1;
        }
    }

    public boolean isLeapYear(int year){
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
