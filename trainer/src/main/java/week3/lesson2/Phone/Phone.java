package week3.lesson2.Phone;

abstract class Phone {
	private String number;
	private boolean camera;
	private int sideSize;

	public Phone(String number, boolean camera, int sideSize) {
		this.number = number;
		this.camera = camera;
		this.sideSize = sideSize;
	}

	
	public void call(Phone ph){
		System.out.println("call " + number + " to " + ph.getNumber());
	}
	
	public String getNumber(){		
		return number;
	}
	
	abstract void printModel();
}
