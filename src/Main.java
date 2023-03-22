import java.util.Set;
import java.util.TreeSet;
public class Main {

    public static void main(String[] args) {
        Set<String> s = new TreeSet<String>();
        System.out.println(s.isEmpty());
        s.add("Phani");       //add the value in the set
        s.add("Santhosh");
        s.add("Charan");
        s.add("Srinivas");
        s.add("Phani");    //duplicates are not allowed in set

        System.out.println(s);    //prints the items in the set

        s.remove("Santhosh");    //remove the value from the set
        s.remove("Phani");
        System.out.println(s);

        System.out.println(s.size());      //size of the set
        for(String g: s)                   //traversal using for-loop
            System.out.println(g);
        System.out.println(s.contains("Phani"));   //checks whether the set is having the value or not
        System.out.println(s.contains("Charan"));
        System.out.println(s);

    }

}


