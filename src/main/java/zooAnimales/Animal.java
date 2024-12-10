package zooAnimales;

import gestion.Zona;

public class Animal {
  private static int totalAnimales;
  private String nombre;
  private int edad;
  private String habitat;
  private String genero;
  private Zona zona;
  
  public Animal(){
    this("", 0, "", "");
    totalAnimales += 1;
  }

  public Animal(String nombre, int edad, String habitat, String genero){
    this.nombre = nombre;
    this.edad = edad;
    this.habitat = habitat;
    this.genero = genero;
    totalAnimales +=1;
  }

  public static String totalPorTipo(){
    int totalMamiferos = Mamifero.cantidadMamiferos();
    int totalAves = Ave.cantidadAves();
    int totalReptiles = Reptil.cantidadReptiles();
    int totalPeces = Pez.cantidadPeces();
    int totalAnfibios = Anfibio.cantidadAnfibios();

    return "Mamiferos: " + totalMamiferos +"\n" + 
				"Aves: " + totalAves+ "\n" + 
				"Reptiles: " + totalReptiles+"\n" + 
				"Peces: " + totalPeces +"\n" + 
				"Anfibios: " + totalAnfibios;

  }

  public String toString(){
    if (zona == null){
      return "Mi nombre es " + nombre + ", tengo una edad de " + edad + ", habito en " + habitat + " y mi genero es " + genero;
    }else {
      return "Mi nombre es " + nombre + ", tengo una edad de " + edad + ", habito en " + habitat + " y mi genero es " + genero +", la zona en la que me ubico es " + zona + ", en el " + zona.getZoo();
    }    
  }

  public String movimiento(){
    return "desplazarse";
  }

  public static int getTotalAnimales(){
    return totalAnimales;
  }

  public String getNombre(){
    return nombre;
  }

  public int getEdad(){
    return edad;
  }

  public String getHabitat(){
    return habitat;
  }

  public String getGenero(){
    return genero;
  }

  public Zona getZona(){
    return zona;
  }

  public void setTotalAnimales(int totalAnimales){
    Animal.totalAnimales = totalAnimales;
  }

  public void setNombre(String nombre){
    this.nombre = nombre;
  }

  public void setEdad(int edad){
    this.edad = edad;
  }

  public void setHabitat(String habitat){
    this.habitat = habitat;
  }
  
  public void setGenero(String genero){
    this.genero = genero;
  }

  public void setZona(Zona zona){
    this.zona = zona;
  }
}
