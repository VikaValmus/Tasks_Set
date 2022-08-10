package epam.com.st.text;

public class TextPrint {

    public void printToConsole(Text text) {
        System.out.println(text.getText());

        for (Sentence s : text.getText()) {
            System.out.print(createAsString(s));
            System.out.print(" ");
        }

    }

    private String createAsString(Sentence s) {
        String sent = " ";

        for (Word w : s.getSentence()) {
            sent = sent + w.getWord() + " ";
        }

        sent.trim();
        return sent;
    }


}
