package text;

import javax.swing.JOptionPane;

public class Actions {

	Notepad n;
	
	String findWord;
	int findIndex;
	
	public Actions(Notepad n) {
		this.n = n;
	}
	
	public void cut() {
		n.getTextComponent().toString();
	}
	
	public void copy() {
		n.getTextComponent().toString();
	}
	
	 public void paste(){
	     n.getTextComponent().toString();
	}
	 
	public void find() {
		findWord = JOptionPane.showInputDialog("Type the word to find");
		findIndex = n.getTextComponent().indexOf(findWord);
		if (findIndex == -1) {
			JOptionPane.showMessageDialog(null,"Word not found");
		} else { 
			// selectFound(); 
		}			
	}
	 
}
