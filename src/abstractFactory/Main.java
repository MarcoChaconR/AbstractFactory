package abstractFactory;

import entidades.AnimalFactory;

public class Main {

	public static void main(String[] args) {
		AnimalFactory animalFactory = new AnimalFactory();
		String[] animales = { "Perro", "Gato", "Pato" };

		for (String animalito : animales) {
			System.out.println("Abstract Factory de la clase" + animalFactory.create(animalito).getNombreAnimal());
			System.out.println("El " + animalFactory.create(animalito).getNombreAnimal() + " hace "
					+ animalFactory.create(animalito).onomatopeya() + " y tiene "
					+ animalFactory.create(animalito).cantidadPatas() + " patas");
			System.out.println();
		}

	}

}
