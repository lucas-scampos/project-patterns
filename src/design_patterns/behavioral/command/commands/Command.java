package design_patterns.behavioral.command.commands;

import design_patterns.behavioral.command.editor.Editor;

// Abstract command defines the common interface for all
// concrete commands.
public abstract class Command {

	public Editor editor;
    private String backup;

    Command(Editor editor) {
        this.editor = editor;
    }

    void backup() {
        backup = editor.textField.getText();
    }

    public void undo() {
        editor.textField.setText(backup);
    }

    public abstract boolean execute();
}