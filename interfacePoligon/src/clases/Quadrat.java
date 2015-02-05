package clases;

public class Quadrat extends Poligon {
	private int longitud;
	
	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public double area() {
		// TODO Auto-generated method stub
		return longitud*longitud;
	}	
	
	@Override
	public String toString(){
		return "La longitud del costat es: "+longitud+" i te un area de; "+area();
	}
}
