package epam.com.st.text;

//Создать объект класса Текст, используя классы Предложение, Слово.
//Методы: дополнить текст, вывести на консоль текст, заголовок текста.

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Text text = new Text();

        text.setTitle("Java");

        List<Word> st1 = new ArrayList<>();
        st1.add(new Word("j"));
        st1.add(new Word("a"));
        st1.add(new Word("v"));
        st1.add(new Word("a"));

        List<Word> st2 = new ArrayList<>();
        st2.add(new Word("h"));
        st2.add(new Word("e"));
        st2.add(new Word("l"));
        st2.add(new Word("l"));
        st2.add(new Word("o"));

        Sentence sentence1 = new Sentence(st1);
        Sentence sentence2 = new Sentence(st2);

        text.add(sentence1);
        text.add(0,sentence2);

        TextPrint textPrint = new TextPrint();
        textPrint.printToConsole(text);
    }
}
