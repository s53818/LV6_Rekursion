package org.campus02;

public class PalindromChecker
{
    public static void main(String[] args)
    {
        String text = "Rentner rentner";
        System.out.println(check(text));
        String text2 = "Trug Tim eine so helle Hose nie mit Gurt";
        System.out.println(check(text2));
    }
    public static boolean check(String palindrom)
    {
        if(palindrom.isEmpty() || palindrom.length() == 1)
        {
            // wenn der Text leer oder nur 1 Zeichen lang ist, TRUE weil ist ein Palindrom
            return true;
        }
        palindrom = palindrom.toUpperCase().replaceAll(" ", "");
        if(palindrom.charAt(0) == palindrom.charAt(palindrom.length()-1))
        {
            return check(palindrom.substring(1, palindrom.length()-1));
        }
        return false;
    }
}
