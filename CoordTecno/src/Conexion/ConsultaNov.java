package Conexion;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class ConsultaNov {
	
	ConexionDB conexion;
	Connection conexionNov = null;
	ResultSet resulset;


	public ConsultaNov(){
						
	}
	
	public ResultSet ConsRangoGuias(){
		
		try {
			conexion = new ConexionDB();
			conexionNov = conexion.getConexion();
			Statement declaracion = conexionNov.createStatement();
			resulset = declaracion.executeQuery("select distinct b.Nro_Placa , a.Nom_Responsable_PRP ,\n" +
"count( case when(responsable_solucion)='OP' then (a.Cons_guiasu) end) as NovOP ,\n" +
"count( case when(responsable_solucion)='SC' then (a.Cons_guiasu) end) as NovSAC,\n" +
"b.G_Entregadas ,b.T_Guias\n" +
"from T0400009 a join T0400019 b on a.Num_PlanillaRpto=b.Num_PlanillaRpto \n" +
"join T0600001 c on b.Nro_placa=c.Nro_placa \n" +
"join T0700002 d on a.Cod_Regional=d.Cod_Regional and a.Cod_FormaPago=d.Cod_FormaPago and a.cons_guiasU=d.Cons_GuiasU\n" +
"join T0200027 e on d.Cod_Novedad=e.Cod_Novedad\n" +
"where  b.Cod_regional=83 and b.fec_PlanillaRpto=CONVERT(DATE,GETDATE()) and  c.Cod_Tipo=21  and d.fec_novedad=CONVERT(DATE,GETDATE()) and d.Mca_Estado='VI'\n" +
"group by b.Nro_Placa ,a.Nom_Responsable_PRP,b.G_Entregadas, b.T_Guias");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return resulset;
		          
	}

//	public ResultSet ConsCuentaFecha(int reg_cuenta, int ofi_cuenta, int cons_cuenta, String fecha_cuenta){
//		
//		try {
//			conexion = new ConexionDB();
//			conexionNov = conexion.getConexion();
//			Statement declaracion = conexionNov.createStatement();
//			resulset = declaracion.executeQuery("SELECT T0400009.Cod_Regional, T0400009.Cod_FormaPago, T0400009.Cons_GuiasU, "
//					+ "T0400009.Nom_Remitente, T0400009.Nom_Destinatario, T0400009.Dir_Destinatario, T0200014.Nom_Ciudad, T0200015.Nom_Departamento, "
//					+ "T0400009.Num_Unidades, T0400009.Texto_Guia, T0400009.Dice_Contener "
//					+ "FROM T0400009, T0200014, T0200015 "
//					+ "WHERE T0400009.Cod_CiudadD = T0200014.Cod_Ciudad"
//					+ " AND T0200014.Cod_Departamento = T0200015.Cod_Departamento "
//					+ "AND T0400009.Cod_Regional_Cta = " + reg_cuenta + " AND T0400009.Cod_Oficina_Cta = " + ofi_cuenta + " AND T0400009.Cod_Cuenta = " + cons_cuenta + " AND T0400009.Fec_Generacion = '" + fecha_cuenta + "' "
//					+ "ORDER BY Cons_GuiasU");
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//		
//		return resulset;
//		
//	}
//
//	public ResultSet ConsNomCuenta(int reg_cuenta, int ofi_cuenta, int cons_cuenta){
//		
//		try {
//			conexion = new ConexionDB();
//			conexionNov = conexion.getConexion();
//			Statement declaracion = conexionNov.createStatement();
//			resulset = declaracion.executeQuery("SELECT T0300007.Nom_Cuenta "
//					+ "FROM T0300007 "
//					+ "WHERE T0300007.Cod_Regional = " + reg_cuenta + " AND T0300007.Cod_Oficina = " + ofi_cuenta + " AND T0300007.Cod_Cuenta = " + cons_cuenta);
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//		
//		return resulset;
//		
//	}
	
}
