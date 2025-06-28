package com.example.organ;

import org.springframework.stereotype.Component;

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

@Component
public class JwtKeyGenerator {

    public static void main(String args[]) throws NoSuchAlgorithmException {
        KeyGenerator keyGen=KeyGenerator.getInstance("HmacSha256");
        keyGen.init(256);
        SecretKey secretKey = keyGen.generateKey();
        String base64Key = Base64.getEncoder().encodeToString(secretKey.getEncoded());
        System.out.println(base64Key);
    }

}
