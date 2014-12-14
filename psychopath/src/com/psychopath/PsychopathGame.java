package com.psychopath;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;


public class PsychopathGame extends BasicGame {

	private GameContainer container;
	
	/**
	 * Point d'entré
	 */
	public static void main(String[] args) throws SlickException {
        new AppGameContainer(new PsychopathGame(), 640, 480, false).start();
    }
	
	public PsychopathGame() {
		super("Psychopath");
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
		//met à jour la scene
	}
	
	
	//a déplacer, permet de quitter 
	@Override
    public void keyReleased(int key, char c) {
        if (Input.KEY_ESCAPE == key) {
            container.exit();
        }
    }

}
