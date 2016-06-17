package app;

public class CalculaImpostoQuinzeOuDez implements CalculaImposto {
	
	@Override
	public double calcularSalarioComImposto(Funcionario umFuncionario){
		if(umFuncionario.getSalarioBase() > 2000) {
			return umFuncionario.getSalarioBase() * 0.85;
		}
		
		else {
			return umFuncionario.getSalarioBase() * 0.9;
		}
	}
}
