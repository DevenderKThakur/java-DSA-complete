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
        for(int i=0;i<3;i++){
        list.add(scanner.next());
         }
         System.out.println(list);
    // to find max value in the arraylist 
    ArrayList<Integer> mynum = new ArrayList<Integer>();
    for(int i=0;i<5;i++){
        mynum.add(scanner.nextInt());
    }
    int max = mynum.get(0);
    for(int i=0;i<5;i++){
        if(max < mynum.get(i)){
            max = mynum.get(i);
        }
    }
    System.out.println(max);
    
    }
}
