package com.sagr.prometheus;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Oleksandr Hrintsov.
 */
public class InsertionSortTest {
    @Test
    public void sort() throws Exception {
        int[] input = {5, 2, 4, 6, 1, 3};
        int[] expected = {1, 2, 3, 4, 5, 6};

        InsertionSort.sort(input);

        assertArrayEquals(expected, input);
    }
}