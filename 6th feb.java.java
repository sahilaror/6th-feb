Answer1  Mutable string means once we created a string object and try to change a string object that change will be reflected on existing object not on new object.



Answer 2 class a{
    public static void main(String[] args) {
        String s="pw skill";
        String s1=" ";
        for(int i=s.length()-1; i>=0; i--){
            s1=s1+s.charAt(i);
        }
        System.out.println(s1);
    }
}  



Answer 3       class a{
  		  public static void main(String[] args) {
      	  String s="Think skill";
        	  String s1=" ";
        	  for(int i=s.length()-1; i>=0; i--){
          	  s1=s1+s.charAt(i);
        	}
       	 System.out.println(s1);
  	  }
	}



Answer 4    	  import java.util.Arrays;

			class a{
    			public static void main(String[] args) {
    	 	      String s="Think Twice";
   	   	     char ch[]=s.toCharArray();
       	     Arrays.sort(ch);
                 System.out.println(ch);
    		   }
 		}