package com.javaeight;

/**
 * Created by EM on 24.09.2015.
 */
public interface Converter<A, T> {

    public T convert(A arg);
}
