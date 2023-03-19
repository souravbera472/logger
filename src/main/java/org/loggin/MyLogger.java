package org.loggin;

public interface MyLogger {

    void info(Object obj);
    void error(Object obj);
    void error(Object obj, Throwable e);
    void warn(Object obj);
}
