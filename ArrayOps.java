public class ArrayOps {
    public static void main(String[] args) {
        
        
    }
    
    public static int findMissingInt (int[] array) {
        int[] array2 = new int[array.length + 1];
        int missing = 999;

        for(int i = 0 ; i < array2.length; i++){
            array2[i] = i;
            }

        for(int i = 0; i < array2.length; i++){
            Boolean didFind = false;

            for(int j = 0; j < array.length; j++){
                if(array[j]==array2[i]){
                    didFind = true;
                    }

                }
                if(!didFind){
                    missing = array2[i];
                    break;
                    }

                }
    return missing;
    }

    public static int secondMaxValue(int [] array) {
        int sec;
        int max;

        if(array[0] >= array[1]){
            sec = array[1];
            max = array[0];
        }

        else{
            sec = array[0];
            max = array[1];

        }
        
        for(int i = 0; i < array.length; i++){

            if(array[i] >= max){ 
                sec = max;
                max = array[i]; 
                
            }
        }
        return sec;
    }

    public static boolean containsTheSameElements(int [] array1,int [] array2) {
        
        for(int i =0; i < array1.length; i++){
            Boolean isContaining = false;
            for(int j=0; j < array2.length; j++){
                if(array1[i] == array2[j]){
                    isContaining = true;
                    break;
                }
            }
            if(!isContaining){return false;}
        }
        return true;
    }

    public static boolean isSorted(int [] array) {
        Boolean isSortedDecreasingly = true;
        Boolean isSortedIncreasingly = true;
        int min = array[0];
        for(int i =0; i < array.length; i++){
            if(array[i] >= min){
                min = array[i];
            }
                else{
                    isSortedIncreasingly = false;
                }
            
        }

        int max = array[0];
        for(int i =0; i < array.length; i++){
            if(array[i] <= max){
                max = array[i];
            }
                else{
                    isSortedDecreasingly = false;
                }
            
        }
        return (isSortedDecreasingly || isSortedIncreasingly);
    }

}
