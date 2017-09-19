package com.theironyard;

import java.util.List;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int[] myNumbers = { 3, 3, 44, 9, 17};    //teaching basic Java array ideas

        int[] newCloneNums = myNumbers.clone();  //cloning myNumbers as new array

        List<Integer> newNumbers = new ArrayList<>();  //creating list of integers to convert original array to a list
                                                       //so we can add to it
        for(int num : myNumbers) {
            newNumbers.add(num);                       //copying original array into the list we created
        }

        newNumbers.add(36);     //adding to it here

        System.out.println(newNumbers);

        Integer[] switchBack = newNumbers.toArray(new Integer[newNumbers.size()]);  //switching it back to an array

        System.out.println(switchBack[switchBack.length - 1]);

        String[] myString = {"hey", "do", "you", "like", "this", "lesson", "I'm", "showing", "you", "?"};

        List<String> coolString = new ArrayList<>();

        coolString.add("Hello");    // adds Hello to coolString

        System.out.println(coolString.get(0));

        for(int i = 0; i < myString.length; i++) {     //adds all of myString to coolString
            coolString.add(myString[i]);
        }

        System.out.println(coolString);

        System.out.println(coolString.size());   //shows size or length of array coolString

        String[] newCoolNamesArr = coolString.toArray(new String[coolString.size()]);

        for (String str : newCoolNamesArr) {
            System.out.println(str);
        }

        String[] newStringExample = new String[5]; //other way to create an array

        newStringExample[0] = "Spencer";
        newStringExample[1] = "Chris";
        newStringExample[2] = "Josh";
        newStringExample[3] = "Whitney";
        newStringExample[4] = "Heather";


    }
}
