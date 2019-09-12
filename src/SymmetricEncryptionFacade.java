
public class SymmetricEncryptionFacade {
	EncryptAlgorithm encryptAlgorithm;
	DecryptAlgorithm decryptAlgorithm;
	EncryptFactory encryptFactory;
	DecryptFactory decryptFactory;
	String key;

	public SymmetricEncryptionFacade(String key) {
		this.key = key;
		decryptFactory = new DecryptFactory();
		encryptFactory = new EncryptFactory();
	}

	public String encrypt(String str) {
		if (key.length() > 10) {
			encryptAlgorithm = encryptFactory.getEncryptClass(EncryptFactory.SUBSTITUTION_CIPHER, key);
		} else {
			encryptAlgorithm = encryptFactory.getEncryptClass(EncryptFactory.VIGENERE_CIPHER, key);
		}
		return encryptAlgorithm.encrypt(str);
	}

	public String decrypt(String str) {
		if (key.length() > 10) {
			decryptAlgorithm = decryptFactory.getDecryptClass(EncryptFactory.SUBSTITUTION_CIPHER, key);
		} else {
			decryptAlgorithm = decryptFactory.getDecryptClass(EncryptFactory.VIGENERE_CIPHER, key);
		}
		return decryptAlgorithm.decrypt(str);
	}

	public void setKey(String key) {
		this.key = key;
	}

	public void print() {
		System.out.println("Key: " + key);
		System.out.println("Encrypt Algorithm: " + encryptAlgorithm);
		System.out.println("Decrypt Algorithm: " + decryptAlgorithm);
	}

}
