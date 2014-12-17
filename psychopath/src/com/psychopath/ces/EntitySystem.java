package com.psychopath.ces;

import java.util.ArrayList;

import com.psychopath.ces.tools.CustomList;

/**
 * Un système applique des méthodes sur un ensemble d'entités.
 * 
 * @example  	La gravité sur les Entity possèdant un composant Gravity.
 * @author  	Spoke
 *
 */
abstract public class EntitySystem {
	private CustomList<Entity> entities;
	private boolean active = true;
	
	private ArrayList<Integer> allTypes; // all ComponentType needed to use the System
	private ArrayList<Integer> excludeTypes; // all ComponentTypes which don't permit the use of the system (if one = exclude from system)
	private ArrayList<Integer> lastType; // last component add to the system check method
	
	private World world;
	
	public EntitySystem(){
		
	}

	
	public final void process(){
		before();
		start(entities);
		after();
	}
	
	// Avant de traiter les entités
	protected void before(){
		
	}
	
	// Boucle de traitement des entités
	protected void start(CustomList<Entity> items){
		
	}
	
	// Après avoir traité les entités
	protected void after(){
		
	}

	public void verify(Entity e){
		// Si l'entité correspond on l'ajoute
		
	}
	
	private void check(Entity e){
		int entityId = e.getId();
		
		
		if(lastType == null) // error, not initialized
			return;
		
		if(allTypes.size() > 0){ // case : many include types
			for(int i : allTypes){
				
			}
		}
	}
	
	
	// setters & getters
	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}
	
}
