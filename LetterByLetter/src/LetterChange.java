import java.util.Scanner;

public class LetterChange {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        System.out.println("input 1: ");
        String string1 = reader.nextLine();
        System.out.println("input 2: ");
        String string2 = reader.nextLine();

        System.out.println();
        System.out.println(string1);
        for (int i=0; i<string1.length(); i++){
            if (!string1.substring(i,i+1).equals(string2.substring(i,i+1))){
                System.out.println(string2.substring(0,i+1) + string1.substring(i+1));
            }
        }
    }
}
