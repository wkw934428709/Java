import java.util.Scanner;
import java.util.Stack;

public class Cal {
    
    static Stack<Character> priStack = new Stack<Character>();
    static Stack<Character> numStack = new Stack<Character>();
    
    public static void main(String[] args) {
        
        
        
        String input = "HAHA";
        String output = "";
        
        while(!input.equals("")) {
            System.out.println("Please input the number : \n");
            Scanner sc = new Scanner(System.in);
            input = sc.nextLine();
            try {
                
                //Day3
                output = day3Eval(input);
                
                
            } catch (Exception e) {
                System.out.println("Wrong Input :( ");
                continue;
            } finally {
                if (!output.equals("")) {
                    return;
                }
            }
        }
        
    }
    
    private static String day3Eval(String input) {
        
        char tmp = ' ';
        StringBuffer inputStr = new StringBuffer(input);
        
        while(inputStr.length() != 0) {
            tmp = inputStr.charAt(0);
            inputStr.delete(0, 1);
            if (!isNum(tmp) || tmp == '(' || priStack.isEmpty() || priStack.contains('(')) {
                comparePri(tmp);
            } else {
                numStack.push(tmp);
            }
        }
        
        return null;
    }
    
    private static void comparePri(char tmp) {
        switch (tmp) {
            case '+':
                char firstCh = priStack.pop();
                break;
                
            case '-':
                break;
                
            case '*':
                break;
                
            case '/':
                break;
                
            case ')':
                break;
                
            default:
                break;
        }
        
    }
    
    private static boolean isNum(char tmp) {
        return Character.isDigit(tmp);
    }
    
}
