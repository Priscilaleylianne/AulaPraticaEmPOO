package exercico;

import java.util.Calendar;

import dominio.Cliente;

public class programaCaixaEletronico {

	public static void main(String[] args) {
		
		System.out.println("Iniciando a programacao Java");

		// Cria um objeto da classe Cliente
		Cliente octavio = new Cliente(1, "Octavio", "Octavio@gmail.com", Calendar.getInstance().getTime());
		
		Cliente paula = new Cliente(1, "Paula", "Paula@gmail.com", Calendar.getInstance().getTime());
						
		Cliente moises = new Cliente(1, "Moises", "Moises@gmail.com", Calendar.getInstance().getTime());
		
		moises.setEmail("moises@terra.com");
		
		paula.setNome("Paula Oliveira Tompson");
		
		octavio.setCpf(123456789);
		
		System.out.println("");
		
		System.out.println("Informacao do OCTAVIO "+octavio);
		
		System.out.println("Informacao da PAULA "+paula);
		
		System.out.println("Informacao do MOISES "+moises);
		
		System.out.println(octavio.getEmail());
		
		
		
	}
}
