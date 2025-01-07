package com.mallis.controller;

import com.mallis.model.MallBlocks;
import java.util.List;

/**
 *
 * @author Anup Wagle 23048623
 */
public class BinarySearch {

    public static MallBlocks searchBySpaceID(List<MallBlocks> blocks, int targetSpaceID) {
        int left = 0;
        int right = blocks.size() - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            MallBlocks midBlock = blocks.get(mid);

            if (midBlock.getSpaceID() == targetSpaceID) {
                return midBlock;
            } else if (midBlock.getSpaceID() < targetSpaceID) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return null;
    }
}
