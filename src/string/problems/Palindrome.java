package string.problems;
import java.util.Scanner;


public class Palindrome {
    public static void main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
          Palindrome. So write java code to check if a given String is Palindrome or not.
         */
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a word to check palindrome");
        String st = input.next();
        System.out.println(isPalindrome(st));
    }

    public static boolean isPalindrome(String st) {
        boolean palindrome = false;
        for (int i = 0; i < st.length(); i++) {
            for (int j = st.length() - 1; j >= 0; j--) {
                if (st.charAt(i) == st.charAt(j)) {
                    palindrome = true;
                }
                else { palindrome = false;

                }
            }
        }
        return palindrome;


    }
    }

