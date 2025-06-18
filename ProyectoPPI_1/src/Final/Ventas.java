package Final;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import Opciones_de_salida.Salir;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JTextField;
import javax.swing.JTextPane;
import java.awt.Toolkit;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;

import Mensajefinal.Mensaje_4;

public class Ventas extends JFrame {

    private JPanel contentPane;
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;
    private JTextField textField_3;
    private JTextField textField_4;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Ventas frame = new Ventas();
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
    public Ventas() {
        setResizable(false);
        setTitle("Ventas.");
        setIconImage(Toolkit.getDefaultToolkit().getImage(Ventas.class.getResource("/Iconos/computer.png")));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 640, 480);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblNewLabel = new JLabel("Formulario de ventas.");
        lblNewLabel.setForeground(Color.BLACK);
        lblNewLabel.setIcon(new ImageIcon(Ventas.class.getResource("/Iconos/book_addresses.png")));
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
        lblNewLabel.setBounds(10, 11, 291, 31);
        contentPane.add(lblNewLabel);

        JPanel panel = new JPanel();
        panel.setBounds(362, 145, 252, 285);
        contentPane.add(panel);

        JPanel panel_1 = new JPanel();
        panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 6, true));
        panel_1.setBackground(new Color(153, 102, 204));
        panel_1.setBounds(10, 293, 166, 147);
        contentPane.add(panel_1);
        panel_1.setLayout(null);

        JButton btnNewButton_2 = new JButton("Guardar.");
        btnNewButton_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                try {
                    java.sql.Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/computadores", "root", "");

                    java.sql.Statement comando = conexion.createStatement();

                    comando.executeUpdate("insert into ventas(codigo,descripcion,precio,cantidad,total) values (" + textField.getText() + ",'" + textField_1.getText() + "'," + textField_2.getText() + "," + textField_3.getText() + "," + textField_4.getText() + ")");
                    conexion.close();

                    Mensaje_4 mensaje = new Mensaje_4();
                    dispose();
                    mensaje.setVisible(true);

                    textField.setText("");
                    textField_1.setText("");
                    textField_2.setText("");
                    textField_3.setText("");
                    textField_4.setText("");

                } catch (SQLException ejuna) {
                    setTitle(ejuna.toString());
                }
            }
        });
        btnNewButton_2.setIcon(new ImageIcon(Ventas.class.getResource("/Iconos/database_add.png")));
        btnNewButton_2.setForeground(new Color(255, 255, 255));
        btnNewButton_2.setBackground(new Color(0, 0, 0));
        btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 12));
        btnNewButton_2.setBounds(10, 11, 146, 23);
        panel_1.add(btnNewButton_2);

        JButton btnNewButton_3 = new JButton("Consultar.");
        btnNewButton_3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                try {
                    java.sql.Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/computadores", "root", "");
                    java.sql.Statement comando = conexion.createStatement();

                    ResultSet registro = comando.executeQuery("select descripcion,precio,cantidad,total from ventas where codigo=" + textField.getText());
                    if (registro.next() == true) {

                        textField_1.setText(registro.getString("descripcion"));
                        textField_2.setText(registro.getString("precio"));
                        textField_3.setText(registro.getString("cantidad"));
                        textField_4.setText(registro.getString("total"));

                    } else {
                        JOptionPane.showMessageDialog(null, "No existe ningpun registro con dicho codigo");
                    }
                    conexion.close();
                } catch (SQLException ex) {
                    setTitle(ex.toString());
                }

            }
        });
        btnNewButton_3.setIcon(new ImageIcon(Ventas.class.getResource("/Iconos/zoom.png")));
        btnNewButton_3.setForeground(new Color(255, 255, 255));
        btnNewButton_3.setBackground(new Color(0, 0, 0));
        btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 12));
        btnNewButton_3.setBounds(10, 113, 146, 23);
        panel_1.add(btnNewButton_3);

        JButton btnNewButton_5 = new JButton("Editar.");
        btnNewButton_5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    java.sql.Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/computadores", "root", "");
                    java.sql.Statement comando = conexion.createStatement();
                    int cantidad = comando.executeUpdate("update ventas set descripcion='" + textField_1.getText() + "',"
                            + "cantidad=" + textField_2.getText() + ","
                            + "total=" + textField_3.getText() + ","
                            + "precio=" + textField_4.getText() + " where codigo=" + textField.getText());
                    if (cantidad == 1) {
                        JOptionPane.showMessageDialog(null, "Se actualizo correctamente");
                    } else {
                        JOptionPane.showMessageDialog(null, "No se pudo actualizar");
                    }
                    conexion.close();
                } catch (SQLException ex) {
                    setTitle(ex.toString());
                }
            }
        });
        btnNewButton_5.setBounds(10, 45, 146, 23);
        panel_1.add(btnNewButton_5);
        btnNewButton_5.setIcon(new ImageIcon(Ventas.class.getResource("/Iconos/page_white_paint.png")));
        btnNewButton_5.setForeground(new Color(255, 255, 255));
        btnNewButton_5.setBackground(new Color(0, 0, 0));
        btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD, 12));

        JButton btnNewButton_4 = new JButton("Borrar.");
        btnNewButton_4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {

                try {
                    java.sql.Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/computadores", "root", "");
                    java.sql.Statement comando = conexion.createStatement();
                    int cantidad = comando.executeUpdate("delete from ventas where codigo=" + textField.getText());
                    if (cantidad == 1) {

                        textField.setText("");
                        textField_1.setText("");
                        textField_2.setText("");
                        textField_3.setText("");
                        textField_4.setText("");

                        JOptionPane.showMessageDialog(null, "Se borro");
                    } else {
                        JOptionPane.showMessageDialog(null, "No existe ningun elemento con dicho c�digo");
                    }
                    conexion.close();
                } catch (SQLException ex) {
                    setTitle(ex.toString());
                }

            }
        });
        btnNewButton_4.setBounds(10, 79, 146, 23);
        panel_1.add(btnNewButton_4);
        btnNewButton_4.setIcon(new ImageIcon(Ventas.class.getResource("/Iconos/delete.png")));
        btnNewButton_4.setForeground(new Color(255, 255, 255));
        btnNewButton_4.setBackground(new Color(0, 0, 0));
        btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 12));

        panel.setBounds(486, 11, 128, 101);
        panel.setBorder(new LineBorder(new Color(0, 0, 0), 6, true));
        panel.setBackground(new Color(153, 102, 204));
        contentPane.add(panel);
        panel.setLayout(null);

        JButton btnNewButton = new JButton("Volver...");
        btnNewButton.setIcon(new ImageIcon(Empleados.class.getResource("/Iconos/arrow_turn_left.png")));
        btnNewButton.setBackground(new Color(0, 0, 0));
        btnNewButton.setForeground(new Color(255, 255, 255));
        btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                Menu menu = new Menu();
                dispose();
                menu.setVisible(true);

            }
        });
        btnNewButton.setBounds(10, 11, 108, 23);
        panel.add(btnNewButton);

        JButton btnNewButton_1 = new JButton("Salir.");
        btnNewButton_1.setIcon(new ImageIcon(Empleados.class.getResource("/Iconos/cancel.png")));
        btnNewButton_1.setBackground(new Color(0, 0, 0));
        btnNewButton_1.setForeground(new Color(255, 255, 255));
        btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 12));
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Salir salir = new Salir();
                dispose();
                salir.setVisible(true);
            }
        });
        btnNewButton_1.setBounds(10, 67, 108, 23);
        panel.add(btnNewButton_1);

        JPanel panel_3 = new JPanel();
        panel_3.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 6), "Datos sobre el articulo.", TitledBorder.CENTER, TitledBorder.TOP, null, Color.WHITE));
        panel_3.setBackground(new Color(153, 102, 204));
        panel_3.setBounds(369, 207, 255, 233);
        contentPane.add(panel_3);
        panel_3.setLayout(null);

        JLabel lblNewLabel_2 = new JLabel("Codigo.");
        lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_2.setForeground(new Color(255, 255, 255));
        lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblNewLabel_2.setBounds(10, 23, 87, 14);
        panel_3.add(lblNewLabel_2);

        JLabel lblNewLabel_3 = new JLabel("Descripcion.");
        lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_3.setForeground(new Color(255, 255, 255));
        lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblNewLabel_3.setBounds(10, 67, 87, 14);
        panel_3.add(lblNewLabel_3);

        JLabel lblNewLabel_4 = new JLabel("Precio.");
        lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_4.setForeground(new Color(255, 255, 255));
        lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblNewLabel_4.setBounds(10, 112, 87, 14);
        panel_3.add(lblNewLabel_4);

        JLabel lblNewLabel_5 = new JLabel("Cantidad.");
        lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_5.setForeground(new Color(255, 255, 255));
        lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblNewLabel_5.setBounds(10, 156, 87, 14);
        panel_3.add(lblNewLabel_5);

        JLabel lblNewLabel_6 = new JLabel("Total.");
        lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_6.setForeground(new Color(255, 255, 255));
        lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblNewLabel_6.setBounds(10, 200, 87, 14);
        panel_3.add(lblNewLabel_6);

        textField = new JTextField();
        textField.setBounds(98, 20, 139, 20);
        panel_3.add(textField);
        textField.setColumns(10);

        textField_1 = new JTextField();
        textField_1.setBounds(98, 64, 139, 20);
        panel_3.add(textField_1);
        textField_1.setColumns(10);

        textField_2 = new JTextField();
        textField_2.setBounds(98, 109, 139, 20);
        panel_3.add(textField_2);
        textField_2.setColumns(10);

        textField_3 = new JTextField();
        textField_3.setBounds(98, 153, 139, 20);
        panel_3.add(textField_3);
        textField_3.setColumns(10);

        textField_4 = new JTextField();
        textField_4.setBounds(98, 197, 139, 20);
        panel_3.add(textField_4);
        textField_4.setColumns(10);

        JLabel lblNewLabel_1 = new JLabel("");
        lblNewLabel_1.setIcon(new ImageIcon(Ventas.class.getResource("/imagenes_personalizadas/21021f08753990a88a7ed016762c1e42.jpg")));
        lblNewLabel_1.setBounds(0, 0, 634, 451);
        contentPane.add(lblNewLabel_1);
    }
}
