class Solution {
    int MAX = 100;
    int top = -1;
    char stack[] = new char[MAX];

    public String clearDigits(String s) {
        for(char c : s.toCharArray()) {
            if(Character.isDigit(c)) {
                pop();
            }
            else {
                push(c);
            }
        }
        return display();
    }

    public void push(char c) {
        if(top >= MAX-1) {
            return;
        }
        stack[++top] = c;
    }

    public void pop() {
        if(top >= 0) {
            top--;
        }
    }

    public String display() {
        StringBuilder res = new StringBuilder();
        if(top >= 0) {
            for(int i=0;i<=top;i++) {
                res.append(stack[i]);
            }
        }
        return res.toString().trim();
    }
}