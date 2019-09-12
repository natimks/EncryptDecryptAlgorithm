
public class EncryptFactory implements EncryptFactoryAlgorithm {
	public final static int VIGENERE_CIPHER = 1;
	public final static int SUBSTITUTION_CIPHER = 2;

	@Override
	public EncryptAlgorithm getEncryptClass(int tipo, String key) {
		EncryptAlgorithm encryptAlgorithm = null;
		switch (tipo) {
		case VIGENERE_CIPHER:
			encryptAlgorithm = new VigenereCipherEncrypt(key);
			break;
		case SUBSTITUTION_CIPHER:
			encryptAlgorithm = new SubstitutionCipherEncrypt(key);
			break;
		default:
			break;
		}
		return encryptAlgorithm;
	}
}