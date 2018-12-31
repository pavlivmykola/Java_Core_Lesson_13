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
		System.out.println("Введіть вагу");
		Integer weight = sc.nextInt();
		System.out.println("Введіть ріст");
		Integer height = sc.nextInt();	
		System.out.println("Введіть прізвище");
		String lastName = sc.next();	
		System.out.println("Введіть ім'я");
		String firstName = sc.next();	
		System.out.println("Введіть вік");
		Integer age = sc.nextInt();		
		System.out.println("Цей депутат хабарник?");
		Boolean corruptionist = sc.nextBoolean();
		fraction.add(new Deputy(weight,height,lastName,firstName,age,corruptionist));
		fraction.get(fraction.size()-1).giveBribe();
		System.out.println("Додано депутата "+fraction.get(fraction.size()-1).toString());
	}
	
	public void deleteDeputy(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Введіть прізвище");
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
		if (!find) System.out.println("Депутата "+lastName+" не знайдено");
	}
	
	public void getCorruptionist() {
		Iterator<Deputy> iterator = fraction.iterator();
		System.out.println("Список корупціонерів");
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
		System.out.println("Найбільший корупціонер "+deputy.toString());
	}	
	
	
	public void getAllDeputies() {
		Iterator<Deputy> iterator = fraction.iterator();
		System.out.println("Список депутатів");
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
