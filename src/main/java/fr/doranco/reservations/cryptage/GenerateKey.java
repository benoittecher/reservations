package fr.doranco.reservations.cryptage;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

public abstract class GenerateKey {
	public final static SecretKey getKey(String algorithm, int keysize) throws NoSuchAlgorithmException, GeneralSecurityException {
		
		KeyGenerator keyGen = KeyGenerator.getInstance(algorithm);
		keyGen.init(keysize);
		SecretKey key = keyGen.generateKey();
		
		return key;
	}

}
