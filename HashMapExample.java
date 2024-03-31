import java.util.*;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();

        //add Key and Values in HashMap Using put()
        map.put("india",170);
        map.put("usa",150);
        map.put("china",200);

        //Print The HashMap 
        System.out.println(map);
        System.out.println("The Population of India is = "+map.get("india"));

        //Update The Value of usa Key
        map.put("usa",140);
        System.out.println(map);

        //Check if  the Given key is Present In HashMap or not Using containsKey()
        if(map.containsKey("china")){
            System.out.println("The Key is Present in  HashMap....!");
        }

        //Iterate The Hashmap and get all The Key Value Pairs in The HashMap
        for(Map.Entry<String, Integer> e : map.entrySet()){
            System.out.println(e.getKey()+" "+e.getValue());
        }

        System.out.println();

        //Iterate The Hashmap and get only Keys in the HashMap
        Set<String> keys = map.keySet();

        for(String key : keys){
            System.out.println(key+" "+map.get(key));
        }

        //Remove The Key Values in the HashMap using remove()
        map.remove("china");
        System.out.println(map);

    }
}
