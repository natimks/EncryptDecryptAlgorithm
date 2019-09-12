
public class Main2 {

	
	public static void main(String[] args) {
		
		String key, str;		
		key = "SENHA";		
		SymmetricEncryptionFacade facade = new SymmetricEncryptionFacade(key);
		
		str = facade.encrypt("HelloWorld");		
		System.out.println(str);
		System.out.println(facade.decrypt(str));
		facade.print();
		
		key = "]kYV}(!7P$n5_0i R:?jOWtF/=-pe'AD&@r6%ZXs\"v*N[#wSl9zq2^+g;LoB`aGh{3.HIu4fbK)mU8|dMET><,Qc\\C1yxJ";		
		facade.setKey(key);
		
		str = facade.encrypt("HelloWorld");		
		System.out.println(str);
		System.out.println(facade.decrypt(str));		
		facade.print();

	}
	
	
}
