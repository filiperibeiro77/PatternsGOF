package app;

public class MarioGrande implements MarioState {
	@Override
	public MarioState pegarCogumelo() {
		System.out.println("Mario ganhou 1000 Pontos");
		return this;
	}
	
	@Override
	public MarioState pegarFlor() {
		System.out.println("Mario Grande com Fogo");
		return new MarioFogo();
	}
	
	@Override
	public MarioState pegarPena() {
		System.out.println("Mario Grande com Pena");
		return new MarioPena();
	}
	
	@Override
	public MarioState levarDano() {
		System.out.println("Mario Pequeno");
		return new MarioPequeno();
	}
}
