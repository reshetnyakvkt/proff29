package week3.lesson2.Phone;

abstract class IPhone extends Phone {
	private int appleid;

	public IPhone(String number, boolean camera, int sideSize,int appleid) {
		super(number, camera, sideSize);	
		this.appleid = appleid;
	}
	
	public void printAppleId(){
		System.out.println("AppleId " + appleid);
	}
	
//	@Override
//	public void printModel(){
//		System.out.println("IPhone");
//	}
}
 