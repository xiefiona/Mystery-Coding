import java.util.*;

public class Tester {
    public static void main(String args[]){
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter number between 3 and 21: ");
        int num = reader.nextInt();
        System.out.println("Enter trunk character: ");
        String trunk = reader.next();
        System.out.println("Enter tree character: ");
        String tree = reader.next();

        String string;
        for (int i=1; i<=num; i+=2){
            string = "";
            for (int x=0; x<=i; x++){
                string += tree;
            }
            System.out.println(string);
        }
        string = "";
        for (int i=0; i<3; i++){
            string+=trunk;
        }
        System.out.println(string);
    }
}
