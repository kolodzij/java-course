package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.BookA;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class MedianAdapterTestSuite {

    @Test
    public void publicationYearMedianTest() {
        //Given
        MedianAdapter medianAdapter = new MedianAdapter();
        Set<BookA> bookSet = new HashSet<>();
        bookSet.add(new BookA("author1", "title1", 2001, "A23452"));
        bookSet.add(new BookA("author2", "title2", 2017, "A74465"));
        bookSet.add(new BookA("author3", "title3", 1985, "A97865"));
        bookSet.add(new BookA("author4", "title4", 2005, "A56735"));

        //When
        int result = medianAdapter.publicationYearMedian(bookSet);

        //Then
        assertEquals(result, 2001);

    }
}
