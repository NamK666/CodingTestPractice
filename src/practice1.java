public class practice1 {
    public static void main(String[] args) {
        String str= "When organizing items, always label each group with the appropriate category. category: books, category: electronics, category: clothing, category: kitchenware, and so on. ";
        printCategroy(str);
    }

        // 카테고리 콜론 다음에 나오는 단어를 출력하기.
       static void printCategroy(String str){
        int i=0;
        while(true){
            // i의 값이 업데이트 되면서 해당 인덱스의 문자열을 탐색합니다.
             int idx= str.indexOf("category:", i);
             if(idx==-1){
                 break;
             }
             int startIdx = idx + 9;
             int endIdx = str.indexOf(',',startIdx);
            System.out.println(str.substring(startIdx, endIdx));
            i=endIdx+1;
           }
        }

    }

