package com.torryharris.pack1;

public interface Interface3 extends Interface1,Interface2 {
    @Override
    default void method1() {

    }

    @Override
    default int method2() {
        return 0;
    }

    @Override
    default double method7() {
        return 0;
    }

    @Override
    default void method4() {

    }
}
