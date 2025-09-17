public class String_immutability{
    public static void main(String[] args){

        String series="";

        for(int i=0;i<26;i++){
            char ch=(char)('a' + i);
            series=series+ch;   //here each time new object is get created .previous objet value copiees into new object then appended new string into it. so toos much memory got used . that why we use StringBuilder class to save the memory .
        }
        System.out.println(series.toString());
    }
}