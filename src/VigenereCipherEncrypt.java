
public class VigenereCipherEncrypt extends EncryptAlgorithm {

	public VigenereCipherEncrypt(String key) {
		super(key);
	}

	@Override
	public String encrypt(String message) {
		String EMessage = "";
		message = message.toUpperCase();
		for (int i = 0, j = 0; i < message.length(); i++) {
			char letter = message.charAt(i);
			EMessage += (char) (((letter - 65) + (key.charAt(j) - 65)) % 26 + 65);
			j = ++j % key.length();
		}
		return EMessage;
	}

	@Override
	public String toString() {
		return "VigenereEncrypt";
	}
}
