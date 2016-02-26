package text;

public class UndoAction {

	Notepad notepad;

	public UndoAction(Notepad notepad) {
		this.notepad = notepad;
	}

	public void actionPerformed() {
		notepad.undo.undo();
	}
}
