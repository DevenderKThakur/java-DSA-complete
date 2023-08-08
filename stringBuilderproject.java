public class stringBuilderproject {
    public static void main(String[] args) {
      StringBuilder name = new StringBuilder("Devender");
      System.err.println(name.charAt(0));

    //   set an idex at 0 
       name.setCharAt(0, 'd');
       System.out.println(name);

    //  insert char in the string 
      name.insert( 0,'n');   

    //    reverse a string 
        StringBuilder name2 = new StringBuilder("Hello");
        for(int i=0;i<name2.length()/2;i++){
             int start = 0;
             int end = name2.length()-1-i;

             char startChar = name2.charAt(start);
             char endChar = name2.charAt(end);
             name2.setCharAt(start, endChar);
             name2.setCharAt(end, startChar);
        }
        System.out.println(name2);
    } 
}
