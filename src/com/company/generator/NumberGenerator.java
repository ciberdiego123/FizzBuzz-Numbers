package com.company.generator;

import java.util.Collection;

public interface NumberGenerator<T extends Number>{

    Collection<T> generate(T start, T end);

}
