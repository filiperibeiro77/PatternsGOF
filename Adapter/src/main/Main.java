package main;
import app.*;

public class Main {

	public static void main(String[] args) {
		ImagemTarget imagem = new OpenGLImagemAdapter();
		imagem.carregarImagem("Teste.png");
		imagem.desenharImagem(7, 13, 7.2, 13.7);
		
		imagem = new SDLImagemAdapter();
		imagem.carregarImagem("versao1.gif");
		imagem.desenharImagem(13, 7, 10.1, 7.13);
	}
}
