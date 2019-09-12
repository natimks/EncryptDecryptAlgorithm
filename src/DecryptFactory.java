
public class DecryptFactory implements DecryptFactoryAlgotithm {
	public final static int VIGENERE_CIPHER = 1;
	public final static int SUBSTITUTION_CIPHER = 2;

	@Override
	public DecryptAlgorithm getDecryptClass(int tipo, String key) {
		DecryptAlgorithm decryptAlgorithm = null;
		switch (tipo) {
		case VIGENERE_CIPHER:
			decryptAlgorithm = new VigenereCipherDecrypt(key);
			break;
		case SUBSTITUTION_CIPHER:
			decryptAlgorithm = new SubstitutionCipherDecrypt(key);
			break;
		default:
			break;
		}
		return decryptAlgorithm;
	}

}
