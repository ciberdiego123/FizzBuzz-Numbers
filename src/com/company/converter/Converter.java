package com.company.converter;

public interface Converter<T, F> {
    F convert(T t);
}
