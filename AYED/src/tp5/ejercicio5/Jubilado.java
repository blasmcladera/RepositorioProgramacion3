package tp5.ejercicio5;

public class Jubilado {
	boolean es;
	String nya;
	String domicilio;
	
	public Jubilado(boolean es, String nya, String domicilio) {
		this.es = es;
		this.nya = nya;
		this.domicilio = domicilio;
	}
	
	public boolean getEs() {
		return es;
	}
	public void setEs(boolean es) {
		this.es = es;
	}
	public String getNya() {
		return nya;
	}
	public void setNya(String nya) {
		this.nya = nya;
	}

	public String getDomicilio() {
		return domicilio;
	}
	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	@Override
	public String toString() {
		return "["+nya+ " "+domicilio+"]";
	}
	
}
