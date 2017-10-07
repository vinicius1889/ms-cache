package br.com.icarros;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.scheduling.annotation.EnableScheduling;

import javax.crypto.*;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import javax.xml.bind.DatatypeConverter;
import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Base64;
import java.util.Random;


@EnableJms
@EnableScheduling
@SpringBootApplication
public class MsStarterApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsStarterApplication.class, args);
	}
}
//


//public class MsStarterApplication {
//
//	public static void main(String[] args) throws Exception {
//
//		InputStream cipherInputStream = null;
//		try {
//			final StringBuilder output = new StringBuilder();
//			final byte[] secretKey = javax.xml.bind.DatatypeConverter.parseHexBinary("333925384A4D344324373841562431375443213545414034454150453623325A");
//			final byte[] initVector = javax.xml.bind.DatatypeConverter.parseHexBinary("4441244655334056303937415A58354C");
//			final Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
//			cipher.init(Cipher.ENCRYPT_MODE, new SecretKeySpec(secretKey, "AES"), new IvParameterSpec(initVector, 0, cipher.getBlockSize()));
//
//			byte[] update = cipher.doFinal("01234567890".getBytes(StandardCharsets.UTF_8));
//
//			String s = DatatypeConverter.printHexBinary(update);
//
//			System.out.println(s);
//
//
//		} finally {
//			if (cipherInputStream != null) {
//				cipherInputStream.close();
//			}
//		}
//
//	}
//
//
//}