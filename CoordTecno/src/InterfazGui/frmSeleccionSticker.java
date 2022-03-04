/*     */ package InterfazGui;
/*     */ 
/*     */ import Conexion.Sticker;
/*     */ import Conexion.StickerDataSource;
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
/*     */ public class frmSeleccionSticker
/*     */   extends JDialog
/*     */ {
/*     */   private static final long serialVersionUID = 1L;
/*  31 */   private JPanel pnlSeleccionReporte = new JPanel();
/*     */   private ResultSet resulset;
/*  33 */   private Sticker sticker = null;
/*  34 */   StickerDataSource stickerDS = null;
/*     */   File archivo;
/*     */   protected Frame parent;
/*  37 */   InputMap enter = new InputMap();
/*     */   
/*     */   public frmSeleccionSticker(Frame parent, boolean modal, final ResultSet resultado) {
/*  40 */     super(parent, modal);
/*  41 */     setTitle("Seleccione el Tipo de Guía a Imprimir");
/*  42 */     setResizable(false);
/*  43 */     setBounds(100, 100, 411, 144);
/*  44 */     getContentPane().setLayout(new BorderLayout());
/*  45 */     this.pnlSeleccionReporte.setBorder((Border)null);
/*  46 */     getContentPane().add(this.pnlSeleccionReporte, "Center");
/*  47 */     this.pnlSeleccionReporte.setLayout((LayoutManager)null);
/*     */     
/*  49 */     this.enter.put(KeyStroke.getKeyStroke(10, 0, false), "pressed");
/*  50 */     this.enter.put(KeyStroke.getKeyStroke(10, 0, true), "released");
/*     */     
/*  52 */     JButton btnStickers2x6 = new JButton("Stickers 2x6");
/*  53 */     btnStickers2x6.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent arg0) {
/*  55 */             frmSeleccionSticker.this.setResulset(resultado);
/*  56 */             frmSeleccionSticker.this.Imprimirstickers("2x6");
                        dispose();
/*     */           }
/*     */         });
/*  59 */     btnStickers2x6.setBounds(10, 54, 120, 41);
/*  60 */     this.pnlSeleccionReporte.add(btnStickers2x6);
/*  61 */     btnStickers2x6.setInputMap(0, this.enter);
/*     */     
/*  63 */     JButton btnStickers3x11 = new JButton("Stickers 3x11");
/*  64 */     btnStickers3x11.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent arg0) {
/*  66 */             frmSeleccionSticker.this.setResulset(resultado);
/*  67 */             frmSeleccionSticker.this.Imprimirstickers("3x11");
                        dispose();
/*     */           }
/*     */         });
/*  70 */     btnStickers3x11.setBounds(140, 54, 120, 41);
/*  71 */     this.pnlSeleccionReporte.add(btnStickers3x11);
/*  72 */     btnStickers3x11.setInputMap(0, this.enter);
/*     */     
/*  74 */     JButton btnCancelar = new JButton("Cancelar");
/*  75 */     btnCancelar.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent arg0) {
/*  77 */             frmSeleccionSticker.this.dispose();
/*     */           }
/*     */         });
/*  80 */     btnCancelar.setBounds(270, 54, 120, 41);
/*  81 */     this.pnlSeleccionReporte.add(btnCancelar);
/*  82 */     btnCancelar.setInputMap(0, this.enter);
/*     */     
/*  84 */     JLabel lblguiasEncontradas = new JLabel();
/*  85 */     lblguiasEncontradas.setHorizontalAlignment(0);
/*  86 */     lblguiasEncontradas.setText(" guías, unidades encontradas. Tipo de sticker a utilizar?");
/*  87 */     lblguiasEncontradas.setBounds(10, 11, 380, 14);
/*  88 */     this.pnlSeleccionReporte.add(lblguiasEncontradas);
/*     */   }
/*     */ 
/*     */   
/*     */   public ResultSet getResulset() {
/*  93 */     return this.resulset;
/*     */   }
/*     */   public void setResulset(ResultSet resulset) {
/*  96 */     this.resulset = resulset;
/*     */   }
/*     */ 
/*     */   
/*     */   public void Imprimirstickers(String seleccionSticker) {
/*     */     try {
/* 102 */       this.stickerDS = new StickerDataSource();
/* 103 */       while (this.resulset.next()) {
/*     */         
/* 105 */         for (int unidad = 1; unidad <= Integer.parseInt(this.resulset.getString(9)); unidad++) {
/* 106 */           String valRegi = this.resulset.getString(1);
/* 107 */           String valCons = this.resulset.getString(3);
/*     */           
/* 109 */           if (this.resulset.getString(1).length() < 2) {
/*     */             
/* 111 */             int cero = 2 - this.resulset.getString(1).length();
/* 112 */             valRegi = completarCeros(this.resulset.getString(1), cero);
/*     */           } 
/*     */           
/* 115 */           if (this.resulset.getString(3).length() < 9) {
/* 116 */             int ceros = 9 - this.resulset.getString(3).length();
/* 117 */             valCons = completarCeros(this.resulset.getString(3), ceros);
/* 118 */             this.sticker = new Sticker(valRegi, Integer.parseInt(this.resulset.getString(2)), valCons, this.resulset.getString(4), this.resulset.getString(5), this.resulset.getString(6), this.resulset.getString(7), this.resulset.getString(8), unidad, Integer.parseInt(this.resulset.getString(9)), this.resulset.getString(10), this.resulset.getString(11));
/* 119 */             this.stickerDS.addSticker(this.sticker);
/*     */           } else {
/* 121 */             this.sticker = new Sticker(valRegi, Integer.parseInt(this.resulset.getString(2)), valCons, this.resulset.getString(4), this.resulset.getString(5), this.resulset.getString(6), this.resulset.getString(7), this.resulset.getString(8), unidad, Integer.parseInt(this.resulset.getString(9)), this.resulset.getString(10), this.resulset.getString(11));
/* 122 */             this.stickerDS.addSticker(this.sticker);
/*     */           } 
/*     */         } 
/*     */       } 
/*     */ 
/*     */ 
/*     */       
/* 129 */       JasperReport reporte = (JasperReport)JRLoader.loadObjectFromFile("\\\\FSERVER-CAR\\Reportes\\ImpGuiaSticker" + seleccionSticker + ".jasper");
/*     */       
/* 131 */       JasperPrint jasperPrint = JasperFillManager.fillReport(reporte, null, (JRDataSource)this.stickerDS);
/*     */ 
/*     */ 
/*     */       
/* 135 */       frmVisualRepote visualreporte = new frmVisualRepote(this.parent, true, jasperPrint);
/* 136 */       visualreporte.setLocationRelativeTo(null);
/* 137 */       visualreporte.setVisible(true);
/* 138 */       visualreporte.setDefaultCloseOperation(2);
/*     */     }
/* 140 */     catch (NullPointerException e) {
/*     */       
/* 142 */       JOptionPane.showMessageDialog(null, "No se hallaron registros.");
/*     */     }
/* 144 */     catch (Exception e2) {
/* 145 */       System.out.println(e2);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String completarCeros(String consguia, int ceros) {
/* 153 */     for (int i = 1; i <= ceros; i++) {
/* 154 */       consguia = "0" + consguia;
/*     */     }
/*     */     
/* 157 */     return consguia;
/*     */   }
/*     */ }


/* Location:              C:\Users\JORGE\Desktop\CoordTecno.jar!\InterfazGui\frmSeleccionSticker.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */