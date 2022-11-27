package entidades;

public class Perro implements Animal {

	@Override
	public String getNombreAnimal() {
		return "Perro";
	}

	@Override
	public String onomatopeya() {
		return "guau";
	}

	@Override
	public int cantidadPatas() {
		return 4;
	}

}
