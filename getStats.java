
package feefo.examples;
/**
 *
 * @author Dan
 */
public class getStats {
    
    public void getStats(int[] passedArray){
        int[] bigArray=passedArray;
        //Acquire Median
        int median = bigArray.length/2;
        System.out.println("Median is: " + bigArray[median]);
        
        //Acquire Mean
        int mean=0;
        for (int i=0; i< bigArray.length;i++){
            mean+=bigArray[i];
        }
        mean=mean/(bigArray.length+1);
        System.out.println("Mean is: " + mean);
        
        //Acquire Mode
        int mode = bigArray[0];
        int repeatNum = 0;
        int prevRepCnt = 0;
        
        //code for finding mode in Java referenced from Stack Overflow for concept
        for (int i=0; i<bigArray.length; i++){
            for (int j=i; j<bigArray.length; j++){
                if (i != j && bigArray[i] ==bigArray[j]){
                    repeatNum++;
                    if (repeatNum>=prevRepCnt){
                        mode=bigArray[i];
                    }
                    prevRepCnt = repeatNum;
                }
                repeatNum=0;
            }
        }
        System.out.println("Mode is: " + mode);
        
        //Acquire Range
        int max = bigArray[0],min = bigArray[0];
        for (int i=0;i< bigArray.length; i++){
            if (bigArray[i]>max){
                max=bigArray[i];
            } else if (bigArray[i]< min){
                min=bigArray[i];
            }
        }
        int range = (max-min);
        System.out.println("Range is: " + range);
    }
}
