/*     */ package InterfazGui;
/*     */ 
/*     */ import Conexion.ConsultaSticker;
/*     */ import java.awt.Component;
/*     */ import java.awt.Font;
/*     */ import java.awt.Frame;
/*     */ import java.awt.LayoutManager;
/*     */ import java.awt.event.ActionEvent;
/*     */ import java.awt.event.ActionListener;
/*     */ import java.awt.event.KeyAdapter;
/*     */ import java.sql.ResultSet;
/*     */ import java.text.ParseException;
/*     */ import javax.swing.Icon;
/*     */ import javax.swing.InputMap;
/*     */ import javax.swing.JButton;
/*     */ import javax.swing.JComboBox;
/*     */ import javax.swing.JDialog;
/*     */ import javax.swing.JFormattedTextField;
/*     */ import javax.swing.JLabel;
/*     */ import javax.swing.JOptionPane;
/*     */ import javax.swing.JPanel;
/*     */ import javax.swing.JTabbedPane;
/*     */ import javax.swing.JTextField;
/*     */ import javax.swing.KeyStroke;
/*     */ import javax.swing.text.MaskFormatter;
/*     */ 
/*     */ 
/*     */ public class frmConsutaStickers
/*     */   extends JDialog
/*     */ {
/*     */   private static final long serialVersionUID = 1L;
/*     */   JPanel pnlSeleccionar;
/*     */   JPanel pnlCuenta;
/*     */   JPanel pnlRangoGuias;
/*     */   private JTextField txtRegCuenta;
/*     */   private JTextField txtOfiCuenta;
/*     */   private JTextField txtConsCuenta;
/*     */   private JTextField txtGuiaInicial;
/*     */   private JTextField txtGuiaFinal;
/*     */   private JFormattedTextField txtFecha;
/*     */   private JLabel lblFormaPago;
/*  42 */   private int[] opcionPago = new int[] { 1, 3, 4, 5, 6, 7, 8 };
/*     */   private int pagoSeleccionado;
/*     */   private JTextField txtNomCuenta;
/*     */   private ResultSet resulset;
/*     */   protected Frame consultaparent;
/*  47 */   private ConsultaSticker consultasticker = null;
/*  48 */   private frmSeleccionSticker seleccionsticker = null;
/*  49 */   InputMap enter = new InputMap();
/*  50 */   MaskFormatter formatofecha = null;
/*     */ 
/*     */ 
/*     */   
/*     */   public frmConsutaStickers(Frame parent, boolean modal) {
/*  55 */     super(parent, modal);
/*  56 */     setTitle("Consulta de guías Stickers");
/*  57 */     setResizable(false);
/*  58 */     setBounds(100, 100, 450, 195);
/*  59 */     getContentPane().setLayout((LayoutManager)null);
/*     */     
/*  61 */     this.pnlSeleccionar = new JPanel();
/*  62 */     this.pnlSeleccionar.setBounds(0, 0, 434, 155);
/*  63 */     getContentPane().add(this.pnlSeleccionar);
/*  64 */     this.pnlSeleccionar.setLayout((LayoutManager)null);
/*     */     
/*  66 */     JTabbedPane tapPanel = new JTabbedPane(1);
/*  67 */     tapPanel.setBounds(10, 11, 414, 129);
/*  68 */     this.pnlSeleccionar.add(tapPanel);
/*     */     
/*  70 */     this.pnlCuenta = new JPanel();
/*  71 */     tapPanel.addTab("Consulta x Cuenta", (Icon)null, this.pnlCuenta, (String)null);
/*  72 */     this.pnlCuenta.setLayout((LayoutManager)null);
/*     */     
/*  74 */     this.txtRegCuenta = new JTextField();
/*  75 */     this.txtRegCuenta.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent arg0) {
/*  77 */             ((Component)arg0.getSource()).transferFocus();
/*     */           }
/*     */         });
/*  80 */     this.txtRegCuenta.setBounds(33, 43, 33, 20);
/*  81 */     this.pnlCuenta.add(this.txtRegCuenta);
/*  82 */     this.txtRegCuenta.setColumns(2);
/*     */     
/*  84 */     this.txtOfiCuenta = new JTextField();
/*  85 */     this.txtOfiCuenta.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent arg0) {
/*  87 */             ((Component)arg0.getSource()).transferFocus();
/*     */           }
/*     */         });
/*  90 */     this.txtOfiCuenta.setBounds(78, 43, 25, 20);
/*  91 */     this.pnlCuenta.add(this.txtOfiCuenta);
/*  92 */     this.txtOfiCuenta.setColumns(10);
/*     */     
/*  94 */     this.txtConsCuenta = new JTextField();
/*  95 */     this.txtConsCuenta.addActionListener(new ActionListener()
/*     */         {
/*     */           public void actionPerformed(ActionEvent arg0) {
/*     */             try {
/*  99 */               frmConsutaStickers.this.consultasticker = new ConsultaSticker();
/* 100 */               frmConsutaStickers.this.resulset = frmConsutaStickers.this.consultasticker.ConsNomCuenta(Integer.parseInt(frmConsutaStickers.this.txtRegCuenta.getText()), Integer.parseInt(frmConsutaStickers.this.txtOfiCuenta.getText()), Integer.parseInt(frmConsutaStickers.this.txtConsCuenta.getText()));
/* 101 */               frmConsutaStickers.this.resulset.next();
/* 102 */               frmConsutaStickers.this.txtNomCuenta.setText(frmConsutaStickers.this.resulset.getString(1));
/* 103 */             } catch (Exception e1) {
/*     */               
/* 105 */               JOptionPane.showMessageDialog(null, e1);
/*     */             } 
/* 107 */             ((Component)arg0.getSource()).transferFocus();
/*     */           }
/*     */         });
/* 110 */     this.txtConsCuenta.setBounds(113, 43, 105, 20);
/* 111 */     this.pnlCuenta.add(this.txtConsCuenta);
/* 112 */     this.txtConsCuenta.setColumns(10);
/*     */     
/* 114 */     JButton btnConsultar = new JButton("Consultar");
/* 115 */     btnConsultar.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent e) {
/* 117 */             if (frmConsutaStickers.this.txtRegCuenta.getText().isEmpty() || frmConsutaStickers.this.txtOfiCuenta.getText().isEmpty() || frmConsutaStickers.this.txtConsCuenta.getText().isEmpty() || frmConsutaStickers.this.txtFecha.getText().isEmpty()) {
/* 118 */               JOptionPane.showMessageDialog(null, "Error: Debe Ingresar la Cuenta y Fecha correctamente.");
/*     */             } else {
/*     */               
/*     */               try {
/* 122 */                 frmConsutaStickers.this.consultasticker = new ConsultaSticker();
/* 123 */                 frmConsutaStickers.this.resulset = frmConsutaStickers.this.consultasticker.ConsCuentaFecha(Integer.parseInt(frmConsutaStickers.this.txtRegCuenta.getText()), Integer.parseInt(frmConsutaStickers.this.txtOfiCuenta.getText()), Integer.parseInt(frmConsutaStickers.this.txtConsCuenta.getText()), frmConsutaStickers.this.txtFecha.getText());
/*     */                 
/* 125 */                 frmConsutaStickers.this.seleccionsticker = new frmSeleccionSticker(frmConsutaStickers.this.consultaparent, true, frmConsutaStickers.this.resulset);
/* 126 */                 frmConsutaStickers.this.seleccionsticker.setLocationRelativeTo(null);
/* 127 */                 frmConsutaStickers.this.seleccionsticker.setVisible(true);
/* 128 */                 frmConsutaStickers.this.seleccionsticker.setDefaultCloseOperation(2);
/*     */                 
/* 130 */                 frmConsutaStickers.this.dispose();
/* 131 */               } catch (Exception e2) {
/* 132 */                 JOptionPane.showMessageDialog(null, e);
/*     */               } 
/*     */             } 
/*     */           }
/*     */         });
/*     */ 
/*     */     
/* 139 */     btnConsultar.setBounds(310, 43, 89, 20);
/* 140 */     this.pnlCuenta.add(btnConsultar);
/* 141 */     btnConsultar.setInputMap(0, this.enter);
/*     */     
/* 143 */     JLabel label = new JLabel("-");
/* 144 */     label.setBounds(69, 46, 11, 14);
/* 145 */     this.pnlCuenta.add(label);
/*     */     
/* 147 */     JLabel label_1 = new JLabel("-");
/* 148 */     label_1.setBounds(107, 46, 11, 14);
/* 149 */     this.pnlCuenta.add(label_1);
/*     */     
/* 151 */     JLabel lblCuenta = new JLabel("Cuenta");
/* 152 */     lblCuenta.setFont(new Font("Tahoma", 1, 12));
/* 153 */     lblCuenta.setBounds(96, 11, 46, 14);
/* 154 */     this.pnlCuenta.add(lblCuenta);
/*     */     
/* 156 */     this.txtNomCuenta = new JTextField();
/* 157 */     this.txtNomCuenta.setEnabled(false);
/* 158 */     this.txtNomCuenta.setBounds(33, 70, 266, 20);
/* 159 */     this.pnlCuenta.add(this.txtNomCuenta);
/* 160 */     this.txtNomCuenta.setColumns(10);
/*     */     
/* 162 */     JLabel lblFecha = new JLabel("Fecha");
/* 163 */     lblFecha.setFont(new Font("Tahoma", 1, 12));
/* 164 */     lblFecha.setBounds(254, 11, 46, 14);
/* 165 */     this.pnlCuenta.add(lblFecha);
/*     */     
/*     */     try {
/* 168 */       this.formatofecha = new MaskFormatter("##-##-####");
/* 169 */     } catch (ParseException e1) {
/* 170 */       e1.printStackTrace();
/*     */     } 
/* 172 */     this.txtFecha = new JFormattedTextField(this.formatofecha);
/* 173 */     this.txtFecha.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent arg0) {
/* 175 */             ((Component)arg0.getSource()).transferFocus();
/*     */           }
/*     */         });
/* 178 */     this.txtFecha.setBounds(228, 43, 72, 20);
/* 179 */     this.pnlCuenta.add(this.txtFecha);
/*     */     
/* 181 */     this.pnlRangoGuias = new JPanel();
/* 182 */     tapPanel.addTab("Consulta x Consecutivo Guías", (Icon)null, this.pnlRangoGuias, (String)null);
/* 183 */     this.pnlRangoGuias.setLayout((LayoutManager)null);
/*     */     
/* 185 */     final JComboBox<String> comboBox = new JComboBox<>();
/* 186 */     comboBox.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent arg0) {
/* 188 */             frmConsutaStickers.this.pagoSeleccionado = frmConsutaStickers.this.opcionPago[comboBox.getSelectedIndex()];
/*     */           }
/*     */         });
/* 191 */     comboBox.setBounds(10, 39, 129, 20);
/* 192 */     comboBox.addItem("Contado (1)");
/* 193 */     comboBox.addItem("Contraentrega (3)");
/* 194 */     comboBox.addItem("Credito (4)");
/* 195 */     comboBox.addItem("Cortesia (5)");
/* 196 */     comboBox.addItem("ContadoOnline (6)");
/* 197 */     comboBox.addItem("ContraentregaOnline(7)");
/* 198 */     comboBox.addItem("CreditoRosada (8)");
/* 199 */     this.pnlRangoGuias.add(comboBox);
/*     */     
/* 201 */     this.enter.put(KeyStroke.getKeyStroke(10, 0, false), "pressed");
/* 202 */     this.enter.put(KeyStroke.getKeyStroke(10, 0, true), "released");
/*     */     
/* 204 */     this.txtGuiaInicial = new JTextField();
/* 205 */     this.txtGuiaInicial.addKeyListener(new KeyAdapter() {
/*     */         
/*     */         });
/* 208 */     this.txtGuiaInicial.addActionListener(new ActionListener()
/*     */         {
/*     */           public void actionPerformed(ActionEvent arg0) {
/* 211 */             String guiainicial = frmConsutaStickers.this.txtGuiaInicial.getText();
/* 212 */             if (!frmConsutaStickers.this.isNumeric(guiainicial)) {
/* 213 */               JOptionPane.showMessageDialog(null, "Digite guía inicial correctamente.");
/* 214 */               frmConsutaStickers.this.txtGuiaInicial.setText("");
/* 215 */               frmConsutaStickers.this.txtGuiaInicial.setFocusable(true);
/*     */             } else {
/* 217 */               ((Component)arg0.getSource()).transferFocus();
/*     */             } 
/*     */           }
/*     */         });
/* 221 */     this.txtGuiaInicial.setBounds(139, 39, 86, 20);
/* 222 */     this.pnlRangoGuias.add(this.txtGuiaInicial);
/* 223 */     this.txtGuiaInicial.setColumns(10);
/*     */     
/* 225 */     this.txtGuiaFinal = new JTextField();
/* 226 */     this.txtGuiaFinal.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent arg0) {
/* 228 */             String guiainicial = frmConsutaStickers.this.txtGuiaFinal.getText();
/* 229 */             if (!frmConsutaStickers.this.isNumeric(guiainicial)) {
/* 230 */               JOptionPane.showMessageDialog(null, "Digite guía final correctamente.");
/* 231 */               frmConsutaStickers.this.txtGuiaFinal.setText("");
/* 232 */               frmConsutaStickers.this.txtGuiaFinal.setFocusable(true);
/*     */             } else {
/* 234 */               ((Component)arg0.getSource()).transferFocus();
/*     */             } 
/*     */           }
/*     */         });
/* 238 */     this.txtGuiaFinal.setBounds(229, 39, 86, 20);
/* 239 */     this.pnlRangoGuias.add(this.txtGuiaFinal);
/* 240 */     this.txtGuiaFinal.setColumns(10);
/*     */     
/* 242 */     JButton btnConsultar_1 = new JButton("Consultar");
/* 243 */     btnConsultar_1.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent arg0) {
/* 245 */             if (Integer.parseInt(frmConsutaStickers.this.txtGuiaInicial.getText()) > Integer.parseInt(frmConsutaStickers.this.txtGuiaFinal.getText())) {
/* 246 */               JOptionPane.showMessageDialog(null, "Error: La guía inicial debe ser menor que la guía final.");
/*     */             } else {
/*     */               try {
/* 249 */                 frmConsutaStickers.this.consultasticker = new ConsultaSticker();
/* 250 */                 frmConsutaStickers.this.resulset = frmConsutaStickers.this.consultasticker.ConsRangoGuias(frmConsutaStickers.this.pagoSeleccionado, Integer.parseInt(frmConsutaStickers.this.txtGuiaInicial.getText()), Integer.parseInt(frmConsutaStickers.this.txtGuiaFinal.getText()));
/*     */                 
/* 252 */                 frmConsutaStickers.this.seleccionsticker = new frmSeleccionSticker(frmConsutaStickers.this.consultaparent, true, frmConsutaStickers.this.resulset);
/* 253 */                 frmConsutaStickers.this.seleccionsticker.setLocationRelativeTo(null);
/* 254 */                 frmConsutaStickers.this.seleccionsticker.setVisible(true);
/* 255 */                 frmConsutaStickers.this.seleccionsticker.setDefaultCloseOperation(2);
/*     */                 
/* 257 */                 frmConsutaStickers.this.dispose();
/* 258 */               } catch (Exception e) {
/* 259 */                 JOptionPane.showMessageDialog(null, e);
/*     */               } 
/*     */             } 
/*     */           }
/*     */         });
/*     */ 
/*     */     
/* 266 */     btnConsultar_1.setBounds(320, 38, 89, 23);
/* 267 */     this.pnlRangoGuias.add(btnConsultar_1);
/* 268 */     btnConsultar_1.setInputMap(0, this.enter);
/*     */     
/* 270 */     JLabel lblGuaInicial = new JLabel("Guía Inicial");
/* 271 */     lblGuaInicial.setFont(new Font("Tahoma", 1, 12));
/* 272 */     lblGuaInicial.setBounds(129, 24, 75, 14);
/* 273 */     this.pnlRangoGuias.add(lblGuaInicial);
/*     */     
/* 275 */     JLabel lblGuaFinal = new JLabel("Guía Final");
/* 276 */     lblGuaFinal.setFont(new Font("Tahoma", 1, 12));
/* 277 */     lblGuaFinal.setBounds(229, 24, 64, 14);
/* 278 */     this.pnlRangoGuias.add(lblGuaFinal);
/*     */     
/* 280 */     this.lblFormaPago = new JLabel("Forma Pago");
/* 281 */     this.lblFormaPago.setFont(new Font("Tahoma", 1, 12));
/* 282 */     this.lblFormaPago.setBounds(21, 24, 75, 14);
/* 283 */     this.pnlRangoGuias.add(this.lblFormaPago);
/*     */   }
/*     */ 
/*     */   
/*     */   public frmConsutaStickers() {
/* 288 */     throw new UnsupportedOperationException("Not supported yet.");
/*     */   }
/*     */   public boolean isNumeric(String str) {
/* 291 */     return (str.matches("[+-]?\\d*(\\.\\d+)?") && !str.equals(""));
/*     */   }
/*     */ }


/* Location:              C:\Users\JORGE\Desktop\CoordTecno.jar!\InterfazGui\frmConsutaStickers.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */