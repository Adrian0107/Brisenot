package tarea2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Tarea2 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tarea2 frame = new Tarea2();
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
	public Tarea2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 4, 0, 0));
		
		JLabel label_6 = new JLabel("");
		contentPane.add(label_6);
		
		JButton btnNewButton = new JButton("1");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton.setBackground(Color.MAGENTA);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("2");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("3");
		contentPane.add(btnNewButton_2);
		
		JLabel label = new JLabel("");
		contentPane.add(label);
		
		JButton btnNewButton_3 = new JButton("4");
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("5");
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("6");
		contentPane.add(btnNewButton_5);
		
		JLabel label_1 = new JLabel("");
		contentPane.add(label_1);
		
		JButton btnNewButton_6 = new JButton("7");
		contentPane.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("8");
		contentPane.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("9");
		contentPane.add(btnNewButton_8);
		
		JLabel label_2 = new JLabel("");
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("");
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("");
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("");
		contentPane.add(label_5);
		
		JLabel label_7 = new JLabel("");
		contentPane.add(label_7);
		
		JLabel label_8 = new JLabel("");
		contentPane.add(label_8);
		
		JLabel label_9 = new JLabel("");
		contentPane.add(label_9);
		
		JLabel label_10 = new JLabel("");
		contentPane.add(label_10);
	}
}
