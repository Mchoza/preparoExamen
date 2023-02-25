package examenGit;

public class SumaNumeros {
	
	//Atributos
	private static int numero1;
	private static int numero2;
	
	//Constructor
	
	public SumaNumeros(int numero1, int numero2) {
		super();
		this.numero1 = numero1;
		this.numero2 = numero2;
	}
	
	//Getters and setters

	public int getNumero1() {
		return numero1;
	}

	public void setNumero1(int numero1) {
		this.numero1 = numero1;
	}

	public int getNumero2() {
		return numero2;
	}

	public void setNumero2(int numero2) {
		this.numero2 = numero2;
	}
	
	public static int dimeSuma() {
		return numero1+numero2;
	}
	
	
	

}
