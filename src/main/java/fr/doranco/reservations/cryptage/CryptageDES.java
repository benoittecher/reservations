package fr.doranco.reservations.cryptage;

import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;

/**
 * Classe permettant d'effectuer le cryptage et decryptage de messages avec l'algorithme DES.<br/>
 * Elle propose les m�thodes statiques suivantes :
	 * <ul>
	 * 		<li> G�n�ration de cl� de cryptage.</li>
	 * 		<li> Encryptage.</li>
	 * 		<li> D�cryptage.</li>
	 * </ul>
 * @author Ryadh
 *
 */
public abstract class CryptageDES {

	/**
	 * Effectue l'encryptage de message.
	 * @param messageToEncrypt : Le message de type {@link String} � encrypter.
	 * @param key : La cl� utilis�e pour l'ecryptage du message.
	 * @return Le message encrypt� de type.
	 *  
	 * @throws NoSuchAlgorithmException
	 * @throws NoSuchPaddingException
	 * @throws GeneralSecurityException
	 * @throws UnsupportedEncodingException
	 * 
	 * @author Ryadh
	 */
	public static byte[] encrypt(String messageToEncrypt, SecretKey key) throws NoSuchAlgorithmException, NoSuchPaddingException,
																				GeneralSecurityException, UnsupportedEncodingException {
		Cipher cipher = Cipher.getInstance("DES");
		//System.out.println("instance de chiffrement : " + cipher.getProvider().getInfo());
		cipher.init(Cipher.ENCRYPT_MODE, key);
		byte[] messageInBytes = messageToEncrypt.getBytes("UTF-8");
		byte[] messageEncrypte = cipher.doFinal(messageInBytes);
		
		return messageEncrypte;
	}
	
	public static String decrypt(byte[] cipherBytes, SecretKey key) throws NoSuchAlgorithmException, NoSuchPaddingException,
																			GeneralSecurityException, UnsupportedEncodingException {
		Cipher cipher = Cipher.getInstance("DES");
		cipher.init(Cipher.DECRYPT_MODE, key);
		byte[] messageDecrypteInBytes = cipher.doFinal(cipherBytes);
		String messageDecrypte = new String(messageDecrypteInBytes, "UTF8");
		
		return messageDecrypte;
	}
	
}
