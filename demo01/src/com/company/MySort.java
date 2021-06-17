package com.company;

import java.util.ArrayList;
import java.util.List;

public class MySort {
    List<Integer> collection;

    MySort(ArrayList<Integer> collection){
        this.collection = collection;
    }

    public ArrayList<Integer> ascendingSort(){

        if(this.collection.size() < 2){
            return (ArrayList<Integer>) this.collection;
        }
        if(this.collection.get(0) < this.collection.get(1)){
            return (ArrayList<Integer>) this.collection;
        }else {
            List<Integer> sortedList = new ArrayList<>();
            sortedList.add(this.collection.get(1));
            sortedList.add(this.collection.get(0));
            return (ArrayList<Integer>) sortedList;
        }
    }
}
