package com.mallis.controller;

import com.mallis.model.MallBlocks;
import java.util.LinkedList;

/**
 *
 * @author Anup Wagle 23048623
 */
public class SelectionSort {

    public static void sortByCustomerName(LinkedList<MallBlocks> blocks, boolean ascending) {
        int size = blocks.size();

        for (int step = 0; step < size - 1; step++) {
            int selectedIndex = step;

            for (int i = step + 1; i < size; i++) {
                int comparison = blocks.get(i).getCustomerName()
                        .compareTo(blocks.get(selectedIndex).getCustomerName());

                if ((ascending && comparison < 0) || (!ascending && comparison > 0)) {
                    selectedIndex = i;
                }
            }

            // Swap elements
            MallBlocks temp = blocks.get(step);
            blocks.set(step, blocks.get(selectedIndex));
            blocks.set(selectedIndex, temp);
        }
    }
}