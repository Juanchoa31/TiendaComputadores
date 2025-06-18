package Final;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import Mensajefinal.Mensaje_3;
import Opciones_de_salida.Salir_1;

import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class Productos extends JFrame {

    private JPanel contentPane;
    private JTextField textField_1;
    private JTextField textField_2;
    private JTextField textField_3;
    private JTextField textField_4;
    private JTextField textField_5;
    private JTextField textField;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Productos frame = new Productos();
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
    public Productos() {
        setResizable(false);
        setTitle("Productos.");
        setIconImage(Toolkit.getDefaultToolkit().getImage(Productos.class.getResource("/Iconos/computer.png")));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 640, 480);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 6, true), "Listado de productos.", TitledBorder.CENTER, TitledBorder.BOTTOM, null, new Color(255, 255, 255)));
        panel.setBackground(new Color(153, 102, 204));
        panel.setBounds(343, 11, 271, 287);
        contentPane.add(panel);
        panel.setLayout(null);

        JLabel lblNewLabel_6 = new JLabel("Computadores.");
        lblNewLabel_6.setIcon(new ImageIcon(Productos.class.getResource("/Iconos/computer.png")));
        lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblNewLabel_6.setForeground(new Color(255, 255, 255));
        lblNewLabel_6.setBounds(10, 11, 118, 14);
        panel.add(lblNewLabel_6);

        JLabel lblNewLabel_7 = new JLabel("Monitores.");
        lblNewLabel_7.setIcon(new ImageIcon(Productos.class.getResource("/Iconos/monitor.png")));
        lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblNewLabel_7.setForeground(new Color(255, 255, 255));
        lblNewLabel_7.setBounds(10, 33, 115, 14);
        panel.add(lblNewLabel_7);

        JLabel lblNewLabel_8 = new JLabel("Teclados.");
        lblNewLabel_8.setIcon(new ImageIcon(Productos.class.getResource("/Iconos/keyboard.png")));
        lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblNewLabel_8.setForeground(new Color(255, 255, 255));
        lblNewLabel_8.setBounds(10, 58, 118, 14);
        panel.add(lblNewLabel_8);

        JLabel lblNewLabel_9 = new JLabel("Ratones.");
        lblNewLabel_9.setIcon(new ImageIcon(Productos.class.getResource("/Iconos/mouse.png")));
        lblNewLabel_9.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblNewLabel_9.setForeground(new Color(255, 255, 255));
        lblNewLabel_9.setBounds(10, 83, 118, 14);
        panel.add(lblNewLabel_9);

        JLabel lblNewLabel_10 = new JLabel("C�maras.");
        lblNewLabel_10.setIcon(new ImageIcon(Productos.class.getResource("/Iconos/camera.png")));
        lblNewLabel_10.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_10.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblNewLabel_10.setForeground(new Color(255, 255, 255));
        lblNewLabel_10.setBounds(10, 108, 118, 16);
        panel.add(lblNewLabel_10);

        JLabel lblNewLabel_11 = new JLabel("Discos duros.");
        lblNewLabel_11.setIcon(new ImageIcon(Productos.class.getResource("/Iconos/drive.png")));
        lblNewLabel_11.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_11.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblNewLabel_11.setForeground(new Color(255, 255, 255));
        lblNewLabel_11.setBounds(10, 133, 118, 14);
        panel.add(lblNewLabel_11);

        JLabel lblNewLabel_12 = new JLabel("Controles.");
        lblNewLabel_12.setIcon(new ImageIcon(Productos.class.getResource("/Iconos/controller.png")));
        lblNewLabel_12.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_12.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblNewLabel_12.setForeground(new Color(255, 255, 255));
        lblNewLabel_12.setBounds(10, 158, 118, 14);
        panel.add(lblNewLabel_12);

        JLabel lblNewLabel_13 = new JLabel("Ipod's.");
        lblNewLabel_13.setIcon(new ImageIcon(Productos.class.getResource("/Iconos/ipod.png")));
        lblNewLabel_13.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_13.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblNewLabel_13.setForeground(new Color(255, 255, 255));
        lblNewLabel_13.setBounds(10, 183, 118, 14);
        panel.add(lblNewLabel_13);

        JLabel lblNewLabel_14 = new JLabel("Joystick.");
        lblNewLabel_14.setIcon(new ImageIcon(Productos.class.getResource("/Iconos/joystick.png")));
        lblNewLabel_14.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_14.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblNewLabel_14.setForeground(new Color(255, 255, 255));
        lblNewLabel_14.setBounds(10, 208, 118, 14);
        panel.add(lblNewLabel_14);

        JLabel lblNewLabel_15 = new JLabel("Celulares.");
        lblNewLabel_15.setIcon(new ImageIcon(Productos.class.getResource("/Iconos/phone.png")));
        lblNewLabel_15.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_15.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblNewLabel_15.setForeground(new Color(255, 255, 255));
        lblNewLabel_15.setBounds(10, 233, 118, 14);
        panel.add(lblNewLabel_15);

        JLabel lblNewLabel_16 = new JLabel("Impresoras.");
        lblNewLabel_16.setIcon(new ImageIcon(Productos.class.getResource("/Iconos/printer.png")));
        lblNewLabel_16.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_16.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblNewLabel_16.setForeground(new Color(255, 255, 255));
        lblNewLabel_16.setBounds(10, 254, 118, 14);
        panel.add(lblNewLabel_16);

        JLabel lblNewLabel_17 = new JLabel("1.000.000$ c/u.");
        lblNewLabel_17.setIcon(new ImageIcon(Productos.class.getResource("/Iconos/money_dollar.png")));
        lblNewLabel_17.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_17.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblNewLabel_17.setForeground(new Color(255, 255, 255));
        lblNewLabel_17.setBounds(121, 11, 140, 14);
        panel.add(lblNewLabel_17);

        JLabel lblNewLabel_18 = new JLabel("700.000$ c/u.");
        lblNewLabel_18.setIcon(new ImageIcon(Productos.class.getResource("/Iconos/money_dollar.png")));
        lblNewLabel_18.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_18.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblNewLabel_18.setForeground(new Color(255, 255, 255));
        lblNewLabel_18.setBounds(121, 33, 140, 14);
        panel.add(lblNewLabel_18);

        JLabel lblNewLabel_19 = new JLabel("50.000$ c/u.");
        lblNewLabel_19.setIcon(new ImageIcon(Productos.class.getResource("/Iconos/money_dollar.png")));
        lblNewLabel_19.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_19.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblNewLabel_19.setForeground(new Color(255, 255, 255));
        lblNewLabel_19.setBounds(121, 58, 140, 14);
        panel.add(lblNewLabel_19);

        JLabel lblNewLabel_20 = new JLabel("50.000$ c/u.");
        lblNewLabel_20.setIcon(new ImageIcon(Productos.class.getResource("/Iconos/money_dollar.png")));
        lblNewLabel_20.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_20.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblNewLabel_20.setForeground(new Color(255, 255, 255));
        lblNewLabel_20.setBounds(121, 83, 140, 14);
        panel.add(lblNewLabel_20);

        JLabel lblNewLabel_21 = new JLabel("100.000$ c/u.");
        lblNewLabel_21.setIcon(new ImageIcon(Productos.class.getResource("/Iconos/money_dollar.png")));
        lblNewLabel_21.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_21.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblNewLabel_21.setForeground(new Color(255, 255, 255));
        lblNewLabel_21.setBounds(121, 108, 140, 14);
        panel.add(lblNewLabel_21);

        JLabel lblNewLabel_22 = new JLabel("300.000$ c/u.");
        lblNewLabel_22.setIcon(new ImageIcon(Productos.class.getResource("/Iconos/money_dollar.png")));
        lblNewLabel_22.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_22.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblNewLabel_22.setForeground(new Color(255, 255, 255));
        lblNewLabel_22.setBounds(121, 133, 140, 14);
        panel.add(lblNewLabel_22);

        JLabel lblNewLabel_23 = new JLabel("75.000$ c/u.");
        lblNewLabel_23.setIcon(new ImageIcon(Productos.class.getResource("/Iconos/money_dollar.png")));
        lblNewLabel_23.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_23.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblNewLabel_23.setForeground(new Color(255, 255, 255));
        lblNewLabel_23.setBounds(121, 158, 140, 14);
        panel.add(lblNewLabel_23);

        JLabel lblNewLabel_24 = new JLabel("600.000$ c/u.");
        lblNewLabel_24.setIcon(new ImageIcon(Productos.class.getResource("/Iconos/money_dollar.png")));
        lblNewLabel_24.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_24.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblNewLabel_24.setForeground(new Color(255, 255, 255));
        lblNewLabel_24.setBounds(121, 183, 140, 14);
        panel.add(lblNewLabel_24);

        JLabel lblNewLabel_25 = new JLabel("25.000$ c/u.");
        lblNewLabel_25.setIcon(new ImageIcon(Productos.class.getResource("/Iconos/money_dollar.png")));
        lblNewLabel_25.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_25.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblNewLabel_25.setForeground(new Color(255, 255, 255));
        lblNewLabel_25.setBounds(121, 208, 140, 14);
        panel.add(lblNewLabel_25);

        JLabel lblNewLabel_26 = new JLabel("650.000$ c/u.");
        lblNewLabel_26.setIcon(new ImageIcon(Productos.class.getResource("/Iconos/money_dollar.png")));
        lblNewLabel_26.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_26.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblNewLabel_26.setForeground(new Color(255, 255, 255));
        lblNewLabel_26.setBounds(121, 233, 140, 14);
        panel.add(lblNewLabel_26);

        JLabel lblNewLabel_27 = new JLabel("700.000$ c/u.");
        lblNewLabel_27.setIcon(new ImageIcon(Productos.class.getResource("/Iconos/money_dollar.png")));
        lblNewLabel_27.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_27.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblNewLabel_27.setForeground(new Color(255, 255, 255));
        lblNewLabel_27.setBounds(121, 254, 140, 14);
        panel.add(lblNewLabel_27);

        JPanel panel_1 = new JPanel();
        panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 6, true));
        panel_1.setBackground(new Color(153, 102, 204));
        panel_1.setBounds(10, 339, 468, 91);
        contentPane.add(panel_1);
        panel_1.setLayout(null);

        JButton btnNewButton = new JButton("Guardar.");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                try {
                    java.sql.Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/computadores", "root", "");

                    java.sql.Statement comando = conexion.createStatement();

                    comando.executeUpdate("insert into productos(codigo,nombre,marca,cantidad,referencia,precio) values (" + textField.getText() + ",'" + textField_1.getText() + "','" + textField_2.getText() + "'," + textField_3.getText() + ",'" + textField_4.getText() + "'," + textField_5.getText() + ")");
                    conexion.close();

                    Mensaje_3 mensaje = new Mensaje_3();
                    dispose();
                    mensaje.setVisible(true);

                    textField.setText("");
                    textField_1.setText("");
                    textField_2.setText("");
                    textField_3.setText("");
                    textField_4.setText("");
                    textField_5.setText("");

                } catch (SQLException ex) {
                    setTitle(ex.toString());
                }
            }
        });
        btnNewButton.setIcon(new ImageIcon(Productos.class.getResource("/Iconos/database_add.png")));
        btnNewButton.setBackground(new Color(0, 0, 0));
        btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
        btnNewButton.setForeground(new Color(255, 255, 255));
        btnNewButton.setBounds(10, 11, 123, 23);
        panel_1.add(btnNewButton);

        JButton btnNewButton_1 = new JButton("Editar.");
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                try {
                    java.sql.Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/computadores", "root", "");
                    java.sql.Statement comando = conexion.createStatement();
                    int cantidad = comando.executeUpdate("update productos set nombre='" + textField_1.getText() + "',"
                            + "marca='" + textField_2.getText() + "',"
                            + "cantidad=" + textField_3.getText() + ","
                            + "referencia='" + textField_4.getText() + "',"
                            + "precio=" + textField_5.getText() + " where codigo=" + textField.getText());
                    if (cantidad == 1) {
                        JOptionPane.showMessageDialog(null, "Se modifico el articulo.");
                    } else {
                        JOptionPane.showMessageDialog(null, "No existe un articulo con dicho c�digo.");
                    }
                    conexion.close();
                } catch (SQLException ex) {
                    setTitle(ex.toString());
                }
            }

        });
        btnNewButton_1.setIcon(new ImageIcon(Productos.class.getResource("/Iconos/page_white_paint.png")));
        btnNewButton_1.setBackground(new Color(0, 0, 0));
        btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 12));
        btnNewButton_1.setForeground(new Color(255, 255, 255));
        btnNewButton_1.setBounds(121, 57, 123, 23);
        panel_1.add(btnNewButton_1);

        JButton btnNewButton_2 = new JButton("Borrar.");
        btnNewButton_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                try {
                    java.sql.Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/computadores", "root", "");
                    java.sql.Statement comando = conexion.createStatement();
                    int cantidad = comando.executeUpdate("delete from productos where codigo=" + textField.getText());
                    if (cantidad == 1) {

                        textField.setText("");
                        textField_1.setText("");
                        textField_2.setText("");
                        textField_3.setText("");
                        textField_4.setText("");
                        textField_5.setText("");

                        JOptionPane.showMessageDialog(null, "Se borro");
                    } else {
                        JOptionPane.showMessageDialog(null, "No existe ningun articulo con dicho c�digo");
                    }
                    conexion.close();
                } catch (SQLException ex) {
                    setTitle(ex.toString());
                }

            }
        });
        btnNewButton_2.setIcon(new ImageIcon(Productos.class.getResource("/Iconos/delete.png")));
        btnNewButton_2.setBackground(new Color(0, 0, 0));
        btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 12));
        btnNewButton_2.setForeground(new Color(255, 255, 255));
        btnNewButton_2.setBounds(230, 11, 123, 23);
        panel_1.add(btnNewButton_2);

        JButton btnNewButton_3 = new JButton("Consultar.");
        btnNewButton_3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {

                try {
                    java.sql.Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/computadores", "root", "");
                    java.sql.Statement comando = conexion.createStatement();

                    ResultSet registro = comando.executeQuery("select nombre,marca,cantidad,referencia,precio from productos where codigo=" + textField.getText());
                    if (registro.next() == true) {

                        textField_1.setText(registro.getString("nombre"));
                        textField_2.setText(registro.getString("marca"));
                        textField_3.setText(registro.getString("cantidad"));
                        textField_4.setText(registro.getString("referencia"));
                        textField_5.setText(registro.getString("precio"));

                    } else {
                        JOptionPane.showMessageDialog(null, "No existe un producto con dicho c�digo");
                    }
                    conexion.close();
                } catch (SQLException ex) {
                    setTitle(ex.toString());
                }

            }
        });
        btnNewButton_3.setIcon(new ImageIcon(Productos.class.getResource("/Iconos/zoom.png")));
        btnNewButton_3.setBackground(new Color(0, 0, 0));
        btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 12));
        btnNewButton_3.setForeground(new Color(255, 255, 255));
        btnNewButton_3.setBounds(334, 57, 123, 23);
        panel_1.add(btnNewButton_3);

        JPanel panel_2 = new JPanel();
        panel_2.setBackground(new Color(153, 102, 204));
        panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 6, true));
        panel_2.setBounds(488, 339, 126, 91);
        contentPane.add(panel_2);
        panel_2.setLayout(null);

        JButton btnNewButton_4 = new JButton("Volver...");
        btnNewButton_4.setIcon(new ImageIcon(Productos.class.getResource("/Iconos/arrow_turn_left.png")));
        btnNewButton_4.setBackground(new Color(0, 0, 0));
        btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 12));
        btnNewButton_4.setForeground(new Color(255, 255, 255));
        btnNewButton_4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                Menu productos = new Menu();
                dispose();
                productos.setVisible(true);
            }
        });
        btnNewButton_4.setBounds(10, 11, 106, 23);
        panel_2.add(btnNewButton_4);

        JButton btnNewButton_5 = new JButton("Salir.");
        btnNewButton_5.setIcon(new ImageIcon(Productos.class.getResource("/Iconos/cancel.png")));
        btnNewButton_5.setBackground(new Color(0, 0, 0));
        btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD, 12));
        btnNewButton_5.setForeground(new Color(255, 255, 255));
        btnNewButton_5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                Salir_1 salir = new Salir_1();
                dispose();
                salir.setVisible(true);
            }
        });
        btnNewButton_5.setBounds(10, 57, 106, 23);
        panel_2.add(btnNewButton_5);

        JPanel panel_3 = new JPanel();
        panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 6, true));
        panel_3.setBackground(new Color(153, 102, 204));
        panel_3.setBounds(10, 11, 233, 196);
        contentPane.add(panel_3);
        panel_3.setLayout(null);

        JLabel lblNewLabel = new JLabel("Codigo.");
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblNewLabel.setForeground(Color.WHITE);
        lblNewLabel.setBounds(10, 15, 82, 14);
        panel_3.add(lblNewLabel);

        JLabel lblNewLabel_1 = new JLabel("Nombre.");
        lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblNewLabel_1.setForeground(new Color(255, 255, 255));
        lblNewLabel_1.setBounds(10, 46, 82, 14);
        panel_3.add(lblNewLabel_1);

        JLabel lblNewLabel_2 = new JLabel("Marca.");
        lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblNewLabel_2.setForeground(new Color(255, 255, 255));
        lblNewLabel_2.setBounds(10, 76, 82, 14);
        panel_3.add(lblNewLabel_2);

        JLabel lblNewLabel_3 = new JLabel("Cantidad.");
        lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblNewLabel_3.setForeground(new Color(255, 255, 255));
        lblNewLabel_3.setBounds(10, 108, 82, 14);
        panel_3.add(lblNewLabel_3);

        JLabel lblNewLabel_4 = new JLabel("Referencia.");
        lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblNewLabel_4.setForeground(new Color(255, 255, 255));
        lblNewLabel_4.setBounds(10, 138, 82, 14);
        panel_3.add(lblNewLabel_4);

        JLabel lblNewLabel_5 = new JLabel("Precio.");
        lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblNewLabel_5.setForeground(new Color(255, 255, 255));
        lblNewLabel_5.setBounds(10, 169, 82, 14);
        panel_3.add(lblNewLabel_5);

        textField = new JTextField();
        textField.setBounds(102, 11, 121, 20);
        panel_3.add(textField);
        textField.setColumns(10);

        textField_1 = new JTextField();
        textField_1.setBounds(102, 42, 121, 20);
        panel_3.add(textField_1);
        textField_1.setColumns(10);

        textField_2 = new JTextField();
        textField_2.setBounds(102, 72, 121, 20);
        panel_3.add(textField_2);
        textField_2.setColumns(10);

        textField_3 = new JTextField();
        textField_3.setBounds(102, 103, 121, 20);
        panel_3.add(textField_3);
        textField_3.setColumns(10);

        textField_4 = new JTextField();
        textField_4.setBounds(102, 134, 121, 20);
        panel_3.add(textField_4);
        textField_4.setColumns(10);

        textField_5 = new JTextField();
        textField_5.setBounds(102, 165, 121, 20);
        panel_3.add(textField_5);
        textField_5.setColumns(10);

        JLabel lblNewLabel_29 = new JLabel("Productos...");
        lblNewLabel_29.setIcon(new ImageIcon(Productos.class.getResource("/Iconos/bricks.png")));
        lblNewLabel_29.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblNewLabel_29.setForeground(Color.WHITE);
        lblNewLabel_29.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_29.setBounds(10, 288, 176, 29);
        contentPane.add(lblNewLabel_29);

        JLabel lblNewLabel_28 = new JLabel("");
        lblNewLabel_28.setIcon(new ImageIcon(Productos.class.getResource("/imagenes_personalizadas/21021f08753990a88a7ed016762c1e42.jpg")));
        lblNewLabel_28.setBounds(0, 0, 624, 441);
        contentPane.add(lblNewLabel_28);
    }
}
