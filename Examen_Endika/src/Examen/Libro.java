package Examen;

public class Libro {
	public String titulo;
	public String autor;
	public String isbn;
	public boolean prestado;
	
	public Libro(String titulo, String autor, String isbn, boolean prestado) {
		this.titulo = titulo;
		this.autor = autor;
		this.isbn = isbn;
		this.prestado = prestado;
	}
	public String getTitulo() {
		return this.titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String toStringTitulo() {
		return "este es el titulo "+titulo;
	}
	public String getAutor() {
		return this.autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String toStringAutor() {
		return "este es el autor "+autor;
	}
	public String getIsbn() {
		return this.isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String toStringIsbn() {
		return "este es el isbn "+isbn;
	}
	public boolean getPrestado() {
		return this.prestado;
	}
	public void setPrestado(boolean prestado) {
		this.prestado = prestado;
	}
	public String toStringPrestado() {
		return " el libro esta prestado es "+prestado;
	}
}

