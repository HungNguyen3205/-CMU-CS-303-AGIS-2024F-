package Assignment7.ArraysList;

import java.util.ArrayList;

public class Exercise4_CheckPython {
    public static void Language(){
        String java = "Java";
        String py = "Python";
        String c = "C++";
        String js = "Javascript";
        ArrayList<String>Lang=new ArrayList<>();
        Lang.add(java);
        Lang.add(py);
        Lang.add(c);
        Lang.add(js);
        for (String Language : Lang){
            System.out.print(" "+Language+" ");
        }
        Check(py, Lang);
    }
    public static void Check(String py, ArrayList<String> Lang) {
        if (Lang.contains(py)) {
            System.out.println("\nLanguage " + py + " have in list.");
        } else {
            System.out.println("\nLanguage " + py + " no have in list.");
        }
    }
    public static void main(String[] args) {
        Exercise4_CheckPython.Language();
    }
}
