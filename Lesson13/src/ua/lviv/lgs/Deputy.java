package ua.lviv.lgs;

import java.util.Scanner;

public class Deputy extends Human {
	private String lastName;
	private String firstName;
	private int age;
	private boolean corruptionist;
	private int sizeOfBribe;
	
	public void giveBribe (){
		System.out.println("Введіть суму хабара");
		if (corruptionist) {
			Scanner sc = new Scanner(System.in);
			Integer bribe = sc.nextInt();
			if (bribe>5000) {
				System.out.println("Міліція ув'язнить депутата");
			} else {
				sizeOfBribe=bribe;
			}
		} else {
			System.out.println("Цей депутат не бере хабарів");
		}
	}

	public Deputy(int weight, int height, String lastName, String firstName,
			int age, boolean corruptionist) {
		super(weight, height);
		this.lastName = lastName;
		this.firstName = firstName;
		this.age = age;
		this.corruptionist = corruptionist;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isCorruptionist() {
		return corruptionist;
	}

	public void setCorruptionist(boolean corruptionist) {
		this.corruptionist = corruptionist;
	}

	public int getSizeOfBribe() {
		return sizeOfBribe;
	}

	public void setSizeOfBribe(int sizeOfBribe) {
		this.sizeOfBribe = sizeOfBribe;
	}

	@Override
	public String toString() {
		return "Deputy ["+ super.toString() +"  lastName=" + lastName + ", firstName=" + firstName
				+ ", age=" + age + ", corruptionist=" + corruptionist
				+ ", sizeOfBribe=" + sizeOfBribe + "]";
	}


	
	
}
