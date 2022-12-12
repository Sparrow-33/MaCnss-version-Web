package com.macnss.helper;

import java.math.BigInteger;
import java.security.SecureRandom;

public class codeVerification {

    public static String codeGenerator() {
        SecureRandom random = new SecureRandom();
        String code = new BigInteger(30, random).toString(32).toUpperCase();
        return code;
    }

    public static Boolean verification(String input, String code) {
           return (code.equals(input)) ? true : false;
    }
}
