package zooAnimales;

import java.util.ArrayList;
import java.util.Arrays;

public class Ave extends Animal{
  private static ArrayList<Ave> listado;
  public static int halcones;
  public static int aguilas;
  private String colorPlumas;

  public Ave(){
    listado.add(this);
  }

  public Ave(String nombre, int edad, String habitat, String genero, String colorPlumas){
    super(nombre,edad,habitat,genero);
    this.colorPlumas = colorPlumas;
    listado.add(this);
  }

  public String movimiento(){
    return "volar";
  }

  public int cantidadAves(){
    return listado.size();
  }

  public static Ave crearHalcon(String nombre, int edad, String genero){
    Ave halcon = new Ave(nombre, edad, "montanas", genero, "cafe glorioso");
    halcones += 1;
    return halcon;
  }

  public static Ave crearAguila(String nombre, int edad, String genero){
    Ave aguila = new Ave(nombre, edad, "montanas", genero, "blanco y amarillo");
    halcones += 1;
    return aguila;
  }

  public static ArrayList<Ave> getListado(){
    return listado;
  }

  public String getColorPlumas(){
    return colorPlumas;
  }

  public static void setListado(Ave[] listado){
    ArrayList<Ave> listadoNuevo = new ArrayList<>(Arrays.asList(listado));
    Ave.listado = listadoNuevo;
  }

  public void setColorPlumas(String color){
    this.colorPlumas = color;
  }
}
