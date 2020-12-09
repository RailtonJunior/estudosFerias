package biblioteca;

public class Livro {
	
	private String nome;
	private String autor;
	private int edicao;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getEdicao() {
		return edicao;
	}
	public void setEdicao(int edicao) {
		this.edicao = edicao;
	}
	@Override
	public String toString() {
		return "Nome do livro = " + nome + ", Autor do livro = " + autor + ", Edicao do livro = " + edicao + "";
	}
	
	
	
}
