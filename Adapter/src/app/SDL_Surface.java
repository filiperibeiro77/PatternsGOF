package app;

public class SDL_Surface {
	public void SDL_CarregarSurface(String arquivo){
		System.out.println("Imagem " + arquivo + " carregada");
	}
	
	public void SDL_DesenharSurface(double altura, double largura, int posX, int posY) {
		System.out.println("Surface desenhada");
	}
}
