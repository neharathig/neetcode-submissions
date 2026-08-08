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
    }

    public void pushback(int n) {
       
        if(capacity == size){
            resize();
        }
        arr[size] = n;
        size++;
    }

    public int popback() {
          size = size-1;
          return arr[size];
    }

    private void resize() {
        capacity = capacity * 2;
        int[] newArr = new int[capacity];
        for (int i = 0; i < size; i++) {
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
