package ua.lviv.lgs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public final class SupremeCouncil {
	private List<Fraction> supremeCouncil = new ArrayList<Fraction>();
	private static SupremeCouncil _instance = null;
	
	private static final SupremeCouncil INSTANCE = new SupremeCouncil();
	
	private SupremeCouncil() {
		super();
	}

	  public static SupremeCouncil getInstance() {
	        if (_instance == null)
	            _instance = new SupremeCouncil();
	        return _instance;
	    }
	
	public void addFraction(){
		System.out.println("������ ����� �������");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		supremeCouncil.add(new Fraction(name));
		System.out.println("������ ������� "+name);
	}
	
	public void deleteFraction(){
		System.out.println("������ ����� �������");		
		Scanner sc = new Scanner(System.in);
		String name = sc.next();		
		Iterator<Fraction> iterator = supremeCouncil.iterator();
		while (iterator.hasNext()) {
			if (iterator.next().getName().matches(name)){
				iterator.remove();
				System.out.println("�������� ������� "+name);
			}
		}
	}
	
	
	public void clearFraction(){
		System.out.println("������ ����� �������");		
		Scanner sc = new Scanner(System.in);
		String name = sc.next();		
		Iterator<Fraction> iterator = supremeCouncil.iterator();
		while (iterator.hasNext()) {
			Fraction fraction = iterator.next();
			if (fraction.getName().matches(name)){
				fraction.clearFraction();
				System.out.println("������� ������� "+name);
			}
		}
	}	
	
	public void getAllFractions(){
		System.out.println("������� �������� ����");
		Iterator<Fraction> iterator = supremeCouncil.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next().getName());
		}
	}

	
	public void getFraction(){
		System.out.println("������ ����� �������");		
		Scanner sc = new Scanner(System.in);
		String name = sc.next();				
		Iterator<Fraction> iterator = supremeCouncil.iterator();
		while (iterator.hasNext()) {
			Fraction fraction = iterator.next();
			if (fraction.getName().matches(name)){
				System.out.println("������� "+fraction.getName());
			}
		}
	}
	
	public void addDeputy(){
		System.out.println("������ ����� �������");		
		Scanner sc = new Scanner(System.in);
		String name = sc.next();				
		Iterator<Fraction> iterator = supremeCouncil.iterator();
		boolean find = false;
		while (iterator.hasNext()) {
			Fraction fraction = iterator.next();
			if (fraction.getName().matches(name)){
				find = true;
				System.out.println("������ �������� �� ������� "+fraction.getName());
				fraction.addDeputy();				
			}			
		}
		if (!find) {
			System.out.println("������� "+name+" �� ��������");
		}
	}
	
	
	public void deleteDeputy(){
		System.out.println("������ ����� �������");		
		Scanner sc = new Scanner(System.in);
		String name = sc.next();			
		Iterator<Fraction> iterator = supremeCouncil.iterator();
		boolean find = false;
		while (iterator.hasNext()) {
			Fraction fraction = iterator.next();
			if (fraction.getName().matches(name)){
				find = true;
				System.out.println("�������� �������� "+name+" � ������� "+fraction.getName());
				fraction.deleteDeputy();
			}			
		}
		if (!find) {
			System.out.println("������� "+name+" �� ��������");
		}
	}
	
	
	public void getCorruptionist(){
		System.out.println("������ ����� �������");		
		Scanner sc = new Scanner(System.in);
		String name = sc.next();			
		Iterator<Fraction> iterator = supremeCouncil.iterator();
		boolean find = false;
		while (iterator.hasNext()) {
			Fraction fraction = iterator.next();
			if (fraction.getName().matches(name)){
				find = true;
				System.out.println("������������ � ������� "+fraction.getName());
				fraction.getCorruptionist();
			}			
		}
		if (!find) {
			System.out.println("������� "+name+" �� ��������");
		}		
	}
	
	
	
	public void getMostCorruptionist(){
		System.out.println("������ ����� �������");		
		Scanner sc = new Scanner(System.in);
		String name = sc.next();			
		Iterator<Fraction> iterator = supremeCouncil.iterator();
		boolean find = false;
		while (iterator.hasNext()) {
			Fraction fraction = iterator.next();
			if (fraction.getName().matches(name)){
				find = true;
				System.out.println("��������� ����������� � ������� "+fraction.getName());
				fraction.getMostCorruptionist();
			}			
		}
		if (!find) {
			System.out.println("������� "+name+" �� ��������");
		}		
	}	
	
	
	
	public void getAllDeputies(){
		System.out.println("������ ����� �������");		
		Scanner sc = new Scanner(System.in);
		String name = sc.next();			
		Iterator<Fraction> iterator = supremeCouncil.iterator();
		boolean find = false;
		while (iterator.hasNext()) {
			Fraction fraction = iterator.next();
			if (fraction.getName().matches(name)){
				find = true;
				System.out.println("�������� ������� "+fraction.getName());
				fraction.getAllDeputies();
			}			
		}
		if (!find) {
			System.out.println("������� "+name+" �� ��������");
		}		
	}	
	
}
