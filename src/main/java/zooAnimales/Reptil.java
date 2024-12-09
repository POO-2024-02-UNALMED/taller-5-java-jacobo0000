package zooAnimales;

import java.util.ArrayList;
import java.util.Arrays;

public class Reptil extends Animal{
  private static ArrayList<Reptil> listado = new ArrayList<>();
  public static int iguanas;
  public static int serpientes;
  private String colorEscamas;
  private int largoCola;

  public Reptil(){
    this("", 0, "", "", "", 0);
    listado.add(this);

  }

  public Reptil(String nombre, int edad, String habitat, String genero, String colorEscamas, int largoCola){
    super(nombre,edad,habitat,genero);
    this.colorEscamas = colorEscamas;
    this.largoCola = largoCola;
    listado.add(this);
  }

  public String movimiento(){
    return "reptar";
  }

  public int cantidadReptiles(){
    return listado.size();
  }

  public static Reptil crearIguana(String nombre, int edad, String genero){
    Reptil iguana = new Reptil(nombre, edad, "humedal", genero, "verde", 3);
    iguanas ++;
    return iguana;
  }

  public static Reptil crearSerpiente(String nombre, int edad, String genero){
    Reptil serpiente =new Reptil(nombre, edad, "jungla", genero, "blanco", 1);
    iguanas ++;
    return serpiente;
  }

  public static ArrayList<Reptil> getListado(){
    return listado;
  }

  public String getColorEscamas(){
    return colorEscamas;
  }

  public int getLargoCola(){
    return largoCola;
  }

  public static void setListado(Reptil[] listado){
    ArrayList<Reptil> listadoNuevo = new ArrayList<>(Arrays.asList(listado));
    Reptil.listado = listadoNuevo;
  }

  public void setColorEscamas(String color){
    this.colorEscamas = color;
  }

  public void setLargoCola(int cola){
    this.largoCola = cola;
  }
}
