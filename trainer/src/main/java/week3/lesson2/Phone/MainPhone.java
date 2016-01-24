package week3.lesson2.Phone;

import java.util.ArrayList;
import java.util.Scanner;

/*
 Написать класс телефонов.
 Phone(String number, boolean camera, int sideSize)
 Nokia, Samsung
 IPhone(int appleId),IPhone4, IPhone5
 Что умеют делать:
 - call(Phone ph)
 - printModel()
 - printAppleId()// для айфонов
 MainPhone(список телефонов)
 Добавить пару телефонов с номерами каждого вида в список.(Nokia, Samsung, IPhone4, IPhone5)
 С консоли считать 2 (индекса)номера телефона и вызвать методы call  с одного номер на второй.
 Для всех телефонов из списка вызвать метод printModel.
 Затем для всех телефонов, для которых возможно вызвать метод printAppleId.
 */
public class MainPhone {
	private static ArrayList<Phone> list = new ArrayList<>();

	public static void main(String[] args) {

		addPhones();

		//callPhones();
		System.out.println("");
		printModelPhones();
		System.out.println("");
		printAppleIdPhones();
	}

	public static void addPhones() {
		list.add(new Nokia("nokia 3300", true, 300));
		list.add(new Nokia("nokia 5100", true, 400));

		list.add(new Samsung("samsung 326", true, 350));
		list.add(new Samsung("samsung 586", true, 450));

		list.add(new IPhone4("44441111", true, 1050, 1133));
		list.add(new IPhone4("44442222", true, 1100, 2314));

		list.add(new IPhone5("55551111", true, 1050, 1133));
		list.add(new IPhone5("55552222", true, 1100, 2314));
	}

	public static void callPhones() {
		Scanner scan = new Scanner(System.in);

		System.out.println("������� ��� ������� ������:");
		int idxNumCalling = scan.nextInt();
		int idxNumReceiving = scan.nextInt();
		list.get(idxNumCalling).call(list.get(idxNumReceiving));
	}

	public static void printModelPhones() {
		for (Phone phone : list) {
			phone.printModel();
        }		
	}

	public static void printAppleIdPhones() {
		for (Phone phone : list) {
			if (phone instanceof IPhone) {
			  //((IPhone)phone).printAppleId();
			  ((IPhone)(phone)).printAppleId();
			}
        }		
	}
}