class Solution {
    public boolean isValid(String s) {
        
        // Creamos un stack con los 
        Stack<Character> brackets = new Stack<>();
        Map<Character, Character> bracketLookup = new HashMap<>(3);

        bracketLookup.put(')','(');
        bracketLookup.put('}','{');
        bracketLookup.put(']','[');

        // Recorremos el stack 'S'
        for (int i = 0; i < s.length(); i++) {

            // Primer valor de 'S'
            char c = s.charAt(i);

            // Diccionario encuentra 'S'
            if (bracketLookup.containsKey(c)) {

                // Array no esta vacio
                if(!brackets.isEmpty() && bracketLookup.get(c).equals(brackets.peek())) {
                    brackets.pop();
                } else {
                    return false;
                }

            } else {
                brackets.push(c);
            }
        }

        return brackets.isEmpty();
    }
}
