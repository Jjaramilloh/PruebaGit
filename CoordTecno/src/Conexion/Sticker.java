/*     */ package Conexion;
/*     */ 
/*     */ public class Sticker
/*     */ {
/*     */   private String cod_regional;
/*     */   private int cod_formapago;
/*     */   private String cons_guiasu;
/*     */   private String nom_remitente;
/*     */   private String nom_destinatario;
/*     */   private String dir_destinatario;
/*     */   private String nom_ciudad;
/*     */   private String nom_departamento;
/*     */   private int unidad;
/*     */   private int num_unidades;
/*     */   private String texto_guia;
/*     */   private String dice_contener;
/*     */   
/*     */   public String getCod_regional() {
/*  19 */     return this.cod_regional;
/*     */   }
/*     */   
/*     */   public void setCod_regional(String cod_regional) {
/*  23 */     this.cod_regional = cod_regional;
/*     */   }
/*     */   
/*     */   public int getCod_formapago() {
/*  27 */     return this.cod_formapago;
/*     */   }
/*     */   
/*     */   public void setCod_formapago(int cod_formapago) {
/*  31 */     this.cod_formapago = cod_formapago;
/*     */   }
/*     */   
/*     */   public String getCons_guiasu() {
/*  35 */     return this.cons_guiasu;
/*     */   }
/*     */   
/*     */   public void setCons_guiasu(String cons_guiasu) {
/*  39 */     this.cons_guiasu = cons_guiasu;
/*     */   }
/*     */   
/*     */   public String getNom_remitente() {
/*  43 */     return this.nom_remitente;
/*     */   }
/*     */   
/*     */   public void setNom_remitente(String nom_remitente) {
/*  47 */     this.nom_remitente = nom_remitente;
/*     */   }
/*     */   
/*     */   public String getNom_destinatario() {
/*  51 */     return this.nom_destinatario;
/*     */   }
/*     */   
/*     */   public void setNom_destinatario(String nom_destinatario) {
/*  55 */     this.nom_destinatario = nom_destinatario;
/*     */   }
/*     */   
/*     */   public String getDir_destinatario() {
/*  59 */     return this.dir_destinatario;
/*     */   }
/*     */   
/*     */   public void setDir_destinatario(String dir_destinatario) {
/*  63 */     this.dir_destinatario = dir_destinatario;
/*     */   }
/*     */   
/*     */   public String getNom_ciudad() {
/*  67 */     return this.nom_ciudad;
/*     */   }
/*     */   
/*     */   public void setNom_ciudad(String nom_ciudad) {
/*  71 */     this.nom_ciudad = nom_ciudad;
/*     */   }
/*     */   
/*     */   public String getNom_departamento() {
/*  75 */     return this.nom_departamento;
/*     */   }
/*     */   
/*     */   public void setNom_departamento(String nom_departamento) {
/*  79 */     this.nom_departamento = nom_departamento;
/*     */   }
/*     */   
/*     */   public int getNum_unidades() {
/*  83 */     return this.num_unidades;
/*     */   }
/*     */   
/*     */   public void setNum_unidades(int num_unidades) {
/*  87 */     this.num_unidades = num_unidades;
/*     */   }
/*     */   public int getUnidad() {
/*  90 */     return this.unidad;
/*     */   }
/*     */   
/*     */   public void setUnidad(int unidad) {
/*  94 */     this.unidad = unidad;
/*     */   }
/*     */   
/*     */   public String getTexto_guia() {
/*  98 */     return this.texto_guia;
/*     */   }
/*     */   
/*     */   public void setTexto_guia(String texto_guia) {
/* 102 */     this.texto_guia = texto_guia;
/*     */   }
/*     */   
/*     */   public String getDice_contener() {
/* 106 */     return this.dice_contener;
/*     */   }
/*     */   
/*     */   public void setDice_contener(String dice_contener) {
/* 110 */     this.dice_contener = dice_contener;
/*     */   }
/*     */ 
/*     */   
/*     */   public Sticker(String cod_regional, int cod_formapago, String cons_guiasu, String nom_remitente, String nom_destinatario, String dir_destinatario, String nom_ciudad, String nom_departamento, int unidad, int num_unidades, String texto_guia, String dice_contener) {
/* 115 */     this.cod_regional = cod_regional;
/* 116 */     this.cod_formapago = cod_formapago;
/* 117 */     this.cons_guiasu = cons_guiasu;
/* 118 */     this.nom_remitente = nom_remitente;
/* 119 */     this.nom_destinatario = nom_destinatario;
/* 120 */     this.dir_destinatario = dir_destinatario;
/* 121 */     this.nom_ciudad = nom_ciudad;
/* 122 */     this.nom_departamento = nom_departamento;
/* 123 */     this.unidad = unidad;
/* 124 */     this.num_unidades = num_unidades;
/* 125 */     this.texto_guia = texto_guia;
/* 126 */     this.dice_contener = dice_contener;
/*     */   }
/*     */ }


/* Location:              C:\Users\JORGE\Desktop\CoordTecno.jar!\Conexion\Sticker.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */