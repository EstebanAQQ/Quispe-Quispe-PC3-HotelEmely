
package vista;

import com.formdev.flatlaf.intellijthemes.FlatCyanLightIJTheme;
import java.awt.CardLayout;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import modelo.Usuario;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class vista extends javax.swing.JFrame {
    public Usuario U;
    public File newResource= new File("memoria.txt");
    //public File newResource = new File(getClass().getClassLoader().getResource("memoria.txt").getFile()); 
    
    public vista() {
        this.setUndecorated(true);
        this.initComponents();
        this.setSize(750,570);
        this.setLocationRelativeTo(null);
        this.U=new Usuario();
        this.LeerCookies();
        radio_M.setSelected(true);
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        panel_login4 = new javax.swing.JPanel();
        jPanel112 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel126 = new javax.swing.JPanel();
        jPanel113 = new javax.swing.JPanel();
        filler15 = new javax.swing.Box.Filler(new java.awt.Dimension(50, 0), new java.awt.Dimension(50, 0), new java.awt.Dimension(50, 32767));
        jPanel124 = new javax.swing.JPanel();
        jPanel114 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jPanel117 = new javax.swing.JPanel();
        jPanel115 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jPanel116 = new javax.swing.JPanel();
        txt_user3 = new javax.swing.JTextField();
        jPanel13 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        filler16 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 32767));
        jPanel120 = new javax.swing.JPanel();
        jPanel118 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jPanel119 = new javax.swing.JPanel();
        txt_pass3 = new javax.swing.JPasswordField();
        ver_contra3 = new javax.swing.JLabel();
        jPanel30 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        filler17 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 32767));
        jPanel123 = new javax.swing.JPanel();
        jPanel121 = new javax.swing.JPanel();
        jCheckBox4 = new javax.swing.JCheckBox();
        jPanel122 = new javax.swing.JPanel();
        bt_iniciar3 = new javax.swing.JButton();
        jPanel17 = new javax.swing.JPanel();
        bt_registro = new javax.swing.JButton();
        jPanel125 = new javax.swing.JPanel();
        filler18 = new javax.swing.Box.Filler(new java.awt.Dimension(50, 0), new java.awt.Dimension(50, 0), new java.awt.Dimension(50, 32767));
        jPanel3 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        lb_titulo = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        panel_control = new javax.swing.JPanel();
        jPanel33 = new javax.swing.JPanel();
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 32767));
        jPanel34 = new javax.swing.JPanel();
        filler6 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 20), new java.awt.Dimension(0, 20), new java.awt.Dimension(32767, 20));
        jPanel36 = new javax.swing.JPanel();
        jPanel37 = new javax.swing.JPanel();
        lb_imagen_user = new javax.swing.JLabel();
        lb_nombre_usuario = new javax.swing.JLabel();
        jPanel39 = new javax.swing.JPanel();
        jPanel38 = new javax.swing.JPanel();
        bt_control_habitaciones = new javax.swing.JButton();
        bt_edit_perfil_usu = new javax.swing.JButton();
        bt_historial_clientes = new javax.swing.JButton();
        bt_control_reservaciones = new javax.swing.JButton();
        bt_nueva_reservacion = new javax.swing.JButton();
        bt_reservacion_usu = new javax.swing.JButton();
        bt_historial_usu = new javax.swing.JButton();
        bt_historial_pagos = new javax.swing.JButton();
        bt_cerrar_sesion_usu = new javax.swing.JButton();
        jPanel16 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        jPanel23 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel24 = new javax.swing.JPanel();
        panel_login5 = new javax.swing.JPanel();
        jPanel127 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel128 = new javax.swing.JPanel();
        jPanel129 = new javax.swing.JPanel();
        filler19 = new javax.swing.Box.Filler(new java.awt.Dimension(50, 0), new java.awt.Dimension(50, 0), new java.awt.Dimension(50, 32767));
        jPanel130 = new javax.swing.JPanel();
        jPanel131 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        jPanel132 = new javax.swing.JPanel();
        jPanel133 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        jPanel134 = new javax.swing.JPanel();
        txt_nombre_registro = new javax.swing.JTextField();
        jPanel25 = new javax.swing.JPanel();
        filler20 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 32767));
        jPanel140 = new javax.swing.JPanel();
        jPanel142 = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        jPanel146 = new javax.swing.JPanel();
        txt_numero_registro = new javax.swing.JTextField();
        jPanel27 = new javax.swing.JPanel();
        filler23 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 32767));
        jPanel143 = new javax.swing.JPanel();
        jPanel144 = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        jPanel145 = new javax.swing.JPanel();
        txt_correo_registro = new javax.swing.JTextField();
        jPanel28 = new javax.swing.JPanel();
        jLabel43 = new javax.swing.JLabel();
        filler24 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 32767));
        jPanel135 = new javax.swing.JPanel();
        jPanel136 = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        jPanel137 = new javax.swing.JPanel();
        txt_pass_registro = new javax.swing.JPasswordField();
        ver_contra4 = new javax.swing.JLabel();
        jPanel31 = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        filler21 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 32767));
        jPanel138 = new javax.swing.JPanel();
        jPanel139 = new javax.swing.JPanel();
        radio_F = new javax.swing.JRadioButton();
        radio_M = new javax.swing.JRadioButton();
        jPanel26 = new javax.swing.JPanel();
        bt_insertar_cliente = new javax.swing.JButton();
        bt_cambio_iniciarSesion = new javax.swing.JButton();
        jPanel29 = new javax.swing.JPanel();
        jPanel32 = new javax.swing.JPanel();
        jPanel141 = new javax.swing.JPanel();
        filler22 = new javax.swing.Box.Filler(new java.awt.Dimension(50, 0), new java.awt.Dimension(50, 0), new java.awt.Dimension(50, 32767));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new java.awt.CardLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel2.setLayout(new java.awt.GridLayout(1, 0));

        jPanel5.setBackground(new java.awt.Color(44, 57, 37));
        jPanel5.setLayout(new java.awt.BorderLayout());

        jPanel10.setOpaque(false);
        jPanel10.setLayout(new java.awt.BorderLayout());

        jPanel11.setOpaque(false);
        jPanel11.setLayout(new java.awt.BorderLayout());

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/HOSPEDAJE EMELY_free-file.png"))); // NOI18N
        jPanel11.add(jLabel6, java.awt.BorderLayout.CENTER);

        jPanel10.add(jPanel11, java.awt.BorderLayout.CENTER);

        jPanel5.add(jPanel10, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel5);

        panel_login4.setBackground(new java.awt.Color(250, 242, 233));
        panel_login4.setLayout(new java.awt.BorderLayout());

        jPanel112.setOpaque(false);
        java.awt.FlowLayout flowLayout1 = new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT);
        flowLayout1.setAlignOnBaseline(true);
        jPanel112.setLayout(flowLayout1);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Close_32px.png"))); // NOI18N
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel112.add(jLabel10);

        panel_login4.add(jPanel112, java.awt.BorderLayout.PAGE_START);

        jPanel126.setOpaque(false);
        jPanel126.setLayout(new java.awt.BorderLayout());

        jPanel113.setOpaque(false);
        jPanel113.add(filler15);

        jPanel126.add(jPanel113, java.awt.BorderLayout.LINE_START);

        jPanel124.setOpaque(false);
        jPanel124.setLayout(new java.awt.GridLayout(5, 1));

        jPanel114.setOpaque(false);

        jLabel31.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 28)); // NOI18N
        jLabel31.setText("INICIAR SESION");
        jPanel114.add(jLabel31);

        jPanel124.add(jPanel114);

        jPanel117.setOpaque(false);
        jPanel117.setLayout(new java.awt.GridLayout(2, 1));

        jPanel115.setOpaque(false);
        jPanel115.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        jLabel32.setFont(new java.awt.Font("Comic Sans MS", 1, 16)); // NOI18N
        jLabel32.setText("CORREO ELECTRONICO");
        jPanel115.add(jLabel32);

        jPanel117.add(jPanel115);

        jPanel116.setBackground(new java.awt.Color(240, 236, 235));
        jPanel116.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jPanel116.setLayout(new java.awt.BorderLayout());

        txt_user3.setBackground(new java.awt.Color(240, 236, 235));
        txt_user3.setFont(new java.awt.Font("Comic Sans MS", 0, 21)); // NOI18N
        txt_user3.setBorder(null);
        txt_user3.setOpaque(false);
        txt_user3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_userKeyReleased(evt);
            }
        });
        jPanel116.add(txt_user3, java.awt.BorderLayout.CENTER);

        jPanel13.setOpaque(false);
        jPanel13.setLayout(new java.awt.BorderLayout());

        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/At sign_26px.png"))); // NOI18N
        jPanel13.add(jLabel33, java.awt.BorderLayout.WEST);
        jPanel13.add(filler16, java.awt.BorderLayout.CENTER);

        jPanel116.add(jPanel13, java.awt.BorderLayout.WEST);

        jPanel117.add(jPanel116);

        jPanel124.add(jPanel117);

        jPanel120.setOpaque(false);
        jPanel120.setLayout(new java.awt.GridLayout(2, 1));

        jPanel118.setOpaque(false);
        jPanel118.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        jLabel34.setFont(new java.awt.Font("Comic Sans MS", 1, 16)); // NOI18N
        jLabel34.setText("CONTRASEÑA");
        jPanel118.add(jLabel34);

        jPanel120.add(jPanel118);

        jPanel119.setBackground(new java.awt.Color(240, 236, 235));
        jPanel119.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jPanel119.setLayout(new java.awt.BorderLayout());

        txt_pass3.setBackground(new java.awt.Color(240, 236, 235));
        txt_pass3.setFont(new java.awt.Font("Comic Sans MS", 0, 21)); // NOI18N
        txt_pass3.setBorder(null);
        txt_pass3.setOpaque(false);
        txt_pass3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_passKeyReleased(evt);
            }
        });
        jPanel119.add(txt_pass3, java.awt.BorderLayout.CENTER);

        ver_contra3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ver_contra3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eye_25px.png"))); // NOI18N
        ver_contra3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ver_contraMouseClicked(evt);
            }
        });
        jPanel119.add(ver_contra3, java.awt.BorderLayout.EAST);

        jPanel30.setOpaque(false);
        jPanel30.setLayout(new java.awt.BorderLayout());

        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lock_26px.png"))); // NOI18N
        jPanel30.add(jLabel35, java.awt.BorderLayout.WEST);
        jPanel30.add(filler17, java.awt.BorderLayout.CENTER);

        jPanel119.add(jPanel30, java.awt.BorderLayout.WEST);

        jPanel120.add(jPanel119);

        jPanel124.add(jPanel120);

        jPanel123.setOpaque(false);
        jPanel123.setLayout(new java.awt.GridLayout(2, 1));

        jPanel121.setOpaque(false);
        jPanel121.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        jCheckBox4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
        jCheckBox4.setText("Recordar ");
        jCheckBox4.setOpaque(false);
        jPanel121.add(jCheckBox4);

        jPanel123.add(jPanel121);

        jPanel122.setOpaque(false);
        jPanel122.setLayout(new java.awt.BorderLayout());

        bt_iniciar3.setBackground(new java.awt.Color(65, 170, 174));
        bt_iniciar3.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 20)); // NOI18N
        bt_iniciar3.setForeground(new java.awt.Color(255, 255, 255));
        bt_iniciar3.setText("INICIAR SESION");
        bt_iniciar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_iniciarActionPerformed(evt);
            }
        });
        jPanel122.add(bt_iniciar3, java.awt.BorderLayout.CENTER);

        jPanel123.add(jPanel122);

        jPanel124.add(jPanel123);

        jPanel17.setOpaque(false);

        bt_registro.setBackground(new java.awt.Color(250, 242, 233));
        bt_registro.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 20)); // NOI18N
        bt_registro.setForeground(new java.awt.Color(65, 170, 174));
        bt_registro.setText("Registrarse");
        bt_registro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_registrobt_iniciarActionPerformed(evt);
            }
        });
        jPanel17.add(bt_registro);

        jPanel124.add(jPanel17);

        jPanel126.add(jPanel124, java.awt.BorderLayout.CENTER);

        jPanel125.setOpaque(false);

        javax.swing.GroupLayout jPanel125Layout = new javax.swing.GroupLayout(jPanel125);
        jPanel125.setLayout(jPanel125Layout);
        jPanel125Layout.setHorizontalGroup(
            jPanel125Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
            .addGroup(jPanel125Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel125Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(filler18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel125Layout.setVerticalGroup(
            jPanel125Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 815, Short.MAX_VALUE)
            .addGroup(jPanel125Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel125Layout.createSequentialGroup()
                    .addGap(0, 407, Short.MAX_VALUE)
                    .addComponent(filler18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 408, Short.MAX_VALUE)))
        );

        jPanel126.add(jPanel125, java.awt.BorderLayout.EAST);

        panel_login4.add(jPanel126, java.awt.BorderLayout.CENTER);

        jPanel2.add(panel_login4);

        jPanel1.add(jPanel2, "card2");

        jPanel3.setLayout(new java.awt.BorderLayout());

        jPanel6.setLayout(new java.awt.BorderLayout());

        jPanel12.setBackground(new java.awt.Color(0, 102, 102));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/multiply_100px.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel12.add(jLabel2);

        jPanel6.add(jPanel12, java.awt.BorderLayout.LINE_END);

        jPanel14.setBackground(new java.awt.Color(0, 102, 102));

        lb_titulo.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N
        lb_titulo.setForeground(new java.awt.Color(255, 255, 255));
        lb_titulo.setText("HOSPEDAJE EMELY- CLIENTE");
        jPanel14.add(lb_titulo);

        jPanel6.add(jPanel14, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel6, java.awt.BorderLayout.PAGE_START);

        jPanel7.setOpaque(false);
        jPanel7.setLayout(new java.awt.BorderLayout());

        jPanel8.setLayout(new java.awt.BorderLayout());

        jPanel15.setLayout(new java.awt.BorderLayout());

        panel_control.setBackground(new java.awt.Color(0, 102, 153));
        panel_control.setLayout(new java.awt.BorderLayout());

        jPanel33.setOpaque(false);
        jPanel33.add(filler3);

        panel_control.add(jPanel33, java.awt.BorderLayout.LINE_START);

        jPanel34.setOpaque(false);
        jPanel34.add(filler6);

        panel_control.add(jPanel34, java.awt.BorderLayout.PAGE_START);

        jPanel36.setOpaque(false);
        jPanel36.setLayout(new java.awt.BorderLayout());

        jPanel37.setOpaque(false);
        jPanel37.setLayout(new java.awt.BorderLayout());

        lb_imagen_user.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_imagen_user.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/male_user_100px.png"))); // NOI18N
        jPanel37.add(lb_imagen_user, java.awt.BorderLayout.CENTER);

        lb_nombre_usuario.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
        lb_nombre_usuario.setForeground(new java.awt.Color(255, 255, 255));
        lb_nombre_usuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_nombre_usuario.setText("Nombre User");
        jPanel37.add(lb_nombre_usuario, java.awt.BorderLayout.PAGE_END);

        jPanel36.add(jPanel37, java.awt.BorderLayout.PAGE_START);

        jPanel39.setOpaque(false);

        jPanel38.setOpaque(false);
        jPanel38.setLayout(new javax.swing.BoxLayout(jPanel38, javax.swing.BoxLayout.Y_AXIS));

        bt_control_habitaciones.setBackground(new java.awt.Color(0, 153, 153));
        bt_control_habitaciones.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
        bt_control_habitaciones.setForeground(new java.awt.Color(255, 255, 255));
        bt_control_habitaciones.setText(" Control Habitaciones");
        bt_control_habitaciones.setMaximumSize(new java.awt.Dimension(185, 35));
        bt_control_habitaciones.setMinimumSize(new java.awt.Dimension(185, 35));
        bt_control_habitaciones.setPreferredSize(new java.awt.Dimension(185, 35));
        jPanel38.add(bt_control_habitaciones);

        bt_edit_perfil_usu.setBackground(new java.awt.Color(0, 153, 153));
        bt_edit_perfil_usu.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
        bt_edit_perfil_usu.setForeground(new java.awt.Color(255, 255, 255));
        bt_edit_perfil_usu.setText("Editar Perfil");
        bt_edit_perfil_usu.setMaximumSize(new java.awt.Dimension(185, 35));
        bt_edit_perfil_usu.setMinimumSize(new java.awt.Dimension(185, 35));
        bt_edit_perfil_usu.setPreferredSize(new java.awt.Dimension(185, 35));
        bt_edit_perfil_usu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_edit_perfil_usuActionPerformed(evt);
            }
        });
        jPanel38.add(bt_edit_perfil_usu);

        bt_historial_clientes.setBackground(new java.awt.Color(0, 153, 153));
        bt_historial_clientes.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
        bt_historial_clientes.setForeground(new java.awt.Color(255, 255, 255));
        bt_historial_clientes.setText("Historial Clientes");
        bt_historial_clientes.setMaximumSize(new java.awt.Dimension(185, 35));
        bt_historial_clientes.setMinimumSize(new java.awt.Dimension(185, 35));
        bt_historial_clientes.setPreferredSize(new java.awt.Dimension(185, 35));
        bt_historial_clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_historial_clientesActionPerformed(evt);
            }
        });
        jPanel38.add(bt_historial_clientes);

        bt_control_reservaciones.setBackground(new java.awt.Color(0, 153, 153));
        bt_control_reservaciones.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
        bt_control_reservaciones.setForeground(new java.awt.Color(255, 255, 255));
        bt_control_reservaciones.setText("Control Reservaciones");
        bt_control_reservaciones.setMaximumSize(new java.awt.Dimension(185, 35));
        bt_control_reservaciones.setMinimumSize(new java.awt.Dimension(185, 35));
        bt_control_reservaciones.setPreferredSize(new java.awt.Dimension(185, 35));
        bt_control_reservaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_control_reservacionesActionPerformed(evt);
            }
        });
        jPanel38.add(bt_control_reservaciones);

        bt_nueva_reservacion.setBackground(new java.awt.Color(0, 153, 153));
        bt_nueva_reservacion.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
        bt_nueva_reservacion.setForeground(new java.awt.Color(255, 255, 255));
        bt_nueva_reservacion.setText("Nueva Reservacion");
        bt_nueva_reservacion.setMaximumSize(new java.awt.Dimension(185, 35));
        bt_nueva_reservacion.setMinimumSize(new java.awt.Dimension(185, 35));
        bt_nueva_reservacion.setPreferredSize(new java.awt.Dimension(185, 35));
        jPanel38.add(bt_nueva_reservacion);

        bt_reservacion_usu.setBackground(new java.awt.Color(0, 153, 153));
        bt_reservacion_usu.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
        bt_reservacion_usu.setForeground(new java.awt.Color(255, 255, 255));
        bt_reservacion_usu.setText("Reservacion");
        bt_reservacion_usu.setMaximumSize(new java.awt.Dimension(185, 35));
        bt_reservacion_usu.setMinimumSize(new java.awt.Dimension(185, 35));
        bt_reservacion_usu.setPreferredSize(new java.awt.Dimension(185, 35));
        jPanel38.add(bt_reservacion_usu);

        bt_historial_usu.setBackground(new java.awt.Color(0, 153, 153));
        bt_historial_usu.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
        bt_historial_usu.setForeground(new java.awt.Color(255, 255, 255));
        bt_historial_usu.setText("Historial");
        bt_historial_usu.setMaximumSize(new java.awt.Dimension(185, 35));
        bt_historial_usu.setMinimumSize(new java.awt.Dimension(185, 35));
        bt_historial_usu.setPreferredSize(new java.awt.Dimension(185, 35));
        jPanel38.add(bt_historial_usu);

        bt_historial_pagos.setBackground(new java.awt.Color(0, 153, 153));
        bt_historial_pagos.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
        bt_historial_pagos.setForeground(new java.awt.Color(255, 255, 255));
        bt_historial_pagos.setText("Historial Pagos");
        bt_historial_pagos.setMaximumSize(new java.awt.Dimension(185, 35));
        bt_historial_pagos.setMinimumSize(new java.awt.Dimension(185, 35));
        bt_historial_pagos.setPreferredSize(new java.awt.Dimension(185, 35));
        bt_historial_pagos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_historial_pagosActionPerformed(evt);
            }
        });
        jPanel38.add(bt_historial_pagos);

        bt_cerrar_sesion_usu.setBackground(new java.awt.Color(204, 0, 51));
        bt_cerrar_sesion_usu.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
        bt_cerrar_sesion_usu.setForeground(new java.awt.Color(255, 255, 255));
        bt_cerrar_sesion_usu.setText("Cerrar sesion");
        bt_cerrar_sesion_usu.setMaximumSize(new java.awt.Dimension(185, 35));
        bt_cerrar_sesion_usu.setMinimumSize(new java.awt.Dimension(185, 35));
        bt_cerrar_sesion_usu.setPreferredSize(new java.awt.Dimension(185, 35));
        bt_cerrar_sesion_usu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_cerrar_sesion_usuActionPerformed(evt);
            }
        });
        jPanel38.add(bt_cerrar_sesion_usu);

        jPanel39.add(jPanel38);

        jPanel36.add(jPanel39, java.awt.BorderLayout.CENTER);

        panel_control.add(jPanel36, java.awt.BorderLayout.CENTER);

        jPanel15.add(panel_control, java.awt.BorderLayout.LINE_START);

        jPanel8.add(jPanel15, java.awt.BorderLayout.LINE_START);

        jPanel16.setBackground(new java.awt.Color(0, 102, 153));
        jPanel16.setLayout(new java.awt.BorderLayout());

        jPanel19.setOpaque(false);

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel16.add(jPanel19, java.awt.BorderLayout.PAGE_START);

        jPanel20.setOpaque(false);

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel16.add(jPanel20, java.awt.BorderLayout.PAGE_END);

        jPanel21.setOpaque(false);
        jPanel21.setLayout(new java.awt.BorderLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/double_right_32px.png"))); // NOI18N
        jPanel21.add(jLabel1, java.awt.BorderLayout.CENTER);

        jPanel16.add(jPanel21, java.awt.BorderLayout.CENTER);

        jPanel8.add(jPanel16, java.awt.BorderLayout.CENTER);

        jPanel7.add(jPanel8, java.awt.BorderLayout.LINE_START);

        jPanel9.setBackground(new java.awt.Color(254, 233, 212));
        jPanel9.setLayout(new java.awt.BorderLayout());
        jPanel7.add(jPanel9, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel7, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel3, "card3");

        jPanel4.setLayout(new java.awt.GridLayout(1, 0));

        jPanel18.setBackground(new java.awt.Color(44, 57, 37));
        jPanel18.setLayout(new java.awt.BorderLayout());

        jPanel22.setOpaque(false);
        jPanel22.setLayout(new java.awt.BorderLayout());

        jPanel23.setOpaque(false);
        jPanel23.setLayout(new java.awt.BorderLayout());

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/HOSPEDAJE EMELY_free-file.png"))); // NOI18N
        jPanel23.add(jLabel7, java.awt.BorderLayout.CENTER);

        jPanel22.add(jPanel23, java.awt.BorderLayout.CENTER);

        jPanel18.add(jPanel22, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel18);

        jPanel24.setLayout(new java.awt.BorderLayout());

        panel_login5.setBackground(new java.awt.Color(250, 242, 233));
        panel_login5.setLayout(new java.awt.BorderLayout());

        jPanel127.setOpaque(false);
        java.awt.FlowLayout flowLayout3 = new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT);
        flowLayout3.setAlignOnBaseline(true);
        jPanel127.setLayout(flowLayout3);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Close_32px.png"))); // NOI18N
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11jLabel7MouseClicked(evt);
            }
        });
        jPanel127.add(jLabel11);

        panel_login5.add(jPanel127, java.awt.BorderLayout.PAGE_START);

        jPanel128.setOpaque(false);
        jPanel128.setLayout(new java.awt.BorderLayout());

        jPanel129.setOpaque(false);
        jPanel129.add(filler19);

        jPanel128.add(jPanel129, java.awt.BorderLayout.LINE_START);

        jPanel130.setOpaque(false);
        jPanel130.setLayout(new java.awt.GridLayout(7, 1));

        jPanel131.setOpaque(false);

        jLabel36.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 28)); // NOI18N
        jLabel36.setText("Registrarse");
        jPanel131.add(jLabel36);

        jPanel130.add(jPanel131);

        jPanel132.setOpaque(false);
        jPanel132.setLayout(new java.awt.GridLayout(2, 1));

        jPanel133.setOpaque(false);
        jPanel133.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        jLabel37.setFont(new java.awt.Font("Comic Sans MS", 1, 16)); // NOI18N
        jLabel37.setText("NOMBRE COMPLETO");
        jPanel133.add(jLabel37);

        jPanel132.add(jPanel133);

        jPanel134.setBackground(new java.awt.Color(240, 236, 235));
        jPanel134.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jPanel134.setLayout(new java.awt.BorderLayout());

        txt_nombre_registro.setBackground(new java.awt.Color(240, 236, 235));
        txt_nombre_registro.setFont(new java.awt.Font("Comic Sans MS", 0, 21)); // NOI18N
        txt_nombre_registro.setBorder(null);
        txt_nombre_registro.setOpaque(false);
        txt_nombre_registro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_nombre_registrotxt_userKeyReleased(evt);
            }
        });
        jPanel134.add(txt_nombre_registro, java.awt.BorderLayout.CENTER);

        jPanel25.setOpaque(false);
        jPanel25.setLayout(new java.awt.BorderLayout());
        jPanel25.add(filler20, java.awt.BorderLayout.CENTER);

        jPanel134.add(jPanel25, java.awt.BorderLayout.WEST);

        jPanel132.add(jPanel134);

        jPanel130.add(jPanel132);

        jPanel140.setOpaque(false);
        jPanel140.setLayout(new java.awt.GridLayout(2, 1));

        jPanel142.setOpaque(false);
        jPanel142.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        jLabel38.setFont(new java.awt.Font("Comic Sans MS", 1, 16)); // NOI18N
        jLabel38.setText("NUMERO TELEFONICO");
        jPanel142.add(jLabel38);

        jPanel140.add(jPanel142);

        jPanel146.setBackground(new java.awt.Color(240, 236, 235));
        jPanel146.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jPanel146.setLayout(new java.awt.BorderLayout());

        txt_numero_registro.setBackground(new java.awt.Color(240, 236, 235));
        txt_numero_registro.setFont(new java.awt.Font("Comic Sans MS", 0, 21)); // NOI18N
        txt_numero_registro.setBorder(null);
        txt_numero_registro.setOpaque(false);
        txt_numero_registro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_numero_registrotxt_userKeyReleased(evt);
            }
        });
        jPanel146.add(txt_numero_registro, java.awt.BorderLayout.CENTER);

        jPanel27.setOpaque(false);
        jPanel27.setLayout(new java.awt.BorderLayout());
        jPanel27.add(filler23, java.awt.BorderLayout.CENTER);

        jPanel146.add(jPanel27, java.awt.BorderLayout.WEST);

        jPanel140.add(jPanel146);

        jPanel130.add(jPanel140);

        jPanel143.setOpaque(false);
        jPanel143.setLayout(new java.awt.GridLayout(2, 1));

        jPanel144.setOpaque(false);
        jPanel144.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        jLabel42.setFont(new java.awt.Font("Comic Sans MS", 1, 16)); // NOI18N
        jLabel42.setText("CORREO ELECTRONICO");
        jPanel144.add(jLabel42);

        jPanel143.add(jPanel144);

        jPanel145.setBackground(new java.awt.Color(240, 236, 235));
        jPanel145.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jPanel145.setLayout(new java.awt.BorderLayout());

        txt_correo_registro.setBackground(new java.awt.Color(240, 236, 235));
        txt_correo_registro.setFont(new java.awt.Font("Comic Sans MS", 0, 21)); // NOI18N
        txt_correo_registro.setBorder(null);
        txt_correo_registro.setOpaque(false);
        txt_correo_registro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_correo_registrotxt_userKeyReleased(evt);
            }
        });
        jPanel145.add(txt_correo_registro, java.awt.BorderLayout.CENTER);

        jPanel28.setOpaque(false);
        jPanel28.setLayout(new java.awt.BorderLayout());

        jLabel43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/At sign_26px.png"))); // NOI18N
        jPanel28.add(jLabel43, java.awt.BorderLayout.WEST);
        jPanel28.add(filler24, java.awt.BorderLayout.CENTER);

        jPanel145.add(jPanel28, java.awt.BorderLayout.WEST);

        jPanel143.add(jPanel145);

        jPanel130.add(jPanel143);

        jPanel135.setOpaque(false);
        jPanel135.setLayout(new java.awt.GridLayout(2, 1));

        jPanel136.setOpaque(false);
        jPanel136.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        jLabel39.setFont(new java.awt.Font("Comic Sans MS", 1, 16)); // NOI18N
        jLabel39.setText("CONTRASEÑA");
        jPanel136.add(jLabel39);

        jPanel135.add(jPanel136);

        jPanel137.setBackground(new java.awt.Color(240, 236, 235));
        jPanel137.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jPanel137.setLayout(new java.awt.BorderLayout());

        txt_pass_registro.setBackground(new java.awt.Color(240, 236, 235));
        txt_pass_registro.setFont(new java.awt.Font("Comic Sans MS", 0, 21)); // NOI18N
        txt_pass_registro.setBorder(null);
        txt_pass_registro.setOpaque(false);
        txt_pass_registro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_pass_registrotxt_passKeyReleased(evt);
            }
        });
        jPanel137.add(txt_pass_registro, java.awt.BorderLayout.CENTER);

        ver_contra4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ver_contra4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eye_25px.png"))); // NOI18N
        ver_contra4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ver_contra4ver_contraMouseClicked(evt);
            }
        });
        jPanel137.add(ver_contra4, java.awt.BorderLayout.EAST);

        jPanel31.setOpaque(false);
        jPanel31.setLayout(new java.awt.BorderLayout());

        jLabel40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lock_26px.png"))); // NOI18N
        jPanel31.add(jLabel40, java.awt.BorderLayout.WEST);
        jPanel31.add(filler21, java.awt.BorderLayout.CENTER);

        jPanel137.add(jPanel31, java.awt.BorderLayout.WEST);

        jPanel135.add(jPanel137);

        jPanel130.add(jPanel135);

        jPanel138.setOpaque(false);
        jPanel138.setLayout(new java.awt.GridLayout(2, 1));

        jPanel139.setOpaque(false);
        jPanel139.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        radio_F.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        radio_F.setText("Femenino");
        radio_F.setOpaque(false);
        radio_F.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_FActionPerformed(evt);
            }
        });
        jPanel139.add(radio_F);

        radio_M.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        radio_M.setText("Masculino");
        radio_M.setOpaque(false);
        radio_M.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_MActionPerformed(evt);
            }
        });
        jPanel139.add(radio_M);

        jPanel138.add(jPanel139);

        jPanel130.add(jPanel138);

        jPanel26.setOpaque(false);
        jPanel26.setLayout(new java.awt.GridLayout(2, 2));

        bt_insertar_cliente.setBackground(new java.awt.Color(65, 170, 174));
        bt_insertar_cliente.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
        bt_insertar_cliente.setForeground(new java.awt.Color(255, 255, 255));
        bt_insertar_cliente.setText("Registrarme");
        bt_insertar_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_insertar_clienteActionPerformed(evt);
            }
        });
        jPanel26.add(bt_insertar_cliente);

        bt_cambio_iniciarSesion.setBackground(new java.awt.Color(65, 170, 174));
        bt_cambio_iniciarSesion.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
        bt_cambio_iniciarSesion.setForeground(new java.awt.Color(255, 255, 255));
        bt_cambio_iniciarSesion.setText("Iniciar Sesion");
        bt_cambio_iniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_cambio_iniciarSesionActionPerformed(evt);
            }
        });
        jPanel26.add(bt_cambio_iniciarSesion);

        jPanel29.setOpaque(false);

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 195, Short.MAX_VALUE)
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 58, Short.MAX_VALUE)
        );

        jPanel26.add(jPanel29);

        jPanel32.setOpaque(false);

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 195, Short.MAX_VALUE)
        );
        jPanel32Layout.setVerticalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 58, Short.MAX_VALUE)
        );

        jPanel26.add(jPanel32);

        jPanel130.add(jPanel26);

        jPanel128.add(jPanel130, java.awt.BorderLayout.CENTER);

        jPanel141.setOpaque(false);

        javax.swing.GroupLayout jPanel141Layout = new javax.swing.GroupLayout(jPanel141);
        jPanel141.setLayout(jPanel141Layout);
        jPanel141Layout.setHorizontalGroup(
            jPanel141Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
            .addGroup(jPanel141Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel141Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(filler22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel141Layout.setVerticalGroup(
            jPanel141Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 820, Short.MAX_VALUE)
            .addGroup(jPanel141Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel141Layout.createSequentialGroup()
                    .addGap(0, 410, Short.MAX_VALUE)
                    .addComponent(filler22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 410, Short.MAX_VALUE)))
        );

        jPanel128.add(jPanel141, java.awt.BorderLayout.EAST);

        panel_login5.add(jPanel128, java.awt.BorderLayout.CENTER);

        jPanel24.add(panel_login5, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel24);

        jPanel1.add(jPanel4, "card4");

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_iniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_iniciarActionPerformed
        loginVerificacion();
    }//GEN-LAST:event_bt_iniciarActionPerformed

    private void ver_contraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ver_contraMouseClicked
        if(ver==false){
            ver=true;
            ver_contra3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eye_24px.png")));
            txt_pass3.setEchoChar((char)0);
        }
        else{
            ver=false;
            ver_contra3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eye_25px.png")));
            txt_pass3.setEchoChar('•');}
    }//GEN-LAST:event_ver_contraMouseClicked

    private void txt_passKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_passKeyReleased
        if(KeyEvent.VK_ENTER== evt.getKeyCode()){
            loginVerificacion();
        }
    }//GEN-LAST:event_txt_passKeyReleased

    private void txt_userKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_userKeyReleased
        if(KeyEvent.VK_ENTER== evt.getKeyCode()){
            loginVerificacion();

        }
    }//GEN-LAST:event_txt_userKeyReleased

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void bt_edit_perfil_usuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_edit_perfil_usuActionPerformed
        
    }//GEN-LAST:event_bt_edit_perfil_usuActionPerformed

    private void bt_historial_clientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_historial_clientesActionPerformed
        
    }//GEN-LAST:event_bt_historial_clientesActionPerformed

    private void bt_control_reservacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_control_reservacionesActionPerformed
        
    }//GEN-LAST:event_bt_control_reservacionesActionPerformed

    private void bt_historial_pagosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_historial_pagosActionPerformed
        
    }//GEN-LAST:event_bt_historial_pagosActionPerformed

    private void bt_cerrar_sesion_usuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_cerrar_sesion_usuActionPerformed
                        this.LeerCookies();
                        this.setSize(750,570);
                        CardLayout card= (CardLayout)this.jPanel1.getLayout();
                        card.show(jPanel1,"card2");
                        this.setLocationRelativeTo(null);
    }//GEN-LAST:event_bt_cerrar_sesion_usuActionPerformed

    private void bt_registrobt_iniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_registrobt_iniciarActionPerformed
                        CardLayout card= (CardLayout)this.jPanel1.getLayout();
                        card.show(jPanel1,"card4");
    }//GEN-LAST:event_bt_registrobt_iniciarActionPerformed

    private void jLabel11jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11jLabel7MouseClicked
      System.exit(0);
    }//GEN-LAST:event_jLabel11jLabel7MouseClicked

    private void txt_nombre_registrotxt_userKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nombre_registrotxt_userKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombre_registrotxt_userKeyReleased

    private void txt_pass_registrotxt_passKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_pass_registrotxt_passKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_pass_registrotxt_passKeyReleased

    private void ver_contra4ver_contraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ver_contra4ver_contraMouseClicked
            if(ver==false){
            ver=true;
            ver_contra4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eye_24px.png")));
            txt_pass_registro.setEchoChar((char)0);
        }
        else{
            ver=false;
            ver_contra4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eye_25px.png")));
            txt_pass_registro.setEchoChar('•');}
    }//GEN-LAST:event_ver_contra4ver_contraMouseClicked

    private void txt_correo_registrotxt_userKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_correo_registrotxt_userKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_correo_registrotxt_userKeyReleased

    private void txt_numero_registrotxt_userKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_numero_registrotxt_userKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_numero_registrotxt_userKeyReleased

    private void bt_insertar_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_insertar_clienteActionPerformed
        Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        String email=txt_correo_registro.getText();
        Boolean repetido=false;
        Matcher mather = pattern.matcher(email);
        //validar repeticion
        for (int i = 0; i < U.User.size(); i++) {
            if(txt_correo_registro.getText().equals(U.User.get(i))){
            repetido=true;
            
            }else
            repetido=false;
        }

        
        //validar email

        if(txt_nombre_registro.getText().isEmpty()&& txt_correo_registro.getText().isEmpty()&&
            txt_pass_registro.getText().isEmpty()&& txt_numero_registro.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Existen espacio vacios" ); 
        }else{
        if (mather.find() == true) {
          if (repetido==false){

            U.insertar_Clientes(txt_nombre_registro.getText(),txt_correo_registro.getText() ,txt_pass_registro.getText(),sex, txt_numero_registro.getText());

        txt_nombre_registro.setText("");
        txt_correo_registro.setText("");
        txt_pass_registro.setText("");
        txt_numero_registro.setText("");

        }else{JOptionPane.showMessageDialog(null,"Ya existe un usuario con ese correo"); }  
        } 
        else {
        JOptionPane.showMessageDialog(null,"El email ingresado es inválido" );             

        }}


 





    }//GEN-LAST:event_bt_insertar_clienteActionPerformed
     int sex=0;
    private void radio_MActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_MActionPerformed
         radio_F.setSelected(false);
        sex=1;
    }//GEN-LAST:event_radio_MActionPerformed

    private void radio_FActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_FActionPerformed
        radio_M.setSelected(false);
        sex=0;
    }//GEN-LAST:event_radio_FActionPerformed

    private void bt_cambio_iniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_cambio_iniciarSesionActionPerformed
                        CardLayout card= (CardLayout)this.jPanel1.getLayout();
                        card.show(jPanel1,"card2");
    }//GEN-LAST:event_bt_cambio_iniciarSesionActionPerformed

