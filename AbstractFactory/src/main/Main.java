package main;
import app.*;

public class Main {

	public static void main(String[] args) {
		FabricaFiat fabrica = new FabricaFiat();
		CarroPopular palio = fabrica.criarCarroPopular();
		CarroSedan siena = fabrica.criarCarroSedan();
		
		palio.exibirInfoPopular();
		siena.exibirInfoSedan();
	}

}
