package org.sb;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.loggin.KLogger;

public class Main {

    public static void main(String[] args) {

        //System.out.println("Hello world!");
        KLogger.info("Calling solve method");
        solve();
    }

    static void solve(){
        KLogger.info("This is solve method");
        KLogger.error("This is error form solve");
    }
}