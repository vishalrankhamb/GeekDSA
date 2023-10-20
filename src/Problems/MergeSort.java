package Problems;

import static Problems.Merge.merge;

class Merge{
    public static void merge(int arr[],int s,int e){
        int mid=(s+e)/2;
        int leftSize=mid-s+1;
        int rightSize=e-mid;
        int left[]=new int[leftSize];
        int right[]=new int[rightSize];
        int k=s;
        for(int i=0;i<leftSize;i++){
            left[i]=arr[k];
            k++;
        }
        k=mid+1;
        for(int i=0;i<rightSize;i++){
            right[i]=arr[k];
            k++;
        }
        int leftIndex=0;
        int rightIndex=0;
        int mainArrayIndex=s;
        while(leftIndex<leftSize && rightIndex<rightSize){
            if(left[leftIndex]<right[rightIndex]){
                arr[mainArrayIndex]=left[leftIndex];
                leftIndex++;
                mainArrayIndex++;
            }else{
                arr[mainArrayIndex]=right[rightIndex];
                rightIndex++;
                mainArrayIndex++;
            }
        }
        while(rightIndex<rightSize){
            arr[mainArrayIndex]=right[rightIndex];
            rightIndex++;
            mainArrayIndex++;

        }
        while(leftIndex<leftSize){
            arr[mainArrayIndex]=left[leftIndex];
            leftIndex++;
            mainArrayIndex++;

        }

    }
}
public class MergeSort {
    public static void mergeSort(int arr[],int s,int e){
        int mid=(s+e)/2;
        if(s>=e){
            return;
        }
        mergeSort(arr,s,mid);
        mergeSort(arr,mid+1,e);
        merge(arr,s,e);
    }
    public static void main(String[] args) {
        // write your code here
        int arr[]={9,3,4,5};
        int size=4;
        int s=0;
        int e=size-1;
        mergeSort(arr,s,e);
        for(int i=0;i<size;i++){
            System.out.println(arr[i]+" ");
        }
    }
}
