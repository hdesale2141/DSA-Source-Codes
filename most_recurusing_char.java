public class most_recurusing_char {

    public static void main(String[] args) {
        String str = "abcdeakhasnka";
        
        int freq[] = new int[256];

        for(int i=0 ;i<str.length();++i)
        {
            int id = str.charAt(i);
            freq[id]++;
        }

        int max_id = -1;
        int max_f = -1;

        for(int i=0;i<freq.length;++i)
        {
            if(freq[i] > max_f)
            {
                max_f= freq[i];
                max_id = i;
            }
        }

        System.out.println("Maximum reapeted Char is = "+(char)max_id);
    }
    
}
