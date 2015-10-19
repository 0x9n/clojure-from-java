package com.example;

import clojure.java.api.Clojure;
import clojure.lang.IFn;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        // Hello from Java.
        System.out.println( "Hello from Java!" );

        // Hello from clojure.
        Clojure.var("clojure.core/require").invoke(Clojure.read("HelloClojure"));
        IFn func = Clojure.var("HelloClojure", "hello");
        func.invoke();
    }
}
