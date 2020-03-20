/**
 * 
 * Enumeracion de colores
 * 
 * @author David Castilla Ortiz
 * @version 0.1.0
 *
 */
enum Color {
	ROJO, AZUL, VERDE, AMARILLO, NARANJA
};

/**
 * 
 * Coche es un vehiculo
 * 
 * @author David Castilla Ortiz
 * @version 0.1.0
 *
 */
public class Coche extends Vehiculo {
	private int cilindrada;
	
	/**
	 * 
	 * Constructor de coche
	 * 
	 * @param num_serie Número de serie del coche
	 * @param cilindrada Cilindrada del coche
	 * @param fabricante Fabricante del coche
	 * @param color Color de coche
	 */
	protected Coche(int num_serie, int cilindrada, String fabricante, Color color) {
		this.num_serie = num_serie;
		this.cilindrada = cilindrada;
		this.fabricante = fabricante;
		this.color = color;
	}

	/**
	 * 
	 * @return Cilindrada del coche
	 */
	public int getCilindrada() {
		return cilindrada;
	}

	/**
	 * 
	 * @param cilindrada Nueva cilindrada
	 */
	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

}
