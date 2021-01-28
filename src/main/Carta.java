package main;

public class Carta {

	private Naipe naipe;
	private int valor = 0;

	public Carta(Naipe n, int v){
		setNaipe(n);
		setValor(v);
	}

	private void setNaipe(Naipe oNaipe){
		naipe = oNaipe; }

	public Naipe getNaipe(){
		return naipe; 
		}
	
	private void setValor (int oValor){
		valor = oValor; 
		}

	public int getValor(){
		return valor; 
		}
	
	@Override
	public String toString(){
		char naipeCar = ' ';

		switch (naipe) {
		case ESPADAS:
			naipeCar = 'E';
			break;
		case PAUS:
			naipeCar = 'P';
			break;
		case COPAS:
			naipeCar = 'C';
			break;
		case OUROS:
			naipeCar = 'O';
			break;
		}

		String valorString = "" + valor;

		return "[" + naipeCar + " " + valorString + "]";
	}
}