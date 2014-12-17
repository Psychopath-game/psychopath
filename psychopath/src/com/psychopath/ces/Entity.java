package com.psychopath.ces;

import com.psychopath.ces.tools.CustomList;

/**
 * The representation of an Entity
 * The ComponentManager is passed to the entity to facilitate access to ComponentManager methods.
 * @author Spoke
 *
 */
public final class Entity {
	private int id;
	private ComponentManager cm;
	
	protected Entity(int id, ComponentManager cm){
		this.id = id;
		this.cm = cm;
	}
	
	
	/** ADD **/
	public Entity addComponent(Component c){
		return addComponent(c, ComponentType.getType(c.getClass()));
	}
	
	// Faster
	public Entity addComponent(Component c, ComponentType type){
		cm.addComponent(this, c, type);
		return this;
	}
	
	/** REMOVE **/
	public Entity removeComponent(Component c){
		return removeComponent(ComponentType.getType(c.getClass()));
	}
	
	public Entity removeComponent(ComponentType type){
		cm.removeComponent(this, type);
		return this;
	}
	
	public void removeAllComponents(){
		cm.removeAllComponents(this);
	}
	
	/** GET **/
	public Component getComponent(ComponentType type){
		return cm.getComponent(this, type);
	}
	
	public CustomList<Component> getAllComponents(){
		return cm.getAllComponents(this);
	}
	
	
	/** GETTER & SETTERS **/
	public int getId(){
		return id;
	}
}
