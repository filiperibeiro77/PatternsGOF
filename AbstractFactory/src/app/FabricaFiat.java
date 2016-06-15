package app;

public class FabricaFiat implements FabricaDeCarro {
	
	@Override
	public CarroPopular criarCarroPopular() {
		return new Palio();
	}
	
	@Override
	public CarroSedan criarCarroSedan() {
		return new Siena();
	}
	
}
