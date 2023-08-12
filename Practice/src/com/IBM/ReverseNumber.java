package com.IBM;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   String str = "Monika is my name";
   String revstring = " ";
   String words[]=str.split(" ");
   for (String W:words) {
	   String revwords = " ";
   
   for(int i=W.length()-1;i>=0; i--) {
	   
	   revwords=revwords+W.charAt(i);
   }
       revstring = revstring+revwords;
	}
   System.out.println(revstring);
	}

}
