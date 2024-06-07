import java.util.Arrays;

public class practice2 {
    public static void main(String[] args) {
        System.out.println(search(new int[] {1,2,3,4,5,},10));
/*
        String someTxt = "물방울이 떨어지는 소리를 들으며 나는 한적한 숲속 오두막에서 책을 읽고 있었다.";
        //for (int i=0; i<=someTxt.length();i++){
        //    System.out.println(someTxt.charAt(i));
        //}

        for (int i= someTxt.length()-1; i>=0; i--) {
            System.out.println(someTxt.charAt(i));
        }



        int[] arr = {1, 2, 3, 4, 5};
        int searchNum = 2;
        if (contains(arr, searchNum){
            System.out.println(searchNum);
        }else{
            System.out.println(-1);
        }

 */
        static int search(int[] nums, int target){
            int result;
            for(int i=0;i<nums.length;i++){
                if(nums[i]==target){
                    result = i;
                }
            }
            return result;
        }

    }
}
