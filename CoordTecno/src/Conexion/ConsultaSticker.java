/*    */ package Conexion;
/*    */ 
/*    */ import java.sql.Connection;
/*    */ import java.sql.ResultSet;
/*    */ import java.sql.SQLException;
/*    */ import java.sql.Statement;
/*    */ 
/*    */ public class ConsultaSticker
/*    */ {
/*    */   ConexionDB conexion;
/* 11 */   Connection conexion_sticker = null;
/*    */ 
/*    */ 
/*    */   
/*    */   ResultSet resGuias;
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public ResultSet ConsRangoGuias(int pago, int cons_inicial, int cons_final) {
/*    */     try {
/* 22 */       this.conexion = new ConexionDB();
/* 23 */       this.conexion_sticker = this.conexion.getConexion();
/* 24 */       Statement declaracion = this.conexion_sticker.createStatement();
/* 25 */       this.resGuias = declaracion.executeQuery("SELECT T0400009.Cod_Regional, T0400009.Cod_FormaPago, T0400009.Cons_GuiasU, T0400009.Nom_Remitente, T0400009.Nom_Destinatario, T0400009.Dir_Destinatario, T0200014.Nom_Ciudad, T0200015.Nom_Departamento, T0400009.Num_Unidades, T0400009.Texto_Guia, T0400009.Dice_Contener FROM T0400009, T0200014, T0200015 WHERE T0400009.Cod_CiudadD = T0200014.Cod_Ciudad AND T0200014.Cod_Departamento = T0200015.Cod_Departamento AND T0400009.Cod_Regional = 83 AND T0400009.Cod_FormaPago = " + pago + " AND T0400009.Cons_GuiasU >= " + cons_inicial + " AND T0400009.Cons_GuiasU <= " + cons_final + " And T0400009.Cod_estadoG<>3 ORDER BY Cons_GuiasU");
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/*    */     }
/* 35 */     catch (SQLException e) {
/* 36 */       e.printStackTrace();
/*    */     } 
/*    */     
/* 39 */     return this.resGuias;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public ResultSet ConsCuentaFecha(int reg_cuenta, int ofi_cuenta, int cons_cuenta, String fecha_cuenta) {
/*    */     try {
/* 46 */       this.conexion = new ConexionDB();
/* 47 */       this.conexion_sticker = this.conexion.getConexion();
/* 48 */       Statement declaracion = this.conexion_sticker.createStatement();
/* 49 */       this.resGuias = declaracion.executeQuery("SELECT T0400009.Cod_Regional, T0400009.Cod_FormaPago, T0400009.Cons_GuiasU, T0400009.Nom_Remitente, T0400009.Nom_Destinatario, T0400009.Dir_Destinatario, T0200014.Nom_Ciudad, T0200015.Nom_Departamento, T0400009.Num_Unidades, T0400009.Texto_Guia, T0400009.Dice_Contener FROM T0400009, T0200014, T0200015 WHERE T0400009.Cod_CiudadD = T0200014.Cod_Ciudad AND T0200014.Cod_Departamento = T0200015.Cod_Departamento AND T0400009.Cod_Regional_Cta = " + reg_cuenta + " AND T0400009.Cod_Oficina_Cta = " + ofi_cuenta + " AND T0400009.Cod_Cuenta = " + cons_cuenta + " AND T0400009.Fec_Generacion = '" + fecha_cuenta + "' And T0400009.Cod_estadoG<>3 ORDER BY Cons_GuiasU");
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/*    */     }
/* 57 */     catch (SQLException e) {
/* 58 */       e.printStackTrace();
/*    */     } 
/*    */     
/* 61 */     return this.resGuias;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public ResultSet ConsNomCuenta(int reg_cuenta, int ofi_cuenta, int cons_cuenta) {
/*    */     try {
/* 68 */       this.conexion = new ConexionDB();
/* 69 */       this.conexion_sticker = this.conexion.getConexion();
/* 70 */       Statement declaracion = this.conexion_sticker.createStatement();
/* 71 */       this.resGuias = declaracion.executeQuery("SELECT T0300007.Nom_Cuenta FROM T0300007 WHERE T0300007.Cod_Regional = " + reg_cuenta + " AND T0300007.Cod_Oficina = " + ofi_cuenta + " AND T0300007.Cod_Cuenta = " + cons_cuenta);
/*    */     
/*    */     }
/* 74 */     catch (SQLException e) {
/* 75 */       e.printStackTrace();
/*    */     } 
/*    */     
/* 78 */     return this.resGuias;
/*    */   }
/*    */ }


/* Location:              C:\Users\JORGE\Desktop\CoordTecno.jar!\Conexion\ConsultaSticker.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */