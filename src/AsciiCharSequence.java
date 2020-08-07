//import java.lang.CharSequence;
public class AsciiCharSequence implements CharSequence/* extends/implements */ {

    private final byte[] array_;

    public AsciiCharSequence(byte[] arr){
        array_ = arr.clone();
        //array_ = new byte[arr.length];

    }
    @Override
    public int length(){
        return array_.length;
    }
    @Override
    public char charAt(int index){
        return (char)array_[index];
    }

    @Override
    public AsciiCharSequence subSequence(int start, int end) {
        byte[] bRes = new byte[end-start];
        for(int i = start;i < end; ++i){
            bRes[i-start] = array_[i];
        }
        AsciiCharSequence result = new AsciiCharSequence(bRes);
        return result;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for(int i = 0;i < array_.length;++i){
            result.append((char)array_[i]);
        }
        return result.toString();
    }
    // implementation
}