class DynamicArray {

    int[] arr;
    int last = 0;
    public DynamicArray(int capacity) {
        arr = new int[capacity];
    }

    public int get(int i) {
        return arr[i];
    }

    public void set(int i, int n) {
        arr[i] = n;
        if(i > last){
            last = i;
        }
    }

    public void pushback(int n) {
        System.out.print("Push "+ last);
        last = last + 1;
        if(arr.length >= last){
            set( last-1, n);
            System.out.println("in pushback if");
        }
        else
        {
            resize();
            set(last-1, n);
        }

    }

    public int popback() {
        System.out.println("Popback last " +last);
        System.out.println(arr.length);
        int lastEle = arr[last-1];
        arr = Arrays.copyOf(arr, arr.length);
        last = last - 1;
        return lastEle;
    }

    private void resize() {
        int n = arr.length;
        int[] newArr = new int[n*2]; 
        for(int i=0; i<n; i++){
            newArr[i] = arr[i];
        }
        arr = newArr;
    }

    public int getSize() {
        return last;
    }

    public int getCapacity() {
        return arr.length;
    }
}
