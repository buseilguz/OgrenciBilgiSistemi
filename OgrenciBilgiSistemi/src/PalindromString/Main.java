package PalindromString;

public class Main {
  

    static boolean isPalindrome(String word) {
        String reverse = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reverse += word.charAt(i);
        }

        if (word.equals(reverse))
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
    	String word="kaya";
       if(isPalindrome(word)) {
    	   System.out.println(word+" kelimesi polindromik kelimedir.");
       }
       else
    	   System.out.println(word+" kelimesi polindromik kelime deðildir.");
    	   
    }
}