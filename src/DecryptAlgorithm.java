
public abstract class DecryptAlgorithm {
	String key;

	public DecryptAlgorithm(String key) {
		this.key = key;
	}

	public abstract String decrypt(String Message);
}
