import java.util.*;
public class string1
{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(s);
        System.out.println(s.length());
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        System.out.println(s.charAt(0));
        System.out.println(s.charAt(s.length()-1));
        System.out.println(s.substring(0,3));
        System.out.println(s.substring(3));
        System.out.println(s.contains("java"));
        System.out.println(s.startsWith("java"));
        System.out.println(s.endsWith("java"));
        System.out.println(s.indexOf("java"));
        System.out.println(s.lastIndexOf("java"));
        System.out.println(s.replace("java","python"));
        System.out.println(s.split(" "));
        System.out.println(s.trim());
        System.out.println(s.concat("java"));
        System.out.println(s.equals("java"));
        System.out.println(s.equals("java"));
        System.out.println(s.compareTo("java"));
        System.out.println(s.compareToIgnoreCase("java"));
        System.out.println(s.regionMatches(0,"java",0,3));
        System.out.println(s.regionMatches(3,"java",0,3));
        System.out.println(s.regionMatches(0,"java",3,3));
        System.out.println(s.regionMatches(3,"java",3,3));
        System.out.println(s.regionMatches(0,"java",0,4));
        System.out.println(s.regionMatches(3,"java",0,4));
        
    
    
    
    
    
    }
}