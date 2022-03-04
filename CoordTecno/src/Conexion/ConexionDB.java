/*    */ package Conexion;
/*    */ 
/*    */ import java.sql.Connection;
/*    */ import java.sql.DriverManager;
/*    */ import java.sql.SQLException;
/*    */ 
/*    */ public class ConexionDB {
/*  8 */  // String nomDB = "database=Envia;";
/*  9 */  // String loginDB = "user=CoordTecno;";
/* 10 */  // String passDB = "password=EnvCart83;";
/*    */   
/* 12 */   String urlDB = "jdbc:sqlserver://Kronos\\cor83car:54049;databaseName=Envia;IntegratedSecurity=true";
/*    */   
/* 14 */   Connection conexion = null;
/*    */   
/*    */   public ConexionDB() {
/*    */     try {
/* 18 */       this.conexion = DriverManager.getConnection(this.urlDB);
/* 19 */     } catch (SQLException e) {
/* 20 */       System.out.println(e);
/*    */     } 
/*    */   }
/*    */   
/*    */   public Connection getConexion() {
/* 25 */     return this.conexion;
/*    */   }
/*    */   
/*    */   public void desconectar() {
/* 29 */     this.conexion = null;
/*    */   }
/*    */ }


/* Location:              C:\Users\JORGE\Desktop\CoordTecno.jar!\Conexion\ConexionDB.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */