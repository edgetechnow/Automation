package encapsulation;

public class EncapSetTest  {
	
	
	
	
	public static void main(String[] args) {
		EncapTest encap = new EncapTest();
		
		encap.setAge(18);
		encap.setName("Hasan");
		encap.setIdNum("123");
		
		System.out.println(" My age: "+ encap.getAge() + " My name: " +encap.getName() + " My id: "
		+ encap.getIdNum());
		
		
		encap.setAge(28);
		encap.setName("Adam");
		encap.setIdNum("003");
		
		System.out.println(" My age: "+ encap.getAge() + " My name: " +encap.getName() + " My id: "
		+ encap.getIdNum());
		
		
	}

}
