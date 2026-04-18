class Solution {
    static boolean isValid(String s) {

        Stack<Character> brackets = new Stack<>();
        Map<Character, Character> bracketsLookup = new HashMap<>(3);

        bracketsLookup.put(')','(');
        bracketsLookup.put('}','{');
        bracketsLookup.put(']','[');

        for (int i = 0; i < s.length(); i++) {

            char value = s.charAt(i); // }

            if (bracketsLookup.containsKey(value)) {
                if (!brackets.isEmpty() && bracketsLookup.get(value).equals(brackets.peek())) {
                    brackets.pop();
                } else {
                    return false;
                }

            } else {
                brackets.push(value);
            }
        }

        return brackets.isEmpty();
    }
}
