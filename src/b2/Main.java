package b2;

public class Main {
    public static void main(String[] args) throws Exception {
        int[] arr = {1,2,4,5,6,2,1,8,9,3,5,4,2,1,5,2,4,2,5,};
        int max = arr[0];
        if (arr.length == 0){
            throw new Exception("Mảng không có phần tử");
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >max){
                max = arr[i];
            }
        }
        System.out.println("Số lớn nhất trong mảng là:" + max);
    }
}
