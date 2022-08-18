public class Main {
    public static void main(String[] args) throws Exception {
        MyStack stack = new MyStack(5);

        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);

        System.out.println("1. Kich thuoc cua ngan sau sau khi day:  " + stack.size());
        System.out.printf("2. Cac phan tu trong ngan xep : ");

        while (!stack.isEmpty()) {
            System.out.printf(" %d", stack.pop());
        }
        System.out.println("\nKich thuc cua ngan xep sau khi xoa : " + stack.size());
    }
}
