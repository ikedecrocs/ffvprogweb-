package model;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
	
	List<Livro> livros = new ArrayList<Livro>();
	
	public List<Livro> getLivros() {
		return livros;
	}
	
	public void setLivros(List<Livro> livros) {
		this.livros = livros;
	}
	
	public void add(Livro livro) {
		boolean valido = true;
		
		if(livro.getIsbn().equals("")
				|| livro.getTitulo().equals("")
				|| livro.getAutor().equals("")) {
			valido = false;
		}
		
		for (Livro livroFor: livros) {
			if (livro.getIsbn().equals(livroFor.getIsbn())) {
				valido = false;
			}
			
		}
		
		if (valido) {
			livros.add(livro);
		} else {
			System.out.println("Livro inválido");
		}
	}
	
	public int size() {
		return livros.size();
	}

}
