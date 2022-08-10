package epam.com.st.text;

import java.util.ArrayList;
import java.util.List;

public class Text {
    private String title;
    private List<Sentence> text;

    public Text() {
        text = new ArrayList<Sentence>();
    }

    public Text(List<Sentence> sentences) {
        this.text = new ArrayList<Sentence>();
        this.text.addAll(sentences);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Sentence> getText() {
        return text;
    }

    public void setText(List<Sentence> text) {
        this.text = text;
    }

    public boolean add(Sentence sentence) {
        text.add(sentence);
        return true;
    }

    public boolean add(int index, Sentence sentence) {
        if (index < 0 || index > text.size()) {
            return false;
        }
        text.add(index, sentence);
        return true;
    }

}
