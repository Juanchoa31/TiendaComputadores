package Opciones_de_salida;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;

import javax.swing.SwingConstants;

import javax.swing.border.LineBorder;

import Final.Empleados;
import Final.Menu;

import java.awt.Toolkit;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Salir_3 extends JFrame {

    private JPanel contentPane;
    Menu menu = new Menu();

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Salir frame = new Salir();
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
    public Salir_3() {
        setTitle("Opci\u00F3n de salida.");
        setIconImage(Toolkit.getDefaultToolkit().getImage(Salir.class.getResource("/Iconos/computer.png")));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 350, 180);
        contentPane = new JPanel();
        contentPane.setBackground(Color.BLACK);
        contentPane.setBorder(new LineBorder(new Color(153, 102, 204), 6));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        this.setResizable(false);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setBackground(new Color(153, 102, 204));
        panel.setBounds(26, 63, 274, 47);
        contentPane.add(panel);
        panel.setLayout(null);

        JButton btnNewButton = new JButton("Si.");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                System.exit(0);
            }
        });
        btnNewButton.setIcon(new ImageIcon(Salir.class.getResource("/Iconos/accept.png")));
        btnNewButton.setBackground(Color.BLACK);
        btnNewButton.setForeground(Color.WHITE);
        btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
        btnNewButton.setBounds(10, 11, 118, 23);
        panel.add(btnNewButton);

        JButton btnNewButton_1 = new JButton("No.");
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
              Empleados salir = new Empleados(null, true);
              salir.setLocationRelativeTo(null);
              salir.setVisible(true);
              dispose();             
            }
        });
        btnNewButton_1.setIcon(new ImageIcon(Salir.class.getResource("/Iconos/cancel.png")));
        btnNewButton_1.setBackground(Color.BLACK);
        btnNewButton_1.setForeground(Color.WHITE);
        btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 12));
        btnNewButton_1.setBounds(146, 11, 118, 23);
        panel.add(btnNewButton_1);

        JLabel lblNewLabel_1 = new JLabel("¿Estas seguro de querer salir?");
        lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
        lblNewLabel_1.setForeground(Color.WHITE);
        lblNewLabel_1.setBounds(30, 22, 274, 31);
        contentPane.add(lblNewLabel_1);

    }
}
