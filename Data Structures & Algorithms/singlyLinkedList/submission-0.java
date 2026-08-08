class LinkedList {
    ArrayList<Integer> list;
    public LinkedList() {
        list = new ArrayList<>();
    }

    public int get(int index) {
        if (index < list.size())
            return list.get(index);
        return -1;
    }

    public void insertHead(int val) {
        list.add(0,val);
    }

    public void insertTail(int val) {
        list.add(val);
    }

    public boolean remove(int index) {
        int n = list.size();
        System.out.println("size "+n);

        if (index < n) {
            list.remove(index);
            return true;
        }
        return false;
    }

    public ArrayList<Integer> getValues() {
        return list;
    }
}
