package zooAnimales;

import java.util.ArrayList;
import java.util.Arrays;

public class Mamifero extends Animal {
  private static ArrayList<Mamifero> listado;
  public static int caballos;
  public static int leones;
  private Boolean pelaje;
  private int patas;

  public Mamifero(){
    listado.add(this);
  }

  public Mamifero(String nombre, int edad, String habitat, String genero, Boolean pelaje, int patas){
    this.setNombre(nombre);
    this.setEdad(edad);
    this.setHabitat(habitat);
    this.setGenero(genero);
    this.pelaje = pelaje;
    this.patas = patas;
    listado.add(this);
  }

  public int cantidadMamiferos(){
    return listado.size();
  }

  public static Mamifero crearCaballo(String nombre, int edad, String genero){
    Mamifero caballo =new Mamifero(nombre, edad, "pradera", genero, true, 4);
    caballos += 1;
    return caballo;
  }

  public static Mamifero crearLeon(String nombre, int edad, String genero){
    Mamifero leon = new Mamifero(nombre, edad, "selva", genero, true, 4);
    leones += 1;
    return leon;
  }

  public static ArrayList<Mamifero> getListado(){
    return listado;
  }

  public Boolean getPelaje(){
    return pelaje;
  }

  public int getPatas(){
    return patas;
  }

  public static void setListado(Mamifero[] listado){
    ArrayList<Mamifero> listadoNuevo = new ArrayList<>(Arrays.asList(listado));
    Mamifero.listado = listadoNuevo;
  }

  public void setPelaje(Boolean pelaje){
    this.pelaje = pelaje;
  }

  public void setPatas(int patas){
    this.patas = patas;
  }

  public Boolean isPelaje(){
    return pelaje;
  }
}
