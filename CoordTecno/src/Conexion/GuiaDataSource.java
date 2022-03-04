/*     */ package Conexion;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import net.sf.jasperreports.engine.JRDataSource;
/*     */ import net.sf.jasperreports.engine.JRException;
/*     */ import net.sf.jasperreports.engine.JRField;
/*     */ 
/*     */ public class GuiaDataSource
/*     */   implements JRDataSource
/*     */ {
/*  12 */   private List<Guia> guias = new ArrayList<>();
/*     */   
/*  14 */   private int indiceGuiaActual = -1;
/*     */ 
/*     */ 
/*     */   
/*     */   public Object getFieldValue(JRField campo) {
/*  19 */     Object valor = null;
/*     */     
/*  21 */     if ("Nom_Sigla".equals(campo.getName())) {
/*  22 */       valor = ((Guia)this.guias.get(this.indiceGuiaActual)).getNom_Sigla();
/*     */     }
/*     */     
/*  25 */     if ("Cod_Regional_PRP".equals(campo.getName())) {
/*  26 */       valor = ((Guia)this.guias.get(this.indiceGuiaActual)).getCod_Regional_PRP();
/*     */     }
/*     */     
/*  29 */     if ("Cod_Regional".equals(campo.getName())) {
/*  30 */       valor = ((Guia)this.guias.get(this.indiceGuiaActual)).getCod_Regional();
/*     */     }
/*     */     
/*  33 */     if ("Cod_FormaPago".equals(campo.getName())) {
/*  34 */       valor = Integer.valueOf(((Guia)this.guias.get(this.indiceGuiaActual)).getCod_FormaPago());
/*     */     }
/*     */     
/*  37 */     if ("Cons_GuiasU".equals(campo.getName())) {
/*  38 */       valor = ((Guia)this.guias.get(this.indiceGuiaActual)).getCons_GuiasU();
/*     */     }
/*     */     
/*  41 */     if ("fec_Captura".equals(campo.getName())) {
/*  42 */       valor = ((Guia)this.guias.get(this.indiceGuiaActual)).getFec_Captura();
/*     */     }
/*     */     
/*  45 */     if ("Nom_Remitente".equals(campo.getName())) {
/*  46 */       valor = ((Guia)this.guias.get(this.indiceGuiaActual)).getNom_Remitente();
/*     */     }
/*     */     
/*  49 */     if ("Dir_Remitente".equals(campo.getName())) {
/*  50 */       valor = ((Guia)this.guias.get(this.indiceGuiaActual)).getDir_Remitente();
/*     */     }
/*     */     
/*  53 */     if ("Tel_Remitente".equals(campo.getName())) {
/*  54 */       valor = ((Guia)this.guias.get(this.indiceGuiaActual)).getTel_Remitente();
/*     */     }
/*     */     
/*  57 */     if ("ced_Remitente".equals(campo.getName())) {
/*  58 */       valor = ((Guia)this.guias.get(this.indiceGuiaActual)).getCed_Remitente();
/*     */     }
/*     */     
/*  61 */     if ("Cod_Regional_Cta".equals(campo.getName())) {
/*  62 */       valor = ((Guia)this.guias.get(this.indiceGuiaActual)).getCod_Regional_Cta();
/*     */     }
/*  64 */     if ("cod_oficina_cta".equals(campo.getName())) {
/*  65 */       valor = ((Guia)this.guias.get(this.indiceGuiaActual)).getCod_oficina_cta();
/*     */     }
/*  67 */     if ("cod_cuenta".equals(campo.getName())) {
/*  68 */       valor = ((Guia)this.guias.get(this.indiceGuiaActual)).getCod_cuenta();
/*     */     }
/*     */     
/*  71 */     if ("nom_destinatario".equals(campo.getName())) {
/*  72 */       valor = ((Guia)this.guias.get(this.indiceGuiaActual)).getNom_destinatario();
/*     */     }
/*     */     
/*  75 */     if ("dir_destinatario".equals(campo.getName())) {
/*  76 */       valor = ((Guia)this.guias.get(this.indiceGuiaActual)).getDir_destinatario();
/*     */     }
/*     */     
/*  79 */     if ("tel_destinatario".equals(campo.getName())) {
/*  80 */       valor = ((Guia)this.guias.get(this.indiceGuiaActual)).getTel_destinatario();
/*     */     }
/*     */     
/*  83 */     if ("ced_destinatario".equals(campo.getName())) {
/*  84 */       valor = ((Guia)this.guias.get(this.indiceGuiaActual)).getCed_destinatario();
/*     */     }
/*     */     
/*  87 */     if ("texto_Guia".equals(campo.getName())) {
/*  88 */       valor = ((Guia)this.guias.get(this.indiceGuiaActual)).getTexto_Guia();
/*     */     }
/*     */     
/*  91 */     if ("Accion_notaguia".equals(campo.getName())) {
/*  92 */       valor = ((Guia)this.guias.get(this.indiceGuiaActual)).getAccion_notaguia();
/*     */     }
/*     */     
/*  95 */     if ("dice_contener".equals(campo.getName())) {
/*  96 */       valor = ((Guia)this.guias.get(this.indiceGuiaActual)).getDice_contener();
/*     */     }
/*     */     
/*  99 */     if ("num_unidades".equals(campo.getName())) {
/* 100 */       valor = ((Guia)this.guias.get(this.indiceGuiaActual)).getNum_unidades();
/*     */     }
/*     */     
/* 103 */     if ("pesoreal_k".equals(campo.getName())) {
/* 104 */       valor = ((Guia)this.guias.get(this.indiceGuiaActual)).getPesoreal_k();
/*     */     }
/*     */     
/* 107 */     if ("pesovolumen_k".equals(campo.getName())) {
/* 108 */       valor = ((Guia)this.guias.get(this.indiceGuiaActual)).getPesovolumen_k();
/*     */     }
/* 110 */     if ("k_cobrados".equals(campo.getName())) {
/* 111 */       valor = ((Guia)this.guias.get(this.indiceGuiaActual)).getK_cobrados();
/*     */     }
/* 113 */     if ("valor_declarado".equals(campo.getName())) {
/* 114 */       valor = Double.valueOf(((Guia)this.guias.get(this.indiceGuiaActual)).getValor_declarado());
/*     */     }
/*     */     
/* 117 */     if ("nom_ciudad".equals(campo.getName())) {
/* 118 */       valor = ((Guia)this.guias.get(this.indiceGuiaActual)).getNom_ciudad();
/*     */     }
/*     */     
/* 121 */     if ("Nom_ciud".equals(campo.getName())) {
/* 122 */       valor = ((Guia)this.guias.get(this.indiceGuiaActual)).getNom_ciud();
/*     */     }
/* 124 */     if ("nom_departamento".equals(campo.getName())) {
/* 125 */       valor = ((Guia)this.guias.get(this.indiceGuiaActual)).getNom_departamento();
/*     */     }
/* 127 */     if ("Nom_Regional".equals(campo.getName())) {
/* 128 */       valor = ((Guia)this.guias.get(this.indiceGuiaActual)).getNom_Regional();
/*     */     }
              if ("valor_producto".equals(campo.getName())) {
/* 114 */       valor = ((Guia)this.guias.get(this.indiceGuiaActual)).getValor_producto();
/*     */     }
              if ("num_documentos".equals(campo.getName())) {
/* 128 */       valor = ((Guia)this.guias.get(this.indiceGuiaActual)).getNum_documentos();
/*     */     }
              if ("valor_flete".equals(campo.getName())) {
/* 114 */       valor = Double.valueOf(((Guia)this.guias.get(this.indiceGuiaActual)).getValor_flete());
/*     */     }

              if ("valor_costom".equals(campo.getName())) {
/* 114 */       valor = Double.valueOf(((Guia)this.guias.get(this.indiceGuiaActual)).getValor_costom());
/*     */     }
              if ("valor_otros".equals(campo.getName())) {
/* 114 */       valor = Double.valueOf(((Guia)this.guias.get(this.indiceGuiaActual)).getValor_otros());
/*     */     }
              if ("con_cartaporte".equals(campo.getName())) {
/* 114 */       valor = ((Guia)this.guias.get(this.indiceGuiaActual)).getCon_cartaporte();
/*     */     }
/*     */     
/* 131 */     return valor;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void addGuia(Guia guia) {
/* 137 */     this.guias.add(guia);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean next() throws JRException {
/* 143 */     return (++this.indiceGuiaActual < this.guias.size());
/*     */   }
/*     */ }


/* Location:              C:\Users\JORGE\Desktop\CoordTecno.jar!\Conexion\GuiaDataSource.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */