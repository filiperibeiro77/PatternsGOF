package app;

public class Mario {
	MarioState estado;
	
	public Mario (){
		new MarioPequeno();
	}

	public void pegarCogumelo() {
		estado = estado.pegarCogumelo();
	}
	
	public void pegarFlor() {
		estado = estado.pegarFlor();
	}
	
	public void pegarPena() {
		estado = estado.pegarPena();
	}
	
	public void levarDano() {
		estado = estado.levarDano();
	}
	
}
