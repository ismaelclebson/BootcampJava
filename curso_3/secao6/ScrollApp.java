package secao6;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JScrollBar;

public class ScrollApp {

	public static void main(String[] args) {
		JFrame f = new JFrame("Aplicação");
		f.setSize(350, 250);
		Container cont = f.getContentPane();
		JScrollBar sbar = new JScrollBar(JScrollBar.HORIZONTAL);
		cont.add(sbar, BorderLayout.NORTH);
		f.setVisible(true);
	}

}
