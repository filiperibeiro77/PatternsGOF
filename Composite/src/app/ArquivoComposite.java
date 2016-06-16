package app;

import java.util.ArrayList;

public class ArquivoComposite extends ArquivoComponent {
	
	ArrayList<ArquivoComponent> arquivos = new ArrayList<ArquivoComponent>();
	
	public ArquivoComposite(String nomeDoArquivo) {
		this.nomeDoArquivo = nomeDoArquivo;
	}
	
	@Override
	public void imprimirNomeDoArquivo(){
		System.out.println(this.nomeDoArquivo);
		for (ArquivoComponent arquivoTmp : arquivos) {
			arquivoTmp.imprimirNomeDoArquivo();
		}
	}
	
	@Override
	public void adicionarNovoComponent(ArquivoComponent novoArquivo) {
		this.arquivos.add(novoArquivo);
	}
	
	@Override
	public void removerComponent(String nomeDoArquivo) throws Exception{
		for (ArquivoComponent arquivoTmp : arquivos) {
			if (arquivoTmp.getNomedoArquivo() == nomeDoArquivo) {
				this.arquivos.remove(arquivoTmp);
				return;
			}
		}
		throw new Exception("Não existe esse arquivo");
	}
	
	@Override
	public ArquivoComponent getArquivo(String nomeDoArquivo) throws Exception{
		for (ArquivoComponent arquivoTmp : arquivos) {
			if (arquivoTmp.getNomedoArquivo() == nomeDoArquivo) {
				return arquivoTmp;
			}
		}
		throw new Exception("Não existe esse arquivo");
	}
}
