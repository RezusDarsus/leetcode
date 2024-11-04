class Solution {
    
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length];
        int index = 0;
        buble(arr1);

        for (int i = 0; i < arr2.length; i++){
            for (int j = 0; j <arr1.length;j++){
                    if(arr2[i] == arr1[j]){
                        result[index++] = arr2[i];
                    }
            }
        }
        for (int j = 0; j < arr1.length; j++) {
            boolean found = false;
            for (int i = 0; i < arr2.length; i++) {
                if (arr1[j] == arr2[i]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                result[index++] = arr1[j];
            }
        }

        return result;
    }



    void buble(int[] arr) {
        int length = arr.length;
        while (length != 0) {
            int max_index = 0;
            for (int i = 1; i < length; i++) {
                if (arr[i - 1] > arr[i]) {
                    int temp = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = temp;
                    max_index = i;
                }

            }

            length = max_index;
        }
    }
}
