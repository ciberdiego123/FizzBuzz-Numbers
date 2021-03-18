package com.company.joiner;

import java.util.Collection;

public interface Joiner<T extends Collection, F> {

    F join(T collection);

}
