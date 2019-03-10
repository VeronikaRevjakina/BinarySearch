public class BinarySearch {
   static int[]  sortedArr={1,2,3,4,5,6,7,9,11,12};

    public  static int binarySearch(int number){
        int start=0;
        int end=sortedArr.length;

        while(start<=end-1){
            int mid=(start+end)/2;
            if(number==sortedArr[mid])  {
                System.out.println(mid);
              return mid;
          }
          else if(number > sortedArr[mid]){
                start=mid+1;
            }
            else{
              end=mid;
            }
        }
        System.out.println(-1);
        return -1;
    }
}
