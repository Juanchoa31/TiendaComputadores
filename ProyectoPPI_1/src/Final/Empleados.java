package Final;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import Listas.ListasEmpleados;
import Mensajefinal.Mensaje_1;
import Opciones_de_salida.Salir_3;

import java.awt.Font;
import java.awt.Frame;
import java.awt.Toolkit;
import javax.swing.JDialog;

public class Empleados extends JDialog {

    private JPanel contentPane;
    private JTextField textField0;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private ListasEmpleados listaEmpleados = new ListasEmpleados();

    public Empleados(Frame parent) {
        super(parent, "Empleados");
        setResizable(false);
        setIconImage(Toolkit.getDefaultToolkit().getImage(Empleados.class.getResource("/Iconos/computer.png")));
        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 640, 480);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblNewLabel_6 = new JLabel("Empleados...");
        lblNewLabel_6.setIcon(new ImageIcon(Empleados.class.getResource("/Iconos/group.png")));
        lblNewLabel_6.setBounds(272, 11, 204, 20);
        lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_6.setForeground(new Color(255, 255, 255));
        lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 16));
        lblNewLabel_6.setBackground(new Color(0, 0, 0));
        contentPane.add(lblNewLabel_6);

        JPanel panel = new JPanel();
        panel.setBorder(new LineBorder(new Color(0, 0, 0), 6, true));
        panel.setBackground(new Color(153, 102, 204));
        panel.setBounds(486, 11, 128, 101);
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

                Salir_3 salir = new Salir_3();
                dispose();
                salir.setVisible(true);
            }
        });
        btnNewButton_1.setBounds(10, 67, 108, 23);
        panel.add(btnNewButton_1);

        JPanel panel_1 = new JPanel();
        panel_1.setBounds(10, 11, 243, 198);
        panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 6, true));
        panel_1.setBackground(new Color(153, 102, 204));
        contentPane.add(panel_1);
        panel_1.setLayout(null);

        textField1 = new JTextField();
        textField1.setHorizontalAlignment(SwingConstants.LEFT);
        textField1.setBounds(112, 42, 119, 20);
        panel_1.add(textField1);
        textField1.setColumns(10);

        textField2 = new JTextField();
        textField2.setHorizontalAlignment(SwingConstants.LEFT);
        textField2.setBounds(112, 73, 119, 20);
        panel_1.add(textField2);
        textField2.setColumns(10);

        textField3 = new JTextField();
        textField3.setHorizontalAlignment(SwingConstants.LEFT);
        textField3.setBounds(112, 104, 119, 20);
        panel_1.add(textField3);
        textField3.setColumns(10);

        textField4 = new JTextField();
        textField4.setHorizontalAlignment(SwingConstants.LEFT);
        textField4.setBounds(112, 135, 119, 20);
        panel_1.add(textField4);
        textField4.setColumns(10);

        textField5 = new JTextField();
        textField5.setHorizontalAlignment(SwingConstants.LEFT);
        textField5.setBounds(112, 166, 119, 20);
        panel_1.add(textField5);
        textField5.setColumns(10);

        JLabel lblNewLabel_1 = new JLabel("Nombres.");
        lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblNewLabel_1.setForeground(new Color(255, 255, 255));
        lblNewLabel_1.setBounds(10, 45, 99, 14);
        panel_1.add(lblNewLabel_1);

        JLabel lblNewLabel_2 = new JLabel("Apellidos.");
        lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblNewLabel_2.setForeground(new Color(255, 255, 255));
        lblNewLabel_2.setBounds(10, 78, 99, 14);
        panel_1.add(lblNewLabel_2);

        JLabel lblNewLabel_3 = new JLabel("Edad.");
        lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblNewLabel_3.setForeground(new Color(255, 255, 255));
        lblNewLabel_3.setBounds(10, 139, 99, 14);
        panel_1.add(lblNewLabel_3);

        JLabel lblNewLabel_4 = new JLabel("Genero.");
        lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblNewLabel_4.setForeground(new Color(255, 255, 255));
        lblNewLabel_4.setBounds(10, 108, 99, 14);
        panel_1.add(lblNewLabel_4);

        JLabel lblNewLabel_5 = new JLabel("Sueldo.");
        lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblNewLabel_5.setForeground(new Color(255, 255, 255));
        lblNewLabel_5.setBounds(10, 169, 99, 14);
        panel_1.add(lblNewLabel_5);

        JLabel lblNewLabel_7 = new JLabel("Codigo.");
        lblNewLabel_7.setForeground(Color.WHITE);
        lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_7.setBounds(10, 15, 99, 14);
        panel_1.add(lblNewLabel_7);

        textField0 = new JTextField();
        textField0.setBounds(112, 11, 119, 20);
        panel_1.add(textField0);
        textField0.setColumns(10);

        JPanel panel_2 = new JPanel();
        panel_2.setBounds(10, 350, 604, 80);
        panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 6, true));
        panel_2.setBackground(new Color(153, 102, 204));
        contentPane.add(panel_2);
        panel_2.setLayout(null);

        JButton btnNewButton_2 = new JButton("Guardar.");
        btnNewButton_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {

                try {
                    String codigo = textField0.getText();
                    String nombres = textField1.getText();
                    String apellidos = textField2.getText();
                    String genero = textField3.getText();
                    int edad = Integer.parseInt(textField4.getText());
                    double sueldo = Double.parseDouble(textField5.getText());

                    listaEmpleados.agregarEmpleado(codigo, nombres, apellidos, genero, edad, sueldo);

                    // Mensaje de éxito
                    Mensaje_1 mensaje = new Mensaje_1();
                    dispose();
                    mensaje.setVisible(true);

                    // Limpiar campos
                    textField0.setText("");
                    textField1.setText("");
                    textField2.setText("");
                    textField3.setText("");
                    textField4.setText("");
                    textField5.setText("");

                } catch (NumberFormatException ex) {
                    setTitle("Error de formato: " + ex.getMessage());
                }
            }
        });
        btnNewButton_2.setIcon(new ImageIcon(Empleados.class.getResource("/Iconos/database_add.png")));
        btnNewButton_2.setBackground(new Color(0, 0, 0));
        btnNewButton_2.setForeground(new Color(255, 255, 255));
        btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 12));
        btnNewButton_2.setBounds(10, 28, 145, 23);
        panel_2.add(btnNewButton_2);

        JButton btnNewButton_3 = new JButton("Editar.");
        btnNewButton_3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    java.sql.Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/computadores", "root", "");
                    java.sql.Statement comando = conexion.createStatement();
                    int cantidad = comando.executeUpdate("update empleados set nombres='" + textField1.getText() + "',"
                            + "apellidos='" + textField2.getText() + "',"
                            + "genero='" + textField3.getText() + "',"
                            + "edad=" + textField4.getText() + ","
                            + "sueldo=" + textField5.getText());
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
        btnNewButton_3.setIcon(new ImageIcon(Empleados.class.getResource("/Iconos/page_white_paint.png")));
        btnNewButton_3.setBackground(new Color(0, 0, 0));
        btnNewButton_3.setForeground(new Color(255, 255, 255));
        btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 12));
        btnNewButton_3.setBounds(165, 28, 145, 23);
        panel_2.add(btnNewButton_3);

        JButton btnNewButton_4 = new JButton("Borrar.");
        btnNewButton_4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                try {
                    java.sql.Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/computadores", "root", "");
                    java.sql.Statement comando = conexion.createStatement();
                    int cantidad = comando.executeUpdate("delete from empleados where codigo=" + textField0.getText());
                    if (cantidad == 1) {

                        textField0.setText("");
                        textField1.setText("");
                        textField2.setText("");
                        textField3.setText("");
                        textField4.setText("");
                        textField5.setText("");

                        JOptionPane.showMessageDialog(null, "Se borro");
                    } else {
                        JOptionPane.showMessageDialog(null, "No existe");
                    }
                    conexion.close();
                } catch (SQLException ex) {
                    setTitle(ex.toString());
                }
            }
        });
        btnNewButton_4.setIcon(new ImageIcon(Empleados.class.getResource("/Iconos/delete.png")));
        btnNewButton_4.setBackground(new Color(0, 0, 0));
        btnNewButton_4.setForeground(new Color(255, 255, 255));
        btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 12));
        btnNewButton_4.setBounds(320, 28, 136, 23);
        panel_2.add(btnNewButton_4);

        JButton btnNewButton_5 = new JButton("Consultar.");
        btnNewButton_5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {

                try {
                    java.sql.Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/computadores", "root", "");
                    java.sql.Statement comando = conexion.createStatement();

                    ResultSet registro = comando.executeQuery("select nombres,apellidos,genero,edad,sueldo from empleados where codigo=" + textField0.getText());
                    if (registro.next() == true) {

                        textField1.setText(registro.getString("nombres"));
                        textField2.setText(registro.getString("apellidos"));
                        textField3.setText(registro.getString("genero"));
                        textField4.setText(registro.getString("edad"));
                        textField5.setText(registro.getString("sueldo"));
                    } else {
                        JOptionPane.showMessageDialog(null, "No existe ningun elemento con dicho codigo");
                    }
                    conexion.close();
                } catch (SQLException ex) {
                    setTitle(ex.toString());
                }

            }
        });
        btnNewButton_5.setIcon(new ImageIcon(Empleados.class.getResource("/Iconos/zoom.png")));
        btnNewButton_5.setBackground(new Color(0, 0, 0));
        btnNewButton_5.setForeground(new Color(255, 255, 255));
        btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD, 12));
        btnNewButton_5.setBounds(466, 28, 128, 23);
        panel_2.add(btnNewButton_5);

        JLabel lblNewLabel = new JLabel("");
        lblNewLabel.setBounds(0, 0, 624, 441);
        lblNewLabel.setIcon(new ImageIcon(Empleados.class.getResource("/imagenes_personalizadas/21021f08753990a88a7ed016762c1e42.jpg")));
        contentPane.add(lblNewLabel);
    }
}
