/*     */ package InterfazGui;
/*     */ 
/*     */ import Conexion.ConsultaGuia;
/*     */ import java.awt.EventQueue;
/*     */ import java.awt.Frame;
/*     */ import java.awt.LayoutManager;
/*     */ import java.awt.event.ActionEvent;
/*     */ import java.awt.event.ActionListener;
/*     */ import java.awt.event.FocusAdapter;
/*     */ import java.awt.event.FocusEvent;
/*     */ import java.awt.event.KeyAdapter;
/*     */ import java.awt.event.KeyEvent;
/*     */ import java.awt.event.WindowAdapter;
/*     */ import java.awt.event.WindowEvent;
/*     */ import java.sql.ResultSet;
/*     */ import java.util.ArrayList;
/*     */ import java.util.logging.Level;
/*     */ import java.util.logging.Logger;
/*     */ import javax.swing.GroupLayout;
/*     */ import javax.swing.JButton;
/*     */ import javax.swing.JDialog;
/*     */ import javax.swing.JFrame;
/*     */ import javax.swing.JLabel;
/*     */ import javax.swing.JOptionPane;
/*     */ import javax.swing.JPanel;
/*     */ import javax.swing.JScrollPane;
/*     */ import javax.swing.JTable;
/*     */ import javax.swing.JTextField;
/*     */ import javax.swing.LayoutStyle;
/*     */ import javax.swing.UIManager;
/*     */ import javax.swing.UnsupportedLookAndFeelException;
/*     */ import javax.swing.border.Border;
/*     */ import javax.swing.table.DefaultTableModel;
/*     */ 
/*     */ public class frmConsultaGuia extends JDialog {
/*     */   private static final long serialVersionUID = 1L;
/*  37 */   private frmImprimirGuia imprimirGuias = null;
/*     */   
/*     */   private ResultSet resGuias;
/*     */   
/*     */   private ConsultaGuia guia;
/*     */   private String resultado;
/*     */   protected Frame consultaparent;
/*     */   DefaultTableModel md;
/*  45 */   Object[][] data = new Object[0][];
/*  46 */   Object[] cabeza = new Object[] 
          { "Regional", "F.Pago", "Guia" };
/*     */   private JButton btnCancelar;
/*     */   private JButton btnConsultar;
/*     */   private JButton btnInsertar;
/*     */   
/*     */   public frmConsultaGuia(Frame parent, boolean modal) {
/*  52 */     super(parent, modal);
/*  53 */     setTitle("Reimprimir Guias");
/*  54 */     setResizable(false);
/*  55 */     setBounds(100, 100, 394, 282);
/*  56 */     getContentPane().setLayout((LayoutManager)null);
/*  57 */     initComponents();
/*     */     
/*  59 */     this.md = new DefaultTableModel(this.data, this.cabeza);
/*  60 */     this.jTableGuia.setModel(this.md);
/*     */   }
/*     */ 
/*     */   
/*     */   private JLabel jLabel1;
/*     */   
/*     */   private JLabel jLabel2;
/*     */   
/*     */   private JLabel jLabel3;
/*     */   
/*     */   private JLabel jLabel4;
/*     */   
/*     */   private JPanel jPanel1;
/*     */   
/*     */   private void initComponents() {
/*  75 */     this.jPanel1 = new JPanel();
/*  76 */     this.txtRegional = new JTextField();
/*  77 */     this.jLabel1 = new JLabel();
/*  78 */     this.txtFPago = new JTextField();
/*  79 */     this.jLabel2 = new JLabel();
/*  80 */     this.txtGuia = new JTextField();
/*  81 */     this.jLabel3 = new JLabel();
/*  82 */     this.jScrollPane1 = new JScrollPane();
/*  83 */     this.jTableGuia = new JTable();
/*  84 */     this.btnConsultar = new JButton();
/*  85 */     this.btnCancelar = new JButton();
/*  86 */     this.btnInsertar = new JButton();
/*  87 */     this.txtRegistros = new JTextField();
/*  88 */     this.jLabel4 = new JLabel();
/*     */     
/*  90 */     setDefaultCloseOperation(2);
/*     */     
/*  92 */     this.txtRegional.addKeyListener(new KeyAdapter() {
/*     */           public void keyPressed(KeyEvent evt) {
/*  94 */             frmConsultaGuia.this.txtRegionalKeyPressed(evt);
/*     */           }
/*     */           public void keyTyped(KeyEvent evt) {
/*  97 */             frmConsultaGuia.this.txtRegionalKeyTyped(evt);
/*     */           }
/*     */         });
/*     */     
/* 101 */     this.jLabel1.setText("Regional:");
/*     */     
/* 103 */     this.txtFPago.addKeyListener(new KeyAdapter() {
/*     */           public void keyPressed(KeyEvent evt) {
/* 105 */             frmConsultaGuia.this.txtFPagoKeyPressed(evt);
/*     */           }
/*     */           public void keyTyped(KeyEvent evt) {
/* 108 */             frmConsultaGuia.this.txtFPagoKeyTyped(evt);
/*     */           }

/*     */         });
/*     */     
/* 112 */     this.jLabel2.setText("F. Pago:");
/*     */     
/* 114 */     this.txtGuia.addFocusListener(new FocusAdapter() {
/*     */           public void focusGained(FocusEvent evt) {
/* 116 */             frmConsultaGuia.this.txtGuiaFocusGained(evt);
/*     */           }
/*     */         });
/* 119 */     this.txtGuia.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/* 121 */             frmConsultaGuia.this.txtGuiaActionPerformed(evt);
/*     */           }
/*     */         });
/* 124 */     this.txtGuia.addKeyListener(new KeyAdapter() {
/*     */           public void keyPressed(KeyEvent evt) {
/* 126 */             frmConsultaGuia.this.txtGuiaKeyPressed(evt);
/*     */           }
/*     */           public void keyTyped(KeyEvent evt) {
/* 129 */             frmConsultaGuia.this.txtGuiaKeyTyped(evt);
/*     */           }
/*     */         });
/*     */     
/* 133 */     this.jLabel3.setText("Guia:");
/*     */     
/* 135 */     this.jTableGuia.setModel(new DefaultTableModel(new Object[][] {
                        { null, null, null }, 
                         { null, null, null }, 
                         { null, null, null }, 
                         { null, null, null },  
                       }, 
                   (Object[])new String[] {
                       "Regional", "F. Pago", "Guia" 
                   }
        )
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 146 */           Class[] types = new Class[] { Object.class, Object.class, Integer.class };
/*     */ 
/*     */ 
/*     */           
/*     */           public Class getColumnClass(int columnIndex) {
/* 151 */             return this.types[columnIndex];
/*     */           }
/*     */         });
/* 154 */     this.jScrollPane1.setViewportView(this.jTableGuia);
/*     */     
/* 156 */     this.btnConsultar.setText("Consultar");
/* 157 */     this.btnConsultar.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/* 159 */             frmConsultaGuia.this.btnConsultarActionPerformed(evt);
/*     */           }
/*     */         });
/*     */     
/* 163 */     this.btnCancelar.setText("Cancelar");
/* 164 */     this.btnCancelar.setBorder((Border)null);
/* 165 */     this.btnCancelar.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/* 167 */             frmConsultaGuia.this.btnCancelarActionPerformed(evt);
/*     */           }
/*     */         });
/*     */     
/* 171 */     this.btnInsertar.setText("jButton3");
/* 172 */     this.btnInsertar.addFocusListener(new FocusAdapter() {
/*     */           public void focusGained(FocusEvent evt) {
/* 174 */             frmConsultaGuia.this.btnInsertarFocusGained(evt);
/*     */           }
/*     */         });
/*     */     
/* 178 */     this.txtRegistros.setEditable(false);
/* 179 */     this.txtRegistros.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/* 181 */             frmConsultaGuia.this.txtRegistrosActionPerformed(evt);
/*     */           }
/*     */         });
/*     */     
/* 185 */     this.jLabel4.setText("Guias");
/*     */     
/* 187 */     GroupLayout jPanel1Layout = new GroupLayout(this.jPanel1);
/* 188 */     this.jPanel1.setLayout(jPanel1Layout);
/* 189 */     jPanel1Layout.setHorizontalGroup(jPanel1Layout
/* 190 */         .createParallelGroup(GroupLayout.Alignment.LEADING)
/* 191 */         .addGroup(jPanel1Layout.createSequentialGroup()
/* 192 */           .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/* 193 */             .addGroup(jPanel1Layout.createSequentialGroup()
/* 194 */               .addGap(40, 40, 40)
/* 195 */               .addComponent(this.jLabel1)
/* 196 */               .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
/* 197 */               .addComponent(this.txtRegional, -2, 23, -2)
/* 198 */               .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
/* 199 */               .addComponent(this.jLabel2)
/* 200 */               .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
/* 201 */               .addComponent(this.txtFPago, -2, 23, -2)
/* 202 */               .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
/* 203 */               .addComponent(this.jLabel3)
/* 204 */               .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
/* 205 */               .addComponent(this.txtGuia, -2, 103, -2)
/* 206 */               .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
/* 207 */               .addComponent(this.btnInsertar, -2, 20, -2))
/* 208 */             .addGroup(jPanel1Layout.createSequentialGroup()
/* 209 */               .addGap(26, 26, 26)
/* 210 */               .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
/* 211 */                 .addGroup(jPanel1Layout.createSequentialGroup()
/* 212 */                   .addComponent(this.btnConsultar, -2, 91, -2)
/* 213 */                   .addGap(18, 18, 18)
/* 214 */                   .addComponent(this.btnCancelar, -2, 90, -2)
/* 215 */                   .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767)
/* 216 */                   .addComponent(this.jLabel4)
/* 217 */                   .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
/* 218 */                   .addComponent(this.txtRegistros, -2, 25, -2))
/* 219 */                 .addComponent(this.jScrollPane1, -2, 379, -2))))
/* 220 */           .addContainerGap(-1, 32767)));
/*     */     
/* 222 */     jPanel1Layout.setVerticalGroup(jPanel1Layout
/* 223 */         .createParallelGroup(GroupLayout.Alignment.LEADING)
/* 224 */         .addGroup(jPanel1Layout.createSequentialGroup()
/* 225 */           .addGap(32, 32, 32)
/* 226 */           .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
/* 227 */             .addComponent(this.txtRegional, -2, -1, -2)
/* 228 */             .addComponent(this.jLabel1)
/* 229 */             .addComponent(this.txtFPago, -2, -1, -2)
/* 230 */             .addComponent(this.jLabel2)
/* 231 */             .addComponent(this.txtGuia, -2, -1, -2)
/* 232 */             .addComponent(this.jLabel3)
/* 233 */             .addComponent(this.btnInsertar))
/* 234 */           .addGap(12, 12, 12)
/* 235 */           .addComponent(this.jScrollPane1, -2, 181, -2)
/* 236 */           .addGap(18, 18, 18)
/* 237 */           .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
/* 238 */             .addComponent(this.btnConsultar, -2, 32, -2)
/* 239 */             .addComponent(this.btnCancelar, -2, 32, -2)
/* 240 */             .addComponent(this.txtRegistros, -2, -1, -2)
/* 241 */             .addComponent(this.jLabel4))
/* 242 */           .addContainerGap(25, 32767)));
/*     */ 
/*     */     
/* 245 */     GroupLayout layout = new GroupLayout(getContentPane());
/* 246 */     getContentPane().setLayout(layout);
/* 247 */     layout.setHorizontalGroup(layout
/* 248 */         .createParallelGroup(GroupLayout.Alignment.LEADING)
/* 249 */         .addGroup(layout.createSequentialGroup()
/* 250 */           .addComponent(this.jPanel1, -2, -1, -2)
/* 251 */           .addGap(0, 0, 32767)));
/*     */     
/* 253 */     layout.setVerticalGroup(layout
/* 254 */         .createParallelGroup(GroupLayout.Alignment.LEADING)
/* 255 */         .addComponent(this.jPanel1, -1, -1, 32767));
/*     */ 
/*     */     
/* 258 */     pack();
/*     */   }
/*     */   private JScrollPane jScrollPane1; private JTable jTableGuia; private JTextField txtFPago; private JTextField txtGuia; private JTextField txtRegional;
/*     */   private JTextField txtRegistros;
/*     */   
/*     */   private void txtGuiaActionPerformed(ActionEvent evt) {}
/*     */   
/*     */   private void txtRegionalKeyPressed(KeyEvent evt) {
/* 266 */     if (evt.getKeyCode() == 10) {
/* 267 */       this.txtFPago.requestFocus();
/*     */     }
/*     */   }
/*     */   
/*     */   private void txtFPagoKeyPressed(KeyEvent evt) {
/* 272 */     if (evt.getKeyCode() == 10) {
/* 273 */       this.txtGuia.requestFocus();
/*     */     }
/*     */   }
/*     */   
/*     */   private void txtGuiaKeyPressed(KeyEvent evt) {
/* 278 */     if (evt.getKeyCode() == 10)
/*     */     {
/* 280 */       this.btnInsertar.requestFocus();
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void txtGuiaFocusGained(FocusEvent evt) {}
/*     */ 
/*     */ 
/*     */   
/*     */   private void btnInsertarFocusGained(FocusEvent evt) {

/* 292 */     if (this.txtRegional.getText().isEmpty() == true || this.txtFPago.getText().isEmpty() == true || this.txtGuia.getText().isEmpty() == true ) {
/* 
/* 294 */       String cons= txtGuia.getText();
                this.txtRegional.setText("");
/* 295 */       this.txtFPago.setText("");
/* 296 */       this.txtGuia.setText("");
/* 297 */       this.txtRegional.requestFocus();
/* 298 */       JOptionPane.showMessageDialog(null, "       Verifica el Numero de Guia\nNo se permite Contado ni Contraentrega\n        Consecutivo: "+cons);
/*     */     } else {
/* 300 */       this.guia = new ConsultaGuia(this.txtRegional.getText(), this.txtFPago.getText(), this.txtGuia.getText());
/*     */ 
/*     */ 
/*     */       
/* 304 */       Object[] datos = { this.guia.getCod_Regional(), this.guia.getCod_FormaPago(), this.guia.getCons_GuiasU() };
/* 305 */       this.md.addRow(datos);
/*     */       
/* 307 */       this.txtRegional.setText("");
/* 308 */       this.txtFPago.setText("");
/* 309 */       this.txtGuia.setText("");
/* 310 */       contarRegistro();
/* 311 */       this.txtRegional.requestFocus();
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private void btnCancelarActionPerformed(ActionEvent evt) {
/* 318 */     dispose();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void btnConsultarActionPerformed(ActionEvent evt) {
/* 325 */     StringBuilder sb = new StringBuilder();
/* 326 */     ArrayList<ConsultaGuia> list = new ArrayList<>();
/* 327 */     for (int i = 0; i < this.jTableGuia.getRowCount(); i++) {
/*     */ 
/*     */       
/* 330 */       ConsultaGuia gui = new ConsultaGuia(" or T0400009.Cod_Regional=" + this.jTableGuia.getValueAt(i, 0).toString() + " and ", " Cod_formapago=" + this.jTableGuia.getValueAt(i, 1).toString() + " and ", " Cons_GuiasU=" + this.jTableGuia.getValueAt(i, 2).toString());
/*     */ 
/*     */       
/* 333 */       sb = sb.append(gui.mostrarDatos()).append(" ");

/*     */     } 
/*     */ 
/*     */     
/* 337 */     String str = sb.toString();
/* 338 */     this.resGuias = this.guia.ConsDatosGuia(str);
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 343 */     this.imprimirGuias = new frmImprimirGuia(this.consultaparent, true, this.resGuias);
/* 344 */     this.imprimirGuias.setLocationRelativeTo(null);
/* 345 */     this.imprimirGuias.setVisible(true);
/* 346 */     this.imprimirGuias.setDefaultCloseOperation(2);
/*     */     
/* 348 */     dispose();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void txtRegionalKeyTyped(KeyEvent evt) {
/* 357 */     char valida = evt.getKeyChar();
/*     */     
/* 359 */     if (!Character.isDigit(valida) && evt.getKeyChar() != '' && evt.getKeyChar() != '\r' && evt
/* 360 */       .getKeyChar() != '\b' && evt.getKeyChar() != '\n') {
/* 361 */       getToolkit().beep();
/* 362 */       evt.consume();
/*     */     } 
/*     */     
/* 365 */     int max = 1;
/* 366 */     if (this.txtRegional.getText().length() > max && evt.getKeyChar() != '\n') {
/* 367 */       getToolkit().beep();
/* 368 */       evt.consume();
/*     */     } 
/*     */   }
/*     */   
/*     */   private void txtFPagoKeyTyped(KeyEvent evt) {
/* 373 */     char valida = evt.getKeyChar();
/*     */     
/* 375 */     if (!Character.isDigit(valida) && evt.getKeyChar() != '' && evt.getKeyChar() != '\r' && evt
/* 376 */       .getKeyChar() != '\b' && evt.getKeyChar() != '\n' ) {
/* 377 */       getToolkit().beep();
/* 378 */       evt.consume();
/*     */     } 
/*     */     
/* 381 */     int max = 0;
/* 382 */     if (this.txtFPago.getText().length() > max && evt.getKeyChar() != '\n') {
/* 383 */       getToolkit().beep();
/* 384 */       evt.consume();
/*     */     } 

        if( evt.getKeyChar() != 52 && evt.getKeyChar()!= 53
            && evt.getKeyChar() != 56 && evt.getKeyChar() != 51 && evt.getKeyChar() != 49  ){
            //getToolkit().beep();
            evt.consume();
        }
/*     */   }
/*     */   
/*     */   private void txtGuiaKeyTyped(KeyEvent evt) {
/* 389 */     char valida = evt.getKeyChar();
/*     */     
/* 391 */     if (!Character.isDigit(valida) && evt.getKeyChar() != '' && evt.getKeyChar() != '\r' && evt
/* 392 */       .getKeyChar() != '\b' && evt.getKeyChar() != '\n') {
/* 393 */       getToolkit().beep();
/* 394 */       evt.consume();
/*     */     } 
/*     */     
/* 397 */     int max = 8;
/* 398 */     if (this.txtGuia.getText().length() > max && evt.getKeyChar() != '\n') {
/* 399 */       getToolkit().beep();
/* 400 */       evt.consume();
/*     */     } 
/*     */   }
/*     */   
/*     */   public void contarRegistro() {
/* 405 */     int filas = this.md.getRowCount();
/* 406 */     this.txtRegistros.setText(" " + filas);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void txtRegistrosActionPerformed(ActionEvent evt) {}
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   //public static void main(String[] args) { 
/* 419 */    // System.out.println();
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */   //  try {
/* 425 */    //   for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
/* 426 */     //    if ("Nimbus".equals(info.getName())) {
/* 427 */     //      UIManager.setLookAndFeel(info.getClassName());
/*     */     //      break;
/*     */     //    } 
/*     */    //   } 
/* 431 */    // } catch (ClassNotFoundException ex) {
/* 432 */    //   Logger.getLogger(frmConsultaGuia.class.getName()).log(Level.SEVERE, (String)null, ex);
/* 433 */   //  } catch (InstantiationException ex) {
/* 434 */   //    Logger.getLogger(frmConsultaGuia.class.getName()).log(Level.SEVERE, (String)null, ex);
/* 435 */   //  } catch (IllegalAccessException ex) {
/* 436 */   //    Logger.getLogger(frmConsultaGuia.class.getName()).log(Level.SEVERE, (String)null, ex);
/* 437 */  //   } catch (UnsupportedLookAndFeelException ex) {
/* 438 */  //     Logger.getLogger(frmConsultaGuia.class.getName()).log(Level.SEVERE, (String)null, ex);
/*     */   //  } 
/*     */ 
/*     */ 
/*     */     
/* 443 */   //  EventQueue.invokeLater(new Runnable() {
/*     */   //        public void run() {
/* 445 */   //          frmConsultaGuia dialog = new frmConsultaGuia(new JFrame(), true);
/* 446 */    //         dialog.addWindowListener(new WindowAdapter()
/*     */     //            {
/*     */    //               public void windowClosing(WindowEvent e) {
/* 449 */     //                System.exit(0);
/*     */    //               }
/*     */     //            });
/* 452 */     //        dialog.setVisible(true);
/*     */     //      }
/*     */     //    });
/*     */ //  } 
/*     */ }


/* Location:              C:\Users\JORGE\Desktop\CoordTecno.jar!\InterfazGui\frmConsultaGuia.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */