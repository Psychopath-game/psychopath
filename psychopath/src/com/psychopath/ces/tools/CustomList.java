package com.psychopath.ces.tools;

/**
 * Repr�sente un ensemble d'�l�ments qui restent cons�cutifs en m�moire.
 * Offre de meilleures performance de parcours/acc�s.
 * @author Spoke
 *
 * @param <T>
 */
public class CustomList<T> implements IPsychoList<T> {
	private int size = 0;
	private T[] items;

	/**
	 * Constructeur par d�faut qui instancie un tableau de taille d�finie
	 */
	public CustomList(){
		this(92);
	}
	
	@SuppressWarnings("unchecked")
	public CustomList(int nbr){
		items = (T[]) new Object[nbr];
	}
	
	@Override
	public int size() {
		return size;
	}

	@Override
	public T get(int index) {
		return items[index];
	}
	
	public int getLength(){
		return items.length;
	}
}
