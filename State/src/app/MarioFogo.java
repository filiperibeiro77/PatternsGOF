package app;

public class MarioFogo implements MarioState{
	@Override
	public MarioState pegarCogumelo() {
		System.out.println("Mario Ganhou 1000 Pontos");
		return this;
	}
	
	@Override
	public MarioState pegarFlor() {
		System.out.println("Mario Ganhou 1000 Pontos");
		return this;
	}
	
	@Override
	public MarioState pegarPena() {
		System.out.println("Mario Grande com Pena");
		return new MarioPena();
	}
	
	@Override
	public MarioState levarDano() {
		System.out.println("Mario Grande");
		return new MarioGrande();
	}
}
