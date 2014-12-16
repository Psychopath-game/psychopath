package com.psychopath.ces.tools;

/**
 * Représente un ensemble d'éléments qui restent consécutifs en mémoire.
 * Offre de meilleures performance de parcours/accès.
 * @author Spoke
 *
 * @param <T>
 */
public class CustomList<T> implements IPsychoList<T> {
	private int size = 0;
	private T[] items;

	/**
	 * Constructeur par défaut qui instancie un tableau de taille définie
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
