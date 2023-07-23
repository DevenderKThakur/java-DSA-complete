import java.util.ArrayList;
import java.util.Collections;
public class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> mynum = new ArrayList<Integer>();
        mynum.add(10);
        mynum.add(20);
        mynum.add(30);
        System.out.println(mynum);
        int element =  mynum.get(0); 
         System.out.println(element);
        // mynum.remove(0);   to remove the element in the array 
        Collections.sort(mynum);
        for(int i:mynum){
            System.out.println(i);
        }
    }
}
