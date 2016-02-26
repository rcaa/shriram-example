package text;

import superclasses.JFrame;
import superclasses.UndoManager;

public class Notepad extends JFrame {
    
	public Actions actions = new Actions(this);
    private String textPane;
    
    UndoManager undo = new UndoManager();
    UndoAction undoAction = new UndoAction(this);

    public Notepad () {
    	textPane = new String();
    	this.add(textPane); 
    }
    
    public String getTextComponent() {
    	return textPane;
    }
}
