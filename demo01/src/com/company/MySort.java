package com.company;

import java.util.ArrayList;
import java.util.List;

public class MySort {
    List<Integer> collection;

    MySort(ArrayList<Integer> collection) {
        this.collection = collection;
    }

    public ArrayList<Integer> ascendingSort() {

        if (this.collection.size() < 2) {
            return (ArrayList<Integer>) this.collection;
        }
        for (int i = 0; i < this.collection.size(); i++) {
            for (int j = i + 1; j < this.collection.size(); j++) {
                int tmp = 0;
                if (this.collection.get(i) > this.collection.get(j)) {
                    tmp = this.collection.get(i);
                    this.collection.set(i, this.collection.get(j));
                    this.collection.set(j, tmp);
                }
            }
        }
        return (ArrayList<Integer>) this.collection;
    }
}
