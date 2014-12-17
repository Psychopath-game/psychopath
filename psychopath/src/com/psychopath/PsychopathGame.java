package com.psychopath;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;

import com.psychopath.ces.Entity;
import com.psychopath.ces.World;


public class PsychopathGame extends BasicGame {

	private GameContainer container;
	private World world;
	
	/**
	 * Point d'entr�
	 */
	public static void main(String[] args) throws SlickException {
        new AppGameContainer(new PsychopathGame(), 640, 480, false).start();
    }
	
	public PsychopathGame() {
		super("Psychopath");
		world = new World();
		world.init();

		System.out.println("BEGIN");
		Entity e = world.createEntity();
		e.addToWorld();
		System.out.println("END");
	}

	@Override
	public void init(GameContainer container) throws SlickException {
		//initialise le contenu du jeu
		this.container = container;
	}
	
	@Override
	public void render(GameContainer container, Graphics g) throws SlickException {
		//affiche le jeu
	}
	
	@Override
	public void update(GameContainer container, int delta) throws SlickException {
		//met � jour la scene
		world.run(delta);
	}
	
	
	//a d�placer, permet de quitter 
	@Override
    public void keyReleased(int key, char c) {
        if (Input.KEY_ESCAPE == key) {
            container.exit();
        }
    }

}
