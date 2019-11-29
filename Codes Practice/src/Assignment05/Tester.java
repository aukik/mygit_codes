package gg;

public class Tester{
    public static void main (String[] args){

        MyString s1 = new MyString("ABCDEd");
        MyString s2=new MyString("Abcded");

        System.out.println(s1.length());
        System.out.println(s1.startsWith(s2));
        System.out.println(s1.endsWith(s2));
        System.out.println(s1.replaceFirst('C','z'));
        System.out.println(s2.replaceAll('d','x'));
        System.out.println(s2.replaceLast('d','x'));
        System.out.println(s1.toLowerCase());
        System.out.println(s2.toUpperCase());
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareToIgnoreCase(s2));
        System.out.println(s1.substring(3));
        System.out.println(s1.substring(2,4));
        System.out.println(s1.indexOf('d'));
        System.out.println(s2.lastIndexOf('d'));
        System.out.println(s2.indexOf('x',4));
        System.out.println(s2.lastIndexOf('d',3));
        System.out.println(s2.concat(s1));
    }

}