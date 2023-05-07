package abstraction;

public class AbstarctUse extends AbstractionExample {
	
	
	public static void main(String[] args) {
		AbstarctUse abc = new AbstarctUse();
		
		
		abc.age();
		abc.city();
		abc.name();
	}

	@Override
	public void name() {
		// TODO Auto-generated method stub
		System.out.println("salim Iqbal");
		
	}

	@Override
	public void age() {
		// TODO Auto-generated method stub
		int age =15;
		System.out.println(age);
		
		
	}

	@Override
	public void city() {
		// TODO Auto-generated method stub
		
		System.out.println("Brooklyn");
		
	}

}
