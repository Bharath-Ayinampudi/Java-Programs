public class Isitsorted {
    static boolean sorted(int arr[], int index){
        if(index==arr.length-1) return true;
        if(arr[index]>arr[index+1]) return false;
        boolean val = sorted(arr, index+1);
        return val;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,2};
        boolean sort = sorted(arr,0);
        System.out.println(sort);
    }
}
