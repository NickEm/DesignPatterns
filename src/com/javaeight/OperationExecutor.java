package com.javaeight;

/**
 * Created by EM on 24.09.2015.
 */
public interface OperationExecutor<A, T> {

    public T execute(A arg);
}
