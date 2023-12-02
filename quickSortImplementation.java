import java.util.*;
public class QuickSort {
    static void quickSort(int arr[],int start,int end){
        if(start<end){
        int p=partition(arr,start,end);
        quickSort(arr,start,p-1);
        quickSort(arr,p+1,end);
        }
        else return;
    }
    static int partition(int arr[],int start,int end){
        int pivot=arr[end];
        int i=start-1;
        for(int j=start;j<=end-1;j++){
            if(arr[j]<pivot){
                i++;
                int t=arr[j];
                arr[j]=arr[i];
                arr[i]=t;
            }
        }
        int t=arr[i+1];
        arr[i+1]=arr[end];
        arr[end]=t;
        return i+1;
    }
    public static void main(String args[]) {
      int arr[]={5,7,1,2,-3,12,8};
      int n=arr.length;
      System.out.print("Array Before Sorting- ");
      for(int i:arr) System.out.print(i+" ");
      quickSort(arr,0,n-1);
      System.out.print("Array After Sorting- ");
      for(int i:arr) System.out.print(i+" ");
      
    }
}
