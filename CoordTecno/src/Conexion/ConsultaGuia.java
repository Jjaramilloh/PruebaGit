/*    */ package Conexion;
/*    */ 
/*    */ import java.sql.Connection;
/*    */ import java.sql.ResultSet;
/*    */ import java.sql.SQLException;
/*    */ import java.sql.Statement;
/*    */ import java.util.ArrayList;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ConsultaGuia
/*    */ {
/*    */   ConexionDB conexion;
/* 16 */   Connection conReestGuias = null;
/*    */   
/*    */   ResultSet resGuias;
/*    */   String Cod_Regional;
/*    */   String Cod_FormaPago;
/*    */   String Cons_GuiasU;
/*    */   String fecinicial;
/*    */   String fecfinal;    
/*    */   private ConsultaGuia cadena;
/* 23 */   ArrayList<Guia> lista = new ArrayList<>();
/*    */ 
/*    */   
/*    */   public ConsultaGuia() {}
/*    */ 
            
/*    */   
/*    */   public ConsultaGuia(String Cod_Regional, String Cod_FormaPago, String Cons_GuiasU) {
/* 30 */     this.Cod_Regional = Cod_Regional;
/* 31 */     this.Cod_FormaPago = Cod_FormaPago;
/* 32 */     this.Cons_GuiasU = Cons_GuiasU;
/*    */   }
/*    */   
/*    */

  
 public String getCod_Regional() {
/* 36 */     return this.Cod_Regional;
/*    */   }
/*    */   
/*    */   public String getCod_FormaPago() {
/* 40 */     return this.Cod_FormaPago;
/*    */   }
/*    */   
/*    */   public String getCons_GuiasU() {
/* 44 */     return this.Cons_GuiasU;
/*    */   }
/*    */   
/*    */   public void setCod_Regional(String Cod_Regional) {
/* 48 */     this.Cod_Regional = Cod_Regional;
/*    */   }
/*    */   
/*    */   public void setCod_FormaPago(String Cod_FormaPago) {
/* 52 */     this.Cod_FormaPago = Cod_FormaPago;
/*    */   }
/*    */   
/*    */   public void setCons_GuiasU(String Cons_GuiasU) {
/* 56 */     this.Cons_GuiasU = Cons_GuiasU;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public String getFecinicial() {
        return fecinicial;
   }

    public void setFecinicial(String fecinicial) {
        this.fecinicial = fecinicial;
    }

    public String getFecfinal() {
        return fecfinal;
    }

/*    */
/*    */
    public void setFecfinal(String fecfinal) {
        this.fecfinal = fecfinal;
    }

/*    */
/*    */   
/*    */
/*    */
/*    */
/*    */
/*    */
    /*    */
/*    */
    public ConsultaGuia(String fecinicial, String fecfinal) {
        this.fecinicial = fecinicial;
        this.fecfinal = fecfinal;
    }
/*    */
/*    */
/*    */
/*    */

/*    */
/*    */
/*    */
/*    */
/*    */
/*    */
/*    */
/*    */
    public ResultSet ConsDatosGuia(String Guia) {
        /*    */     try {
            /* 69 */       this.conexion = new ConexionDB();
            /* 70 */       this.conReestGuias = this.conexion.getConexion();
            /* 71 */       Statement declaracion = this.conReestGuias.createStatement();
            /* 72 */       this.resGuias = declaracion.executeQuery("SELECT b.Nom_Sigla, T0200014_1.Cod_Regional,T0400009.Cod_Regional, T0400009.Cod_FormaPago, T0400009.Cons_GuiasU,T0400009.fec_Captura , \nT0400009.Nom_Remitente , T0400009.Dir_Remitente , T0400009.Tel_Remitente , T0400009.ced_Remitente , T0400009.Cod_Regional_Cta,\nT0400009.cod_oficina_cta , T0400009.cod_cuenta , T0400009.nom_destinatario, T0400009.dir_destinatario ,T0400009.tel_destinatario, \nT0400009.ced_destinatario , T0400009.texto_Guia , T0400009.Accion_notaguia,T0400009.dice_contener , T0400009.num_unidades, T0400009.pesoreal_k , \nT0400009.pesovolumen_k , T0400009.k_cobrados , T0400009.valor_declarado , T0200014.nom_ciudad , T0200014_1.Nom_ciudad  , d.nom_departamento , e.Nom_Regional,T0400009.valor_producto,T0400009.num_documentos,T0400009.valor_flete ,T0400009.valor_costom ,T0400009.valor_otros ,T0400009.con_cartaporte \nFROM  T0200014 AS  T0200014_1 INNER JOIN ( T0400009 INNER JOIN  T0200014 ON  T0400009.Cod_CiudadR =  T0200014.Cod_Ciudad) ON  T0200014_1.Cod_Ciudad =  T0400009.Cod_CiudadD \njoin  T0200002 b on T0400009.cod_servicio=b.Cod_servicio\njoin T0200015 d on T0200014_1.Cod_Departamento=d.Cod_Departamento\njoin T0200001 e on e.Cod_Regional=T0200014_1.Cod_Regional\nWHERE ((( T0400009.Cod_Regional)=1) AND (( T0400009.Cod_FormaPago)=1) AND (( T0400009.Cons_GuiasU)=1))" + Guia +" order by T0400009.Cod_Regional,cons_guiasu asc");
            /*    */
            /*    */
            /*    */
            /*    */
            /*    */
            /*    */
            /*    */
            /*    */
            /*    */
            /*    */
            /*    */
            /*    */
            /*    */
            /*    */
        /*    */     }
        /* 88 */     catch (SQLException e) {
            /* 89 */       e.printStackTrace();
        /*    */     }
        /*    */
        /* 92 */     return this.resGuias;
        /*    */
    }
 public String mostrarDatos() {
/* 98 */     return getCod_Regional() + " " + getCod_FormaPago() + " " + getCons_GuiasU();
/*    */   }
 
  public String mostrarDatos1() {
/* 98 */     return getFecinicial() + " " + getFecfinal();
/*    */   }
/*    */ }


/* Location:              C:\Users\JORGE\Desktop\CoordTecno.jar!\Conexion\ConsultaGuia.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */