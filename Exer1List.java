package Colections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exer1List {

	public static void main(String[] args) {
		ArrayList<String> cores = new ArrayList<>();
		
		Scanner leia = new Scanner(System.in);
		
		for(int i=0;i<5;i++) {
			System.out.println("Digite uma cor: ");
			String cor = leia.nextLine();
			cores.add(cor);
		}
		
		for(String cor:cores) {
			System.out.println(cor);
		}
		
		Collections.sort(cores);
		System.out.println(cores);
	}

}
