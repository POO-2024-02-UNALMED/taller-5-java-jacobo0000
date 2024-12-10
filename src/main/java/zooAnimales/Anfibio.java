package zooAnimales;

import java.util.ArrayList;
import java.util.Arrays;

public class Anfibio extends Animal {
  private static ArrayList<Anfibio> listado = new ArrayList<>();
  public static int ranas = 0;
  public static int salamandras = 0;
  private String colorPiel;
  private Boolean venenoso;

  public Anfibio(){
    this("", 0, "", "", "", false);
    listado.add(this);
  }

  public Anfibio(String nombre, int edad, String habitat, String genero, String colorPiel, Boolean venenoso){
    super(nombre,edad,habitat,genero);
    this.colorPiel = colorPiel;
    this.venenoso = venenoso;
    listado.add(this);
  }

  public static int cantidadAnfibios(){
    return listado.size();
  }

  public String movimiento(){
    return "saltar";
  }

  public static Anfibio crearRana(String nombre, int edad, String genero){
    Anfibio rana = new Anfibio(nombre, edad, "selva", genero, "rojo", true);
    ranas++;
    return rana;
  }

  public static Anfibio crearSalamandra(String nombre, int edad, String genero){
    Anfibio salamandra = new Anfibio(nombre, edad, "selva", genero, "negro y amarillo", false);
    salamandras++;
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

  public Boolean isVenenoso(){
    return venenoso;
  }
}
