
public class SubstitutionCipherEncrypt extends EncryptAlgorithm {

	public SubstitutionCipherEncrypt(String key) {
		super(key);
	}

	@Override
	public String encrypt(String message) {
		return new SubstitutionCipher(key).encode(message);
	}

	@Override
	public String toString() {
		return "SubstitutionEncrypt";
	}

}