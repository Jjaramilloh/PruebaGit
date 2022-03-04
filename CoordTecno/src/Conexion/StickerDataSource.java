/*    */ package Conexion;
/*    */ 
/*    */ import java.util.ArrayList;
/*    */ import java.util.List;
/*    */ import net.sf.jasperreports.engine.JRDataSource;
/*    */ import net.sf.jasperreports.engine.JRException;
/*    */ import net.sf.jasperreports.engine.JRField;
/*    */ 
/*    */ public class StickerDataSource
/*    */   implements JRDataSource
/*    */ {
/* 12 */   private List<Sticker> Stickers = new ArrayList<>();
/*    */   
/* 14 */   private int indiceStickerActual = -1;
/*    */ 
/*    */ 
/*    */   
/*    */   public Object getFieldValue(JRField campo) {
/* 19 */     Object valor = null;
/*    */     
/* 21 */     if ("Cod_Regional".equals(campo.getName())) {
/* 22 */       valor = ((Sticker)this.Stickers.get(this.indiceStickerActual)).getCod_regional();
/*    */     }
/*    */     
/* 25 */     if ("Cod_FormaPago".equals(campo.getName())) {
/* 26 */       valor = Integer.valueOf(((Sticker)this.Stickers.get(this.indiceStickerActual)).getCod_formapago());
/*    */     }
/*    */     
/* 29 */     if ("Cons_GuiasU".equals(campo.getName())) {
/* 30 */       valor = ((Sticker)this.Stickers.get(this.indiceStickerActual)).getCons_guiasu();
/*    */     }
/*    */     
/* 33 */     if ("Nom_Remitente".equals(campo.getName())) {
/* 34 */       valor = ((Sticker)this.Stickers.get(this.indiceStickerActual)).getNom_remitente();
/*    */     }
/*    */     
/* 37 */     if ("Nom_Destinatario".equals(campo.getName())) {
/* 38 */       valor = ((Sticker)this.Stickers.get(this.indiceStickerActual)).getNom_destinatario();
/*    */     }
/*    */     
/* 41 */     if ("Dir_Destinatario".equals(campo.getName())) {
/* 42 */       valor = ((Sticker)this.Stickers.get(this.indiceStickerActual)).getDir_destinatario();
/*    */     }
/*    */     
/* 45 */     if ("Nom_Ciudad".equals(campo.getName())) {
/* 46 */       valor = ((Sticker)this.Stickers.get(this.indiceStickerActual)).getNom_ciudad();
/*    */     }
/*    */     
/* 49 */     if ("Nom_Departamento".equals(campo.getName())) {
/* 50 */       valor = ((Sticker)this.Stickers.get(this.indiceStickerActual)).getNom_departamento();
/*    */     }
/*    */     
/* 53 */     if ("Unidad".equals(campo.getName())) {
/* 54 */       valor = Integer.valueOf(((Sticker)this.Stickers.get(this.indiceStickerActual)).getUnidad());
/*    */     }
/*    */     
/* 57 */     if ("Num_Unidades".equals(campo.getName())) {
/* 58 */       valor = Integer.valueOf(((Sticker)this.Stickers.get(this.indiceStickerActual)).getNum_unidades());
/*    */     }
/*    */     
/* 61 */     if ("Texto_Guia".equals(campo.getName())) {
/* 62 */       valor = ((Sticker)this.Stickers.get(this.indiceStickerActual)).getTexto_guia();
/*    */     }
/* 64 */     if ("Dice_Contener".equals(campo.getName())) {
/* 65 */       valor = ((Sticker)this.Stickers.get(this.indiceStickerActual)).getDice_contener();
/*    */     }
/* 67 */     return valor;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void addSticker(Sticker sticker) {
/* 73 */     this.Stickers.add(sticker);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean next() throws JRException {
/* 79 */     return (++this.indiceStickerActual < this.Stickers.size());
/*    */   }
/*    */ }


/* Location:              C:\Users\JORGE\Desktop\CoordTecno.jar!\Conexion\StickerDataSource.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */