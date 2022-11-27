package entidades;

public class Pato implements Animal {

	@Override
	public String getNombreAnimal() {
		return "Pato";
	}

	@Override
	public String onomatopeya() {
		return "cuac";
	}

	@Override
	public int cantidadPatas() {
		return 2;
	}

}
