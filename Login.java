package registration;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;

public class Login {

	private JFrame frmMasuk;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frmMasuk.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMasuk = new JFrame();
		frmMasuk.setTitle("Masuk");
		frmMasuk.setBounds(100, 100, 360, 447);
		frmMasuk.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMasuk.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SELAMAT DATANG");
		lblNewLabel.setFont(new Font("Tw Cen MT", Font.BOLD, 36));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 11, 326, 59);
		frmMasuk.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Masukkan Username dan Password");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(59, 78, 236, 14);
		frmMasuk.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Username");
		lblNewLabel_2.setFont(new Font("Tw Cen MT", Font.PLAIN, 14));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(10, 123, 80, 14);
		frmMasuk.getContentPane().add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(92, 120, 193, 20);
		frmMasuk.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2_1 = new JLabel("Password");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setFont(new Font("Tw Cen MT", Font.PLAIN, 14));
		lblNewLabel_2_1.setBounds(10, 167, 80, 14);
		frmMasuk.getContentPane().add(lblNewLabel_2_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(92, 164, 191, 20);
		frmMasuk.getContentPane().add(passwordField);
		
		JButton btnNewButton = new JButton("Masuk");
		btnNewButton.setBounds(123, 242, 89, 23);
		frmMasuk.getContentPane().add(btnNewButton);
		
		JButton btnRegister = new JButton("Daftar");
		btnRegister.setBounds(107, 303, 123, 23);
		frmMasuk.getContentPane().add(btnRegister);
		
		JLabel lblNewLabel_3 = new JLabel("Belum mendaftar?");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(107, 328, 123, 14);
		frmMasuk.getContentPane().add(lblNewLabel_3);
	}
}
