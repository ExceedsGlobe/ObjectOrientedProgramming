package CollectionsAndGenerics;

import java.util.ArrayList;
import java.util.List;

public class ShirtMain {
    public static void main(String args[]){
        List<Shirt> shirts=new ArrayList<>();
        Shirt shirt=new Shirt("Allen solly","Black",43);
       shirts.add(shirt);
       shirts.add(new Shirt("Roadster","Red",44));
       shirts.add(new Shirt("Wrogn","Blue",40));
for (int i=0;i<shirts.size();i++) {
    System.out.println(shirts.get(i).getName());
    System.out.println(shirts.get(i).getColor());
    System.out.println(shirts.get(i).getSize());
}


    }
}
