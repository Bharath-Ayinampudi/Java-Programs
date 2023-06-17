
public class AscendingDiff {
    public static void main(String[] args) {
        int[] arr = {6,5,4,3,2,1};
        int min =arr[0];
        int max = arr[1];

        int current = 1;
        int index = 0;

        for(int i=0;i<arr.length;i++){
            current = arr[i];
            if(min > current && current != arr[arr.length-1]){
                min = current;
                index = i;
            }

            if(min < current && current> arr[index]){
                max = current;
            }
        }
        System.out.println("MAX:"+max);
        System.out.println("MIN:"+min);
        if(min>max){
            System.out.println(-1);
        }else{
            System.out.println(max-min);
        }
    }    
}
