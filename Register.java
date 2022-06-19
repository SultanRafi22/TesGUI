package registration;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;

public class Register {

	private JFrame frmPendaftaran;
	private JTextField txtPendaftaran;
	private JTextField textField_1;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Register window = new Register();
					window.frmPendaftaran.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Register() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPendaftaran = new JFrame();
		frmPendaftaran.setTitle("Pendaftaran");
		frmPendaftaran.setBounds(100, 100, 362, 444);
		frmPendaftaran.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPendaftaran.getContentPane().setLayout(null);
		
		JLabel lblHello = new JLabel("HALO!!!");
		lblHello.setHorizontalAlignment(SwingConstants.CENTER);
		lblHello.setFont(new Font("Tw Cen MT", Font.BOLD, 36));
		lblHello.setBounds(89, 11, 163, 59);
		frmPendaftaran.getContentPane().add(lblHello);
		
		JLabel lblNewLabel_1 = new JLabel("Silahkan masukkan data anda");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(52, 70, 236, 14);
		frmPendaftaran.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Nama");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2.setFont(new Font("Tw Cen MT", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(10, 109, 80, 14);
		frmPendaftaran.getContentPane().add(lblNewLabel_2);
		
		txtPendaftaran = new JTextField();
		txtPendaftaran.setColumns(10);
		txtPendaftaran.setBounds(131, 106, 193, 20);
		frmPendaftaran.getContentPane().add(txtPendaftaran);
		
		JLabel lblNewLabel_2_1 = new JLabel("Username");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_1.setFont(new Font("Tw Cen MT", Font.PLAIN, 14));
		lblNewLabel_2_1.setBounds(10, 147, 80, 14);
		frmPendaftaran.getContentPane().add(lblNewLabel_2_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(131, 144, 193, 20);
		frmPendaftaran.getContentPane().add(textField_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Password");
		lblNewLabel_2_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_1_1.setFont(new Font("Tw Cen MT", Font.PLAIN, 14));
		lblNewLabel_2_1_1.setBounds(10, 187, 80, 14);
		frmPendaftaran.getContentPane().add(lblNewLabel_2_1_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(131, 184, 193, 20);
		frmPendaftaran.getContentPane().add(passwordField);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("Ulangi Password");
		lblNewLabel_2_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_1_1_1.setFont(new Font("Tw Cen MT", Font.PLAIN, 14));
		lblNewLabel_2_1_1_1.setBounds(10, 223, 123, 14);
		frmPendaftaran.getContentPane().add(lblNewLabel_2_1_1_1);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(131, 220, 193, 20);
		frmPendaftaran.getContentPane().add(passwordField_1);
		
		JButton btnNewButton = new JButton("Daftar");
		btnNewButton.setBounds(113, 297, 111, 23);
		frmPendaftaran.getContentPane().add(btnNewButton);
	}

}
