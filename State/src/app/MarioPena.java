package app;

public class MarioPena implements MarioState{
	@Override
	public MarioState pegarCogumelo() {
		System.out.println("Mario Ganhou 1000 Pontos");
		return this;
	}
	
	@Override
	public MarioState pegarFlor() {
		System.out.println("Mario Grande com Fogo");
		return new MarioFogo();
	}
	
	@Override
	public MarioState pegarPena() {
		System.out.println("Mario Ganhou 1000 Pontos");
		return this;
	}
	
	@Override
	public MarioState levarDano() {
		System.out.println("Mario Grande");
		return new MarioGrande();
	}
}
