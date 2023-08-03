package com.example.service;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.sql.Date;
import java.util.Properties;

public class JunitTestSalpleVerify {

    public Properties load(){
        Properties prop = new Properties();
        try {
            String hostName = InetAddress.getLocalHost().getHostName();
            prop.setProperty("key",hostName);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        System.out.println(prop);
        return prop;
    }

}
