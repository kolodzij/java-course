package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.BookA;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Classifier;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookB;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookSignature;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class MedianAdapter extends MedianAdaptee implements Classifier {

    @Override
    public int publicationYearMedian(Set<BookA> bookSet) {
        Map<BookSignature, BookB> booksMap = new HashMap<BookSignature, BookB>();
        booksMap =  bookSet.stream()
                    .collect(Collectors.toMap(sss-> new BookSignature(sss.getSignature()), sss-> new BookB(sss.getAuthor(),sss.getTitle(),sss.getPublicationYear())));
        return medianPublicationYear(booksMap);
    }
}
