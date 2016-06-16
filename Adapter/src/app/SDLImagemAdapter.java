package app;

public class SDLImagemAdapter extends SDL_Surface implements ImagemTarget {
	
	@Override
	public void carregarImagem(String nomeDoArquivo){
		SDL_CarregarSurface(nomeDoArquivo);
	}
	
	@Override
	public void desenharImagem(int posX, int posY, double altura, double largura) {
		SDL_DesenharSurface(altura, largura, posX, posY);
	}
}
