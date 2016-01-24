package week3.lesson2.Phone;

class Nokia extends Phone {
	public Nokia(String number, boolean camera, int sideSize) {
		super(number, camera, sideSize);		
	}
	
	@Override
	public void printModel(){		
		System.out.println("Nokia");
	}
}
