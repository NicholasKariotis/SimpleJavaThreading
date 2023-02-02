package part2;

import java.util.ArrayList;

public class Main{

    public static void main(String[] args) {
        Bridge troll = new Bridge();
        Woolie w1 = new Woolie("Nick", "Merctan", 10, troll);
        Woolie w2 = new Woolie("David", "Sicstine", 8, troll);
        Woolie w3 = new Woolie("Jason", "Sicstine", 12, troll);
        Woolie w4 = new Woolie("Owie", "Merctan", 11, troll);
        ArrayList<Woolie> woolies = new ArrayList<>();
        woolies.add(w1);
        woolies.add(w2);
        woolies.add(w3);
        woolies.add(w4);
        for(int i = 0; i < woolies.size(); i++){
            Thread t = new Thread(woolies.get(i));
            t.start();
        }
    }
}