
public class SubstitutionCipherDecrypt extends DecryptAlgorithm {

	public SubstitutionCipherDecrypt(String key) {
		super(key);
	}

	@Override
	public String decrypt(String message) {
		StringBuilder sb = new StringBuilder(message.length());

		for (char c : message.toCharArray())
			sb.append((char) (key.indexOf((int) c) + 32));

		return sb.toString().toUpperCase();
	}

	@Override
	public String toString() {
		return "SubstitutionDecrypt";
	}

}
