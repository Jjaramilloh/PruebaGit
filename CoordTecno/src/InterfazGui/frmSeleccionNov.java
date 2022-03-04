package InterfazGui;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.File;
import java.sql.ResultSet;

import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.KeyStroke;
import javax.swing.SwingConstants;

import Conexion.ConsNovedad;
import Conexion.ConsNovDataSource;
//import Reportes.*;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;

public class frmSeleccionNov extends JDialog {

	private static final long serialVersionUID = 1L;
	private JPanel pnlSeleccionReporte = new JPanel();
	private ResultSet resulset;
	private ConsNovedad consNovedad = null;
	ConsNovDataSource consNovedadDS = null;
	File archivo;
	protected Frame parent;
	InputMap enter = new InputMap();

	public frmSeleccionNov(Frame parent, boolean modal, ResultSet resultado) {
		super(parent, modal);
		setTitle("Reporte Panel");
		setResizable(false);
		setBounds(100, 100, 411, 144);
		getContentPane().setLayout(new BorderLayout());
		pnlSeleccionReporte.setBorder(null);
		getContentPane().add(pnlSeleccionReporte, BorderLayout.CENTER);
		pnlSeleccionReporte.setLayout(null);
		
		enter.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, false), "pressed");
		enter.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, true), "released");
		
		/*  55 */     JButton btnStickers2x6 = new JButton("Generar");
/*  56 */     btnStickers2x6.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent arg0) {
/*  58 */             frmSeleccionNov.this.setResulset(resultado);
/*  59 */             frmSeleccionNov.this.ImprimirconsNovedad("");
 
 JOptionPane.showMessageDialog(parent, consNovedadDS );
/*  60 */             frmSeleccionNov.this.dispose();
/*     */           }
/*     */         });
/*  63 */     btnStickers2x6.setBounds(30, 54, 120, 41);
/*  64 */     this.pnlSeleccionReporte.add(btnStickers2x6);
/*  65 */     btnStickers2x6.setInputMap(0, this.enter);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		btnCancelar.setBounds(270, 54, 120, 41);
		pnlSeleccionReporte.add(btnCancelar);
		btnCancelar.setInputMap(0, enter);
		
		JLabel lblguiasEncontradas = new JLabel();
		lblguiasEncontradas.setHorizontalAlignment(SwingConstants.CENTER);
		lblguiasEncontradas.setText(" guías, " + "unidades encontradas. Tipo de consNovedad a utilizar?");
		lblguiasEncontradas.setBounds(10, 11, 380, 14);
		pnlSeleccionReporte.add(lblguiasEncontradas);
		
	}
	
	public ResultSet getResulset() {
		return resulset;
	}
	public void setResulset(ResultSet resulset) {
		this.resulset = resulset;
	}
	
	public void ImprimirconsNovedad(String seleccionConsNovedad) {
		
		try {			
			consNovedadDS = new ConsNovDataSource();			
		     while(resulset.next()){		    	 
		    	 for(int unidad = 1; unidad <= 1; unidad++){
		    		 
		    		
		    			 consNovedad = new ConsNovedad( resulset.getString(1), resulset.getString(2), resulset.getString(3), resulset.getString(4), resulset.getString(5), resulset.getString(6));
		    			 consNovedadDS.addConsNovedad(consNovedad);
		    			
                                        
		    		 
		    	 }
		    	  
		      }
		     
		     JasperReport reporte = (JasperReport) JRLoader.loadObjectFromFile("\\\\FSERVER-CAR\\Reportes\\ReportePanel.jasper"); 
		     
		     JasperPrint jasperPrint = JasperFillManager.fillReport(reporte, null, consNovedadDS);
		     
		     //JasperViewer.viewReport(jasperPrint, false);
		     
		     frmVisualRepote visualreporte = new frmVisualRepote(parent, true, jasperPrint);
		     visualreporte.setLocationRelativeTo(null);
		     visualreporte.setVisible(true);
		     visualreporte.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		     
		} catch (NullPointerException e) {
			
			JOptionPane.showMessageDialog(null, "No se hallaron registros.");
			
		} catch (Exception e2) {
			System.out.println(e2);
		}
		
		
	}
	
	public String completarCeros(String consguia, int ceros){
		
		for(int i = 1; i <= ceros; i++){
			consguia = "0" + consguia;
		}
		
		return consguia;
	}
	
	
}
