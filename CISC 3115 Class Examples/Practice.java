public class Practice{
    public static void main(String[] args){
        if(args.length!=3){
            System.err.println("Error: Must Supply three Arrguments");
            System.exit(1);
        }

        int operand1 = Integer.parseInt(args[0]);
        
        char operator = args[1].charAt(0);

        int operand2 = Integer.parseInt(args[2]);

        process(operand1, operator, operand2);

        System.out.println(ans);
    }

    private static int process(int op1, char operator, int op2){

    	int ans = 0;

    	switch(operator){
    		case '+':
    		ans= op1+op2;
    		break;

    		case '-':
    		ans = op1 - op2;
    		break;

    		case '/':
    		ans = opt1 / opt2;
    		break;

    		default: System.err.println("Unknown Operation.");
    		System.ext(1);
    		break;
    	}
    	return ans;
    }
}