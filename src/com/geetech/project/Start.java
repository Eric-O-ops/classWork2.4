package com.geetech.project;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Start { private static ArrayList<String> listA = new ArrayList<String>();
    private static ArrayList<String> listB = new ArrayList<String>();
    private static ArrayList<String> listC = new ArrayList<String>();

    public static void start() {
        outA();
        outB();
        outC();
        sortList("C");

    }

    private static void outA() {
        fillAndShowList("A");
    }

    private static void outB() {
        fillAndShowList("B");
    }
    private static void outC() {
       for (int i = 0, j = 4; i < listA.size(); i++, j--) {
            listC.add(listA.get(i));
            listC.add(listB.get(j));

         }
        System.out.println("ListC have: " + listC);
    }


    private static void scanner(String nameList) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        if (nameList.equals("A")) listA.add(s);
        if (nameList.equals("B")) listB.add(s);

    }

    private static void fillAndShowList(String nameList) {

        List list = null;
        if (nameList.equals("A")) list = listA;
        if (nameList.equals("B")) list = listB;

        System.out.println("Fill in list" + nameList);
        for (int i = 1; i <= 5; i++) {
            System.out.println("Value: " + i);
            scanner(nameList);
        }
        System.out.println("List" + nameList + " have: " + list + "\n");

    }
    private static void sortList(String nameList){
        List list = null;

        if (nameList.equals("A")) list = listA;
        if (nameList.equals("B")) list = listB;
        if (nameList.equals("C")) list = listC;

        list.sort(Comparator.comparingInt(String::length));
        System.out.println(list);
    }
}
