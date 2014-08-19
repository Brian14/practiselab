package com.T819.base64;


import org.apache.commons.codec.binary.Base64;

/**
 * User: BAOBR
 * Date: 8/19/14
 */
public class TestBase64 {
    public static void main(String[] args) {
        String source = "11122233";

        byte encodeBytes[] = Base64.encodeBase64(source.getBytes());
        String encodeString = new String(encodeBytes);
        System.out.println("encodeString:" + encodeString);

        byte decodeBytes[] = Base64.decodeBase64(encodeString.getBytes());
        String decodeFromString = new String(decodeBytes);
        System.out.println("decode From String:" + decodeFromString);

        byte decodeBytesFromBytes[] = Base64.decodeBase64(encodeBytes);
        String decodeFromBytes = new String(decodeBytesFromBytes);
        System.out.println("decodeBytes From Bytes:" + decodeFromBytes);


    }
}
