
public class Main1 {

	public static void main(String[] args) {
		VigenereCipher vigenere = new VigenereCipher("SENHA");
		SubstitutionCipher substitution = new SubstitutionCipher("]kYV}(!7P$n5_0i R"
				+ ":?jOWtF/=-pe'AD&@r6%ZXs\"v*N[#wSl9zq2^+g;LoB`aGh{3.HIu4fbK)mU8|dMET>"
				+ "<,Qc\\C1yxJ");
		String str;

		str = vigenere.encrypt("HelloWorld");		
		System.out.println(str);
		System.out.println(vigenere.decrypt(str));
		
		
		str = substitution.encode("HelloWorld");		
		System.out.println(str);
		System.out.println(substitution.decode(str));

	}

}
