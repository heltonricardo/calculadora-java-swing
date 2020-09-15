package calculadora.io.github.heltonricardo.calc.visao;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Calculadora extends JFrame {

	public Calculadora() {
		organizarLayout();
		
		setVisible(true);
		setSize(232, 322);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	private void organizarLayout() {
		setLayout(new BorderLayout());
		
		Display display = new Display();
		display.setPreferredSize(new Dimension(232, 60));
		add(display, BorderLayout.NORTH);
		
		add(new Teclado(), BorderLayout.CENTER);
	}

	public static void main(String[] args) {
		
		new Calculadora();
	}
}
