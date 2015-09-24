package com.javaeight;

import java.util.function.Function;

/**
 * Created by EM on 24.09.2015.
 */
public class Executor {

    public static void main(String[] args) {
        OperationExecutor<String, String> function = (s) -> s.toUpperCase();
        System.out.println(function.execute("Some"));
    }
}
