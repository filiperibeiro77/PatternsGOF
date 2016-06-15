package main;
import app.*;

public class Main {
	
	public static void main(String[] args) {
		FabricaFiat fabrica = new FabricaFiat();
		Carro palio = fabrica.criarCarro();
		palio.exibirInfo();
	}

}
