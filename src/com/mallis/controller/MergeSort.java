package com.mallis.controller;

import com.mallis.model.MallBlocks;
import java.util.List;

/**
 *
 * @author Anup Wagle 23048623
 */
public class MergeSort {

    public static void sortBySpaceID(List<MallBlocks> blocks) {
        if (blocks.size() < 2) return;

        int mid = blocks.size() / 2;
        List<MallBlocks> left = blocks.subList(0, mid);
        List<MallBlocks> right = blocks.subList(mid, blocks.size());

        sortBySpaceID(left);
        sortBySpaceID(right);

        merge(blocks, left, right);
    }

    private static void merge(List<MallBlocks> blocks, List<MallBlocks> left, List<MallBlocks> right) {
        int i = 0, j = 0, k = 0;

        while (i < left.size() && j < right.size()) {
            if (left.get(i).getSpaceID() <= right.get(j).getSpaceID()) {
                blocks.set(k++, left.get(i++));
            } else {
                blocks.set(k++, right.get(j++));
            }
        }

        while (i < left.size()) {
            blocks.set(k++, left.get(i++));
        }

        while (j < right.size()) {
            blocks.set(k++, right.get(j++));
        }
    }
}