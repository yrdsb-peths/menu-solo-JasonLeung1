import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class InstructionScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class InstructionScreen extends World
{
    private String[] instructions = {
        "Page 1",
        "Page 2",
        "Page 3",
    };
    private int currentPage = 0;
    private Label instructionLabel; 

    
    /**
     * Constructor for objects of class InstructionScreen.
     * 
     */
    public InstructionScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        Button nextButton = new Button("Next");
        addObject(nextButton, getWidth() - 50, getHeight() - 50);
        
        Button previousButton = new Button("Previous");
        addObject(previousButton, 50, getHeight() - 50);
        
        Button backButton = new Button("Back to Menu");
        addObject(backButton, getWidth() / 2, getHeight() - 50);
    }
    
    public void updateInstruction(int change) {
        
        
        if(currentPage < 0) {
            currentPage = instructions.length - 1;
        } else if(currentPage >= instructions.length) {
            currentPage = 0;
        }
        
    }
}
