package aedTrabalho_n2;

import java.util.Iterator;

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
			conteudo.addFirst(new Carta(Naipe.OUROS, i));
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
		Object [] arr = null;
		
		while(it.hasNext()) {
			Object val =it.next();
			System.out.println(val);
		}
	}
	
	public void inShuffle(){
		if (conteudo.size() % 2 != 0) {
            throw new IllegalArgumentException("size must be even");
		}
		
		Iterator it = this.conteudo.iterator();
		Object [] arr = null;
		int i = 0;
		
		while(it.hasNext()) {
			arr[i]= it.next();
			i++;
		}
		
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
