import java.util.ArrayList;

public class CharacterRemoval {

    public String removeCharacter(String initial, String remove){
        ArrayList<String> arrLet = new ArrayList<>();
        for (int i=0; i < initial.length(); i++){
            arrLet.add(initial.substring(i,i+1));
        }

        for (int i=0; i < remove.length(); i++){
            for (int x=0; x < initial.length(); x++){
                if (initial.substring(x,x+1).equals(remove.substring(i,i+1))){
                    arrLet.remove(x);
                }
            }
        }
        String string = "";
        for (int i=0; i < arrLet.size(); i++){
            string += arrLet.get(i);
        }
        return string;
    }
}
