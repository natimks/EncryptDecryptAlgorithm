
public class VigenereCipherDecrypt extends DecryptAlgorithm {

	public VigenereCipherDecrypt(String key) {
		super(key);
	}

	@Override
	public String decrypt(String message) {
		String DMessage = "";
		message = message.toUpperCase();
		for (int i = 0, j = 0; i < message.length(); i++) {
			char letter = message.charAt(i);
			DMessage += (char) ((letter - key.charAt(j) + 26) % 26 + 65);
			j = ++j % key.length();
		}
		return DMessage;
	}

	@Override
	public String toString() {
		return "VigenereDecrypt";
	}
}
