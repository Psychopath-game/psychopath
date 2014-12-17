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
	private World world;
	private ComponentManager cm;
	private EntityManager em;
	
	protected Entity(World w, int id){
		this.id = id;
		this.world = w;
		this.cm = world.getComponentManager();
		this.em = world.getEntityManager();
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
	
	/** WORLD **/
	public void addToWorld(){
		world.addEntity(this);
	}
	
	public void removeFromWorld(){
		world.removeEntity(this);
	}
	
	public void changedInWorld(){
		world.changeEntity(this);
	}
	
	public void enable(){
		world.enableEntity(this);
	}
	
	public void disable(){
		world.disableEntity(this);
	}
	
	
	/** GETTER & SETTERS **/
	public int getId(){
		return id;
	}
}
