package ua.lviv.lgs;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		boolean run = true;
		while (run) {		
			System.out.println();
			System.out.println("Введіть 1 щоб додати фракцію");
			System.out.println("Введіть 2 щоб видалити конкретну фракцію");
			System.out.println("Введіть 3 щоб вивести усі  фракції");
			System.out.println("Введіть 4 щоб очистити конкретну фракцію");
			System.out.println("Введіть 5 щоб вивести конкретну фракцію");
			System.out.println("Введіть 6 щоб додати депутата в фракцію");
			System.out.println("Введіть 7 щоб видалити депутата з фракції");
			System.out.println("Введіть 8 щоб вивести список хабарників");
			System.out.println("Введіть 9 щоб вивести найбільшого хабарника");
		
			Scanner sc = new Scanner(System.in);
			int i = sc.nextInt();
			switch (i) {
			case 1:
				SupremeCouncil.getInstance().addFraction();
				break;
			case 2:
				SupremeCouncil.getInstance().deleteFraction();
				break;
			case 3:
				SupremeCouncil.getInstance().getAllFractions();
				break;
			case 4:
				SupremeCouncil.getInstance().clearFraction();
				break;
			case 5:
				SupremeCouncil.getInstance().getFraction();
				break;
			case 6:
				SupremeCouncil.getInstance().addDeputy();
				break;
			case 7:
				SupremeCouncil.getInstance().deleteDeputy();
				break;
			case 8:
				SupremeCouncil.getInstance().getCorruptionist();
				break;
			case 9:
				SupremeCouncil.getInstance().getMostCorruptionist();
				break;
			default: run=false;break;
			}
		}

	}

}
