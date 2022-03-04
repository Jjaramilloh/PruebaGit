
package Conexion;

/**
 *
 * @author CoordTecno
 */
public class ConsNovedad {
    
    String placa, responsable, novop, novsac,entregadas,total;

    public ConsNovedad(String placa, String responsable, String novop, String novsac, String entregadas, String total) {
        this.placa = placa;
        this.responsable = responsable;
        this.novop = novop;
        this.novsac = novsac;
        this.entregadas = entregadas;
        this.total = total;
    }

    public String getPlaca() {
        return placa;
    }

    public String getResponsable() {
        return responsable;
    }

    public String getNovop() {
        return novop;
    }

    public String getNovsac() {
        return novsac;
    }

    public String getEntregadas() {
        return entregadas;
    }

    public String getTotal() {
        return total;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }

    public void setNovop(String novop) {
        this.novop = novop;
    }

    public void setNovsac(String novsac) {
        this.novsac = novsac;
    }

    public void setEntregadas(String entregadas) {
        this.entregadas = entregadas;
    }

    public void setTotal(String total) {
        this.total = total;
    }
    
    
    
}
