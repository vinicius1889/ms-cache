package br.com.icarros.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import javax.xml.bind.DatatypeConverter;
import java.nio.charset.StandardCharsets;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

@Service
public class EncryptService {

    @Value("${encrypt.key}")
    String key;
    @Value("${encrypt.iv}")
    String iv;

    public String encrypt(String str) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidAlgorithmParameterException, InvalidKeyException, BadPaddingException, IllegalBlockSizeException {
        final byte[] secretKey = javax.xml.bind.DatatypeConverter.parseHexBinary(this.key);
        final byte[] initVector = javax.xml.bind.DatatypeConverter.parseHexBinary(this.iv);
        final Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(Cipher.ENCRYPT_MODE, new SecretKeySpec(secretKey, "AES"), new IvParameterSpec(initVector, 0, cipher.getBlockSize()));
        byte[] update = cipher.doFinal(str.getBytes(StandardCharsets.UTF_8));
        return DatatypeConverter.printHexBinary(update);
    }

}
