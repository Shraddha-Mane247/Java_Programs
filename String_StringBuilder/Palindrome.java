public class Palindrome {
    public static void main(String[] args) {
        String str="Madam";
        boolean result=isPalindrome(str);
        if(result==true){
            System.out.println("String is Palindrome !");
        }
        else{
            System.out.println("String is Not palindrome!");
        }
    }
    static boolean isPalindrome(String str){
        str=str.toLowerCase();
        for(int i=0;i<str.length();i++){
            char start=str.charAt(i);
            char end=str.charAt(str.length()-1-i);

            if(start!=end){
                return false;
            }
        }
        return true;
    }
}
