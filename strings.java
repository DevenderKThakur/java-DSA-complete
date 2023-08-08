import java.util.*;

public class strings {
    public static void main(String[] args) {
         Scanner sc = new Scanner (System.in);
        // String name = sc.next(); // takes the string as input until the space 
        // String name2 = sc.next();
        // System.out.println(name + "  " +name2);

        // String firstname = "Devender";
        // String lastname = "Thakur";
        // String fullname = firstname + " " + lastname;
        // System.out.println(fullname);

        // //  to calculate the length of the string 
        // System.err.println(fullname.length()); // it will coount the space between 

        // for(int i=0;i<fullname.length();i++){
        //     System.err.println(fullname.charAt(i)); // print every char value in the string 
        // }
        // // to compare the string 
        // if(firstname.compareTo(lastname) == 0){
        //     System.out.println("equal");
        // }else{
        //     System.out.println("not equal ");
        // }


        // String sentence =  "TonyStark";
        // String name = sentence.substring(4); // this is inclusive 0 , 1 
        // System.out.println(name);

        String str = "123";   
        int number  = Integer.parseInt(str);  // to convert number into string Integer.toString(number)
        System.out.println(number);
    }
}
