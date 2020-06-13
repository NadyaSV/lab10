package main;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
	    ArrayList<Integer> listArray= new ArrayList<Integer>();
	    int[] numbers = {23, -11, 5, -7, 4, -9, -8 };
	    for (int i=0; i<numbers.length; i++)
             listArray.add(numbers[i]);
        Collections.sort(listArray);
        System.out.println(listArray);
    }

}
