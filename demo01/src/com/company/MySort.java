package com.company;

import java.util.ArrayList;
import java.util.List;

public class MySort {
    List<Integer> collection;

    MySort(ArrayList<Integer> collection){
        this.collection = collection;
    }

    public ArrayList<Integer> ascendingSort(){
        return (ArrayList<Integer>) this.collection;
    }
}
