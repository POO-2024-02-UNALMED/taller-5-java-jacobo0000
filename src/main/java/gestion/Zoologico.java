package gestion;

import java.util.ArrayList;

public class Zoologico {
  private String nombre;
  private String ubicacion;
  private ArrayList<Zona> zonas;

  public Zoologico(){

  }

  public Zoologico(String nombre, String ubicacion){
    this.nombre = nombre;
    this.ubicacion = ubicacion;
  }

  public void agregarZonas(Zona zona){
    zonas.add(zona);
  }

  public int cantidadTotalAnimales(){
    int cantidadAnimales = 0;
    for(int i = 0; i < zonas.size();i++){
      cantidadAnimales += zonas.get(i).getAnimales().size();   
    }
    return cantidadAnimales;
  }

  public String getNombre(){
    return nombre;
  }

  public String getUbicacion(){
    return ubicacion;
  }

  public ArrayList<Zona> getZona(){
    return zonas;
  }

  public void setNombre(String nombre){
    this.nombre = nombre;
  }

  public void setUbicacion(String ubicacion){
    this.ubicacion = ubicacion;
  }
}
