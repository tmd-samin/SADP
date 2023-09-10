import java.util.ArrayList;
import java.util.List;
class EditorMemento {
    private String text;

    public EditorMemento(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
class TextEditor {
    private StringBuilder content = new StringBuilder();

    public void write(String text) {
        content.append(text);
    }

    public String getContent() {
        return content.toString();
    }

    public EditorMemento save() {
        return new EditorMemento(content.toString());
    }

    public void restore(EditorMemento memento) {
        content = new StringBuilder(memento.getText());
    }
}
class History {
    private List<EditorMemento> mementos = new ArrayList<>();

    public void push(EditorMemento memento) {
        mementos.add(memento);
    }

    public EditorMemento pop() {
        int lastIndex = mementos.size() - 1;
        EditorMemento lastMemento = mementos.get(lastIndex);
        mementos.remove(lastIndex);
        return lastMemento;
    }
}
public class Main {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        History history = new History();

        editor.write("HI ");
        history.push(editor.save());

        editor.write("Hellow");
        System.out.println("Current content: " + editor.getContent());

        // Undo
        editor.restore(history.pop());
        System.out.println("Restored content: " + editor.getContent());
    }
}
