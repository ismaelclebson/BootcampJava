package secao6;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class ButtonApp extends JFrame implements ActionListener, WindowListener{
	
	public UIManager.LookAndFeelInfo looks[];

	public static void main(String[] args) {
		ButtonApp frame = new ButtonApp();
		frame.setTitle("Primeira aplicação");
		frame.setSize(350, 250);
		Container cont = frame.getContentPane();
		cont.setLayout(new FlowLayout());
		JButton botao = new JButton("Isto é um botão");
		botao.addActionListener(frame);
		cont.add(botao);
		frame.addWindowListener(frame);
		frame.looks = UIManager.getInstalledLookAndFeels();
		try {
			UIManager.setLookAndFeel(frame.looks[2].getClassName());
		} catch (Exception e) {
			e.printStackTrace();
		}
		frame.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(null, e.getActionCommand().toString());
		
		
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent ev) {
		JOptionPane.showInternalMessageDialog(null, "Encerrando a aplicação...");
		System.exit(0);
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

}
