import java.util.Stack;
public class stack {
    public static void main(String[] args) {
        System.out.println("all about stack collection");
        Stack<String> animal=new Stack<>();
        animal.push("lion");
        animal.push("tiger");
        animal.push("cow");
        animal.push("dog");
        // animal.push("dog");
        animal.pop();
        System.out.println(animal.peek());

    }
}
