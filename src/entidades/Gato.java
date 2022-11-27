package entidades;

public class Gato implements Animal{

	@Override
	public String getNombreAnimal() {
		return "Gato";
	}

	@Override
	public String onomatopeya() {
		return "miau";
	}

	@Override
	public int cantidadPatas() {
		return 4;
	}

}
