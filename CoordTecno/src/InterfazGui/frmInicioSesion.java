/*     */ package InterfazGui;
/*     */ 
/*     */ import Conexion.IniciarSesion;
/*     */ import java.awt.Component;
/*     */ import java.awt.Font;
/*     */ import java.awt.LayoutManager;
/*     */ import java.awt.event.ActionEvent;
/*     */ import java.awt.event.ActionListener;
/*     */ import java.sql.ResultSet;
/*     */ import java.sql.SQLException;
/*     */ import javax.swing.InputMap;
/*     */ import javax.swing.JButton;
/*     */ import javax.swing.JFrame;
/*     */ import javax.swing.JLabel;
/*     */ import javax.swing.JOptionPane;
/*     */ import javax.swing.JPanel;
/*     */ import javax.swing.JPasswordField;
/*     */ import javax.swing.JTextField;
/*     */ import javax.swing.KeyStroke;
/*     */ import javax.swing.border.EmptyBorder;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class frmInicioSesion
/*     */   extends JFrame
/*     */ {
/*     */   private static final long serialVersionUID = 1L;
/*     */   private JPanel contentPane;
/*     */   private JTextField txtUsuario;
/*     */   private JPasswordField txtPassUsu;
/*  33 */   InputMap enter = new InputMap();
/*     */   
/*  35 */   frmPrincipal principal = null;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public frmInicioSesion() {
/*  41 */     setResizable(false);
/*  42 */     setDefaultCloseOperation(3);
/*  43 */     setBounds(100, 100, 258, 220);
/*  44 */     this.contentPane = new JPanel();
/*  45 */     this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
/*  46 */     setContentPane(this.contentPane);
/*  47 */     this.contentPane.setLayout((LayoutManager)null);
/*     */     
/*  49 */     JLabel lblTitulo = new JLabel("Iniciar sesión");
/*  50 */     lblTitulo.setFont(new Font("Cambria", 0, 16));
/*  51 */     lblTitulo.setBounds(77, 11, 100, 14);
/*  52 */     this.contentPane.add(lblTitulo);
/*     */     
/*  54 */     JLabel lblUsuario = new JLabel("Usuario:");
/*  55 */     lblUsuario.setFont(new Font("Tahoma", 0, 14));
/*  56 */     lblUsuario.setBounds(33, 42, 60, 14);
/*  57 */     this.contentPane.add(lblUsuario);
/*     */     
/*  59 */     JLabel lblContrasena = new JLabel("Contraseña:");
/*  60 */     lblContrasena.setFont(new Font("Tahoma", 0, 14));
/*  61 */     lblContrasena.setBounds(10, 85, 83, 14);
/*  62 */     this.contentPane.add(lblContrasena);
/*     */     
/*  64 */     this.txtUsuario = new JTextField();
/*  65 */     this.txtUsuario.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent arg0) {
/*  67 */             if (frmInicioSesion.this.txtUsuario.getText().isEmpty()) {
/*  68 */               JOptionPane.showMessageDialog(null, "Debe ingresar Usuario y contraseña correctamente.");
/*     */             } else {
/*  70 */               ((Component)arg0.getSource()).transferFocus();
/*     */             } 
/*     */           }
/*     */         });
/*  74 */     this.txtUsuario.setFont(new Font("Ebrima", 1, 14));
/*  75 */     this.txtUsuario.setBounds(103, 36, 125, 24);
/*  76 */     this.contentPane.add(this.txtUsuario);
/*  77 */     this.txtUsuario.setColumns(10);
/*     */     
/*  79 */     this.txtPassUsu = new JPasswordField();
/*  80 */     this.txtPassUsu.setFont(new Font("Tahoma", 1, 13));
/*  81 */     this.txtPassUsu.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent arg0) {
/*  83 */             if ((frmInicioSesion.this.txtPassUsu.getPassword()).length == 0) {
/*  84 */               JOptionPane.showMessageDialog(null, "Debe ingresar Usuario y contraseña correctamente.");
/*     */             } else {
/*  86 */               ((Component)arg0.getSource()).transferFocus();
/*     */             } 
/*     */           }
/*     */         });
/*  90 */     this.txtPassUsu.setBounds(103, 82, 125, 24);
/*  91 */     this.contentPane.add(this.txtPassUsu);
/*     */     
/*  93 */     this.enter.put(KeyStroke.getKeyStroke(10, 0, false), "pressed");
/*  94 */     this.enter.put(KeyStroke.getKeyStroke(10, 0, true), "released");
/*     */     
/*  96 */     JButton btnIngresar = new JButton("Ingresar");
/*  97 */     btnIngresar.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent e) {
/*  99 */             if (frmInicioSesion.this.txtUsuario.getText().isEmpty() != true && (frmInicioSesion.this.txtPassUsu.getPassword()).length != 0) {
/* 100 */               String sUsuario = frmInicioSesion.this.txtUsuario.getText();
/* 101 */               String sPassword = new String(frmInicioSesion.this.txtPassUsu.getPassword());
/*     */               
/* 103 */               IniciarSesion inisesion = new IniciarSesion(sUsuario, sPassword);
/* 104 */               ResultSet resUsuario = inisesion.validarUsuario();
/*     */               
/*     */               try {
/* 107 */                 if (resUsuario.next() == true) {
/* 108 */                   frmInicioSesion.this.principal = new frmPrincipal();
/* 109 */                   frmInicioSesion.this.principal.setLocationRelativeTo(null);
/* 110 */                   frmInicioSesion.this.principal.setVisible(true);
/* 111 */                   frmInicioSesion.this.dispose();
/*     */                 } else {
/* 113 */                   JOptionPane.showMessageDialog(null, "Usuario y/o Contraseña incorrecta.");
/* 114 */                   frmInicioSesion.this.txtUsuario.setText("");
/* 115 */                   frmInicioSesion.this.txtPassUsu.setText("");
/* 116 */                   frmInicioSesion.this.txtUsuario.setFocusable(true);
/*     */                 } 
/* 118 */               } catch (SQLException e1) {
/* 119 */                 e1.printStackTrace();
/*     */               } 
/*     */             } else {
/* 122 */               JOptionPane.showMessageDialog(null, "Debe ingresar Usuario y Contraseña.");
/*     */             } 
/*     */           }
/*     */         });
/*     */     
/* 127 */     btnIngresar.setFont(new Font("Tahoma", 0, 14));
/* 128 */     btnIngresar.setBounds(26, 131, 89, 23);
/* 129 */     this.contentPane.add(btnIngresar);
/* 130 */     btnIngresar.setInputMap(0, this.enter);
/* 131 */     JButton btnCancelar = new JButton("Cancelar");
/* 132 */     btnCancelar.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent arg0) {
/* 134 */             System.exit(0);
/*     */           }
/*     */         });
/* 137 */     btnCancelar.setFont(new Font("Tahoma", 0, 14));
/* 138 */     btnCancelar.setBounds(139, 131, 89, 23);
/* 139 */     this.contentPane.add(btnCancelar);
/* 140 */     btnCancelar.setInputMap(0, this.enter);
/*     */   }
/*     */ }


/* Location:              C:\Users\JORGE\Desktop\CoordTecno.jar!\InterfazGui\frmInicioSesion.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */