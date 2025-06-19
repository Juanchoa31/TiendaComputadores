package Final;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;

import Consultas.ConsultaClientes;
import Consultas.ConsultaEmpleados;
import Consultas.ConsultaProductos;
import Consultas.ConsultaVentas;
import Opciones_de_salida.Salir_4;

import java.awt.Toolkit;

public class Menu extends JFrame {

    private JPanel contentPane;
    Empleados empleadosDialog = new Empleados(this);

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Menu frame = new Menu();
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
    public Menu() {
        setTitle("Tienda de computadores.");
        setIconImage(Toolkit.getDefaultToolkit().getImage(Menu.class.getResource("/Iconos/computer.png")));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 640, 480);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        this.setResizable(false);
        setLocationRelativeTo(null);

        JPanel panel_1 = new JPanel();
        panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 6, true));
        panel_1.setBackground(new Color(153, 102, 204));
        panel_1.setBounds(10, 203, 222, 197);
        contentPane.add(panel_1);

        JButton btnNewButton = new JButton("Empleados");
        btnNewButton.setBounds(10, 11, 201, 35);
        btnNewButton.setIcon(new ImageIcon(Menu.class.getResource("/Iconos/user.png")));
        btnNewButton.setForeground(new Color(255, 255, 255));
        btnNewButton.setBackground(new Color(0, 0, 0));
        btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                dispose();
                empleadosDialog.setVisible(true);
            }
        });
        panel_1.setLayout(null);
        panel_1.add(btnNewButton);

        JButton btnNewButton_1 = new JButton("Clientes");
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                Clientes clientes = new Clientes();
                dispose();
                clientes.setVisible(true);
            }
        });
        btnNewButton_1.setBounds(10, 57, 201, 35);
        btnNewButton_1.setIcon(new ImageIcon(Menu.class.getResource("/Iconos/user_orange.png")));
        btnNewButton_1.setForeground(new Color(255, 255, 255));
        btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 12));
        btnNewButton_1.setBackground(new Color(0, 0, 0));
        panel_1.add(btnNewButton_1);

        JButton btnNewButton_2 = new JButton("Productos");
        btnNewButton_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                Productos productos = new Productos();
                dispose();
                productos.setVisible(true);

            }
        });
        btnNewButton_2.setBounds(10, 103, 200, 35);
        btnNewButton_2.setIcon(new ImageIcon(Menu.class.getResource("/Iconos/mouse.png")));
        btnNewButton_2.setForeground(new Color(255, 255, 255));
        btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 12));
        btnNewButton_2.setBackground(new Color(0, 0, 0));
        panel_1.add(btnNewButton_2);

        JButton btnNewButton_3 = new JButton("Ventas");
        btnNewButton_3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {

                Ventas ventas = new Ventas();
                dispose();
                ventas.setVisible(true);

            }
        });
        btnNewButton_3.setBounds(10, 149, 200, 35);
        btnNewButton_3.setIcon(new ImageIcon(Menu.class.getResource("/Iconos/money.png")));
        btnNewButton_3.setForeground(new Color(255, 255, 255));
        btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 12));
        btnNewButton_3.setBackground(new Color(0, 0, 0));
        panel_1.add(btnNewButton_3);

        JPanel panel = new JPanel();
        panel.setBorder(new LineBorder(new Color(0, 0, 0), 6, true));
        panel.setBackground(new Color(153, 102, 204));
        panel.setBounds(131, 11, 356, 45);
        contentPane.add(panel);
        panel.setLayout(null);

        JLabel lblNewLabel = new JLabel("Componentes y mas.");
        lblNewLabel.setIcon(new ImageIcon(Menu.class.getResource("/Iconos/keyboard.png")));
        lblNewLabel.setForeground(new Color(255, 255, 255));
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
        lblNewLabel.setBounds(10, 11, 336, 22);
        panel.add(lblNewLabel);

        JPanel panel_3 = new JPanel();
        panel_3.setBackground(new Color(153, 102, 204));
        panel_3.setBorder(new LineBorder(Color.BLACK, 6));
        panel_3.setBounds(404, 203, 220, 197);
        contentPane.add(panel_3);
        panel_3.setLayout(null);

        JButton btnNewButton_5 = new JButton("Listado de empleados.");
        btnNewButton_5.setIcon(new ImageIcon(Menu.class.getResource("/Iconos/user.png")));
        btnNewButton_5.setForeground(new Color(255, 255, 255));
        btnNewButton_5.setBackground(new Color(0, 0, 0));
        btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD, 12));
        btnNewButton_5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {

                ConsultaEmpleados empleados = new ConsultaEmpleados();
                dispose();
                empleados.setVisible(true);

            }
        });
        btnNewButton_5.setBounds(10, 11, 198, 35);
        panel_3.add(btnNewButton_5);

        JButton btnNewButton_6 = new JButton("Listado de clientes");
        btnNewButton_6.setIcon(new ImageIcon(Menu.class.getResource("/Iconos/user_orange.png")));
        btnNewButton_6.setForeground(new Color(255, 255, 255));
        btnNewButton_6.setBackground(new Color(0, 0, 0));
        btnNewButton_6.setFont(new Font("Tahoma", Font.BOLD, 12));
        btnNewButton_6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                ConsultaClientes clientes = new ConsultaClientes();
                dispose();
                clientes.setVisible(true);

            }
        });
        btnNewButton_6.setBounds(10, 57, 199, 35);
        panel_3.add(btnNewButton_6);

        JButton btnNewButton_7 = new JButton("Listado de productos.");
        btnNewButton_7.setIcon(new ImageIcon(Menu.class.getResource("/Iconos/mouse.png")));
        btnNewButton_7.setForeground(new Color(255, 255, 255));
        btnNewButton_7.setBackground(new Color(0, 0, 0));
        btnNewButton_7.setFont(new Font("Tahoma", Font.BOLD, 12));
        btnNewButton_7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                ConsultaProductos productos = new ConsultaProductos();
                dispose();
                productos.setVisible(true);

            }
        });
        btnNewButton_7.setBounds(10, 103, 199, 35);
        panel_3.add(btnNewButton_7);

        JButton btnNewButton_8 = new JButton("Listado de ventas.");
        btnNewButton_8.setIcon(new ImageIcon(Menu.class.getResource("/Iconos/money.png")));
        btnNewButton_8.setForeground(new Color(255, 255, 255));
        btnNewButton_8.setBackground(new Color(0, 0, 0));
        btnNewButton_8.setFont(new Font("Tahoma", Font.BOLD, 12));
        btnNewButton_8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                ConsultaVentas ventas = new ConsultaVentas();
                dispose();
                ventas.setVisible(true);

            }
        });
        btnNewButton_8.setBounds(10, 149, 200, 35);
        panel_3.add(btnNewButton_8);

        JButton btnNewButton_4 = new JButton("Salir...");
        btnNewButton_4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                Salir_4 salir = new Salir_4();
                dispose();
                salir.setVisible(true);

            }
        });
        btnNewButton_4.setBounds(267, 411, 105, 23);
        contentPane.add(btnNewButton_4);
        btnNewButton_4.setIcon(new ImageIcon(Menu.class.getResource("/Iconos/cancel.png")));
        btnNewButton_4.setBackground(new Color(0, 0, 0));
        btnNewButton_4.setForeground(new Color(255, 255, 255));
        btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 12));

        JLabel lblNewLabel_1 = new JLabel("Para ingresar informacion.");
        lblNewLabel_1.setForeground(new Color(255, 255, 255));
        lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_1.setBounds(11, 411, 221, 23);
        contentPane.add(lblNewLabel_1);

        JLabel lblNewLabel_2 = new JLabel("Para revisar listados.");
        lblNewLabel_2.setForeground(new Color(255, 255, 255));
        lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_2.setBounds(405, 411, 219, 23);
        contentPane.add(lblNewLabel_2);

        JLabel lblNewLabel_3 = new JLabel("");
        lblNewLabel_3.setIcon(new ImageIcon(Menu.class.getResource("/imagenes_personalizadas/21021f08753990a88a7ed016762c1e42.jpg")));
        lblNewLabel_3.setBounds(0, 0, 634, 451);
        contentPane.add(lblNewLabel_3);

    }
}
