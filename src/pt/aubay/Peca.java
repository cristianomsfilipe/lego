package pt.aubay;

public class Peca {

	Cor cor;
	double altura;
	int numPinosX;
	int numPinosY;
	
	public Peca() {
		
	}
	
	public Peca(Cor cor, double altura, int numPinosX, int numPinosY) {
		super();
		this.cor = cor;
		this.altura = altura;
		this.numPinosX = numPinosX;
		this.numPinosY = numPinosY;
	}

	@Override
	public String toString() {
		return "Peca [cor=" + cor + ", altura=" + altura + ", numPinosX=" + numPinosX + ", numPinosY=" + numPinosY
				+ "]";
	}

	void girar() {
		
	}
	

}
