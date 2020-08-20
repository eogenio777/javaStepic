public abstract class KeywordAnalyzer implements TextAnalyzer{

    public abstract String[] getKeywords();

    public abstract Label getLabel();

    @Override
    public Label processText(String text) {
        for(int i = 0; i < getKeywords().length; ++i){
            if(text.contains(getKeywords()[i])){
                return getLabel();
            }
        }
        return Label.OK;
    }
}
