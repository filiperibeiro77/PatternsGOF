package app;

public class OpenGLImagemAdapter extends OpenGLImagem implements ImagemTarget {
	
	@Override
	public void carregarImagem(String nomeDoArquivo) {
		glCarregarImagem(nomeDoArquivo);
	}
	
	@Override
	public void desenharImagem(int posX, int posY, double largura, double altura) {
		glDesenharImagem(posX, posY);
	}
}
