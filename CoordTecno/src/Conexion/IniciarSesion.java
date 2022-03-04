/*    */ package Conexion;
/*    */ 
/*    */ import java.sql.Connection;
/*    */ import java.sql.ResultSet;
/*    */ import java.sql.SQLException;
/*    */ import java.sql.Statement;
/*    */ 
/*    */ public class IniciarSesion
/*    */ {
/*    */   ConexionDB conexion;
/*    */   Connection conValida;
/*    */   
/*    */


 public ResultSet validarUsuario() {
/*    */     try {
/* 15 */       this.conexion = new ConexionDB();
/* 16 */       this.conValida = this.conexion.getConexion();
/* 17 */       Statement declaracion = this.conValida.createStatement();
/* 18 */       this.resUsuario = declaracion.executeQuery("SELECT * FROM T0300006 WHERE Cod_Regional=83 and Ced_Empleado = '" + this.Usuario + "' and Cod_Nomina = '" + this.Clave + "'");
/* 19 */     } catch (SQLException e) {
/* 20 */       System.out.println(e);
/*    */     } 
/*    */     
/* 23 */     return this.resUsuario;
/*    */   }
/*    */   String Usuario; String Clave; ResultSet resUsuario;
/*    */   public IniciarSesion(String Usu, String Cla) {
/* 27 */     this.Usuario = Usu;
/* 28 */     this.Clave = Cla;
/* 29 */     validarUsuario();
/*    */   }
/*    */

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getClave() {
        return Clave;
    }

    public void setClave(String Clave) {
        this.Clave = Clave;
    }
 }


/* Location:              C:\Users\JORGE\Desktop\CoordTecno.jar!\Conexion\IniciarSesion.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */