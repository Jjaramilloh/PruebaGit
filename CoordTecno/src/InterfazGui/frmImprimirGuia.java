/*     */ package InterfazGui;
/*     */ 
/*     */ import Conexion.Guia;
/*     */ import Conexion.GuiaDataSource;
/*     */ import java.awt.BorderLayout;
/*     */ import java.awt.Frame;
/*     */ import java.awt.LayoutManager;
/*     */ import java.awt.event.ActionEvent;
/*     */ import java.awt.event.ActionListener;
/*     */ import java.io.File;
/*     */ import java.sql.ResultSet;
/*     */ import javax.swing.InputMap;
/*     */ import javax.swing.JButton;
/*     */ import javax.swing.JDialog;
/*     */ import javax.swing.JLabel;
/*     */ import javax.swing.JOptionPane;
/*     */ import javax.swing.JPanel;
/*     */ import javax.swing.KeyStroke;
/*     */ import javax.swing.border.Border;
/*     */ import net.sf.jasperreports.engine.JRDataSource;
/*     */ import net.sf.jasperreports.engine.JasperFillManager;
/*     */ import net.sf.jasperreports.engine.JasperPrint;
/*     */ import net.sf.jasperreports.engine.JasperReport;
/*     */ import net.sf.jasperreports.engine.util.JRLoader;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class frmImprimirGuia
/*     */   extends JDialog
/*     */ {
/*     */   private static final long serialVersionUID = 1L;
/*  34 */   private JPanel pnlSeleccionReporte = new JPanel();
/*     */   private ResultSet resGuias;
/*  36 */   private Guia guia = null;
/*  37 */   GuiaDataSource guiaDS = null;
/*     */   File archivo;
/*     */   protected Frame parent;
/*  40 */   InputMap enter = new InputMap();
/*     */   
/*     */   public frmImprimirGuia(Frame parent, boolean modal, final ResultSet resultado) {
/*  43 */     super(parent, modal);
/*  44 */     setTitle("Generar Reporte de Guias");
/*  45 */     setResizable(false);
/*  46 */     setBounds(100, 100, 350, 144);
/*  47 */     getContentPane().setLayout(new BorderLayout());
/*  48 */     this.pnlSeleccionReporte.setBorder((Border)null);
/*  49 */     getContentPane().add(this.pnlSeleccionReporte, "Center");
/*  50 */     this.pnlSeleccionReporte.setLayout((LayoutManager)null);
/*     */     
/*  52 */     this.enter.put(KeyStroke.getKeyStroke(10, 0, false), "pressed");
/*  53 */     this.enter.put(KeyStroke.getKeyStroke(10, 0, true), "released");
/*     */     
/*  55 */     JButton btnStickers2x6 = new JButton("Generar");
/*  56 */     btnStickers2x6.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent arg0) {
/*  58 */             frmImprimirGuia.this.setResulset(resultado);
/*  59 */             frmImprimirGuia.this.Imprimirstickers("");
/*  60 */             frmImprimirGuia.this.dispose();
/*     */           }
/*     */         });
/*  63 */     btnStickers2x6.setBounds(30, 54, 120, 41);
/*  64 */     this.pnlSeleccionReporte.add(btnStickers2x6);
/*  65 */     btnStickers2x6.setInputMap(0, this.enter);
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
/*  79 */     JButton btnCancelar = new JButton("Cancelar");
/*  80 */     btnCancelar.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent arg0) {
/*  82 */             frmImprimirGuia.this.dispose();
/*     */           }
/*     */         });
/*  85 */     btnCancelar.setBounds(190, 54, 120, 41);
/*  86 */     this.pnlSeleccionReporte.add(btnCancelar);
/*  87 */     btnCancelar.setInputMap(0, this.enter);
/*     */     
/*  89 */     JLabel lblguiasEncontradas = new JLabel();
/*  90 */     lblguiasEncontradas.setHorizontalAlignment(0);
/*  91 */     lblguiasEncontradas.setText("");
/*  92 */     lblguiasEncontradas.setBounds(20, 11, 220, 20);
/*  93 */     this.pnlSeleccionReporte.add(lblguiasEncontradas);
/*     */   }
/*     */ 
/*     */   
/*     */   public ResultSet getResulset() {
/*  98 */     return this.resGuias;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setResulset(ResultSet resGuias) {
/* 103 */     this.resGuias = resGuias;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void Imprimirstickers(String seleccionGuia) {
/*     */     try {
/* 114 */       this.guiaDS = new GuiaDataSource();
/* 115 */       while (this.resGuias.next()) {
/* 116 */         for (int unidad = 1; unidad <= 1; unidad++) {
/*     */           
/* 118 */           String valRegi = this.resGuias.getString(3);
/* 119 */           String valCons = this.resGuias.getString(5);
/* 120 */           String valRcta = this.resGuias.getString(11);
/* 121 */           String valOcta = this.resGuias.getString(12);
/* 122 */           String valCcta = this.resGuias.getString(13);
/*     */           
/* 124 */           if (this.resGuias.getString(11).length() < 2) {
/*     */             
/* 126 */             int cero = 2 - this.resGuias.getString(11).length();
/* 127 */             valRcta = completarCeros(this.resGuias.getString(11), cero);
/*     */           } 
/* 129 */           if (this.resGuias.getString(12).length() < 3) {
/*     */             
/* 131 */             int cero = 3 - this.resGuias.getString(12).length();
/* 132 */             valOcta = completarCeros(this.resGuias.getString(12), cero);
/*     */           } 
/* 134 */           if (this.resGuias.getString(13).length() < 7) {
/*     */             
/* 136 */             int cero = 7 - this.resGuias.getString(13).length();
/* 137 */             valCcta = completarCeros(this.resGuias.getString(13), cero);
/*     */           } 
/* 139 */           if (this.resGuias.getString(3).length() < 2) {
/*     */             
/* 141 */             int cero = 2 - this.resGuias.getString(3).length();
/* 142 */             valRegi = completarCeros(this.resGuias.getString(3), cero);
/*     */           } 
/*     */           
/* 145 */           if (this.resGuias.getString(5).length() < 9) {
/* 146 */             int ceros = 9 - this.resGuias.getString(5).length();
/* 147 */             valCons = completarCeros(this.resGuias.getString(5), ceros);
/* 148 */             this
/* 149 */               .guia = new Guia(this.resGuias.getString(1), this.resGuias.getString(2), valRegi, Integer.parseInt(this.resGuias.getString(4)), valCons, this.resGuias.getString(6), this.resGuias.getString(7), this.resGuias.getString(8), this.resGuias.getString(9), this.resGuias.getString(10), valRcta, valOcta, valCcta, this.resGuias.getString(14), this.resGuias.getString(15), this.resGuias.getString(16), this.resGuias.getString(17), this.resGuias.getString(18), this.resGuias.getString(19), this.resGuias.getString(20), this.resGuias.getString(21), this.resGuias.getString(22), this.resGuias.getString(23), this.resGuias.getString(24), Double.parseDouble(this.resGuias.getString(25)), this.resGuias.getString(26), this.resGuias.getString(27), this.resGuias.getString(28), this.resGuias.getString(29), this.resGuias.getString(30),this.resGuias.getString(31), Double.parseDouble(this.resGuias.getString(32)), Double.parseDouble(this.resGuias.getString(33)), Double.parseDouble(this.resGuias.getString(34)), this.resGuias.getString(35));
/* 150 */             this.guiaDS.addGuia(this.guia);
/*     */           } else {
/* 152 */             this
/* 153 */               .guia = new Guia(this.resGuias.getString(1), this.resGuias.getString(2), valRegi, Integer.parseInt(this.resGuias.getString(4)), valCons, this.resGuias.getString(6), this.resGuias.getString(7), this.resGuias.getString(8), this.resGuias.getString(9), this.resGuias.getString(10), valRcta, valOcta, valCcta, this.resGuias.getString(14), this.resGuias.getString(15), this.resGuias.getString(16), this.resGuias.getString(17), this.resGuias.getString(18), this.resGuias.getString(19), this.resGuias.getString(20), this.resGuias.getString(21), this.resGuias.getString(22), this.resGuias.getString(23), this.resGuias.getString(24), Double.parseDouble(this.resGuias.getString(25)), this.resGuias.getString(26), this.resGuias.getString(27), this.resGuias.getString(28), this.resGuias.getString(29), this.resGuias.getString(30),this.resGuias.getString(31), Double.parseDouble(this.resGuias.getString(32)), Double.parseDouble(this.resGuias.getString(33)), Double.parseDouble(this.resGuias.getString(34)), this.resGuias.getString(35));
/* 154 */             this.guiaDS.addGuia(this.guia);
/*     */           }    
/*     */         } //JOptionPane.showMessageDialog(null, "*"+this.resGuias.getString(17)+"*");
/*     */       } 
/*     */ 
/*     */ 
/*     */       
/* 161 */       JasperReport reporte = (JasperReport)JRLoader.loadObjectFromFile("C:\\Enviasql\\CoordTecno\\CoordTecno\\src\\Reportes\\ImpGuiaOnline.jasper");
/*     */       
/* 163 */       JasperPrint jasperPrint = JasperFillManager.fillReport(reporte, null, (JRDataSource)this.guiaDS);
/*     */ 
/*     */ 
/*     */       
/* 167 */       frmVisualRepote visualreporte = new frmVisualRepote(this.parent, true, jasperPrint);
/* 168 */       visualreporte.setLocationRelativeTo(null);
/* 169 */       visualreporte.setVisible(true);
/* 170 */       visualreporte.setDefaultCloseOperation(2);
/*     */     }
/* 172 */     catch (NullPointerException e) {
/*     */       
/* 174 */       JOptionPane.showMessageDialog(null, "No se hallaron registros.");
/*     */     }
/* 176 */     catch (Exception e2) {
                JOptionPane.showMessageDialog(null, "Error Imprimiendo."+e2);
/* 177 */       System.out.println(e2);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String completarCeros(String consguia, int ceros) {
/* 187 */     for (int i = 1; i <= ceros; i++) {
/* 188 */       consguia = "0" + consguia;
/*     */     }
/*     */     
/* 191 */     return consguia;
/*     */   }
/*     */ }


/* Location:              C:\Users\JORGE\Desktop\CoordTecno.jar!\InterfazGui\frmImprimirGuia.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */