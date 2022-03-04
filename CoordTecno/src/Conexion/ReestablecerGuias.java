/*     */ package Conexion;
/*     */ 
/*     */ import java.sql.Connection;
/*     */ import java.sql.ResultSet;
/*     */ import java.sql.SQLException;
/*     */ import java.sql.Statement;
/*     */ 
/*     */ public class ReestablecerGuias
/*     */ {
/*     */   ConexionDB conexion;
/*  11 */   Connection conReestGuias = null;
/*     */   
/*     */   ResultSet resGuias;
/*     */   
/*     */   public ResultSet ConsNombreCuenta(int regional_cta, int oficina_cta, int cons_cuenta) {
/*     */     try {
/*  17 */       this.conexion = new ConexionDB();
/*  18 */       this.conReestGuias = this.conexion.getConexion();
/*  19 */       Statement declaracion = this.conReestGuias.createStatement();
/*  20 */       this.resGuias = declaracion.executeQuery("SELECT T0300007.Nom_Cuenta, T0300007.Mca_Inactivo FROM T0300007 WHERE T0300007.Cod_Regional = " + regional_cta + " AND T0300007.Cod_Oficina = " + oficina_cta + " AND T0300007.Cod_Cuenta = " + cons_cuenta);
/*     */     
/*     */     }
/*  23 */     catch (SQLException e) {
/*  24 */       e.printStackTrace();
/*     */     } 
/*     */     
/*  27 */     return this.resGuias;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public ResultSet ConsNombreOficina(int regional_ofi, int cons_ofi) {
/*     */     try {
/*  34 */       this.conexion = new ConexionDB();
/*  35 */       this.conReestGuias = this.conexion.getConexion();
/*  36 */       Statement declaracion = this.conReestGuias.createStatement();
/*  37 */       this.resGuias = declaracion.executeQuery("SELECT T0300001.Nom_Oficina, T0300001.Tipo_Oficina FROM T0300001 WHERE T0300001.Cod_Regional = " + regional_ofi + " AND T0300001.Cod_Oficina = " + cons_ofi);
/*     */     
/*     */     }
/*  40 */     catch (SQLException e) {
/*  41 */       e.printStackTrace();
/*     */     } 
/*     */     
/*  44 */     return this.resGuias;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public ResultSet ConsNombreEmpleado(String cod_nomina) {
/*     */     try {
/*  51 */       this.conexion = new ConexionDB();
/*  52 */       this.conReestGuias = this.conexion.getConexion();
/*  53 */       Statement declaracion = this.conReestGuias.createStatement();
/*  54 */       this.resGuias = declaracion.executeQuery("SELECT T0300006.Mca_GGuia,T0300006.Fec_Baja ,T0300006.Nom_Empleado, T0300006.Ape_Empleado FROM T0300006 WHERE T0300006.Cod_Nomina = '" + cod_nomina + "'");
/*     */     
/*     */     }
/*  57 */     catch (SQLException e) {
/*  58 */       e.printStackTrace();
/*     */     } 
/*     */     
/*  61 */     return this.resGuias;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public ResultSet ConsPagoGuia(int reg_cta, int ofi_cta, int cons_cta) {
/*     */     try {
/*  68 */       this.conexion = new ConexionDB();
/*  69 */       this.conReestGuias = this.conexion.getConexion();
/*  70 */       Statement declaracion = this.conReestGuias.createStatement();
/*  71 */       this.resGuias = declaracion.executeQuery("SELECT DISTINCT T0400003.Forma_De_Pago, T0200005.Des_FormaPago FROM T0400003, T0200005 WHERE T0400003.Forma_De_Pago = T0200005.Cod_FormaPago AND T0400003.Cod_Regional = " + reg_cta + " AND T0400003.Cod_Oficina = " + ofi_cta + " AND T0400003.Cod_Cuenta = " + cons_cta + " Order By T0400003.Forma_De_Pago");
/*     */ 
/*     */ 
/*     */     
/*     */     }
/*  76 */     catch (SQLException e) {
/*  77 */       e.printStackTrace();
/*     */     } 
/*     */     
/*  80 */     return this.resGuias;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public ResultSet ConsTipoGuia(int reg_cta, int ofi_cta, int cons_cta, int formapago) {
/*     */     try {
/*  87 */       this.conexion = new ConexionDB();
/*  88 */       this.conReestGuias = this.conexion.getConexion();
/*  89 */       Statement declaracion = this.conReestGuias.createStatement();
/*  90 */       this.resGuias = declaracion.executeQuery("SELECT T0400003.Tipo_GeneracionG, T0400002.Des_GeneracionG FROM T0400003, T0400002 WHERE T0400003.Tipo_GeneracionG = T0400002.Tipo_GeneracionG AND T0400003.Cod_Regional = " + reg_cta + " AND T0400003.Cod_Oficina = " + ofi_cta + " AND T0400003.Cod_Cuenta = " + cons_cta + " AND T0400003.Forma_De_Pago = " + formapago + " Order By T0400003.Tipo_GeneracionG");
/*     */ 
/*     */ 
/*     */     
/*     */     }
/*  95 */     catch (SQLException e) {
/*  96 */       e.printStackTrace();
/*     */     } 
/*     */     
/*  99 */     return this.resGuias;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public ResultSet ConsTotalRegistrosGeneracion() {
/*     */     try {
/* 106 */       this.conexion = new ConexionDB();
/* 107 */       this.conReestGuias = this.conexion.getConexion();
/* 108 */       Statement declaracion = this.conReestGuias.createStatement();
/* 109 */       this.resGuias = declaracion.executeQuery("SELECT MAX(Cons_RptGen) FROM T0500004");
/*     */     }
/* 111 */     catch (SQLException e) {
/* 112 */       e.printStackTrace();
/*     */     } 
/*     */     
/* 115 */     return this.resGuias;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public ResultSet ConsFechaProceso() {
/*     */     try {
/* 122 */       this.conexion = new ConexionDB();
/* 123 */       this.conReestGuias = this.conexion.getConexion();
/* 124 */       Statement declaracion = this.conReestGuias.createStatement();
/* 125 */       this.resGuias = declaracion.executeQuery("SELECT Fec_Proceso FROM T0200020");
/*     */     }
/* 127 */     catch (SQLException e) {
/* 128 */       e.printStackTrace();
/*     */     } 
/*     */     
/* 131 */     return this.resGuias;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void ReestablecimientoCuenta(int Cod_Regional, int Cod_Oficina, int Cod_Cuenta, int Cod_FormaPago, int Tipo_GeneracionG, String Fec_Modifica) {
/*     */     try {
/* 138 */       this.conexion = new ConexionDB();
/* 139 */       this.conReestGuias = this.conexion.getConexion();
/* 140 */       Statement declaracion = this.conReestGuias.createStatement();
/* 141 */       this.resGuias = declaracion.executeQuery("UPDATE T0500004 SET Cant_Usada = 0, Fec_Modifica = " + Fec_Modifica + " WHERE Cod_Regional = " + Cod_Regional + " AND Cod_Oficina = " + Cod_Oficina + " AND Cod_Cuenta = " + Cod_Cuenta + " AND Cod_FormaPago = " + Cod_FormaPago + " AND Tipo_GeneracionG = " + Tipo_GeneracionG);
/*     */     
/*     */     }
/* 144 */     catch (SQLException e) {
/* 145 */       e.printStackTrace();
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\JORGE\Desktop\CoordTecno.jar!\Conexion\ReestablecerGuias.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */