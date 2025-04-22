package clases;

public class Cubo {
   private int lado;
   /**
	 * Crea un cubo con el lado especificado
	 * 
	 * @param Lado
	 */
	
   public Cubo (int lado) {
	   this.lado = lado;
	 }
   /**
	   * Crea un cubo con el lado indicado
	   */
   public Cubo () {
		this.lado = 1;
	}
   /**
	 * Calcula la superficie del cubo
	 * 
	 * @return La superficie en metros
	 */
   public double superficie() {
		return (lado*lado)*6;
	}
   /**
	 * Calcula el volumen de un cubo
	 * 
	 * @return El volumen en metros
	 */
   public double volumen() {
		return lado*lado*lado;
	}
   public void setlado(int lado) {
		this.lado = lado;
	}
	private double getlado() {
		return this.lado;
	}
	public String toString() {
		return "Lado de un circulo " + this.lado;
	}
}
