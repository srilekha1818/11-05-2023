package CoreJava.Strings;

import java.util.Arrays;

public class Anagram{
    public static void main(String[] args){
        String s1="racer";
        String s2="care";
        s1=s1.replace(" ","");
        s2=s2.replace(" ", "");
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();
        char[] ch1=s1.toCharArray();
        char[] ch2=s2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        if(Arrays.equals(ch1,ch2)){
            System.out.println("It's an anagram");
        }
        else{
            System.out.println("It's not an anagram");
        }


    }
}