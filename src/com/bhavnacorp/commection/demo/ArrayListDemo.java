package com.bhavnacorp.commection.demo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        System.out.println("-----------------Start-----------");

        //List
        List list = new ArrayList();

        list.add("Abhi");
        list.add("raj");
        list.add("bivas");
        list.add("harry");
      //  list.add(3);
       // list.add(3.8);

        System.out.println("----------- Inserted data-----------   "+list);
        System.out.println("----------Fetching record on the basis of index-----------");
        System.out.println("2nd index record  : "+list.get(2));

        System.out.println("------ Remove object from list -----");

        //on the basis of index
        System.out.println("---- remove  2nd index value   " +list.remove(2));
        System.out.println("----- updated list---  "+list);

        //on the basis of object
        System.out.println("----- remove on the basis of object ------");
        System.out.println(list.remove("raj"));
        System.out.println("---- updated list" +list);

        //Cheak it exist or not
        System.out.println("Contain : "+list.contains("Abhi"));


        //Add  all
        List list2 = new ArrayList();
        list2.add("Bivas");
        list2.add("Dey");

     //   list.addAll(list2);
        list.addAll(1,list2);

        System.out.println("Updated list -----  "+list);


        //Remove all
      //  list.removeAll(list2);
        System.out.println("Updated list -----  "+list);

        //Cheak size
        int size = list.size();
        System.out.println(size);

        List<String> list3 = new ArrayList<String>();
        list3.add("");
        list3.add("abcd");
     //   list3.add(3);

        System.out.println(list3);

        List<Integer> list4 = new ArrayList<Integer>();





    }
}
