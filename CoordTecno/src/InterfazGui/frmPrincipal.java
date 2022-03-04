/*    */ package InterfazGui;
/*    */ 
/*    */ import java.awt.BorderLayout;
/*    */ import java.awt.Frame;
/*    */ import java.awt.event.ActionEvent;
/*    */ import java.awt.event.ActionListener;
import java.sql.ResultSet;
import javax.swing.JDialog;
/*    */ import javax.swing.JFrame;
/*    */ import javax.swing.JMenu;
/*    */ import javax.swing.JMenuBar;
/*    */ import javax.swing.JMenuItem;
/*    */ import javax.swing.JPanel;
/*    */ import javax.swing.border.EmptyBorder;
/*    */ import Conexion.IniciarSesion;
/*    */ 
/*    */ public class frmPrincipal
/*    */   extends JFrame
/*    */ {
/*    */   private static final long serialVersionUID = 1L;
/*    */   private JPanel contentPane;
/*    */   protected Frame parent;
            private ResultSet resulset;
/*    */   
/*    */   public frmPrincipal() {
/* 23 */     setDefaultCloseOperation(3);
/* 24 */     setBounds(100, 100, 800, 600);
/*    */     
/* 26 */     JMenuBar menuBar = new JMenuBar();
/* 27 */     setJMenuBar(menuBar);
/*    */     
/* 29 */     JMenu mnArchivo = new JMenu("Opciones");
/* 30 */     menuBar.add(mnArchivo);
/*    */     
/* 32 */     JMenuItem mntmRguias = new JMenuItem("Reestablecer Guias");
/* 33 */     mntmRguias.addActionListener(new ActionListener()
/*    */         {
/*    */           public void actionPerformed(ActionEvent arg0) {
/*    */             try {
/* 37 */               FrmReestablecerCuentas inicioS = new FrmReestablecerCuentas();
/* 38 */               inicioS.setVisible(true);
/* 39 */               inicioS.setLocationRelativeTo(null);
/*    */             }
/* 41 */             catch (Exception e) {
/* 42 */               e.printStackTrace();
/*    */             } 
/*    */           }
/*    */         });
/*    */     
/* 47 */     JMenuItem mntReimprimirGuia = new JMenuItem("Reimprimir Guia");
/* 48 */     mntReimprimirGuia.addActionListener(new ActionListener() {
/*    */           public void actionPerformed(ActionEvent arg0) {
/*    */             try {
/* 51 */               frmConsultaGuia dlgConsGuia = new frmConsultaGuia(frmPrincipal.this.parent, true);
/* 52 */               dlgConsGuia.setLocationRelativeTo(null);
/* 53 */               dlgConsGuia.setVisible(true);
/* 54 */               dlgConsGuia.setDefaultCloseOperation(2);
/*    */             }
/* 56 */             catch (Exception e) {
/* 57 */               e.printStackTrace();
/*    */             } 
/*    */           }
/*    */         });
/*    */ 
                        JMenuItem mntImprStickerManual = new JMenuItem("Imprimir Sticker Manual");
                mntImprStickerManual.addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent arg0){
                       try{
 
					StickerManual dlgStickerManual = new StickerManual(parent, true);				
					dlgStickerManual.setLocationRelativeTo(null);
					dlgStickerManual.setVisible(true);
					dlgStickerManual.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);                           
                           
                       }catch(Exception e){
                           e.printStackTrace();
                       }
                    }
        });
                
                
                JMenuItem mntSeleccionGuiasV = new JMenuItem("Imprimir Guias Votre");
                mntSeleccionGuiasV.addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent arg0){
                       try{
 
					frmGuiaVotre dlgGuiaVotre = new frmGuiaVotre( frmPrincipal.this.parent, true);				
					dlgGuiaVotre.setLocationRelativeTo(null);
					dlgGuiaVotre.setVisible(true);
					dlgGuiaVotre.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);                           
                           
                       }catch(Exception e){
                           e.printStackTrace();
                       }
                    }
        });
                                JMenuItem mntSeleccionGuiasML = new JMenuItem("Imprimir Guias Mercado Libre");
                mntSeleccionGuiasML.addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent arg0){
                       try{
 
					frmGuiasMercadoLibre dlgGuiaML = new frmGuiasMercadoLibre( frmPrincipal.this.parent, true);				
					dlgGuiaML.setLocationRelativeTo(null);
					dlgGuiaML.setVisible(true);
					dlgGuiaML.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);                           
                           
                       }catch(Exception e){
                           e.printStackTrace();
                       }
                    }
        });
                            JMenuItem mntSeleccionGuiasAlvaro = new JMenuItem("Imprimir Guias Alvaro");
                mntSeleccionGuiasAlvaro.addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent arg0){
                       try{
 
					frmGuiasAlvaro dlgGuiaML = new frmGuiasAlvaro( frmPrincipal.this.parent, true);				
					dlgGuiaML.setLocationRelativeTo(null);
					dlgGuiaML.setVisible(true);
					dlgGuiaML.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);                           
                           
                       }catch(Exception e){
                           e.printStackTrace();
                       }
                    }
        });
                JMenuItem mntSeleccionInicioSesion2 = new JMenuItem("Imprimir Guias Alvaro");
                mntSeleccionInicioSesion2.addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent arg0){
                       try{
 
					frmInicioSesion2 dlgGuiaML = new frmInicioSesion2( frmPrincipal.this.parent, true);				
					dlgGuiaML.setLocationRelativeTo(null);
					dlgGuiaML.setVisible(true);
					dlgGuiaML.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);                           
                           
                       }catch(Exception e){
                           e.printStackTrace();
                       }
                    }
        });

