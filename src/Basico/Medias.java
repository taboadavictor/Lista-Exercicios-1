package Basico;

import java.util.ArrayList;

public class Medias {

	double x, y, z;
	double a, b, c;
	
	public double mediaAritmetica () {
		
		double mediaAritmetica;
		mediaAritmetica =  (x + y + z) / 3;
		return mediaAritmetica; 
	}
	
	public double media () {
		
		double media;
		media =  (a + b + c) / 2;
		return media;	
	}
	
	public double resultado () {
		
		double p = media () + mediaAritmetica ();
		
		return p;
	}
	
	public double resultadoFinal () {

		double p = media () + mediaAritmetica ();
		
		return p / 2;
		
	}
}
