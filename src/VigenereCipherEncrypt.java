
public class VigenereCipherEncrypt extends EncryptAlgorithm {

	public VigenereCipherEncrypt(String key) {
		super(key);
	}

	@Override
	public String encrypt(String message) {
		return new VigenereCipher(key).encrypt(message);
	}

	@Override
	public String toString() {
		return "VigenereEncrypt";
	}
}
