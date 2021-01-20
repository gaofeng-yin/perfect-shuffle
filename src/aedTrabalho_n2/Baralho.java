package aedTrabalho_n2;

import myCollections.ArrayDeque;

public class Baralho {

	private ArrayDeque<Carta> conteudo;

	public Baralho(){
		this.conteudo = new ArrayDeque<>();
	}

	public Baralho(int numeroDeCartas){
		this.conteudo = new ArrayDeque<>(numeroDeCartas);
	}

	/** Devolve o conteúdo do baralho.
	 @return o conteúdo do baralho.
	 */
	public ArrayDeque<Carta> getConteudo(){
		throw new UnsupportedOperationException("Método não implementado!"); 
	}

	public boolean nextBaralho(){
		throw new UnsupportedOperationException("Método não implementado!"); 
	}

	/** Executa o baralho perfeito in-shuffle.
	 */
	public void inShuffle(){
		throw new UnsupportedOperationException("Método não implementado!"); 
	} // fim de inShuffle

	/** Executa o baralho perfeito out-shuffle.
	 */
	public void outShuffle(){
		throw new UnsupportedOperationException("Método não implementado!"); 
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
