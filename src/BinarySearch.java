public class BinarySearch {

    static public int binarySearch(int[] list, int key){
        int low=0;
        int high=list.length-1;
        return binarySearch(list,key,low,high);
    }

    static public int binarySearch(int[] list, int key, int low, int high){
        if (low>high)
            return -low-1;

        int mid=(low+high)/2;
        if (key<list[mid])
            return binarySearch(list,key,low,mid-1);
        else if (key==list[mid])
            return mid;
        else
            return binarySearch(list,key,mid+1,high);
    }

    static public int nBinarySearch(int[] list, int key){
        int low=0;
        int high=list.length-1;
        return nBinarySearch(list,key,low,high);
    }

    static public int nBinarySearch(int[] list, int key, int low, int high){
        while (low<=high){
            int mid=(low+high)/2;
            if (list[mid]==key)
                return mid;
            else if (list[mid]<key)
                low=mid+1;
            else
                high=mid-1;
        } return -low-1;
    }
}
