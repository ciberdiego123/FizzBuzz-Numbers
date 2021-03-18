package com.company.joiner;

import java.util.Collection;
import java.util.stream.Collectors;

public class StringJoiner implements Joiner<Collection<String>, String> {

    private String delimiter = " ";

    public StringJoiner() {}

    public StringJoiner(String delimiter) {
        this.delimiter = delimiter;
    }

    @Override
    public String join(Collection<String> collection) {
        return String.join(delimiter, collection);
    }

}
