/*     */ package InterfazGui;
/*     */ 
/*     */ import Conexion.ReestablecerGuias;
/*     */ import java.awt.Component;
/*     */ import java.awt.LayoutManager;
/*     */ import java.awt.event.ActionEvent;
/*     */ import java.awt.event.ActionListener;
/*     */ import java.sql.ResultSet;
/*     */ import java.sql.SQLException;
/*     */ import javax.swing.ButtonGroup;
/*     */ import javax.swing.JButton;
/*     */ import javax.swing.JComboBox;
/*     */ import javax.swing.JDialog;
/*     */ import javax.swing.JLabel;
/*     */ import javax.swing.JOptionPane;
/*     */ import javax.swing.JRadioButton;
/*     */ import javax.swing.JTextField;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class FrmReestablecerCuentas
/*     */   extends JDialog
/*     */ {
/*     */   private static final long serialVersionUID = 1L;
/*     */   private JTextField txtRegional;
/*     */   private JTextField txtOficina;
/*     */   private JTextField txtConsecutivo;
/*     */   private JTextField txtNomCuenta;
/*     */   private final ButtonGroup grpRdBtn;
/*     */   private JRadioButton rdbtnCuenta;
/*     */   private JRadioButton rdbtnOficina;
/*     */   private JRadioButton rdbtnEmpleado;
/*     */   private JButton btnReestablecer;
/*     */   private ResultSet resulset;
/*     */   private JComboBox<String> cbBoxFormaPago;
/*     */   private JComboBox<String> cbBoxTipoGuia;
/*     */   private ReestablecerGuias reestablecerGuias;
/*     */   
/*     */   public FrmReestablecerCuentas() {
/*  51 */     setTitle("Reestablecer Cuenta");
/*  52 */     setResizable(false);
/*  53 */     setBounds(100, 100, 394, 282);
/*  54 */     getContentPane().setLayout((LayoutManager)null);
/*     */     
/*  56 */     this.grpRdBtn = new ButtonGroup();
/*     */     
/*  58 */     this.rdbtnCuenta = new JRadioButton("Cuenta");
/*  59 */     this.rdbtnCuenta.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent e) {
/*  61 */             FrmReestablecerCuentas.this.txtRegional.setEditable(true);
/*  62 */             FrmReestablecerCuentas.this.txtOficina.setEditable(true);
/*  63 */             FrmReestablecerCuentas.this.txtConsecutivo.setEditable(true);
/*  64 */             FrmReestablecerCuentas.this.txtRegional.setText("");
/*  65 */             FrmReestablecerCuentas.this.txtOficina.setText("");
/*  66 */             FrmReestablecerCuentas.this.txtConsecutivo.setText("");
/*  67 */             FrmReestablecerCuentas.this.txtRegional.setFocusable(true);
/*  68 */             FrmReestablecerCuentas.this.txtRegional.requestFocus();
/*     */           }
/*     */         });
/*  71 */     this.rdbtnCuenta.setBounds(30, 24, 109, 23);
/*  72 */     getContentPane().add(this.rdbtnCuenta);
/*     */     
/*  74 */     this.rdbtnOficina = new JRadioButton("Oficina");
/*  75 */     this.rdbtnOficina.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent e) {
/*  77 */             FrmReestablecerCuentas.this.txtRegional.setText("83");
/*  78 */             FrmReestablecerCuentas.this.txtConsecutivo.setText("0");
/*  79 */             FrmReestablecerCuentas.this.txtRegional.setEditable(false);
/*  80 */             FrmReestablecerCuentas.this.txtOficina.setEditable(true);
/*  81 */             FrmReestablecerCuentas.this.txtConsecutivo.setEditable(false);
/*  82 */             FrmReestablecerCuentas.this.txtOficina.setText("");
/*  83 */             FrmReestablecerCuentas.this.txtOficina.setFocusable(true);
/*  84 */             FrmReestablecerCuentas.this.txtOficina.requestFocus();
/*     */           }
/*     */         });
/*  87 */     this.rdbtnOficina.setBounds(141, 24, 109, 23);
/*  88 */     getContentPane().add(this.rdbtnOficina);
/*     */     
/*  90 */     this.rdbtnEmpleado = new JRadioButton("Empleado");
/*  91 */     this.rdbtnEmpleado.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent e) {
/*  93 */             FrmReestablecerCuentas.this.txtRegional.setEditable(false);
/*  94 */             FrmReestablecerCuentas.this.txtOficina.setEditable(false);
/*  95 */             FrmReestablecerCuentas.this.txtConsecutivo.setEditable(true);
/*  96 */             FrmReestablecerCuentas.this.txtRegional.setText("83");
/*  97 */             FrmReestablecerCuentas.this.txtOficina.setText("1");
/*  98 */             FrmReestablecerCuentas.this.txtConsecutivo.setText("");
/*  99 */             FrmReestablecerCuentas.this.txtConsecutivo.setFocusable(true);
/* 100 */             FrmReestablecerCuentas.this.txtConsecutivo.requestFocus();
/*     */           }
/*     */         });
/* 103 */     this.rdbtnEmpleado.setBounds(252, 24, 109, 23);
/* 104 */     getContentPane().add(this.rdbtnEmpleado);
/*     */     
/* 106 */     this.grpRdBtn.add(this.rdbtnCuenta);
/* 107 */     this.grpRdBtn.add(this.rdbtnOficina);
/* 108 */     this.grpRdBtn.add(this.rdbtnEmpleado);
/*     */     
/* 110 */     this.txtRegional = new JTextField();
/* 111 */     this.txtRegional.setEditable(false);
/* 112 */     this.txtRegional.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent arg0) {
/* 114 */             ((Component)arg0.getSource()).transferFocus();
/*     */           }
/*     */         });
/* 117 */     this.txtRegional.setBounds(128, 79, 19, 20);
/* 118 */     getContentPane().add(this.txtRegional);
/* 119 */     this.txtRegional.setColumns(10);
/*     */     
/* 121 */     this.txtOficina = new JTextField();
/* 122 */     this.txtOficina.setEditable(false);
/* 123 */     this.txtOficina.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent arg0) {
/* 125 */             if (FrmReestablecerCuentas.this.txtOficina.getText().isEmpty()) {
/* 126 */               JOptionPane.showMessageDialog(null, "Digite solo n�meros");
/* 127 */             } else if (FrmReestablecerCuentas.this.rdbtnOficina.isSelected()) {
/*     */               try {
/* 129 */                 ReestablecerGuias reestablecerGuias = new ReestablecerGuias();
/* 130 */                 FrmReestablecerCuentas.this.resulset = reestablecerGuias.ConsNombreOficina(Integer.parseInt(FrmReestablecerCuentas.this.txtRegional.getText()), Integer.parseInt(FrmReestablecerCuentas.this.txtOficina.getText()));
/* 131 */                 FrmReestablecerCuentas.this.resulset.next();
/* 132 */                 FrmReestablecerCuentas.this.txtNomCuenta.setText(FrmReestablecerCuentas.this.resulset.getString(1));
/* 133 */                 ((Component)arg0.getSource()).transferFocus();
/* 134 */               } catch (Exception e) {
/* 135 */                 e.getMessage();
/*     */               } 
/*     */             } 
/* 138 */             ((Component)arg0.getSource()).transferFocus();
/*     */           }
/*     */         });
/*     */     
/* 142 */     this.txtOficina.setBounds(157, 79, 27, 20);
/* 143 */     getContentPane().add(this.txtOficina);
/* 144 */     this.txtOficina.setColumns(10);
/*     */     
/* 146 */     this.txtConsecutivo = new JTextField();
/* 147 */     this.txtConsecutivo.setEditable(false);
/* 148 */     this.txtConsecutivo.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent arg0) {
/* 150 */             if (FrmReestablecerCuentas.this.txtRegional.getText().isEmpty() || FrmReestablecerCuentas.this.txtOficina.getText().isEmpty() || FrmReestablecerCuentas.this.txtConsecutivo.getText().isEmpty()) {
/* 151 */               JOptionPane.showMessageDialog(null, "Digite solo n�meros");
/* 152 */             } else if (FrmReestablecerCuentas.this.rdbtnEmpleado.isSelected()) {
/*     */               try {
/* 154 */                 FrmReestablecerCuentas.this.reestablecerGuias = new ReestablecerGuias();
/* 155 */                 FrmReestablecerCuentas.this.resulset = FrmReestablecerCuentas.this.reestablecerGuias.ConsNombreEmpleado(FrmReestablecerCuentas.this.txtConsecutivo.getText());
/* 156 */                 FrmReestablecerCuentas.this.resulset.next();
/* 157 */                 FrmReestablecerCuentas.this.txtNomCuenta.setText(FrmReestablecerCuentas.this.resulset.getString(1));
/*     */               }
/* 159 */               catch (Exception e) {
/* 160 */                 e.getMessage();
/*     */               } 
/* 162 */             } else if (FrmReestablecerCuentas.this.rdbtnCuenta.isSelected()) {
/*     */               try {
/* 164 */                 FrmReestablecerCuentas.this.reestablecerGuias = new ReestablecerGuias();
/* 165 */                 FrmReestablecerCuentas.this.resulset = FrmReestablecerCuentas.this.reestablecerGuias.ConsNombreCuenta(Integer.parseInt(FrmReestablecerCuentas.this.txtRegional.getText()), Integer.parseInt(FrmReestablecerCuentas.this.txtOficina.getText()), Integer.parseInt(FrmReestablecerCuentas.this.txtConsecutivo.getText()));
/* 166 */                 FrmReestablecerCuentas.this.resulset.next();
/* 167 */                 if (FrmReestablecerCuentas.this.resulset.getInt(2) == 0) {
/* 168 */                   FrmReestablecerCuentas.this.txtNomCuenta.setText(FrmReestablecerCuentas.this.resulset.getString(1));
/*     */                   
/*     */                   try {
/* 171 */                     FrmReestablecerCuentas.this.reestablecerGuias = null;
/* 172 */                     FrmReestablecerCuentas.this.resulset = null;
/* 173 */                     FrmReestablecerCuentas.this.reestablecerGuias = new ReestablecerGuias();
/* 174 */                     FrmReestablecerCuentas.this.resulset = FrmReestablecerCuentas.this.reestablecerGuias.ConsPagoGuia(Integer.parseInt(FrmReestablecerCuentas.this.txtRegional.getText()), Integer.parseInt(FrmReestablecerCuentas.this.txtOficina.getText()), Integer.parseInt(FrmReestablecerCuentas.this.txtConsecutivo.getText()));
/*     */                     
/* 176 */                     while (FrmReestablecerCuentas.this.resulset.next()) {
/* 177 */                       FrmReestablecerCuentas.this.cbBoxFormaPago.addItem(FrmReestablecerCuentas.this.resulset.getString(1) + " - " + FrmReestablecerCuentas.this.resulset.getString(2));
/*     */                     }
/*     */                   }
/* 180 */                   catch (Exception e) {
/* 181 */                     e.getMessage();
/* 182 */                     JOptionPane.showMessageDialog(null, "No tiene par�metros para Generaci�n de Gu�as");
/*     */                   } 
/*     */                 } else {
/*     */                   
/* 186 */                   JOptionPane.showMessageDialog(null, "Verificar si la Cuenta est� Inactiva");
/* 187 */                   FrmReestablecerCuentas.this.resetFormReestablecer();
/*     */                 }
/*     */               
/* 190 */               } catch (Exception e) {
/* 191 */                 e.getMessage();
/* 192 */                 JOptionPane.showMessageDialog(null, "La Cuenta no Existe");
/*     */               } 
/*     */             } 
/* 195 */             ((Component)arg0.getSource()).transferFocus();
/*     */           }
/*     */         });
/* 198 */     this.txtConsecutivo.setBounds(194, 79, 59, 20);
/* 199 */     getContentPane().add(this.txtConsecutivo);
/* 200 */     this.txtConsecutivo.setColumns(10);
/*     */     
/* 202 */     this.txtNomCuenta = new JTextField();
/* 203 */     this.txtNomCuenta.setHorizontalAlignment(2);
/* 204 */     this.txtNomCuenta.setEditable(false);
/* 205 */     this.txtNomCuenta.setBounds(59, 110, 315, 20);
/* 206 */     getContentPane().add(this.txtNomCuenta);
/* 207 */     this.txtNomCuenta.setColumns(10);
/*     */     
/* 209 */     JLabel lblCodigo = new JLabel("Codigo");
/* 210 */     lblCodigo.setBounds(170, 54, 46, 14);
/* 211 */     getContentPane().add(lblCodigo);
/*     */     
/* 213 */     JLabel lblNombre = new JLabel("Nombre");
/* 214 */     lblNombre.setBounds(10, 113, 46, 14);
/* 215 */     getContentPane().add(lblNombre);
/*     */     
/* 217 */     this.cbBoxFormaPago = new JComboBox<>();
/* 218 */     this.cbBoxFormaPago.addActionListener(new ActionListener()
/*     */         {
/*     */           public void actionPerformed(ActionEvent arg0) {
/* 221 */             if (FrmReestablecerCuentas.this.rdbtnCuenta.isSelected() || FrmReestablecerCuentas.this.rdbtnOficina.isSelected() || FrmReestablecerCuentas.this.rdbtnEmpleado.isSelected()) {
/* 222 */               FrmReestablecerCuentas.this.reestablecerGuias = null;
/* 223 */               FrmReestablecerCuentas.this.resulset = null;
/* 224 */               FrmReestablecerCuentas.this.reestablecerGuias = new ReestablecerGuias();
/*     */               
/* 226 */               FrmReestablecerCuentas.this.resulset = FrmReestablecerCuentas.this.reestablecerGuias.ConsTipoGuia(Integer.parseInt(FrmReestablecerCuentas.this.txtRegional.getText()), Integer.parseInt(FrmReestablecerCuentas.this.txtOficina.getText()), Integer.parseInt(FrmReestablecerCuentas.this.txtConsecutivo.getText()), Integer.parseInt(FrmReestablecerCuentas.this.cbBoxFormaPago.getSelectedItem().toString().substring(0, 1)));
/*     */               
/*     */               try {
/* 229 */                 while (FrmReestablecerCuentas.this.resulset.next()) {
/* 230 */                   FrmReestablecerCuentas.this.cbBoxTipoGuia.addItem(FrmReestablecerCuentas.this.resulset.getString(1) + " - " + FrmReestablecerCuentas.this.resulset.getString(2));
/* 231 */                   FrmReestablecerCuentas.this.btnReestablecer.setEnabled(true);
/*     */                 } 
/* 233 */               } catch (SQLException e) {
/* 234 */                 e.printStackTrace();
/*     */               } 
/*     */             } 
/*     */           }
/*     */         });
/*     */     
/* 240 */     this.cbBoxFormaPago.setBounds(148, 141, 202, 23);
/* 241 */     getContentPane().add(this.cbBoxFormaPago);
/*     */     
/* 243 */     this.cbBoxTipoGuia = new JComboBox<>();
/* 244 */     this.cbBoxTipoGuia.setBounds(148, 175, 202, 23);
/* 245 */     getContentPane().add(this.cbBoxTipoGuia);
/*     */     
/* 247 */     JLabel lblFormaDePago = new JLabel("Forma de Pago");
/* 248 */     lblFormaDePago.setBounds(40, 145, 97, 14);
/* 249 */     getContentPane().add(lblFormaDePago);
/*     */     
/* 251 */     JLabel lblTipoDeGuia = new JLabel("Tipo de Guia");
/* 252 */     lblTipoDeGuia.setBounds(40, 179, 97, 14);
/* 253 */     getContentPane().add(lblTipoDeGuia);
/*     */     
/* 255 */     this.btnReestablecer = new JButton("Reestablecer");
/* 256 */     this.btnReestablecer.setEnabled(false);
/* 257 */     this.btnReestablecer.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent arg0) {
/* 259 */             FrmReestablecerCuentas.this.btReestablecerActionPerformed();
/*     */           }
/*     */         });
/* 262 */     this.btnReestablecer.setBounds(59, 219, 115, 23);
/* 263 */     getContentPane().add(this.btnReestablecer);
/*     */     
/* 265 */     JButton btnNuevo = new JButton("Nuevo");
/* 266 */     btnNuevo.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent arg0) {
/* 268 */             FrmReestablecerCuentas.this.resetFormReestablecer();
/*     */           }
/*     */         });
/* 271 */     btnNuevo.setBounds(214, 219, 115, 23);
/* 272 */     getContentPane().add(btnNuevo);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void resetFormReestablecer() {
/* 278 */     this.txtRegional.setText("");
/* 279 */     this.txtOficina.setText("");
/* 280 */     this.txtConsecutivo.setText("");
/* 281 */     this.txtNomCuenta.setText("");
/* 282 */     this.txtRegional.setEditable(false);
/* 283 */     this.txtOficina.setEditable(false);
/* 284 */     this.txtConsecutivo.setEditable(false);
/* 285 */     this.grpRdBtn.clearSelection();
/* 286 */     resetListas();
/* 287 */     this.resulset = null;
/* 288 */     this.reestablecerGuias = null;
/* 289 */     this.btnReestablecer.setEnabled(false);
/*     */   }
/*     */ 
/*     */   
/*     */   public void resetListas() {
/* 294 */     this.cbBoxTipoGuia.removeAllItems();
/* 295 */     this.cbBoxFormaPago.removeAllItems();
/*     */   }
/*     */   
/*     */   private void btReestablecerActionPerformed() {}
/*     */ }


/* Location:              C:\Users\JORGE\Desktop\CoordTecno.jar!\InterfazGui\FrmReestablecerCuentas.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */