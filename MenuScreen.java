import java.util.LinkedList;
import java.util.Queue;
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MenuScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MenuScreen extends World
{
    private Queue<GreenfootImage> avatars =new LinkedList<>();
    private Actor avatarDisplay;
    /**
     * Constructor for objects of class MenuScreen.
     * 
     */
    public MenuScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        Button startButton = new Button("Start Game");
        addObject(startButton, getWidth() / 2, getHeight() / 2);
        
        avatarDisplay = new Actor() {
            { setImage(avatars.peek()); }
        };
        addObject(avatarDisplay, getWidth() / 2, getHeight() / 2);

        Button nextAvatarButton = new Button("Next Avatar");
        addObject(nextAvatarButton, getWidth() / 2, getHeight() - 50);
    }
    
    public void cycleAvatar() {
        GreenfootImage avatar = avatars.poll();
        avatars.add(avatar);
        avatarDisplay.setImage(avatars.peek());
    }
}
