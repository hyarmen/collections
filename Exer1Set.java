package Colections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Exer1Set {

	public static void main(String[] args) {
		Set<Integer> numeros = new HashSet<>();
		
		Scanner leia = new Scanner(System.in);
		
		for(int i=0;i<10;i++) {
			System.out.println("Entre com um número: ");
			int num = leia.nextInt();
			numeros.add(num);
		}
		
		Iterator<Integer> iterator = numeros.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}

}
