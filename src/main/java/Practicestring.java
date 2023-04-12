
public class Practicestring {

	public static void main(String[] args) {
		//stringreverse();
		eachword();
	}

    public static void stringreverse() {
    	
       String str ="I am good";
       String rev="";
       for(int i=str.length()-1;i>=0;i--) {
    	 rev=rev+str.charAt(i) ; 
       
       }
      System.out.println(rev);
    }

   public static void eachword() {
	   String str="i am good";
       String [] words=str.split(" ");
     for(int i=0;i<words.length;i++) {
    	String word = words[i];
        String rev=" ";
     for(int j=word.length()-1;j>=0;j--) {
    	 
       rev=rev+word.charAt(j);
     }
     System.out.print(rev + " ");
     }
   
   }


}
