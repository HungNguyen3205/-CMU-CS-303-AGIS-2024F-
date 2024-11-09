package Assignment7.ArraysList;

import java.util.ArrayList;

public class Exercise3_ListCity {
    public static void City(){
        ArrayList<String>city=new ArrayList<>();
        city.add("Nha Trang");
        city.add("Ha Noi");
        city.add("Quang Nam");
        city.add("Da Nang");
        city.add("Ho Chi Minh");
        for (String City : city){
            System.out.println(City);
        }
    }
    public static void main(String[] args) {
        Exercise3_ListCity.City();
    }
}
