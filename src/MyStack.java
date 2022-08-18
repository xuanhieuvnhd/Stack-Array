public class MyStack {
    private int arr[];
    private int size;
    private int index = 0;
    public boolean isFull() {
        if (index == size) {
            return true;
        }
        return false;
    }
    public boolean isEmpty() {
        if (index == 0) {
            return true;
        }
        return false;
    }
    public MyStack(int size) {
        this.size = size;
        arr = new int[size];
    }
    public void push(int element){
        if (isFull()) {
            throw new StackOverflowError("Ngan xep dayl");
        }
        arr[index] = element;
        index++;
    }
    public int pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Ngan xep rong");
        }
        return arr[--index];
    }
    public int size() {
        return index;
    }

}
