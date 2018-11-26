package pt.aubay;

import java.util.ArrayList;
import java.util.List;

public class Tres {

	List<Peca> pecas = new ArrayList<Peca>();
	
	public Tres() {
		Peca peca1 = new Peca(Cor.VERDE_ESCURO, 9.6, 3, 2);
		pecas.add(peca1);
		Peca peca2 = new Peca(Cor.VERDE_CLARO, 9.6, 2, 1);
		pecas.add(peca2);
		Peca peca3 = new Peca(Cor.VERDE_ESCURO, 9.6, 2, 2);
		pecas.add(peca3);
		Peca peca4 = new Peca(Cor.VERDE_CLARO, 9.6, 2, 1);
		pecas.add(peca4);
		Peca peca5 = new Peca(Cor.VERDE_ESCURO, 9.6, 3, 2);
		pecas.add(peca5);
	}

	@Override
	public String toString() {
		return "Tres [pecas=" + pecas + "]";
	}
	
}
