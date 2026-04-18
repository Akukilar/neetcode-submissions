public class Solution {
    public bool IsValid(string s) {
        
        // Create a Stack to store the characters
        // WHY A STACK? we need to compare a closing bracket with the previous bracket, if they match we pop off the stack both. 
        // Finally resulting in nothing if the order of the brackets are correct  
        Stack<char> stack = new Stack<char>();
        
        // Dictionary to match the opening and closing brackets
        Dictionary<char,char> closeToOpen = new Dictionary<char, char> {
            { ')', '(' },
            { ']', '[' },
            { '}', '{' }
        };

        // Iterate through the string character
        // if the char matches a closing bracket, then we check the Dictionary to either pop the char of the stack or do nothing.
        // IF char is not a closing bracket just push it into the stack.
        foreach (char c in s) {
            if (closeToOpen.ContainsKey(c)) {
                if (stack.Count > 0 && stack.Peek() == closeToOpen[c]) {
                    stack.Pop();
                } else {
                    return false; // Incorrect order of the brackets
                }
            } else { 
                stack.Push(c);
            }
        }
            return stack.Count == 0;
    }
}
