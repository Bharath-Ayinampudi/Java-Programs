public class FindOccurence{
    static int FirstOccur(int arr[],int index,int value){
        if(index==arr.length) return -1;
        if(arr[index]==value) return index;
        return FirstOccur(arr, index+1, value);
    }

    static int LastOccur(int arr[],int index, int value){
        int position = 0;
        if(index==arr.length) return -1;
        for(int i=index;i<arr.length;i++){
            if(arr[i]==value){
                position = i;
            }
        }
        return position;
    }
    public static void main(String[] args) {
        int arr[]={1,4,2,1,3,5,4,6,5,56};
        System.out.println(FirstOccur(arr, 0, 4));
        System.out.println(LastOccur(arr, 0, 4));
    }
}