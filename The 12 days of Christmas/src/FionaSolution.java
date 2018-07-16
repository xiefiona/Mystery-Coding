import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class FionaSolution {
    public static void main(String[] args) {
        try {
            Scanner Freader = new Scanner(new File("src/Christmas.txt"));
            ArrayList<String> ArrLyrics = new ArrayList<>();
            while (Freader.hasNextLine()){
                ArrLyrics.add(Freader.nextLine());
            }

            Scanner Freader2 = new Scanner(new File("src/Order.txt"));
            ArrayList<String> ArrOrder = new ArrayList<>();
            while (Freader2.hasNextLine()){
                ArrOrder.add(Freader2.nextLine());
            }

            for(int i=0; i<12; i++) {
                System.out.println("On the " + ArrOrder.get(i) + " day of Christmas");
                System.out.println("my true love sent to me: ");
                for(int x=(12-i-1); x<12; x++){
                    if (i==0){
                        System.out.println("1 Partridge in a Pear Tree");
                    } else {
                        System.out.println(ArrLyrics.get(x));
                    }
                }
                System.out.println("");
            }
        } catch (Exception e) {
            System.out.println("file error :(");
        }
    }
}
