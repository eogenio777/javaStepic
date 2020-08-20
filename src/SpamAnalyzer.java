public class SpamAnalyzer extends KeywordAnalyzer{

    private final String[] keywords;

    public SpamAnalyzer(String[] words){
        keywords = words.clone();
    }

    @Override
    public String[] getKeywords() {
        return keywords;
    }

    @Override
    public Label getLabel() {
        return Label.SPAM;
    }

}
