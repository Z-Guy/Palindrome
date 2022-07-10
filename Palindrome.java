public class Palindrome {
    public static boolean test(String candidate)
    // Returns true if candidate is a palindrome, false otherwise
    {
        char ch; // current candidate character being processed
        int length; // length of candidate string
        char fromStack; // current character pooped from stack
        char fromQueue; // current character dequeued from queue
        boolean stillPalindrome; // true if string might be a palindrome

        StackArray<Character> stack; // holds non blank string characters
        QueArray<Character> queue; // also holds non blank string characters

        // initilaize variables and structures
        length = candidate.length();
        stack = new StackArray<Character>(length);
        queue = new QueArray<Character>(length);

        // obtain and handle characters
        for (int i = 0; i < length; i++) {
            ch = candidate.charAt(i);
            if (Character.isLetter(ch)) {
                ch = Character.toLowerCase(ch);
                stack.push(ch);
                queue.enqueue(ch);
            }
        }

        // determine if palindrome
        stillPalindrome = true;
        while (stillPalindrome && !stack.isEmpty()) {
            fromStack = (char) stack.top();
            stack.pop();
            fromQueue = queue.dequeue();
            if (fromStack != fromQueue)
                stillPalindrome = false;
        }

        // return result
        return stillPalindrome;
    }
}