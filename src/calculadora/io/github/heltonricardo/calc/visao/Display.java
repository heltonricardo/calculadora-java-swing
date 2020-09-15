package calculadora.io.github.heltonricardo.calc.visao;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Display extends JPanel {

	private final JLabel label;
	
	public Display() {
		setBackground(new Color(46, 49, 50));
		
		label = new JLabel("1234,56");
		label.setFont(new Font("courier", Font.PLAIN, 30));
		label.setForeground(Color.WHITE);
		
		setLayout(new FlowLayout(FlowLayout.RIGHT, 5, 20));
		
		add(label);
	}
}
