package Assignment10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

     SList<String > list=new SList<>();
     SListIterator<String > iterator=list.iterator();
            iterator.insert("hello");
            iterator.insert("sandeep");
            iterator.insert("Zemoso");
            iterator.insert("Technologies");
            iterator.insert(3,"Welocome to");

            list.toString();
        System.out.println("\nAfter deletion\n");
        iterator.delete();
        list.toString();
    }
}