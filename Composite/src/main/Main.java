package main;
import app.*;

public class Main {
	
	public static void main(String[] args) {
	    ArquivoComponent minhaPasta = new ArquivoComposite("Minha Pasta/");
	    ArquivoComponent meuVideo = new ArquivoVideo("meu video.avi");
	    ArquivoComponent meuOutroVideo = new ArquivoVideo("serieS01E01.mkv");
	 
	    try {
	        meuVideo.adicionarNovoComponent(meuOutroVideo);
	    } catch (Exception e) {
	        System.out.println(e.getMessage());
	    }
	 
	    try {
	        minhaPasta.adicionarNovoComponent(meuVideo);
	        minhaPasta.adicionarNovoComponent(meuOutroVideo);
	        minhaPasta.imprimirNomeDoArquivo();
	    } catch (Exception e) {
	        System.out.println(e.getMessage());
	    }
	 
	    try {
	        System.out.println("\nPesquisando arquivos:");
	        minhaPasta.getArquivo(meuVideo.getNomedoArquivo())
	                .imprimirNomeDoArquivo();
	        System.out.println("\nRemover arquivos");
	        minhaPasta.removerComponent(meuVideo.getNomedoArquivo());
	        minhaPasta.imprimirNomeDoArquivo();
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}
}
