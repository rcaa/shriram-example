package text;

import superclasses.JFrame;

public class Notepad extends JFrame {
    
	public Actions actions = new Actions(this);
    private String textPane;

    public Notepad () {
    	textPane = new String();
    	this.add(textPane); 
    }
    
    public String getTextComponent() {
    	return textPane;
    }
}
