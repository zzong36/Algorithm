package lecture;

public class ShellSort {

    // ShellSort optimizes insertion sort
    public static void main(String[] args) {

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        // optimization phase(preliminary work)
        for(int gap = intArray.length/2; gap>0; gap/=2){

            // insertion sort
            for(int i = gap; i < intArray.length; i++){
                int newElement = intArray[i];

                int j = i;

                while(j>=gap && intArray[j-gap]>newElement){
                    intArray[j] = intArray[j-gap];
                    j -= gap;
                }

                intArray[j] = newElement;
            }
        }

        // 결과 출력
        for(int i = 0; i <intArray.length; i++){
            System.out.print(intArray[i] +" ");
        }
    }
}
