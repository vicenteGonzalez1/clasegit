package interficies;


public class Circumferencia implements Poligon {
	private double radi;
	
	public double getRadi() {
		return radi;
	}

	public void setRadi(double radi) {
		this.radi = radi;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return pi*radi*radi;
	}

}
