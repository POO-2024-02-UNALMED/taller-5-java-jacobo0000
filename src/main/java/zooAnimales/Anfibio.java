package zooAnimales;

import java.util.ArrayList;
import java.util.Arrays;

public class Anfibio extends Animal {
  private static ArrayList<Anfibio> listado;
  public static int ranas;
  public static int salamandras;
  private String colorPiel;
  private Boolean venenoso;

  public Anfibio(){
    listado.add(this);
  }

  public Anfibio(String nombre, int edad, String habitad, String genero, String colorPiel, Boolean venenoso){
    this.colorPiel = colorPiel;
    this.venenoso = venenoso;
    listado.add(this);
  }

  public String movimiento(){
    return "saltar";
  }

  public static Anfibio crearRana(String nombre, int edad, String genero){
    Anfibio rana = new Anfibio(nombre, edad, "selva", genero, "rojo", true);
    ranas += 1;
    return rana;
  }

  public static Anfibio crearSalamandra(String nombre, int edad, String genero){
    Anfibio salamandra = new Anfibio(nombre, edad, "selva", genero, "negro y amarillo", false);
    salamandras += 1;
    return salamandra;
  }

  public static ArrayList<Anfibio> getListado(){
    return listado;
  }

  public String getColorPiel(){
    return colorPiel;
  }

  public Boolean getVenenoso(){
    return venenoso;
  }

  public static void setListado(Anfibio[] listado){
    ArrayList<Anfibio> listadoNuevo = new ArrayList<>(Arrays.asList(listado));
    Anfibio.listado = listadoNuevo;
  }

  public void setColorPiel(String color){
    this.colorPiel = color;
  }

  public void setVenenoso(Boolean venenoso){
    this.venenoso = venenoso;
  }
}
