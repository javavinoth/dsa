package vinoth.dsa.string;

import java.util.ArrayDeque;
import java.util.Map;

/*
https://www.hackerrank.com/challenges/balanced-brackets/problem
 */
public class BalancedBrackets {

    public static boolean solve(String input) {
        Map<Character, Character> map = Map.of('(', ')', '[', ']', '{', '}');
        if (input.length() % 2 != 0)
            return false;
        ArrayDeque<Character> deque = new ArrayDeque<>(); // use deque as a stack
        for (int i = 0; i < input.length(); i++) {
            Character ch = input.charAt(i);
            if (map.containsKey(ch)) {
                deque.push(ch);
            } else if (deque.isEmpty() || ch != map.get(deque.pop())) {
                return false;
            }
        }
        return deque.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(solve("{[()]}"));
    }
}
