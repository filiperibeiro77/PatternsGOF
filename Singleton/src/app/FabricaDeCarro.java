package app;

public class FabricaDeCarro {
	public static FabricaDeCarro instancia;
	
	protected FabricaDeCarro(){
		
	}
	
	public FabricaDeCarro getCarro() {
		if (instancia == null) {
			instancia = new FabricaDeCarro();
		}
		
		return instancia;
	}
}
