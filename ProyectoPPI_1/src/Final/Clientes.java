package Final;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import java.awt.Color;

import javax.swing.border.LineBorder;

import Mensajefinal.Mensaje_2;
import Opciones_de_salida.Salir_2;

import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import java.awt.Dialog.ModalExclusionType;

public class Clientes extends JFrame {

    private JPanel contentPane;
    private JTextField textField_1;
    private JTextField textField_2;
    private JTextField textField_3;
    private JTextField textField_4;
    private JTextField textField;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Clientes frame = new Clientes();
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
    public Clientes() {
        setResizable(false);
        setForeground(new Color(255, 255, 255));
        setTitle("Clientes.");
        setBackground(new Color(153, 102, 204));
        setIconImage(Toolkit.getDefaultToolkit().getImage(Clientes.class.getResource("/Iconos/computer.png")));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 640, 480);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setBorder(new LineBorder(new Color(0, 0, 0), 6, true));
        panel.setBackground(new Color(153, 102, 204));
        panel.setBounds(10, 11, 244, 170);
        contentPane.add(panel);
        panel.setLayout(null);

        JLabel lblNewLabel_1 = new JLabel("Nombres.");
        lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_1.setBackground(new Color(0, 0, 0));
        lblNewLabel_1.setForeground(new Color(255, 255, 255));
        lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblNewLabel_1.setBounds(10, 48, 96, 14);
        panel.add(lblNewLabel_1);

        JLabel lblNewLabel_2 = new JLabel("Apellidos.");
        lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_2.setBackground(new Color(0, 0, 0));
        lblNewLabel_2.setForeground(new Color(255, 255, 255));
        lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblNewLabel_2.setBounds(10, 78, 96, 14);
        panel.add(lblNewLabel_2);

        JLabel lblNewLabel_3 = new JLabel("Direccion.");
        lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_3.setBackground(new Color(0, 0, 0));
        lblNewLabel_3.setForeground(new Color(255, 255, 255));
        lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblNewLabel_3.setBounds(10, 109, 96, 14);
        panel.add(lblNewLabel_3);

        textField_1 = new JTextField();
        textField_1.setBounds(106, 43, 125, 20);
        panel.add(textField_1);
        textField_1.setColumns(10);

        textField_2 = new JTextField();
        textField_2.setBounds(106, 74, 125, 20);
        panel.add(textField_2);
        textField_2.setColumns(10);

        textField_3 = new JTextField();
        textField_3.setBounds(106, 105, 125, 20);
        panel.add(textField_3);
        textField_3.setColumns(10);

        textField_4 = new JTextField();
        textField_4.setBounds(106, 136, 125, 20);
        panel.add(textField_4);
        textField_4.setColumns(10);

        JLabel lblNewLabel = new JLabel("Telefono.");
        lblNewLabel.setForeground(Color.WHITE);
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblNewLabel.setBounds(10, 139, 96, 14);
        panel.add(lblNewLabel);

        textField = new JTextField();
        textField.setBounds(106, 13, 125, 20);
        panel.add(textField);
        textField.setColumns(10);

        JLabel lblNewLabel_4 = new JLabel("Codigo.");
        lblNewLabel_4.setForeground(Color.WHITE);
        lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblNewLabel_4.setBounds(10, 16, 96, 14);
        panel.add(lblNewLabel_4);

