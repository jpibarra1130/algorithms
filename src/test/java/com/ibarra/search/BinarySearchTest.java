package com.ibarra.search;

import org.hamcrest.core.Is;
import org.junit.Test;

import static org.junit.Assert.assertThat;

/**
 * Created by paoloibarra on 2/9/15.
 */
public class BinarySearchTest {
    
    private BinarySearch binarySearch = new BinarySearch();
    
    @Test
    public void testRegularCases() {
        assertThat(binarySearch.findIndex(4, new int[] {1, 2, 3, 4, 5 }), Is.is(3));
        assertThat(binarySearch.findIndex(1, new int[] {1}), Is.is(0));
        assertThat(binarySearch.findIndex(10, new int[] {1, 10}), Is.is(1));
        assertThat(binarySearch.findIndex(1, new int[] {1, 10}), Is.is(0));
    }

    @Test
    public void testMissingElement() {
        assertThat(binarySearch.findIndex(0, new int[] {1, 10, 11}), Is.is(-1));
    }
}
