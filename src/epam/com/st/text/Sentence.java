package epam.com.st.text;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Sentence {

    private List<Word> sentence;

    public Sentence() {
        sentence = new ArrayList<>();
    }

    public Sentence(List<Word> sentence) {
        this.sentence = new ArrayList<>();
        this.sentence.addAll(sentence);
    }

    public List<Word> getSentence() {
        return sentence;
    }

    public void setSentence(List<Word> sentence) {
        this.sentence = sentence;
    }

    public boolean add(Word word) {
        sentence.add(word);
        return true;
    }

    public boolean add(int index, Word word) {
        if (index < 0 || index > sentence.size()) {
            return false;
        }
        sentence.add(index, word);
        return true;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sentence sentence1 = (Sentence) o;
        return Objects.equals(sentence, sentence1.sentence);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sentence);
    }
}
