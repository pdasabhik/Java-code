
public class Testreverse {

	public static void main(String[] args) {
		//reversestring();
	//	eachwordreverse();
		w();
	}
   public static void reversestring() {
	  String str = "I am good" ;
	  String rev="";
	  for(int i=str.length()-1;i>=0;i--) {
		  rev=rev+str.charAt(i);
	  }
     System.out.println(rev);
   }

   public static void eachwordreverse() {
	   String str ="i am good";
	   String [ ] words =str.split(" ");
       for(int i=0; i<words.length;i++) {
    	   String word = words[i];
    	   String rev="";
    	   for(int j=word.length()-1;j>=0;j--) {
    		rev= rev+word.charAt(j);
    	}
         System.out.print(rev + " ");
       }
   
  
   
   }
   public static void w () {
	   String str ="i am good";
	   String [ ] words = str.split(" ");
      for(int i=words.length-1;i>=0;i--) {
    	String word=words[i];
      System.out.print(word + " ");
      }
   
   
   }

}
