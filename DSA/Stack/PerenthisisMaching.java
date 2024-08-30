public class PerenthisisMaching {
    int size;
    int top;
    char[] arr;

    PerenthisisMaching(int size) {
        this.size = size;
        this.top = -1;
        this.arr = new char[size];
    }

    public void push(char val) {
        if (top == size - 1) {
            System.out.println("Stack is overflow.");
            return;
        }
        arr[++top] = val;
    }

    public char pop() {
        if (top == -1) {
            System.out.println("Stack is underflow.");
            return '\0';
        }
        char val = arr[top--];
        return val;
    }

    public static boolean match(char a, char b) {
        if ((a == '(' && b == ')') || (a == '{' && b == '}') || (a == '[' && b == ']'))
            return true;

        return false;
    }

    public static boolean PerenthisisMaching_fun(String exp) {
        PerenthisisMaching stack = new PerenthisisMaching(100);

        for (int i = 0; i < exp.length(); i++) {
            if ((exp.charAt(i) == '(') || (exp.charAt(i) == '{') || (exp.charAt(i) == '[')) {
                stack.push(exp.charAt(i));
            } else if ((exp.charAt(i) == ')') || (exp.charAt(i) == '}') || (exp.charAt(i) == ']')) {
                if (stack.top == -1) {
                    System.out.println("Stack is underflow.");
                    return false;
                }

                char popedChar = stack.pop();
                if (match(popedChar, exp.charAt(i)) == false) {
                    return false;
                }
            }
        }

        if (stack.top == -1)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {

        String exp = "{a+b}*[(8-1)+(8-1)]";

        if (PerenthisisMaching_fun(exp))
            System.out.println("Perenthisis is maching.");
        else
            System.out.println("Perenthisis is not maching.");
    }
}