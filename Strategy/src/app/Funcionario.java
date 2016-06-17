package app;

public class Funcionario {
	private String cargo;
	private double salarioBase;
	
	Funcionario(String cargo, double salarioBase) {
		this.cargo = cargo;
		this.salarioBase = salarioBase;
	}
	
	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
	
	if (this.getCargo().equals("desenvolvedor")) {
		estrategiaDeCalculo = new CalculoImpostoQuinzeOuDez();
		this.setCargo("desenvolvedor");
	}
	
}
