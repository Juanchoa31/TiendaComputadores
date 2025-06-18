package Mensajefinal;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.LineBorder;

import Final.Empleados;
import Final.Menu;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class Mensaje_1 extends JFrame {

    private JPanel contentPane;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Mensaje frame = new Mensaje();
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
    public Mensaje_1() {
        setTitle("Mensaje de salida");
        setIconImage(Toolkit.getDefaultToolkit().getImage(Mensaje.class.getResource("/Iconos/computer.png")));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 217);
        contentPane = new JPanel();
        contentPane.setBackground(Color.BLACK);
        contentPane.setBorder(new LineBorder(new Color(153, 102, 204), 6, true));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        this.setResizable(false);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setBackground(new Color(153, 102, 204));
        panel.setBounds(63, 38, 305, 60);
        contentPane.add(panel);
        panel.setLayout(null);

        JLabel lblNewLabel = new JLabel("Los datos se ingresaron correctamente.");
        lblNewLabel.setForeground(Color.WHITE);
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setBounds(0, 11, 305, 43);
        panel.add(lblNewLabel);

        JButton btnNewButton = new JButton("Volver.");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                Empleados empleados = new Empleados();
                dispose();
                empleados.setVisible(true);
            }
        });
        btnNewButton.setIcon(new ImageIcon(Mensaje.class.getResource("/Iconos/accept.png")));
        btnNewButton.setBackground(new Color(153, 102, 204));
        btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
        btnNewButton.setForeground(Color.WHITE);
        btnNewButton.setBounds(153, 127, 120, 23);
        contentPane.add(btnNewButton);
    }
}
