package lecture;

// Bubble Sort와 동일한 메커니즘이지만 자리 바꿈은 한 번 밖에 하지 않아 더 빠르다

public class SelectionSort {

    public static void main(String[] args) {

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        for(int lastUnsortedIndex = intArray.length-1; lastUnsortedIndex >0 ; lastUnsortedIndex--){

            int max = 0;

            for(int i =1; i <= lastUnsortedIndex; i++){
                if(intArray[i] > intArray[max]);
                max=i;
            }

            swap(intArray, max, lastUnsortedIndex);

        }

        // 결과 출력
        for(int i = 0; i <intArray.length; i++){
            System.out.print(intArray[i] +" ");
        }


    }

    // 자리 바꾸는 함수
    public static void swap(int[] array, int i, int j){
        if(i==j){
            return;
        }

        int temp = array[i];
        array[i]=array[j];
        array[j] = temp;

    }

}
