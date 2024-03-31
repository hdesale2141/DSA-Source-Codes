import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String,Integer> netWorth = new HashMap<>();

        netWorth.put("Darshan", 20000);
        netWorth.put("Ghanshyam", 100000);
        netWorth.put("Mayur", 210000);
        netWorth.put("Harshal", 50000);

        System.out.println(netWorth);

        System.out.println(netWorth.get("Mayur"));
    }
}
