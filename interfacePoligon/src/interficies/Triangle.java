package interficies;


public class Triangle implements Poligon {
	private double base;
	private double altura;
	
	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return ((base*altura)/2);
	}

	@Override
	public String toString(){
		return "La base es "+base+" l'altura es "+altura+" l'area es "+area();
	}
}
