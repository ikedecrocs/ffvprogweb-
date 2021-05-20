package LivroTests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;
import junit.framework.TestCase;
import model.Biblioteca;
import model.Livro;

public class LivroTests {

	@Test
	public void ct1_quando_dados_validos_cadastra_com_sucesso() {
		
		//dado que n�o h� livros cadastrados
		Biblioteca biblioteca = new Biblioteca();
		
		//quando um livro � inserido
		Livro livro = new Livro();
		livro.setAutor("Machado de Assis");
		livro.setIsbn("123");
		livro.setTitulo("Dom Casmurro");
		
		biblioteca.add(livro);
		
		//entao o total de livros vira 1
		assertEquals(1, biblioteca.size());
		
	}
	
	@Test
	public void ct2_quando_isbn_repetido_nao_cadastra() {
		
		//dado h� livros cadastrados
		Biblioteca biblioteca = new Biblioteca();
		
		Livro livro = new Livro();
		livro.setAutor("Machado de Assis");
		livro.setIsbn("123");
		livro.setTitulo("Dom Casmurro");
		
		biblioteca.add(livro);
		
		//quando um livro com isbn repetido � inserido
		Livro repetido = new Livro();
		repetido.setAutor("Machado de Assis");
		repetido.setIsbn("123");
		repetido.setTitulo("Dom Casmurro");
		
		biblioteca.add(repetido);
		
		//entao o total de livro continua sendo 1
		assertEquals(1, biblioteca.size());
		
	}
	
	@Test
	public void ct3_quando_isbn_vazio_nao_cadastra() {
		
		//dado n�o h� livros cadastrados
		Biblioteca biblioteca = new Biblioteca();
		
		//quando um livro com isbn vazio � inserido
		Livro livro = new Livro();
		livro.setAutor("Machado de Assis");
		livro.setIsbn("");
		livro.setTitulo("Dom Casmurro");
		
		biblioteca.add(livro);
		
		//entao o total de livro � 0
		assertEquals(0, biblioteca.size());
		
	}
	
	@Test
	public void ct4_quando_titulo_vazio_nao_cadastra() {
		
		//dado n�o h� livros cadastrados
		Biblioteca biblioteca = new Biblioteca();
		
		//quando um livro com titulo vazio � inserido
		Livro livro = new Livro();
		livro.setAutor("Machado de Assis");
		livro.setIsbn("123");
		livro.setTitulo("");
		
		biblioteca.add(livro);
		
		//entao o total de livro � 0
		assertEquals(0, biblioteca.size());
		
	}
	
	@Test
	public void ct5_quando_autor_vazio_nao_cadastra() {
		
		//dado n�o h� livros cadastrados
		Biblioteca biblioteca = new Biblioteca();
		
		//quando um livro com autor vazio � inserido
		Livro livro = new Livro();
		livro.setAutor("");
		livro.setIsbn("123");
		livro.setTitulo("Dom Casmurro");
		
		biblioteca.add(livro);
		
		//entao o total de livro � 0
		assertEquals(0, biblioteca.size());
		
	}
	
}
