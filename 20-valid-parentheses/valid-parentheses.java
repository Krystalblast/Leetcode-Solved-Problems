class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> bracketMap = Map.of(
            ')','(',
            '}','{',
            ']','['
        );

        Stack<Character> stack = new Stack<>();

        for (char ch: s.toCharArray()){

            if(bracketMap.containsKey(ch)){
                char topElement = stack.isEmpty() ? '#' :stack.pop();

                if(bracketMap.get(ch) != topElement){
                    return false;
                }
            } else {
                stack.push(ch);
            }
        }
        return stack.isEmpty();
    }
}