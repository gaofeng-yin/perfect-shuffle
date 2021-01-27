package aedTrabalho_n2;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Stack;

import myCollections.ArrayDeque;

public class Baralho {

	private ArrayDeque<Carta> conteudo;

	public Baralho(){
		this.conteudo = new ArrayDeque<Carta>();
		int i = 1;
		while(!conteudo.isFull()) {
			conteudo.addFirst(new Carta(Naipe.ESPADAS, i));
			i++;
		}
	}
	
	public Baralho(int numeroDeCartas){
		if(numeroDeCartas % 2 != 0) {
			throw new IllegalArgumentException("Deck size must be even!"); 
		}
		this.conteudo = new ArrayDeque<Carta>(numeroDeCartas);
		int i = numeroDeCartas;
		while(!conteudo.isFull()) {
			conteudo.addFirst(new Carta(Naipe.COPAS, i));
			i--;
		}
	}

	/** Devolve o conteúdo do baralho.
	 @return o conteúdo do baralho.
	 */
	public ArrayDeque<Carta> getConteudo(){
		if (conteudo.isEmpty()) {
	         throw new IllegalStateException("Can't get from an empty deck.");
	    }
		return conteudo;
	}

	public boolean nextBaralho(){
		throw new UnsupportedOperationException("Método não implementado!"); 
	}

	/** Executa o baralho perfeito in-shuffle.
	 */
	
	public void carta() {
		Iterator it = this.conteudo.iterator();
		Object [] arr = new Object[conteudo.size()];
		Object [] clo = null;
		/*
		while(it.hasNext()) {
			Object val =it.next();
			System.out.println(val);
		}*/
		int i = 0;
		while(it.hasNext()) {
			arr[i] = it.next();
			i++;
		}
		clo = arr.clone();
		for(int j = 0; j < clo.length; j++) {
			System.out.println(clo[j]);
		}
		
	}
	
	public void inShuffle(){
		if (conteudo.size() % 2 != 0) {
            throw new IllegalArgumentException("size must be even");
		}
		//Shuffled cards
		ArrayDeque<Object> shuffle = new ArrayDeque<Object>();
		//count number of shuffle
		int countShuffle = 0;
		int embNum = 1;
		//conteudo iterator
		Iterator it = this.conteudo.iterator();
		//object array for cartas to store conteudo
		Object [] cartas = new Object[conteudo.size()];
		//to clone cartas, for verification after shuffle
		Object [] cartasClone = null;
		int i = 0;
		//conteudo to array
		while(it.hasNext()) {
			cartas[i]= it.next();
			i++;
		}
		//cartas clone
		cartasClone = cartas.clone();
		Object [] shuffled = new Object[conteudo.size()];
		shuffled = cartas.clone();
		//do {
			System.out.println("--embaralhar #" + (embNum++) + "--");
			System.out.println("IN-SHUFFLE");
			System.out.print("Baralho original: ");
			for(int g = 0; g < shuffled.length; g++) {
				System.out.print(shuffled[g] + " ");
			}
			System.out.print("\nMetade superior: ");
			Object [] mSuperior = new Object[conteudo.size()/2];
			for(int n = 0; n<=(conteudo.size()/2)-1; n++) {
				mSuperior[n] = cartas[n];
				System.out.print(mSuperior[n] + " ");
			}
			
			int s = 0;
			System.out.print("\nMetade inferior: ");
			Object [] mInferior = new Object[conteudo.size()/2];
			for(int n = (conteudo.size()/2); n<=conteudo.size()-1; n++) {
				mInferior[s] = cartas[n];
				System.out.print(mInferior[s] + " ");
				s++;
			}
			System.out.print("\nBaralhado: ");
			Stack<Object> st = new Stack<Object>();
			int o = 0;
			while(o != mInferior.length) {
				shuffle.addFirst(mInferior[o]);
				shuffle.addFirst(mSuperior[o]);
				o++;
			}
			
			Iterator ar = shuffle.iterator();
			int q = 0;

			while(ar.hasNext()) {
				shuffled[q]= ar.next();
				q++;
			}
			int t = shuffled.length-1;
			while(t >= 0) {
				System.out.print(shuffled[t]);
				t--;
			}
			countShuffle++;
		//}while(Arrays.deepEquals(cartasClone, cartas));
		
	} // fim de inShuffle

	/** Executa o baralho perfeito out-shuffle.
	 */
	public void outShuffle(){
		if (conteudo.size() % 2 != 0) {
            throw new IllegalArgumentException("size must be even");
		}
            //throw new UnsupportedOperationException("Método não implementado!"); 
	} // fim de outShuffle

	/** Mover a carta de topo do baralho um determinado número de
	 posições para baixo do baralho.
	 @param posicao o número de posições a mover.
	 @param messagens quando as mensagens devem ou não ser escritas.
	 */
	public void moveTopo(int posicao, boolean messagens){
		throw new UnsupportedOperationException("Método não implementado!"); 
	} // fim de moveTopo

} // fim de Baralho
