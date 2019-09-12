
public class VigenereCipherDecrypt extends DecryptAlgorithm {

	public VigenereCipherDecrypt(String key) {
		super(key);
	}

	@Override
	public String decrypt(String message) {
		return new VigenereCipher(key).decrypt(message);
	}

	@Override
	public String toString() {
		return "VigenereDecrypt"; 
	}
}
