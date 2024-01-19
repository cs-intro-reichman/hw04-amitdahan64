public class StringOps {
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {
        String s = "One two tHRee world";
        System.out.println(capVowelsLowRest(s));
        
    }
    /* thank god! you are the first to do that, very good!*/
    private static boolean isVowel(char ch){
        //checking if the letter is vowel type
        if(ch == 'A' || ch == 'E' || ch == 'O' || ch == 'U' ||ch == 'I' || ch == 'a' || ch == 'o' || ch == 'u' || ch == 'e' || ch == 'i'){
            return true;
        }
        else {return false;}
    }

    private static boolean lowVowel(char ch){
        //Checking if a char is a low vowel
        if(ch == 'a' || ch == 'e' || ch == 'o' || ch == 'i' || ch == 'u'){
            return true;
        }
        else{return false;}
    }
   
    public static String capVowelsLowRest (String string) {
        String output = "";
        for(int i = 0; i < string.length(); i++){
            if(isVowel(string.charAt(i))){
                if(lowVowel(string.charAt(i))){
                    output = output + ((char)(string.charAt(i) - 32));
                }
                else {
                    
                    output = output + string.charAt(i);
                }
            }
            else{
                if(string.charAt(i) < 91 && string.charAt(i) > 64){
                    output = output + ((char)(string.charAt(i) + 32));
                }

                else{
                    output = output + string.charAt(i);
                }
                
            }
        }
        return output;
    }

    private static String lowerAll(String str){
        //lowering the letters in the whole string
        String out ="";
        for(int i = 0 ; i < str.length(); i++){
            if(str.charAt(i) > 64 && str.charAt(i) < 91) {
                out = out+ ((char)(str.charAt(i) + 32));
            }
            else{out = out + str.charAt(i);}
        }
        return out;
    }

    private static String cutOuterSpaces(String str){
        //cutting spaces at the edges of the string
        while(str.charAt(0) == ' ' || str.charAt(str.length()-1) == ' '){
            if(str.charAt(0) == ' '){
                str = str.substring(1, str.length());
            }
            if(str.charAt(str.length()-1) == ' '){
                str = str.substring(0, str.length()-1);
            }
        }
        return str;

    }
    
    private static String upperFirstCharOfWord(String str){
        //uppering first letters of words
        String out = "";
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == ' ' && (i+1) < str.length()){
                if(str.charAt(i+1) > 96 && str.charAt(i+1) < 123){
                    out = out + " " + (char)(str.charAt(i+1) -32);
                    i++;
                }
            }

            else{
                out = out + str.charAt(i);
            }
            
        }
        return out;
    }
    
    private static String removeSpace(String str){
        //removing spaces between words
        String out = "";
        for(int i = 0; i < str.length(); i++){
            if(!(str.charAt(i) == ' ')){
                out = out + str.charAt(i);
            }
        }
        return out;
    }
    
    public static String camelCase (String string) {
        String output = lowerAll(string);
        output = cutOuterSpaces(output);
        output = upperFirstCharOfWord(output);
        output = removeSpace(output);
        if(output.charAt(0) > 64 && output.charAt(0) < 91)//lowering the first letter
        {
            output = (char)(output.charAt(0) + 32) + output.substring(1, output.length()-1);
        }
        return output;
    }

    public static int[] allIndexOf (String string, char chr) {
        int counter =0;
        int counter2 = 0;
        for(int i = 0; i < string.length(); i++){
            if(string.charAt(i) == chr){
                counter++;
            }
        }
        
        int [] array = new int[counter];
        for(int i = 0; i < string.length(); i++){
            if(string.charAt(i) == chr){
                array[counter2] = i;
                counter2++;
            }
        }
        return array;
    }
}
