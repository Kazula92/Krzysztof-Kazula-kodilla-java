package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminator{

    public List<Integer> exterminate(List<Integer> numbers){

        List<Integer> list2 = new ArrayList<Integer>();
        for(int number : numbers){
            if(number%2==0){
                list2.add(number);
            }
        }
        return list2;

    }
}