/* 62 */     JMenuItem mntmSalir = new JMenuItem("Salir");
/* 63 */     mntmSalir.addActionListener(new ActionListener() {
/*    */           public void actionPerformed(ActionEvent arg0) {
/* 65 */             System.exit(0);
/*    */           }
/*    */         });
/*    */     
/* 69 */     JMenuItem mntmSticker = new JMenuItem("Imprimir Stickers");
/* 70 */     mntmSticker.addActionListener(new ActionListener()
/*    */         {
/*    */           public void actionPerformed(ActionEvent arg0) {
/*    */             try {
/* 74 */               frmConsutaStickers dlgConsSticker = new frmConsutaStickers(frmPrincipal.this.parent, true);
/* 75 */               dlgConsSticker.setLocationRelativeTo(null);
/* 76 */               dlgConsSticker.setVisible(true);
/* 77 */               dlgConsSticker.setDefaultCloseOperation(2);
/* 78 */             } catch (Exception e) {
/* 79 */               e.printStackTrace();
/*    */             } 
/*    */           }
/*    */         });
/*    */     mnArchivo.add(mntmSticker);
/* 84 */     mnArchivo.add(mntSeleccionGuiasV);/*    */   
             mnArchivo.add(mntImprStickerManual);
/* 86 */     mnArchivo.add(mntReimprimirGuia);
            mnArchivo.add(mntSeleccionGuiasML);
/* 87 */     mnArchivo.add(mntmSalir);


/*    */     
/* 89 */     JMenu mnAyudar = new JMenu("Ayuda");
/* 90 */     menuBar.add(mnAyudar);             
/*    */     
/* 92 */     JMenuItem mntmAcercaDe = new JMenuItem("Reportar errores al correo \nsiscgna@envia.co");
/* 93 */     mnAyudar.add(mntmAcercaDe); 
             mnAyudar.add(mntSeleccionInicioSesion2);
/* 94 */     this.contentPane = new JPanel();
/* 95 */     this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
/* 96 */     setContentPane(this.contentPane);
/* 97 */     this.contentPane.setLayout(new BorderLayout(0, 0));
/*    */   }
/*    */ }


/* Location:              C:\Users\JORGE\Desktop\CoordTecno.jar!\InterfazGui\frmPrincipal.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */