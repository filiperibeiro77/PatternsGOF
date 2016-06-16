package app;

public abstract class ArquivoComponent {
	
	String nomeDoArquivo;
	
	public void imprimirNomeDoArquivo() {
		System.out.println(this.nomeDoArquivo);
	}
	
	public String getNomedoArquivo() {
		return this.nomeDoArquivo;
	}
	
	public void adicionarNovoComponent(ArquivoComponent novoArquivo) throws Exception{
		throw new Exception("Não é possível adicionar arquivos em " 
				+this.nomeDoArquivo+ " pois não é uma pasta");
	}
	
	public void removerComponent(String nomeDoArquivo) throws Exception {
		throw new Exception("Não é possível adicionar arquivos em " 
				+this.nomeDoArquivo+ " pois não é uma pasta");
	}
	
	public ArquivoComponent getArquivo(String nomeDoArquivo) throws Exception {
		throw new Exception("Não é possível pesquisar arquivos em " 
				+this.nomeDoArquivo+ " pois não é uma pasta");
	}
	
}
