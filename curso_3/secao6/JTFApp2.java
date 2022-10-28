package secao6;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class JTFApp2{

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setTitle("Primeira aplicação");
		frame.setSize(350, 250);
		Container cont = frame.getContentPane();
		JTextField tf = new JTextField("Digite aqui");
		tf.addActionListener(ev -> {
			JOptionPane.showMessageDialog(null, ev.getActionCommand().toString());
		});
		cont.add(tf, BorderLayout.NORTH);
		frame.setVisible(true);

	}


}
