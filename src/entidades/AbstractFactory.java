package entidades;

public interface AbstractFactory<E> {
	E create(String animalType);
}
