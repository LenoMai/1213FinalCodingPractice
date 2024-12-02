package Prob2;

import java.util.*;

public class Zoo {
    private ArrayList<Mammal> mammals;

    public Zoo(){
        Mammal a1 = new Bear("Paddington", 10, 255.3, "brown");
        Mammal a2 = new Bear("Grizz", 2, 100.4, "black");
        Mammal a3 = new Bear("Suni", 20, 320.3, "white");
        Mammal a4 = new Human("Leo", 20, 180);
        Mammal a5 = new Human("Gina", 34, 120.4);

        mammals = new ArrayList<>();

        mammals.add(a1);
        mammals.add(a2);
        mammals.add(a3);
        mammals.add(a4);
        mammals.add(a5);
    }

    public ArrayList<Mammal> getMammals(){
        return mammals;
    }

}
