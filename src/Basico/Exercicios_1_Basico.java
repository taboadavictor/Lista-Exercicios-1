package Basico;

import java.util.Locale;
import java.util.Scanner;

public class Exercicios_1_Basico {

	public static void main(String[] args) {
		/*
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		Pessoa p = new Pessoa();
		
		System.out.println("Entre com os anos");
		p.anos = sc.nextInt();
		sc.nextLine();
		System.out.println("Entre com os meses");
		p.meses = sc.nextInt();
		sc.nextLine();
		System.out.println("Entre com os dias");
		p.dias = sc.nextInt();
		sc.nextLine();
		
		System.out.printf("Resultado: %d anos, %d meses e %d dias = %d", p.anos, p.meses, p.dias, p.idade());

		sc.close();
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		Medias medias = new Medias();
		
		System.out.println("Valores para media aritmetica");
		medias.x = sc.nextDouble();
		medias.y = sc.nextDouble();
		medias.z = sc.nextDouble();
		
		System.out.println("Valores para media");
		medias.a = sc.nextDouble();
		medias.b = sc.nextDouble();
		medias.c = sc.nextDouble();
		
		System.out.println("Media Aritmetica = " + medias.mediaAritmetica());
		System.out.println("Media dos numeros = " + medias.media());
		System.out.println("Soma das medias = " + medias.resultado());
		System.out.println("Media das medias = " + medias.resultadoFinal());
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		Salario ss = new Salario ();
		System.out.println("Entre com o salario");
		ss.salario = sc.nextDouble();
		System.out.println("Entre com a taxa");
		ss.taxa = sc.nextDouble();
		ss.taxa();
		
		
		System.out.println(ss.salario());
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		Pecas p1 = new Pecas ();
		Pecas2 p2 = new Pecas2 ();
		
		double ipi;
		
		System.out.println("Entre com o código da peça 1, valor e quantidade (separados por espaço)");
		p1.cod = sc.nextInt();
		p1.valor = sc.nextDouble();
		p1.quant = sc.nextInt();
		
		
		System.out.println("Entre com o código da peça 2, valor e quantidade (separados por espaço)");
		p2.cod = sc.nextInt();
		p2.valor = sc.nextDouble();
		p2.quant = sc.nextInt();
		
		
		System.out.println("Entre com o valor do imposto");
		ipi = sc.nextDouble();
		
		
		double resultado = (p1.valor * p1.quant + p2.valor * p2.quant) * (ipi / 100 + 1);
		
		System.out.println(resultado);
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		salarioMinimo sal = new salarioMinimo ();
		
		System.out.println("Entre com o seu salário");
		sal.sal = sc.nextDouble();
		
		System.out.println(String.format("%.2f", sal.calc()));
		*/
		
		Scanner sc = new Scanner (System.in);
		
		Numero n = new Numero ();
		
		System.out.println("Entre com o numero");
		n.numero = sc.nextInt();
		
		System.out.println("O antecessor do número " + n.numero 
				+ " é " + n.ant() +  " e o sucessor é "
				+ n.suc());
	
	}
}