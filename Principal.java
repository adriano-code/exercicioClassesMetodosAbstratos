package exercicioClassesMetodosAbstratos;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Contribuinte> lista = new ArrayList<>();
		
		System.out.print("Entre com o número de contribuintes: ");
		int n = sc.nextInt();
		
		for(int x = 0; x < n; x++) {
			System.out.println("\nEntre com os dados do contribuinte #"+ (x+1));
			System.out.print("Pessoa Física ou Jurídica (i/c)? ");
			char ch = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Contribuição Anual: ");
			double ca = sc.nextDouble();
			if(ch == 'i') {
				System.out.print("Gastos com saúde: ");
				double gs = sc.nextDouble();
				lista.add(new PessoaFisica(nome, ca, gs));
			} else {
				if(ch == 'c') {
					System.out.print("Número de funcionários: ");
					int num = sc.nextInt();
					lista.add(new PessoaJuridica(nome, ca, num));
				}
			}
			
		}
		
		System.out.println("\nTaxas pagas:");
		for(Contribuinte cont : lista) {
			System.out.println(cont.getName() + ": $ " + String.format("%.2f", cont.imposto()));
		}
		
		System.out.println("\nTotal arrecadado:");
		double sum = 0;
		for(Contribuinte cont : lista) {
			sum+=cont.imposto();
		}
		System.out.println("Total arrecadado: $ "+ String.format("%.2f", sum));
		
		
		
		
		
		
		
		
		sc.close();
		
	}

}
