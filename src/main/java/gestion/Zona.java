package gestion;
import zooAnimales.Animal;
import java.util.ArrayList;
import java.util.Arrays;


public class Zona {
  private String nombre;
  private Zoologico zoo;
  private ArrayList<Animal> animales = new ArrayList<>();

  public Zona(){
    this(null, null);
  }

  public Zona(String nombre, Zoologico zoo){
    this.nombre = nombre;
    this.zoo = zoo;
  }

  public void agregarAnimales(Animal animal){
    animales.add(animal);
  }

  public int cantidadAnimales(){
    return animales.size();
  }

  public ArrayList<Animal> getAnimales(){
    return animales;
  }

  public Zoologico getZoo(){
    return zoo;
  } 

  public String getNombre(){
    return nombre;
  }

  public void setNombre(String nombre){
    this.nombre = nombre;
  }

  public void setZoo(Zoologico zoo){
    this.zoo = zoo;
  } 

  public void setAnimales(Animal[] animales){
    ArrayList<Animal> animalesLista = new ArrayList<>(Arrays.asList(animales));
    this.animales = animalesLista;
  }
}
