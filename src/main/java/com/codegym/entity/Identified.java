package com.codegym.entity;

public interface Identified<T> {
    T getId();
    void setId(T id);
}
