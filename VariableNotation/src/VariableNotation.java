import java.util.ArrayList;

public class VariableNotation {

    public String getCamcelCase(String input){
        ArrayList<String> arrLet = new ArrayList<>();
        for (int i=0; i < input.length(); i++){
            arrLet.add(input.substring(i,i+1));
        }

        for (int i=0; i < arrLet.size(); i++){
            if (arrLet.get(i).equals(" ")){
                arrLet.remove(i);
                arrLet.set(i,arrLet.get(i).toUpperCase());
            }
        }

        String string = "";
        for (int i=0; i < arrLet.size(); i++){
            string += arrLet.get(i);
        }

        return string;
    }

    public String getSnakeCase(String input){
        ArrayList<String> arrLet = new ArrayList<>();
        for (int i=0; i < input.length(); i++){
            arrLet.add(input.substring(i,i+1));
        }

        for (int i=0; i < arrLet.size(); i++){
            if (arrLet.get(i).equals(" ")){
                arrLet.set(i,"_");
            }
        }

        String string = "";
        for (int i=0; i < arrLet.size(); i++){
            string += arrLet.get(i);
        }

        return string;
    }

    public String getCapSnakeCase(String input){
        return (getSnakeCase(input)).toUpperCase();
    }
}
