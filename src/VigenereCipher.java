
public class VigenereCipher {

	private String key;

	public VigenereCipher(String key) {
		this.key = key.toUpperCase();
	}

	public String encrypt(String Message) {
		String EMessage = "";
		Message = Message.toUpperCase();
		for (int i = 0, j = 0; i < Message.length(); i++) {
			char letter = Message.charAt(i);
			EMessage += (char) (((letter - 65) + (key.charAt(j) - 65)) % 26 + 65);
			j = ++j % key.length();
		}
		return EMessage;
	}

	public String decrypt(String Message) {
		String DMessage = "";
		Message = Message.toUpperCase();
		for (int i = 0, j = 0; i < Message.length(); i++) {
			char letter = Message.charAt(i);
			DMessage += (char) ((letter - key.charAt(j) + 26) % 26 + 65);
			j = ++j % key.length();
		}
		return DMessage;
	}
}
