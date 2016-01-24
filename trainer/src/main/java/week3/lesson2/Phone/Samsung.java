package week3.lesson2.Phone;

class Samsung extends Phone{
	public Samsung(String number, boolean camera, int sideSize) {
		super(number, camera, sideSize);		
	}
	
	@Override
	public void printModel(){		
		System.out.println("Samsung");
	}
}
