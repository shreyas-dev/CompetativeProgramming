package strings;

import helpers.InputReader;

public class StringCompression1 {

    //    Input: aaabbccccaaa
    //    Output:a3b2c4a3
    public static void main(String[] args) {
        InputReader inputReader=new InputReader(System.in);
        System.out.println("Enter String to be compress:");
        System.out.println("Compressed String:\n"+compress(inputReader.readString()));
    }

    private static String compress(String s) {
        StringBuilder stringBuilder=new StringBuilder();
        char last=s.charAt(0);
        int count=1;
        for(int i=1;i<s.length();i++){
            if(last==s.charAt(i)){
                count++;
            }else{
                stringBuilder.append(last+""+count);
                if(stringBuilder.toString().length()>=s.length())
                    return s;
                last=s.charAt(i);
                count=1;
            }
        }
        stringBuilder.append(last+""+count);
        return stringBuilder.toString();
    }
}