        JPanel panel_1 = new JPanel();
        panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 6, true));
        panel_1.setBackground(new Color(153, 102, 204));
        panel_1.setBounds(486, 11, 128, 101);
        contentPane.add(panel_1);
        panel_1.setLayout(null);

        JButton btnNewButton = new JButton("Salir.");
        btnNewButton.setIcon(new ImageIcon(Clientes.class.getResource("/Iconos/cancel.png")));
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                Salir_2 salir = new Salir_2();
                dispose();
                salir.setVisible(true);
            }
        });
        btnNewButton.setBackground(new Color(0, 0, 0));
        btnNewButton.setForeground(new Color(255, 255, 255));
        btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
        btnNewButton.setBounds(10, 67, 108, 23);
        panel_1.add(btnNewButton);

        JButton btnNewButton_1 = new JButton("Volver...");
        btnNewButton_1.setIcon(new ImageIcon(Clientes.class.getResource("/Iconos/arrow_turn_left.png")));
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                Menu menu = new Menu();
                dispose();
                menu.setVisible(true);

            }
        });
        btnNewButton_1.setBackground(new Color(0, 0, 0));
        btnNewButton_1.setForeground(new Color(255, 255, 255));
        btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 12));
        btnNewButton_1.setBounds(10, 11, 108, 23);
        panel_1.add(btnNewButton_1);

        JPanel panel_2 = new JPanel();
        panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 6, true));
        panel_2.setBackground(new Color(153, 102, 204));
        panel_2.setBounds(10, 350, 604, 80);
        contentPane.add(panel_2);
        panel_2.setLayout(null);

        JButton btnNewButton_2 = new JButton("Guardar.");
        btnNewButton_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                try {
                    java.sql.Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/computadores", "root", "");

                    java.sql.Statement comando = conexion.createStatement();

                    comando.executeUpdate("insert into clientes(codigo,nombres,apellidos,direccion,telefono) values (" + textField.getText() + ",'" + textField_1.getText() + "','" + textField_2.getText() + "','" + textField_3.getText() + "'," + textField_4.getText() + ")");
                    conexion.close();

                    Mensaje_2 mensaje = new Mensaje_2();
                    dispose();
                    mensaje.setVisible(true);

                    textField.setText("");
                    textField_1.setText("");
                    textField_2.setText("");
                    textField_3.setText("");
                    textField_4.setText("");

                } catch (SQLException ex) {
                    setTitle(ex.toString());
                }
            }
        });
        btnNewButton_2.setIcon(new ImageIcon(Clientes.class.getResource("/Iconos/database_add.png")));
        btnNewButton_2.setBackground(new Color(0, 0, 0));
        btnNewButton_2.setForeground(new Color(255, 255, 255));
        btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 12));
        btnNewButton_2.setBounds(10, 28, 145, 23);
        panel_2.add(btnNewButton_2);

        JButton btnNewButton_3 = new JButton("Editar");
        btnNewButton_3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {

                try {
                    java.sql.Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/computadores", "root", "");
                    java.sql.Statement comando = conexion.createStatement();
                    int cantidad = comando.executeUpdate("update clientes set nombres='" + textField_1.getText() + "',"
                            + "apellidos='" + textField_2.getText() + "',"
                            + "direccion='" + textField_3.getText() + "',"
                            + "telefono=" + textField_4.getText());
                    if (cantidad == 1) {
                        JOptionPane.showMessageDialog(null, "Se actualizo correctamente.");
                    } else {
                        JOptionPane.showMessageDialog(null, "No existe dicho codigo, lo siento.");
                    }
                    conexion.close();
                } catch (SQLException ex) {
                    setTitle(ex.toString());
                }
            }
        });
        btnNewButton_3.setIcon(new ImageIcon(Clientes.class.getResource("/Iconos/page_white_paint.png")));
        btnNewButton_3.setBackground(new Color(0, 0, 0));
        btnNewButton_3.setForeground(new Color(255, 255, 255));
        btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 12));
        btnNewButton_3.setBounds(165, 28, 150, 23);
        panel_2.add(btnNewButton_3);

        JButton btnNewButton_4 = new JButton("Borrar.");
        btnNewButton_4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    java.sql.Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/computadores", "root", "");
                    java.sql.Statement comando = conexion.createStatement();
                    int cantidad = comando.executeUpdate("delete from clientes where codigo=" + textField.getText());
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
        btnNewButton_4.setIcon(new ImageIcon(Clientes.class.getResource("/Iconos/delete.png")));
        btnNewButton_4.setBackground(new Color(0, 0, 0));
        btnNewButton_4.setForeground(new Color(255, 255, 255));
        btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 12));
        btnNewButton_4.setBounds(325, 28, 138, 23);
        panel_2.add(btnNewButton_4);

        JButton btnNewButton_5 = new JButton("Consultar.");
        btnNewButton_5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                try {
                    java.sql.Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/computadores", "root", "");
                    java.sql.Statement comando = conexion.createStatement();

                    ResultSet registro = comando.executeQuery("select nombres,apellidos,direccion,telefono from clientes where codigo=" + textField.getText());
                    if (registro.next() == true) {

                        textField_1.setText(registro.getString("nombres"));
                        textField_2.setText(registro.getString("apellidos"));
                        textField_3.setText(registro.getString("direccion"));
                        textField_4.setText(registro.getString("telefono"));
                    } else {
                        JOptionPane.showMessageDialog(null, "No existe ningun elemento con dicho codigo");
                    }
                    conexion.close();
                } catch (SQLException ex) {
                    setTitle(ex.toString());
                }

            }
        });
        btnNewButton_5.setIcon(new ImageIcon(Clientes.class.getResource("/Iconos/zoom.png")));
        btnNewButton_5.setBackground(new Color(0, 0, 0));
        btnNewButton_5.setForeground(new Color(255, 255, 255));
        btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD, 12));
        btnNewButton_5.setBounds(473, 28, 121, 23);
        panel_2.add(btnNewButton_5);

        JLabel lblNewLabel_6 = new JLabel("Clientes...");
        lblNewLabel_6.setIcon(new ImageIcon(Clientes.class.getResource("/Iconos/group_key.png")));
        lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_6.setForeground(new Color(255, 255, 255));
        lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblNewLabel_6.setBounds(272, 11, 204, 25);
        contentPane.add(lblNewLabel_6);

        JLabel lblNewLabel_5 = new JLabel("");
        lblNewLabel_5.setBounds(0, 0, 624, 441);
        contentPane.add(lblNewLabel_5);
        lblNewLabel_5.setIcon(new ImageIcon(Clientes.class.getResource("/imagenes_personalizadas/21021f08753990a88a7ed016762c1e42.jpg")));

    }
}
