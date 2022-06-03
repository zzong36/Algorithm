package lecture;

/*
* Bubblesort는 두 자리를 순차적으로 비교하며 앞의 값이 뒤의 값보다 크면 자리를 바꾼다.
* 자주 사용하지 않음.
* stable sort vs unstable sort
* */
public class BubbleSort {

    public static void main(String[] args) {

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        for(int lastUnsortedIndex = intArray.length-1; lastUnsortedIndex >0 ; lastUnsortedIndex--){
            for(int i = 0; i < lastUnsortedIndex; i++){
                if(intArray[i]>intArray[i+1]){
                    swap(intArray, i, i+1);
                }
            }
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
