package com.tinyurl.urlcreation.java.utils;

import io.seruco.encoding.base62.Base62;
import org.springframework.beans.factory.annotation.Value;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Hashing {

    private static final String BASE62 = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static BigInteger hasing(String longUrl) {
        try{
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] digest = md.digest(longUrl.getBytes(StandardCharsets.UTF_8));
            byte[] subHash = new byte[8]; // 8 bytes = 64 bits
            System.arraycopy(digest, 0, subHash, 0, 8);
            return new BigInteger(1, subHash);
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return null;
    }

    public static String toBase62(BigInteger number){
        StringBuilder sb = new StringBuilder();
        while(number.compareTo(BigInteger.ZERO)>0){
            int remainder = number.mod(BigInteger.valueOf(62)).intValue();
            sb.append(BASE62.charAt(remainder));
            number = number.divide(BigInteger.valueOf(62));
        }
        return sb.reverse().substring(0,7);
    }
}
