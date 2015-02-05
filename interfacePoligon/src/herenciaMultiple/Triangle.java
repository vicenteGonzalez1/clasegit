package herenciaMultiple;

public class Triangle extends posicio implements Moviment, Poligon {
	
	private double base, alutura;
	
	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAlutura() {
		return alutura;
	}

	public void setAlutura(double alutura) {
		this.alutura = alutura;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void FerMoviment(Poligon p) {
		// TODO Auto-generated method stub
		
	}

}
