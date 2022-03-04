/*    */ package InterfazGui;
/*    */ 
/*    */ import java.awt.Container;
/*    */ import java.awt.Frame;
/*    */ import javax.swing.JDialog;
/*    */ import net.sf.jasperreports.engine.JasperPrint;
/*    */ import net.sf.jasperreports.view.JRViewer;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class frmVisualRepote
/*    */   extends JDialog
/*    */ {
/*    */   private static final long serialVersionUID = 1L;
/*    */   
/*    */   public frmVisualRepote(Frame parent, boolean modal, JasperPrint jasperprint) {
/* 19 */     super(parent, modal);
/* 20 */     setBounds(100, 100, 880, 600);
/* 21 */     setTitle("Visualización Reporte");
/* 22 */     JRViewer jrv = new JRViewer(jasperprint);
/* 23 */     setModal(false);
/* 24 */     setContentPane((Container)jrv);
/* 25 */     setModal(true);
/*    */   }
/*    */ }


/* Location:              C:\Users\JORGE\Desktop\CoordTecno.jar!\InterfazGui\frmVisualRepote.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */