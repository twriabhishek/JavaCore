package Array_Problems;


public class frequencyofeachelementinarray {
    public static void frequency(int arr[]){
        int size = arr.length;
        int value = 0;
        int count = 1;
        boolean visited[] = new boolean[size];

        for(int i=0; i<size ; i++){
            if(!visited[i]){
                value=arr[i];
                for(int j=i+1; j<size; j++){
                    if(value == arr[j]){
                        count++;
                        visited[j]=true;
                    }
                }
                System.out.println(value+"-"+count);
                visited[i]=true;
                value = 0;
                count = 1;
            }
        }

    }
    public static void main(String[] args) {
        int arr[] = { 5, 2, 9, 1, 6, 2, 9, 1};
        frequency(arr);
    }
}
