import javax.sound.midi.Soundbank;
import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        //create object of the ArrayList
      ArrayList <Integer> items = new ArrayList<Integer>();
         //add items to ArrayList
        items.add(1);
        items.add(2);
        items.add(3);
        items.add(4);
      //items.add("apple");
        printDouble(items);
    }
    public static void printDouble(ArrayList <Integer> items){
        //for(Object i : items){
          for(int i : items){
            //print items
            System.out.println("item: " + i);
            //System.out.println("item * 2: " + (Integer) i * 2);
              System.out.println("item * 2: " + i * 2);
        }
    }
}


