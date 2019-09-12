
public class SubstitutionCipher {

	private String key;

	public SubstitutionCipher(String key) {
		this.key = key;
	}

	String encode(String s) {
		StringBuilder sb = new StringBuilder(s.length());

		for (char c : s.toCharArray())
			sb.append(key.charAt((int) c - 32));

		return sb.toString();
	}

	String decode(String s) {
		StringBuilder sb = new StringBuilder(s.length());

		for (char c : s.toCharArray())
			sb.append((char) (key.indexOf((int) c) + 32));

		return sb.toString().toUpperCase();
	}
}
