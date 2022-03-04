/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfazGui;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author JORGE
 */
public class Guia2 {
  String guia, remitente,destinatario,dir, ciudad;
  int unidades;
  
    public Guia2(String guia, String remitente, String destinatario, String dir, String ciudad, int unidades) {
        this.guia = guia;
        this.remitente = remitente;
        this.destinatario = destinatario;
        this.dir = dir;
        this.ciudad = ciudad;
        this.unidades = unidades;
    }

    

    public String getGuia() {
        return guia;
    }

    public void setGuia(String guia) {
        this.guia = guia;
    }

    public String getRemitente() {
        
        return remitente;
    }

    public void setRemitente(String remitente) {
        this.remitente = remitente;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public String getDir() {
        return dir;
    }

    public void setDir(String dir) {
        this.dir = dir;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }
        

    public String mostrarDatos(){
        
      
        return getGuia()+getRemitente()+getDestinatario()+getDir()+getCiudad()+getUnidades();
    }

  
    
}
