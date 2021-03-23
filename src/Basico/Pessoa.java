package Basico;
import Basico.Exercicios_1_Basico;
public class Pessoa {

	int dias;
	int meses;
	int anos;

	public int idade () {
		
		int x = anos * 365;
		int y = meses * 30;
		
		return x + y + dias;
	}
}