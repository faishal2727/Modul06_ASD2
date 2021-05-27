package No1;
public class mainStack {
    public static void main(String[] args) {
        stack newStack = new stack(10);
        newStack.push(50);
        newStack.print();
        System.out.println(" ");
        newStack.push(100);
        newStack.print();
        System.out.println(" ");
        newStack.pop();
        newStack.print();
        System.out.println(" ");
        newStack.push(60);
        newStack.print();
        System.out.println(" ");
        newStack.push(80);
        System.out.println(" ");
        newStack.print();
        newStack.pop();
        System.out.println(" ");
        newStack.print();
        long bacaTop = newStack.peek();
        System.out.println(" ");
        System.out.println("nilai top = "+bacaTop);
        System.out.println(" ");
        System.out.println("Muh.Faishal Rizal");
    }
}
