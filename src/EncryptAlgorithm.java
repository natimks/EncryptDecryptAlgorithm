
public abstract class EncryptAlgorithm {
	String key;
	public EncryptAlgorithm(String key) {
		this.key = key;
	}
	public abstract String encrypt(String Message);
}
