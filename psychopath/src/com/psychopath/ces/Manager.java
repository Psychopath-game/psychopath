package com.psychopath.ces;

public abstract class Manager implements IListener {
	private World world;
	
	protected abstract void init();
	
	public World getWorld(){
		return world;
	}
	
	public void setWorld(World w){
		world = w;
	}
	
	
	@Override
	public void added(Entity e) {
		
	}

	@Override
	public void removed(Entity e) {
		
	}

	@Override
	public void changed(Entity e) {
		
	}

	@Override
	public void enabled(Entity e) {
		
	}

	@Override
	public void disabled(Entity e) {
		
	}
	
}
