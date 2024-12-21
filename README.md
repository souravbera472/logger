# logger
This is Logger project for logging in specifice file.

### Just change in log4j2.xml on line number 17 with your package name then logger will start working.
    <Logger name="org" level="debug" additivity="false">
    Here package is "org"

# How To Use

     KLogger.info(message);

     KLogger.error(error message);
# Context Switching
    If you want to use cutome log4j2-A.xml file then follow the below
    // Uncomment in ParentLogger file

    static {
        System.setProperty("log4j.configurationFile", "log4j2-A.xml");
        System.setProperty("Log4jContextSelector", "org.apache.logging.log4j.core.async.AsyncLoggerContextSelector");
    }


    Want to switch log4j2-A file in runtime
    Just follow TestOtherLogFile.java

    static {
        System.setProperty("log4j.configurationFile", "src/main/resources/log4j2-A.xml");
    }

Note

     Info logs are write in info.log file under logs package.
  
     Errors logs are write in error.log file.
