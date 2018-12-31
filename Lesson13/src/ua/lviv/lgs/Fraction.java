package ua.lviv.lgs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Fraction {
	
	
	private String name;

	public Fraction(String name) {
		super();
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private List<Deputy> fraction = new ArrayList<Deputy>();
	
	public void addDeputy() {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ ����");
		Integer weight = sc.nextInt();
		System.out.println("������ ���");
		Integer height = sc.nextInt();	
		System.out.println("������ �������");
		String lastName = sc.next();	
		System.out.println("������ ��'�");
		String firstName = sc.next();	
		System.out.println("������ ��");
		Integer age = sc.nextInt();		
		System.out.println("��� ������� ��������?");
		Boolean corruptionist = sc.nextBoolean();
		fraction.add(new Deputy(weight,height,lastName,firstName,age,corruptionist));
		fraction.get(fraction.size()-1).giveBribe();
		System.out.println("������ �������� "+fraction.get(fraction.size()-1).toString());
	}
	
	public void deleteDeputy(){
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �������");
		String lastName = sc.next();	
		boolean find = false;
		Iterator<Deputy> iterator = fraction.iterator();
		while (iterator.hasNext()) {
			Deputy deputyIterator = iterator.next();
			if (deputyIterator.getLastName().matches(lastName)) {
				iterator.remove();
				find=true;
			}
		}
		if (!find) System.out.println("�������� "+lastName+" �� ��������");
	}
	
	public void getCorruptionist() {
		Iterator<Deputy> iterator = fraction.iterator();
		System.out.println("������ ������������");
		while (iterator.hasNext()) {
			Deputy deputyIterator = iterator.next();
			if (deputyIterator.isCorruptionist()) {
				System.out.println(deputyIterator.toString());
			}
		}
	}
	
	
	public void getMostCorruptionist() {
		Iterator<Deputy> iterator = fraction.iterator();
				int maxBribe = 0;
		Deputy deputy = null;
		while (iterator.hasNext()) {
			Deputy deputyIterator = iterator.next();
			if (deputyIterator.getSizeOfBribe()>maxBribe) {
				maxBribe=deputyIterator.getSizeOfBribe();
				deputy = deputyIterator;
			}
		}
		System.out.println("��������� ����������� "+deputy.toString());
	}	
	
	
	public void getAllDeputies() {
		Iterator<Deputy> iterator = fraction.iterator();
		System.out.println("������ ��������");
		while (iterator.hasNext()) {
			System.out.println(iterator.next().toString());
		}
	}	
	
	
	public void clearFraction() {
		Iterator<Deputy> iterator = fraction.iterator();
		while (iterator.hasNext()) {
			iterator.remove();
		}
	}		
}
