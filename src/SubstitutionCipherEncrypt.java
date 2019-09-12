
public class SubstitutionCipherEncrypt extends EncryptAlgorithm {

	public SubstitutionCipherEncrypt(String key) {
		super(key);
	}

	@Override
	public String encrypt(String message) {
		StringBuilder sb = new StringBuilder(message.length());
		for (char c : message.toCharArray())
			sb.append(key.charAt((int) c - 32));

		return sb.toString();
	}

	@Override
	public String toString() {
		return "SubstitutionEncrypt";
	}

}