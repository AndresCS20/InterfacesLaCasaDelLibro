package laCasaDelLibro;

import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

	public static ArrayList<Libro> listaLibros=new ArrayList<Libro>();
	
	public static void main(String[] args) {
		
		Libro libro1 = new Libro("978-0345803481", "Ready Player One", "Ernest Cline", 20, "http://example.com/readyplayerone.jpg");
        Libro libro2 = new Libro("978-0439064873", "Harry Potter and the Chamber of Secrets", "J.K. Rowling", 30, "http://example.com/harrypotter.jpg");
        Libro libro3 = new Libro("978-0451524935", "1984", "George Orwell", 25, "http://example.com/1984.jpg");
        Libro libro4 = new Libro("978-0140283334", "Fight Club", "Chuck Palahniuk", 15, "http://example.com/fightclub.jpg");
        Libro libro5 = new Libro("978-0307474278", "The Girl with the Dragon Tattoo", "Stieg Larsson", 10, "http://example.com/dragontattoo.jpg");
        Libro libro6 = new Libro("978-0062457790", "The Alchemist", "Paulo Coelho", 35, "http://example.com/alchemist.jpg");
        Libro libro7 = new Libro("978-0307887443", "The Lean Startup", "Eric Ries", 40, "http://example.com/leanstartup.jpg");
        Libro libro8 = new Libro("978-1591847786", "Zero to One", "Peter Thiel", 30, "http://example.com/zerotoone.jpg");
        Libro libro9 = new Libro("978-0062316110", "Thinking Fast and Slow", "Daniel Kahneman", 20, "http://example.com/thinkingfastandslow.jpg");
        Libro libro10 = new Libro("978-0062225672", "Divergent", "Veronica Roth", 25, "http://example.com/divergent.jpg");
        	
		listaLibros.addAll(Arrays.asList(libro1,libro2,libro3,libro4,libro5,libro6,libro7,libro8,libro9,libro10));
		
		
		System.out.println(listaLibros);
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
					frame.setTitle("La Casa del Libro - Pagina Principal");
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}

}
