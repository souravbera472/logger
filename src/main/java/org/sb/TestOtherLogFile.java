package org.sb;

import org.loggin.KLogger;

public class TestOtherLogFile {
    static {
        System.setProperty("log4j.configurationFile", "src/main/resources/log4j2-A.xml");
    }

    public static void main(String[] args) {
        KLogger.info("This is from TestOtherLogFile class");
        Main.solve();
    }
}
