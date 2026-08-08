class DynamicArray {
    int[] arr;
    int size = 0;
    int capacity = 0;
    public DynamicArray(int capacity) {
        arr = new int[capacity];
        this.capacity = capacity;
    }

    public int get(int i) {
        return arr[i];
    }

    public void set(int i, int n) {
        arr[i] = n;
        if (i > size) {
            size = i;
        }
    }

    public void pushback(int n) {
        size = size + 1;
        if(capacity >= size){
            set(size-1, n);
        }
        else{
            resize();
            set(size-1,n);
        }
    }

    public int popback() {
           int lastEle = arr[size-1];
           size = size - 1;
           arr = Arrays.copyOf(arr, arr.length);
           return lastEle;
    }

    private void resize() {
        int n = arr.length;
        capacity = n * 2;
        int[] newArr = new int[n * 2];
        for (int i = 0; i < n; i++) {
            newArr[i] = arr[i];
        }
        arr = newArr;
    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return capacity;
    }
}
