
public class CD extends ItemAcervo {
	private String titulo;
	private String artista;
	private String categoria;
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getArtista() {
		return artista;
	}
	public void setArtista(String artista) {
		this.artista = artista;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	@Override
	public String toString() {
		return "CD [titulo=" + titulo + ", artista=" + artista + ", categoria=" + categoria + "]";
	}
	

}
