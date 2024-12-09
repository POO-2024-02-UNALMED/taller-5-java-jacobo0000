package zooAnimales;

import java.util.ArrayList;
import java.util.Arrays;

public class Pez extends Animal{
  private static ArrayList<Pez> listado = new ArrayList<>();
  public static int salmones = 0;
  public static int bacalaos = 0;
  private String colorEscamas;
  private int cantidadAletas;

  public Pez(){
    this("", 0, "", "", "", 0);
    listado.add(this);
  }

  public Pez(String nombre, int edad, String habitat, String genero, String colorEscamas, int cantidadAletas){
    super(nombre,edad,habitat,genero);
    this.colorEscamas = colorEscamas;
    this.cantidadAletas = cantidadAletas;
    listado.add(this);
  }

  public String movimiento(){
    return "nadar";
  }

  public int cantidadPeces(){
    return listado.size();
  }

  public static Pez crearSalmon(String nombre, int edad, String genero){
    Pez salmon = new Pez(nombre, edad, "oceano", genero, "rojas", 6);
    salmones ++;
    return salmon;
  }

  public static Pez crearBacalao(String nombre, int edad, String genero){
    Pez bacalao = new Pez(nombre, edad, "oceano", genero, "gris", 6);
    bacalaos ++;
    return bacalao;
  }

  public static ArrayList<Pez> getListado(){
    return listado;
  }

  public String getColorEscamas(){
    return colorEscamas;
  }

  public int getCantidadAletas(){
    return cantidadAletas;
  }

  public static void setListado(Pez[] listado){
    ArrayList<Pez> listadoNuevo = new ArrayList<>(Arrays.asList(listado));
    Pez.listado = listadoNuevo;
  }

  public void setColorEscamas(String color){
    this.colorEscamas = color;
  }

  public void setCantidadAletas(int aletas){
    this.cantidadAletas = aletas;
  }
}
