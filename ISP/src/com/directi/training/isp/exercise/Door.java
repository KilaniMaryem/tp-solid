package com.directi.training.isp.exercise;

public interface Door extends LockableDoorInt, OpenableDoorInt
{
    void lock();

    void unlock();

    void open();

    void close();
}
