
public class Livro {

	private String titulo;
	private String autor;
	private String ISBN;
	private String editora;
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	@Override
	public String toString() {
		return "Livro [titulo=" + titulo + ", ator=" + autor + ", ISBN=" + ISBN + ", editora=" + editora + "]";
	}
	
}
