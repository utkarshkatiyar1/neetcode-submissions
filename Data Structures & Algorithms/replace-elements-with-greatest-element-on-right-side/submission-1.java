class Solution {
    public int[] replaceElements(int[] arr) {
        int l = arr.length;
        Map <Integer, Integer> map= new HashMap<>();
        for(int i=0; i<l-1; i++){
            int temp=0;
            if(map.containsKey(i)) arr[i]=map.get(i);
            else {
            for(int j=i+1; j<l; j++){
                if(arr[j]>temp) temp=arr[j];
            }
            arr[i]=temp;
            map.put(i, temp);
            }
        }
        arr[l-1]=-1;
        return arr;
    }
}