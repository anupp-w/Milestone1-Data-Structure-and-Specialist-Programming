package com.mallis.controller;

import com.mallis.model.MallBlocks;
import java.util.LinkedList;

/**
 *
 * @author Anup Wagle 23048623
 */
public class InsertionSort {

    public static void sortBySpaceIDDescending(LinkedList<MallBlocks> blocks) {
        int size = blocks.size();
        for (int step = 1; step < size; step++) {
            MallBlocks key = blocks.get(step);
            int j = step - 1;

            // Compare and shift for descending order
            while (j >= 0 && key.getSpaceID() > blocks.get(j).getSpaceID()) {
                blocks.set(j + 1, blocks.get(j));
                j--;
            }
            blocks.set(j + 1, key);
        }
    }
}