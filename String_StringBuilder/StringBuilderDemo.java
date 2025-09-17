public class StringBuilderDemo {
    //stringBUilder is the mutable class .
    public static void main(String[] args) {
        StringBuilder b1=new StringBuilder("");
        for(int i=0;i<26;i++){
            char ch=(char)('a' + i);
            b1.append(ch);      //here only one string object is created ,and new character is appended in the original string object itself. it saves meory . it overcomes the disadvatage of the string class of memory wastage problem. 
        }
        System.out.println(b1);
    }
}
