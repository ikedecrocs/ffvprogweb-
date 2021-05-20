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
		
		//dado que não há livros cadastrados
		Biblioteca biblioteca = new Biblioteca();
		
		//quando um livro é inserido
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
		
		//dado há livros cadastrados
		Biblioteca biblioteca = new Biblioteca();
		
		Livro livro = new Livro();
		livro.setAutor("Machado de Assis");
		livro.setIsbn("123");
		livro.setTitulo("Dom Casmurro");
		
		biblioteca.add(livro);
		
		//quando um livro com isbn repetido é inserido
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
		
		//dado não há livros cadastrados
		Biblioteca biblioteca = new Biblioteca();
		
		//quando um livro com isbn vazio é inserido
		Livro livro = new Livro();
		livro.setAutor("Machado de Assis");
		livro.setIsbn("");
		livro.setTitulo("Dom Casmurro");
		
		biblioteca.add(livro);
		
		//entao o total de livro é 0
		assertEquals(0, biblioteca.size());
		
	}
	
	@Test
	public void ct4_quando_titulo_vazio_nao_cadastra() {
		
		//dado não há livros cadastrados
		Biblioteca biblioteca = new Biblioteca();
		
		//quando um livro com titulo vazio é inserido
		Livro livro = new Livro();
		livro.setAutor("Machado de Assis");
		livro.setIsbn("123");
		livro.setTitulo("");
		
		biblioteca.add(livro);
		
		//entao o total de livro é 0
		assertEquals(0, biblioteca.size());
		
	}
	
	@Test
	public void ct5_quando_autor_vazio_nao_cadastra() {
		
		//dado não há livros cadastrados
		Biblioteca biblioteca = new Biblioteca();
		
		//quando um livro com autor vazio é inserido
		Livro livro = new Livro();
		livro.setAutor("");
		livro.setIsbn("123");
		livro.setTitulo("Dom Casmurro");
		
		biblioteca.add(livro);
		
		//entao o total de livro é 0
		assertEquals(0, biblioteca.size());
		
	}
	
}
