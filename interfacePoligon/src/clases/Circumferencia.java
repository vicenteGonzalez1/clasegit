package clases;

public class Circumferencia extends Poligon {
	private double radi;
	
	public double getRadi() {
		return radi;
	}

	public void setRadi(double radi) {
		this.radi = radi;
	}

	public double area() {
		// TODO Auto-generated method stub
		return pi*radi*radi;
	}
	
	@Override
	public String toString(){
		return "radi: "+radi+" area: "+area();
	}
}
