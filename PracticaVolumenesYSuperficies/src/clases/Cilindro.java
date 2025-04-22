package clases;

public class Cilindro {
	private int radio;
	private int altura;
	/**
	 * Crea un cilindro con el radio y la altura especificada
	 * 
	 * @param Lado
	 * @param Altura
	 */
	public Cilindro (int radio,int altura) {
		this.radio = radio;
		this.altura = altura;
	}
	/**
	   * Crea un cubo con el radio y altura indicada
	   */
	public Cilindro () {
		this.radio = 1;
		this.altura = 1;
	}
	/**
	 * Calcula la superficie del cilindro
	 * 
	 * @return La superficie en metros
	 */
	public double superficie() {
		return (2*3.14*(radio*radio)+(2*3.14*(radio*altura)));
	}
	/**
	 * Calcula el volumen de un cilindro
	 * 
	 * @return El volumen en metros
	 */
	public double volumen() {
		return 3.14*(radio*radio);
	}
	public void setradio(int base) {
		this.radio = radio;
	}
	public void setaltura(int altura) {
		this.altura = altura;
	}
	private double getradio() {
		return this.radio;
	}
	private double getaltura() {
		return this.altura;
	}
	public String toString() {
		return "El radio y la altura son " + this.radio + this.altura;
	}

}
