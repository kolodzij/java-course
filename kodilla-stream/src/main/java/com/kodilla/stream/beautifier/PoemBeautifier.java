package com.kodilla.stream.beautifier;

public class PoemBeautifier {

    public String beautify(String textToDecorate, PoemDecorator poem) {
        String result = poem.decorate(textToDecorate);
        //return poem.decorate(textToDecorate);
        System.out.println(result);
        return result;
    }
}