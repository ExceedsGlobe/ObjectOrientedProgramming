package CollectionsAndGenerics;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Dictionary {
    public static void main(String args[]){
       Map<String,String> dictionary=new HashMap<>();
       dictionary.put("crunk","very excited");
       dictionary.put("estimate","Imperfect");
       dictionary.put("cons","Mistakes");
       dictionary.put("Famished","extremely hungry");
       dictionary.put("Famished","Very hungry");
       dictionary.put("muggle","very excited");
        dictionary.remove("cons");
        //All keys of the hash map are stored
          Set<String> words=dictionary.keySet();

          for (String word:words){
                // get the value of the enter by using get(key)
              System.out.println(word+":"+dictionary.get(word));
          }
    }
}
