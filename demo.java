import java.util.ArrayList;

public class demo {
public static void main(String[] args) {
    System.out.println("java collection");
    ArrayList<String> vivek=new ArrayList<>();
    vivek.add("vivek nagre");
    vivek.add("shubham nagre");
    vivek.add("sharda nagre");
    vivek.add("pravin nagre".toUpperCase());
    System.out.println("my array was:"+vivek);
    vivek.remove("pravin nagre");
    vivek.add(3, "prerna nagre");
    System.out.println(vivek.contains("sharda nagre"));
    System.out.println("my array was:"+vivek);
    System.out.println("my array was:"+vivek.size());
    for (int i = 0; i < vivek.size(); i++) {
        System.out.println("elemnts: "+vivek.get(i) );
    }
}
    
}