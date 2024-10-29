import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JTextPane;

public class ListaAmigos extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListaAmigos frame = new ListaAmigos();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ListaAmigos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 854, 480);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnVoltar = new JButton("<");
		btnVoltar.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnVoltar.setBounds(10, 11, 49, 43);
		contentPane.add(btnVoltar);
		
		JLabel tituloAmigos = new JLabel("Lista de amigos\r\n");
		tituloAmigos.setFont(new Font("Tahoma", Font.BOLD, 30));
		tituloAmigos.setForeground(Color.WHITE);
		tituloAmigos.setBounds(283, 25, 248, 64);
		contentPane.add(tituloAmigos);
		
		JTextPane listaAmigos = new JTextPane();
		listaAmigos.setBounds(69, 100, 697, 269);
		contentPane.add(listaAmigos);
		
		JButton btnPesquisar = new JButton("Pesquisar\r\n");
		btnPesquisar.setForeground(Color.WHITE);
		btnPesquisar.setBackground(Color.DARK_GRAY);
		btnPesquisar.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnPesquisar.setBounds(162, 394, 135, 23);
		contentPane.add(btnPesquisar);
		
		JButton btnDeletar = new JButton("Deletar\r\n");
		btnDeletar.setForeground(Color.WHITE);
		btnDeletar.setBackground(Color.DARK_GRAY);
		btnDeletar.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnDeletar.setBounds(552, 394, 113, 23);
		contentPane.add(btnDeletar);
	}
}
