package zooAnimales;

import gestion.Zona;

public class Animal {
  private static int totalAnimales;
  private String nombre;
  private int edad;
  private String habitad;
  private String genero;
  private Zona zona;
  
  public Animal(){
    totalAnimales += 1;
  }

  public Animal(String nombre, int edad, String habitad, String genero){
    this.nombre = nombre;
    this.edad = edad;
    this.habitad = habitad;
    this.genero = genero;
    totalAnimales +=1;
  }

  public static String totalPorTipo(){
    int totalMamíferos = Mamifero.getListado().size();
    int totalAves = Ave.getListado().size();
    int totalReptiles = Reptil.getListado().size();
    int totalPeces = Pez.getListado().size();
    int totalAnfibios = Anfibio.getListado().size();

    return "Mamíferos: " + totalMamíferos + "Aves: " + totalAves + "Reptiles: " + totalReptiles + "Peces: " + totalPeces + "Anfibios:  " + totalAnfibios ;

  }

  public String toString(){
    if (zona == null){
      return "Mi nombre es " + nombre + ", tengo una edad de " + edad + ", habito en " + habitad + " y mi genero es " + genero;
    }else {
      return "Mi nombre es " + nombre + ", tengo una edad de " + edad + ", habito en " + habitad + " y mi genero es " + genero +", la zona en la que me ubico es " + zona + ", en el " + zona.getZoo();
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

  public String getHabitad(){
    return habitad;
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

  public void setHabitad(String habitad){
    this.habitad = habitad;
  }
  
  public void setGenero(String genero){
    this.genero = genero;
  }

  public void setZona(Zona zona){
    this.zona = zona;
  }
}
