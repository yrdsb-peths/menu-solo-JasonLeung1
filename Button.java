import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Button here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Button extends Actor
{
    private String label;
    
    public Button(String label) {
        this.label = label;
        updateImage();
    }
    
    private void updateImage() {
        GreenfootImage img = new GreenfootImage(label, 24, Color.WHITE, Color.BLACK);
        setImage(img);
    }
    
    
    
    /**
     * Act - do whatever the Button wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        if(Greenfoot.mouseClicked(this)) {
            World world = getWorld();
            if(label.equals("Next") &&world instanceof InstructionScreen) {
            ((InstructionScreen) world).updateInstruction(1);    
            } else if(label.equals("Previous") && world instanceof InstructionScreen) {
                ((InstructionScreen) world).updateInstruction(-1);
            } else if(label.equals("Next Avatar") && world instanceof MenuScreen) {
                ((MenuScreen) world). cycleAvatar();
            } else if(label.equals("back to Menu")) {
                Greenfoot.setWorld(new MenuScreen());
            }
        }
    }
}
