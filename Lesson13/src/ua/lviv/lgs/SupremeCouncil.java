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
		System.out.println("Введіть назву фракції");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		supremeCouncil.add(new Fraction(name));
		System.out.println("Додано фракцію "+name);
	}
	
	public void deleteFraction(){
		System.out.println("Введіть назву фракції");		
		Scanner sc = new Scanner(System.in);
		String name = sc.next();		
		Iterator<Fraction> iterator = supremeCouncil.iterator();
		while (iterator.hasNext()) {
			if (iterator.next().getName().matches(name)){
				iterator.remove();
				System.out.println("Видалено фракцію "+name);
			}
		}
	}
	
	
	public void clearFraction(){
		System.out.println("Введіть назву фракції");		
		Scanner sc = new Scanner(System.in);
		String name = sc.next();		
		Iterator<Fraction> iterator = supremeCouncil.iterator();
		while (iterator.hasNext()) {
			Fraction fraction = iterator.next();
			if (fraction.getName().matches(name)){
				fraction.clearFraction();
				System.out.println("Очищено фракцію "+name);
			}
		}
	}	
	
	public void getAllFractions(){
		System.out.println("Фракції Верховної Ради");
		Iterator<Fraction> iterator = supremeCouncil.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next().getName());
		}
	}

	
	public void getFraction(){
		System.out.println("Введіть назву фракції");		
		Scanner sc = new Scanner(System.in);
		String name = sc.next();				
		Iterator<Fraction> iterator = supremeCouncil.iterator();
		while (iterator.hasNext()) {
			Fraction fraction = iterator.next();
			if (fraction.getName().matches(name)){
				System.out.println("Фракція "+fraction.getName());
			}
		}
	}
	
	public void addDeputy(){
		System.out.println("Введіть назву фракції");		
		Scanner sc = new Scanner(System.in);
		String name = sc.next();				
		Iterator<Fraction> iterator = supremeCouncil.iterator();
		boolean find = false;
		while (iterator.hasNext()) {
			Fraction fraction = iterator.next();
			if (fraction.getName().matches(name)){
				find = true;
				System.out.println("Додаємо депутата до фракції "+fraction.getName());
				fraction.addDeputy();				
			}			
		}
		if (!find) {
			System.out.println("Фракція "+name+" не знайдена");
		}
	}
	
	
	public void deleteDeputy(){
		System.out.println("Введіть назву фракції");		
		Scanner sc = new Scanner(System.in);
		String name = sc.next();			
		Iterator<Fraction> iterator = supremeCouncil.iterator();
		boolean find = false;
		while (iterator.hasNext()) {
			Fraction fraction = iterator.next();
			if (fraction.getName().matches(name)){
				find = true;
				System.out.println("Видаляєм депутата "+name+" з фракції "+fraction.getName());
				fraction.deleteDeputy();
			}			
		}
		if (!find) {
			System.out.println("Фракція "+name+" не знайдена");
		}
	}
	
	
	public void getCorruptionist(){
		System.out.println("Введіть назву фракції");		
		Scanner sc = new Scanner(System.in);
		String name = sc.next();			
		Iterator<Fraction> iterator = supremeCouncil.iterator();
		boolean find = false;
		while (iterator.hasNext()) {
			Fraction fraction = iterator.next();
			if (fraction.getName().matches(name)){
				find = true;
				System.out.println("Корупціонери з фракції "+fraction.getName());
				fraction.getCorruptionist();
			}			
		}
		if (!find) {
			System.out.println("Фракція "+name+" не знайдена");
		}		
	}
	
	
	
	public void getMostCorruptionist(){
		System.out.println("Введіть назву фракції");		
		Scanner sc = new Scanner(System.in);
		String name = sc.next();			
		Iterator<Fraction> iterator = supremeCouncil.iterator();
		boolean find = false;
		while (iterator.hasNext()) {
			Fraction fraction = iterator.next();
			if (fraction.getName().matches(name)){
				find = true;
				System.out.println("Найбільший корупціонер з фракції "+fraction.getName());
				fraction.getMostCorruptionist();
			}			
		}
		if (!find) {
			System.out.println("Фракція "+name+" не знайдена");
		}		
	}	
	
	
	
	public void getAllDeputies(){
		System.out.println("Введіть назву фракції");		
		Scanner sc = new Scanner(System.in);
		String name = sc.next();			
		Iterator<Fraction> iterator = supremeCouncil.iterator();
		boolean find = false;
		while (iterator.hasNext()) {
			Fraction fraction = iterator.next();
			if (fraction.getName().matches(name)){
				find = true;
				System.out.println("Депутати фракції "+fraction.getName());
				fraction.getAllDeputies();
			}			
		}
		if (!find) {
			System.out.println("Фракція "+name+" не знайдена");
		}		
	}	
	
}
