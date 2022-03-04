/*     */ package Conexion;
/*     */ 
import java.sql.ResultSet;
/*     */ import java.util.ArrayList;
import javax.swing.JOptionPane;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Guia
/*     */ {
/*     */   private String Nom_Sigla;
/*     */   private String Cod_Regional_PRP;
/*     */   private String Cod_Regional;
/*     */   private int Cod_FormaPago;
/*     */   private String Cons_GuiasU;
/*     */   private String fec_Captura;
/*     */   private String Nom_Remitente;
/*     */   private String Dir_Remitente;
/*     */   private String Tel_Remitente;
/*     */   private String ced_Remitente;
/*     */   private String Cod_Regional_Cta;
/*     */   private String cod_oficina_cta;
/*     */   private String cod_cuenta;
/*     */   private String nom_destinatario;
/*     */   private String dir_destinatario;
/*     */   private String tel_destinatario;
/*     */   private String ced_destinatario;
/*     */   private String texto_Guia;
/*     */   private String Accion_notaguia;
/*     */   private String dice_contener;
/*     */   private String num_unidades;
/*     */   private String pesoreal_k;
/*     */   private String pesovolumen_k;
/*     */   private String k_cobrados;
/*     */   private double valor_declarado;
/*     */   private String nom_ciudad;
/*     */   private String Nom_ciud;
/*     */   private String nom_departamento;
/*     */   private String Nom_Regional;
/*     */   private String valor_producto;
            private String num_documentos;
            private double valor_flete;
            private double valor_costom;
            private double valor_otros;
            private String con_cartaporte;
/*     */   
/*     */   public Guia(String Nom_Sigla, String Cod_Regional_PRP, String Cod_Regional, int Cod_FormaPago, String Cons_GuiasU, String fec_Captura, String Nom_Remitente, String Dir_Remitente, String Tel_Remitente, String ced_Remitente, String Cod_Regional_Cta, String cod_oficina_cta, String cod_cuenta, String nom_destinatario, String dir_destinatario, String tel_destinatario, String ced_destinatario, String texto_Guia, String Accion_notaguia, String dice_contener, String num_unidades, String pesoreal_k, String pesovolumen_k, String k_cobrados, double valor_declarado, String nom_ciudad, String Nom_ciud, String nom_departamento, String Nom_Regional, String valor_producto, String num_documentos,double valor_flete, double valor_costom, double valor_otros, String con_cartaporte) {
/*  41 */     this.Nom_Sigla = Nom_Sigla;
/*  42 */     this.Cod_Regional_PRP = Cod_Regional_PRP;
/*  43 */     this.Cod_Regional = Cod_Regional;
/*  44 */     this.Cod_FormaPago = Cod_FormaPago;
/*  45 */     this.Cons_GuiasU = Cons_GuiasU;
/*  46 */     this.fec_Captura = fec_Captura;
/*  47 */     this.Nom_Remitente = Nom_Remitente;
/*  48 */     this.Dir_Remitente = Dir_Remitente;
/*  49 */     this.Tel_Remitente = Tel_Remitente;
/*  50 */     this.ced_Remitente = ced_Remitente;
/*  51 */     this.Cod_Regional_Cta = Cod_Regional_Cta;
/*  52 */     this.cod_oficina_cta = cod_oficina_cta;
/*  53 */     this.cod_cuenta = cod_cuenta;
/*  54 */     this.nom_destinatario = nom_destinatario;
/*  55 */     this.dir_destinatario = dir_destinatario;
/*  56 */     this.tel_destinatario = tel_destinatario;
/*  57 */     this.ced_destinatario = ced_destinatario;
/*  58 */     this.texto_Guia = texto_Guia;
/*  59 */     this.Accion_notaguia = Accion_notaguia;
/*  60 */     this.dice_contener = dice_contener;
/*  61 */     this.num_unidades = num_unidades;
/*  62 */     this.pesoreal_k = pesoreal_k;
/*  63 */     this.pesovolumen_k = pesovolumen_k;
/*  64 */     this.k_cobrados = k_cobrados;
/*  65 */     this.valor_declarado = valor_declarado;
/*  66 */     this.nom_ciudad = nom_ciudad;
/*  67 */     this.Nom_ciud = Nom_ciud;
/*  68 */     this.nom_departamento = nom_departamento;
/*  69 */     this.Nom_Regional = Nom_Regional;
              this.valor_producto = valor_producto;
              this.num_documentos = num_documentos;
              this.valor_flete = valor_flete; 
              this.valor_costom = valor_costom; 
              this.valor_otros = valor_otros; 
              this.con_cartaporte = con_cartaporte;
/*     */   }


/*     */
    public String getNom_Sigla() {
        /*  73 */     return this.Nom_Sigla;
        /*     */
    }
 public String getCod_Regional_PRP() {
/*  77 */     return this.Cod_Regional_PRP;
/*     */   }
/*     */   
/*     */   public String getCod_Regional() {
/*  81 */     return this.Cod_Regional;
/*     */   }
/*     */   
/*     */   public int getCod_FormaPago() {
/*  85 */     return this.Cod_FormaPago;
/*     */   }
/*     */   
/*     */   public String getCons_GuiasU() {
/*  89 */     return this.Cons_GuiasU;
/*     */   }
/*     */   
/*     */   public String getFec_Captura() {
/*  93 */     return this.fec_Captura;
/*     */   }
/*     */   
/*     */   public String getNom_Remitente() {
/*  97 */     return this.Nom_Remitente;
/*     */   }
/*     */   
/*     */   public String getDir_Remitente() {
/* 101 */     return this.Dir_Remitente;
/*     */   }
/*     */   
/*     */   public String getTel_Remitente() {
/* 105 */     return this.Tel_Remitente;
/*     */   }
/*     */   
/*     */   public String getCed_Remitente() {
/* 109 */     return this.ced_Remitente;
/*     */   }
/*     */   
/*     */   public String getCod_Regional_Cta() {
/* 113 */     return this.Cod_Regional_Cta;
/*     */   }
/*     */   
/*     */   public String getCod_oficina_cta() {
/* 117 */     return this.cod_oficina_cta;
/*     */   }
/*     */   
/*     */   public String getCod_cuenta() {
/* 121 */     return this.cod_cuenta;
/*     */   }
/*     */   
/*     */   public String getNom_destinatario() {
/* 125 */     return this.nom_destinatario;
/*     */   }
/*     */   
/*     */   public String getDir_destinatario() {
/* 129 */     return this.dir_destinatario;
/*     */   }
/*     */   
/*     */   public String getTel_destinatario() {
/* 133 */     return this.tel_destinatario;
/*     */   }
/*     */   
/*     */   public String getCed_destinatario() {
/* 137 */     return this.ced_destinatario;
/*     */   }
/*     */   
/*     */   public String getTexto_Guia() {
/* 141 */     return this.texto_Guia;
/*     */   }
/*     */   
/*     */   public String getAccion_notaguia() {
/* 145 */     return this.Accion_notaguia;
/*     */   }
/*     */   
/*     */   public String getDice_contener() {
/* 149 */     return this.dice_contener;
/*     */   }
/*     */   
/*     */   public String getNum_unidades() {
/* 153 */     return this.num_unidades;
/*     */   }
/*     */   
/*     */   public String getPesoreal_k() {
/* 157 */     return this.pesoreal_k;
/*     */   }
/*     */   
/*     */   public String getPesovolumen_k() {
/* 161 */     return this.pesovolumen_k;
/*     */   }
/*     */   
/*     */   public String getK_cobrados() {
/* 165 */     return this.k_cobrados;
/*     */   }
/*     */   
/*     */   public double getValor_declarado() {
/* 169 */     this.valor_declarado = (Math.round(this.valor_declarado * 1.0D) / 1L);
/* 170 */     return this.valor_declarado;
/*     */   }
/*     */   
/*     */   public String getNom_ciudad() {
/* 174 */     return this.nom_ciudad;
/*     */   }
/*     */   
/*     */   public String getNom_ciud() {
/* 178 */     return this.Nom_ciud;
/*     */   }
/*     */   
/*     */   public String getNom_departamento() {
/* 182 */     return this.nom_departamento;
/*     */   }
/*     */   
/*     */   public String getNom_Regional() {
/* 186 */     return this.Nom_Regional;
/*     */   }
/*     */   
/*     */   public void setNom_Sigla(String Nom_Sigla) {
/* 190 */     this.Nom_Sigla = Nom_Sigla;
/*     */   }
/*     */   
/*     */   public void setCod_Regional_PRP(String Cod_Regional_PRP) {
/* 194 */     this.Cod_Regional_PRP = Cod_Regional_PRP;
/*     */   }
/*     */   
/*     */   public void setCod_Regional(String Cod_Regional) {
/* 198 */     this.Cod_Regional = Cod_Regional;
/*     */   }
/*     */   
/*     */   public void setCod_FormaPago(int Cod_FormaPago) {
/* 202 */     this.Cod_FormaPago = Cod_FormaPago;
/*     */   }
/*     */   
/*     */   public void setCons_GuiasU(String Cons_GuiasU) {
/* 206 */     this.Cons_GuiasU = Cons_GuiasU;
/*     */   }
/*     */   
/*     */   public void setFec_Captura(String fec_Captura) {
/* 210 */     this.fec_Captura = fec_Captura;
/*     */   }
/*     */   
/*     */   public void setNom_Remitente(String Nom_Remitente) {
/* 214 */     this.Nom_Remitente = Nom_Remitente;
/*     */   }
/*     */   
/*     */   public void setDir_Remitente(String Dir_Remitente) {
/* 218 */     this.Dir_Remitente = Dir_Remitente;
/*     */   }
/*     */   
/*     */   public void setTel_Remitente(String Tel_Remitente) {
/* 222 */     this.Tel_Remitente = Tel_Remitente;
/*     */   }
/*     */   
/*     */   public void setCed_Remitente(String ced_Remitente) {
/* 226 */     this.ced_Remitente = ced_Remitente;
/*     */   }
/*     */   
/*     */   public void setCod_Regional_Cta(String Cod_Regional_Cta) {
/* 230 */     this.Cod_Regional_Cta = Cod_Regional_Cta;
/*     */   }
/*     */   
/*     */   public void setCod_oficina_cta(String cod_oficina_cta) {
/* 234 */     this.cod_oficina_cta = cod_oficina_cta;
/*     */   }
/*     */   
/*     */   public void setCod_cuenta(String cod_cuenta) {
/* 238 */     this.cod_cuenta = cod_cuenta;
/*     */   }
/*     */   
/*     */   public void setNom_destinatario(String nom_destinatario) {
/* 242 */     this.nom_destinatario = nom_destinatario;
/*     */   }
/*     */   
/*     */   public void setDir_destinatario(String dir_destinatario) {
/* 246 */     this.dir_destinatario = dir_destinatario;
/*     */   }
/*     */   
/*     */   public void setTel_destinatario(String tel_destinatario) {
/* 250 */     this.tel_destinatario = tel_destinatario;
/*     */   }
/*     */   
/*     */   public void setCed_destinatario(String ced_destinatario) {
/* 254 */     this.ced_destinatario = ced_destinatario;
/*     */   }
/*     */   
/*     */   public void setTexto_Guia(String texto_Guia) {
/* 258 */     this.texto_Guia = texto_Guia;
/*     */   }
/*     */   
/*     */   public void setAccion_notaguia(String Accion_notaguia) {
/* 262 */     this.Accion_notaguia = Accion_notaguia;
/*     */   }
/*     */   
/*     */   public void setDice_contener(String dice_contener) {
/* 266 */     this.dice_contener = dice_contener;
/*     */   }
/*     */   
/*     */   public void setNum_unidades(String num_unidades) {
/* 270 */     this.num_unidades = num_unidades;
/*     */   }
/*     */   
/*     */   public void setPesoreal_k(String pesoreal_k) {
/* 274 */     this.pesoreal_k = pesoreal_k;
/*     */   }
/*     */   
/*     */   public void setPesovolumen_k(String pesovolumen_k) {
/* 278 */     this.pesovolumen_k = pesovolumen_k;
/*     */   }
/*     */   
/*     */   public void setK_cobrados(String k_cobrados) {
/* 282 */     this.k_cobrados = k_cobrados;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setValor_declarado(double valor_declarado) {
/* 287 */     this.valor_declarado = valor_declarado;
/*     */   }
/*     */   
/*     */   public void setNom_ciudad(String nom_ciudad) {
/* 291 */     this.nom_ciudad = nom_ciudad;
/*     */   }
/*     */   
/*     */   public void setNom_ciud(String Nom_ciud) {
/* 295 */     this.Nom_ciud = Nom_ciud;
/*     */   }
/*     */   
/*     */   public void setNom_departamento(String nom_departamento) {
/* 299 */     this.nom_departamento = nom_departamento;
/*     */   }
/*     */   
/*     */   public void setNom_Regional(String Nom_Regional) {
/* 303 */     this.Nom_Regional = Nom_Regional;
/*     */   }
            
/*     */   
/*     */

    public String getValor_producto() {
        return valor_producto;
    }

    public void setValor_producto(String valor_producto) {
        this.valor_producto = valor_producto;
    }
    
    /*     */      public String getNum_documentos() {
     return num_documentos;
   }
/*     */   
/*     */  

/*     */
    public void setNum_documentos(String num_documentos) {
        this.num_documentos = num_documentos;
    }

    public double getValor_flete() {
        return valor_flete;
    }

    public void setValor_flete(double valor_flete) {
        this.valor_flete = valor_flete;
    }

    public double getValor_costom() {
        return valor_costom;
    }

    public void setValor_costom(double valor_costom) {
        this.valor_costom = valor_costom;
    }

    public double getValor_otros() {
        return valor_otros;
    }

    public void setValor_otros(double valor_otros) {
        this.valor_otros = valor_otros;
    }

    public String getCon_cartaporte() {
        return con_cartaporte;
    }

    public void setCon_cartaporte(String con_cartaporte) {
        this.con_cartaporte = con_cartaporte;
    }
    
    
    
 public ArrayList leerDatos() {
/* 307 */     ArrayList<Guia> listaLeida = new ArrayList<>();
/*     */     
/* 309 */     for (Guia g : listaLeida) {
/* 310 */       g = new Guia(this.Nom_Sigla, this.Cod_Regional_PRP, this.Cod_Regional, this.Cod_FormaPago, this.Cons_GuiasU, this.fec_Captura, this.Nom_Remitente, this.Dir_Remitente, this.Tel_Remitente, this.ced_Remitente, this.Cod_Regional_Cta, this.cod_oficina_cta, this.cod_cuenta, this.nom_destinatario, this.dir_destinatario, this.tel_destinatario, this.ced_destinatario, this.texto_Guia, this.Accion_notaguia, this.dice_contener, this.num_unidades, this.pesoreal_k, this.pesovolumen_k, this.k_cobrados, this.valor_declarado, this.nom_ciudad, this.Nom_ciud, this.nom_departamento, this.Nom_Regional,this.valor_producto,this.num_documentos,this.valor_flete,this.valor_costom, this.valor_otros ,this.con_cartaporte  );
/*     */     }
/* 312 */     return listaLeida;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String mostrarDatos() {
/* 318 */     return getNom_Sigla() + "\t" + getCod_Regional_PRP() + "\t" + getCod_Regional() + "\t" + getCod_FormaPago() + "\t" + getCons_GuiasU() + "\t" + getFec_Captura() + "\t" + getNom_Remitente() + "\t" + getDir_Remitente() + "\t" + getTel_Remitente() + "\t" + getCed_Remitente() + "\t" + getCod_Regional_Cta() + "\t" + getCod_oficina_cta() + "\t" + getCod_cuenta() + "\t" + getNom_destinatario() + "\t" + getDir_destinatario() + "\t" + getTel_destinatario() + "\t" + getCed_destinatario() + "\t" + getTexto_Guia() + "\t" + getAccion_notaguia() + "\t" + getDice_contener() + "\t" + getNum_unidades() + "\t" + getPesoreal_k() + "\t" + getPesovolumen_k() + "\t" + getK_cobrados() + "\t" + getValor_declarado() + "\t" + getNom_ciudad() + "\t" + getNom_ciud() + "\t" + getNom_departamento() + "\t" + getNom_Regional() + "\t"+getValor_producto() +"\t"+getNum_documentos() +"\t"+getValor_flete() +"\t"+getValor_costom() +"\t"+getValor_otros() +"\t"+getCon_cartaporte();
/*     */   }
/*     */ }


/* Location:              C:\Users\JORGE\Desktop\CoordTecno.jar!\Conexion\Guia.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */