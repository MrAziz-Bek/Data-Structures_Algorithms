import java.util.Stack;

public class StringReverser {
    public String reverse(String str) {
        if (str == null)
            throw new IllegalStateException();

        var stack = new Stack<Character>();

        for (var c : str.toCharArray())
            stack.push(c);

        StringBuffer reversed = new StringBuffer();

        while (!stack.isEmpty())
            reversed.append(stack.pop());

        return reversed.toString();
    }
}
