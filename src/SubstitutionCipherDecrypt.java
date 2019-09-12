
public class SubstitutionCipherDecrypt extends DecryptAlgorithm {

	public SubstitutionCipherDecrypt(String key) {
		super(key);
	}

	@Override
	public String decrypt(String message) {
		return new SubstitutionCipher(key).decode(message);
	}

	@Override
	public String toString() {
		return "SubstitutionDecrypt";
	}

}
