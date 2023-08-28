
//PROGRAM TO COUNT UPPERCASE,LOWERCASE,SPACE,NUMBERS,VOWELS,SYMBOLS.
import java.util.Scanner;
import java.lang.String;

public class CountCharacter_String {
    public static void main(String[] args)
    {
       Scanner input=new Scanner(System.in);
       System.out.println("Enter the String  : ");
       String str=input.nextLine();
       System.out.println("The Actual String : "+str);
       int upper=0,lower=0,space=0,numbers=0,vowels=0;

       for(int i=0;i<str.length();i++)
       {
           if(str.charAt(i)>=97 && str.charAt(i)<=122){
               upper++;
           }
           if(str.charAt(i)>=65 && str.charAt(i)<=90){
               lower++;
           }
           if(str.charAt(i)==32){
               space++;
           }
           if(str.charAt(i)>=48 && str.charAt(i)<=57){
               numbers++;
           }
           if(str.charAt(i)=='a'||str.charAt(i)=='e'||
                   str.charAt(i)=='i'|| str.charAt(i)=='o'||
                   str.charAt(i)=='u'|| str.charAt(i)=='A'||
                   str.charAt(i)=='E'||str.charAt(i)=='I'||
                   str.charAt(i)=='O'||str.charAt(i)=='U')
           {
               vowels++;
           }
       }
        System.out.println("The upper    : "+upper);
        System.out.println("The lower    : "+lower);
        System.out.println("The space    : "+space );
        System.out.println("The numbers  : "+numbers);
        System.out.println("The vowels   : "+vowels);
        System.out.println("The Symbols  : "+(str.length()-(upper+lower+space+numbers+vowels)));


    }
}
