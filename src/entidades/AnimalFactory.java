package entidades;

public class AnimalFactory implements AbstractFactory<Animal> {

	@Override
	public Animal create(String animalType) {

		switch (animalType) {
		case "Perro":
			return new Perro();
		case "Gato":
			return new Gato();
		case "Pato":
			return new Pato();
		default:
			return null;
		}

	}

}