boolean ver=false;    


    public void loginVerificacion(){
    if(txt_user3.getText().isEmpty()||txt_pass3.getText().isEmpty()){
             JOptionPane.showMessageDialog(null,"Por favor, Ingrese su login" ); 
             }else{
        String user=txt_user3.getText();
        String pass=txt_pass3.getText();
        int count=0;
        for (int i = 0; i < U.User.size(); i++) {
            if(user.equals(U.User.get(i))&&pass.equals(U.Pass.get(i))){
                    cookiesActivado();
                    this.lb_nombre_usuario.setText(U.Name.get(i));
                    this.Roles(i);
                    this.Genero(i);
                    this.Roles_botones(i);

            }else{
                count++;
                if(count==U.User.size()){
            JOptionPane.showMessageDialog(null,"Error de login" );} }
        }
        }}
    public String Cook_user,Cook_pass;
    public void cookiesActivado(){
        if(jCheckBox4.isSelected()){
        
    try {
        FileWriter w;
        w = new FileWriter(newResource);
        BufferedWriter bw=new BufferedWriter(w);
        PrintWriter wr=new PrintWriter(bw);
        wr.append("1;"+txt_user3.getText()+";"+txt_pass3.getText());
        wr.close();
    } catch (IOException ex) {
        Logger.getLogger(vista.class.getName()).log(Level.SEVERE, null, ex);
    }
        }else{
        try {
        FileWriter w;
        w = new FileWriter(newResource);
        BufferedWriter bw=new BufferedWriter(w);
            PrintWriter wr=new PrintWriter(bw);
            wr.append("0;;");
            wr.close();
    } catch (IOException ex) {
        Logger.getLogger(vista.class.getName()).log(Level.SEVERE, null, ex);
    }
        }   
    }
    public  void LeerCookies(){   
        try {
            BufferedReader br = new BufferedReader(new FileReader(newResource)); 
            String firstLine = br.readLine().trim();
            String[] columnsName = firstLine.split(";");
            if("1".equals(columnsName[0])){
                txt_user3.setText(columnsName[1]);
                txt_pass3.setText(columnsName[2]);
            }
        } catch (IOException ex) {
            Logger.getLogger(vista.class.getName()).log(Level.SEVERE, null, ex);
        }

    }           
    public void Roles(int i){
        if(0==U.Rol.get(i)){
                            this.lb_titulo.setText("HOSPEDAJE EMELY - CLIENTE");
                        }else
                            this.lb_titulo.setText("HOSPEDAJE EMELY - ADMINISTRADOR");
                     CardLayout card= (CardLayout)this.jPanel1.getLayout();
                        card.show(jPanel1,"card3"); 
                        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
    public boolean ver_b=false;

    public void Roles_botones(int i){
            if(0==U.Rol.get(i)){
                bt_cerrar_sesion_usu.setVisible(!ver_b);
                bt_edit_perfil_usu.setVisible(!ver_b);
                bt_historial_usu.setVisible(!ver_b);
                bt_reservacion_usu.setVisible(!ver_b); 
                bt_control_habitaciones.setVisible(ver_b);
                bt_control_reservaciones.setVisible(ver_b);
                bt_historial_clientes.setVisible(ver_b);
                bt_historial_pagos.setVisible(ver_b);
                bt_nueva_reservacion.setVisible(ver_b); 
                }
                else{
                bt_edit_perfil_usu.setVisible(ver_b);
                bt_historial_usu.setVisible(ver_b);
                bt_reservacion_usu.setVisible(ver_b); 
                bt_control_habitaciones.setVisible(!ver_b);
                bt_control_reservaciones.setVisible(!ver_b);
                bt_historial_clientes.setVisible(!ver_b);
                bt_historial_pagos.setVisible(!ver_b);
                bt_nueva_reservacion.setVisible(!ver_b); 
                bt_cerrar_sesion_usu.setVisible(!ver_b);  }         
      
    }        
    public void Genero(int i){
        if(0==U.Genero.get(i)){
        lb_imagen_user.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/male_user_100px.png"))); 
        
        }else
        lb_imagen_user.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/female_user_100px.png")));    
    
    }
      
    public static void main(String args[]) {
         try {
    UIManager.setLookAndFeel( new FlatCyanLightIJTheme() );
} catch( Exception ex ) {
    System.err.println( "Failed to initialize LaF" );
}
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_cambio_iniciarSesion;
    private javax.swing.JButton bt_cerrar_sesion_usu;
    private javax.swing.JButton bt_control_habitaciones;
    private javax.swing.JButton bt_control_reservaciones;
    private javax.swing.JButton bt_edit_perfil_usu;
    private javax.swing.JButton bt_historial_clientes;
    private javax.swing.JButton bt_historial_pagos;
    private javax.swing.JButton bt_historial_usu;
    private javax.swing.JButton bt_iniciar3;
    private javax.swing.JButton bt_insertar_cliente;
    private javax.swing.JButton bt_nueva_reservacion;
    private javax.swing.JButton bt_registro;
    private javax.swing.JButton bt_reservacion_usu;
    private javax.swing.Box.Filler filler15;
    private javax.swing.Box.Filler filler16;
    private javax.swing.Box.Filler filler17;
    private javax.swing.Box.Filler filler18;
    private javax.swing.Box.Filler filler19;
    private javax.swing.Box.Filler filler20;
    private javax.swing.Box.Filler filler21;
    private javax.swing.Box.Filler filler22;
    private javax.swing.Box.Filler filler23;
    private javax.swing.Box.Filler filler24;
    private javax.swing.Box.Filler filler3;
    private javax.swing.Box.Filler filler6;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel112;
    private javax.swing.JPanel jPanel113;
    private javax.swing.JPanel jPanel114;
    private javax.swing.JPanel jPanel115;
    private javax.swing.JPanel jPanel116;
    private javax.swing.JPanel jPanel117;
    private javax.swing.JPanel jPanel118;
    private javax.swing.JPanel jPanel119;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel120;
    private javax.swing.JPanel jPanel121;
    private javax.swing.JPanel jPanel122;
    private javax.swing.JPanel jPanel123;
    private javax.swing.JPanel jPanel124;
    private javax.swing.JPanel jPanel125;
    private javax.swing.JPanel jPanel126;
    private javax.swing.JPanel jPanel127;
    private javax.swing.JPanel jPanel128;
    private javax.swing.JPanel jPanel129;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel130;
    private javax.swing.JPanel jPanel131;
    private javax.swing.JPanel jPanel132;
    private javax.swing.JPanel jPanel133;
    private javax.swing.JPanel jPanel134;
    private javax.swing.JPanel jPanel135;
    private javax.swing.JPanel jPanel136;
    private javax.swing.JPanel jPanel137;
    private javax.swing.JPanel jPanel138;
    private javax.swing.JPanel jPanel139;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel140;
    private javax.swing.JPanel jPanel141;
    private javax.swing.JPanel jPanel142;
    private javax.swing.JPanel jPanel143;
    private javax.swing.JPanel jPanel144;
    private javax.swing.JPanel jPanel145;
    private javax.swing.JPanel jPanel146;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel lb_imagen_user;
    private javax.swing.JLabel lb_nombre_usuario;
    private javax.swing.JLabel lb_titulo;
    private javax.swing.JPanel panel_control;
    private javax.swing.JPanel panel_login4;
    private javax.swing.JPanel panel_login5;
    private javax.swing.JRadioButton radio_F;
    private javax.swing.JRadioButton radio_M;
    public javax.swing.JTextField txt_correo_registro;
    public javax.swing.JTextField txt_nombre_registro;
    public javax.swing.JTextField txt_numero_registro;
    public javax.swing.JPasswordField txt_pass3;
    public javax.swing.JPasswordField txt_pass_registro;
    public javax.swing.JTextField txt_user3;
    private javax.swing.JLabel ver_contra3;
    private javax.swing.JLabel ver_contra4;
    // End of variables declaration//GEN-END:variables
}
