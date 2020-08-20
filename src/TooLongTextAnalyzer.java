public class TooLongTextAnalyzer implements TextAnalyzer{

    private final int maxLength;

    public TooLongTextAnalyzer(int length){
        maxLength = length;
    }

    @Override
    public Label processText(String text) {
        if(text.length() > maxLength)
            return Label.TOO_LONG;
        else return Label.OK;
    }
}
