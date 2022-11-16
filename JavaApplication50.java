
package javaapplication50;
import java.util.Arrays;

public class JavaApplication50 {

   
    public static void main(String[] args) {
        
        int[] m = {9,11,3,4,7,5,8,10};
        bubbleSort(m);
        System.out.println(Arrays.toString(m));        
    }

    private static void bubbleSort(int[] m) {
         int tmp;
         for (int i = 0; i < m.length; i++) {
             for (int j = 0; j < m.length - 1 ; j++) {
                 if( m[j] > m[j + 1]){
                     tmp = m[j];
                     m[j] = m[j + 1];
                     m[j + 1] = tmp;
                }                
            }
            
        }
         
    }
    
}
