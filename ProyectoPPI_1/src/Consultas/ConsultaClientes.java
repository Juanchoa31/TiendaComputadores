package Consultas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Final.Menu;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Toolkit;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class ConsultaClientes extends JFrame {

    private JPanel contentPane;
    private JTable table;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    ConsultaClientes frame = new ConsultaClientes();
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
    public ConsultaClientes() {
        setResizable(false);
        setTitle("Consulta para clientes.");
        setIconImage(Toolkit.getDefaultToolkit().getImage(ConsultaClientes.class.getResource("/Iconos/computer.png")));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 644, 430);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        setLocationRelativeTo(null);

        table = new JTable();
        table.setFont(new Font("Tahoma", Font.BOLD, 11));
        table.setForeground(Color.WHITE);
        table.setBackground(new Color(153, 102, 204));
        table.setBounds(10, 11, 607, 332);
        contentPane.add(table);

        JButton btnNewButton = new JButton("Buscar.");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                try {
                    java.sql.Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/computadores", "root", "");
                    java.sql.Statement comando = conexion.createStatement();
                    ResultSet registro = comando.executeQuery("select * from clientes");

                    conexion.close();
                } catch (SQLException ex) {
                    setTitle(ex.toString());
                }
            }
        });
        btnNewButton.setIcon(new ImageIcon(ConsultaClientes.class.getResource("/Iconos/zoom.png")));
        btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
        btnNewButton.setBackground(new Color(0, 0, 0));
        btnNewButton.setForeground(new Color(255, 255, 255));
        btnNewButton.setBounds(10, 354, 128, 23);
        contentPane.add(btnNewButton);

        JButton btnNewButton_1 = new JButton("Volver...");
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Menu menu_clientes = new Menu();
                dispose();
                menu_clientes.setVisible(true);

            }
        });
        btnNewButton_1.setIcon(new ImageIcon(ConsultaClientes.class.getResource("/Iconos/arrow_turn_left.png")));
        btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 12));
        btnNewButton_1.setBackground(new Color(0, 0, 0));
        btnNewButton_1.setForeground(new Color(255, 255, 255));
        btnNewButton_1.setBounds(489, 354, 128, 23);
        contentPane.add(btnNewButton_1);

        JLabel lblNewLabel_2 = new JLabel("");
        lblNewLabel_2.setIcon(new ImageIcon(ConsultaClientes.class.getResource("/imagenes_personalizadas/21021f08753990a88a7ed016762c1e42.jpg")));
        lblNewLabel_2.setBounds(0, 0, 644, 399);
        contentPane.add(lblNewLabel_2);
        setLocationRelativeTo(null);
    }
}
