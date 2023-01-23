// Java program to demonstrate
// unmodifiableList() method
  
import java.util.*;
  
public class Teste {
    public static void main(String[] argv)
        throws Exception
    {
        try {
  
            // creating object of ArrayList<Character>
            List<Character> list = new ArrayList<>();
  
            // populate the list
            list.add('X');
            list.add('Y');
  
            // printing the list
            System.out.println("Initial list: " + list);
  
            // getting unmodifiable list
            // using unmodifiableList() method
            List<Character> immutablelist = Collections
                                                .unmodifiableList(list);
  
            // printing the list
            System.out.println("Unmodifiable list: "
                               + immutablelist);
        }
  
        catch (UnsupportedOperationException e) {
            System.out.println("Exception thrown : " + e);
        }
    }
}