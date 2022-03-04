
package Conexion;

import java.util.ArrayList;
import java.util.List;
import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRField;


public class ConsNovDataSource  implements JRDataSource {
    
    private List<ConsNovedad> ConsNovedad = new ArrayList<ConsNovedad>();
  
    private int indiceConsNovedadActual = -1;
    
    @Override
    public Object getFieldValue(JRField campo) {
   Object valor = null;
     
    if ("Nro_Placa".equals(campo.getName())) {
       valor = ConsNovedad.get(indiceConsNovedadActual).getPlaca();
     }
    
     if ("Nom_Responsable_PRP".equals(campo.getName())) {
       valor = ConsNovedad.get(indiceConsNovedadActual).getResponsable();
     }
     
      if ("NovOP".equals(campo.getName())) {
       valor = ConsNovedad.get(indiceConsNovedadActual).getNovop();
     }
      
       if ("NovSAC".equals(campo.getName())) {
       valor = ConsNovedad.get(indiceConsNovedadActual).getNovsac();
     }
       
        if ("G_Entregadas".equals(campo.getName())) {
       valor = ConsNovedad.get(indiceConsNovedadActual).getEntregadas();
     }
        
         if ("T_Guias".equals(campo.getName())) {
       valor = ConsNovedad.get(indiceConsNovedadActual).getTotal();
     }
    
    return valor;
    
    }
    
    public void addConsNovedad(ConsNovedad consNovedad) {
     this.ConsNovedad.add(consNovedad);
  }

    @Override
   public boolean next() throws JRException {
     return ++indiceConsNovedadActual < ConsNovedad.size();
   }
    
}
