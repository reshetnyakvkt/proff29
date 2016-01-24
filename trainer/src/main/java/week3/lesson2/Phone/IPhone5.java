package week3.lesson2.Phone;

class IPhone5 extends IPhone {
	public IPhone5(String number, boolean camera, int sideSize,int appleid){
		super(number, camera, sideSize, appleid);
	}
	@Override
	public void printModel(){		
		System.out.println("IPhone5");
	}
}
