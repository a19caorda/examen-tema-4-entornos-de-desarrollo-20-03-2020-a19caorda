/**
 * 
 * La clase Vehiculo es una superclase par poder abstraer lo que es un vehiculo
 * 
 * @author David Castilla Ortiz
 * @version 0.1.0
 *
 */
public class Vehiculo {

  protected int num_serie;
  protected String fabricante;
  protected Color color;

  /**
   * Constructor de vehiculo
   */
  public Vehiculo() {
    super();
  }

  /**
   * @return El color del vehiculo
   */
  public Color getColor() {
  	return color;
  }

  /**
   * 
   * @param color Color para sustituir el campo color
   */
  public void setColor(Color color) {
  	this.color = color;
  }
  
  /**
   * 
   * @return El número de serie del vehiculo
   */
  public int getNum_serie() {
  	return num_serie;
  }

  /**
   * 
   * @param num_serie Nuevo número de serie
   */
  public void setNum_serie(int num_serie) {
  	this.num_serie = num_serie;
  }

  /**
   * 
   * @return El nombre del fabricante 
   */
  public String getFabricante() {
  	return fabricante;
  }

  /**
   * @param fabricante Nuevo nombre de fabricante
   */
  public void setFabricante(String fabricante) {
  	this.fabricante = fabricante;
  }

}