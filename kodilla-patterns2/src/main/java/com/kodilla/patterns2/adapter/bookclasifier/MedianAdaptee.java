package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookB;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookSignature;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookStatistics;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.Statistics;

import java.util.Map;

public class MedianAdaptee implements BookStatistics {

    @Override
    public int medianPublicationYear(Map<BookSignature, BookB> books) {
        Statistics stats = new Statistics();
        return stats.medianPublicationYear(books);
    }

    @Override
    public int averagePublicationYear(Map<BookSignature, BookB> books) {
        Statistics stats = new Statistics();
        return stats.averagePublicationYear(books);
    }
}
