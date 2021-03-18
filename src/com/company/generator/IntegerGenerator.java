package com.company.generator;

import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class IntegerGenerator implements NumberGenerator<Integer> {

    @Override
    public Collection<Integer> generate(Integer start, Integer end) {
        return IntStream.range(start, end + 1)
                .boxed()
                .collect(Collectors.toList());
    }
}
