/**
 * class expr, which stands for the expression.
 */

public class Analyser{
	
	private String input;
	private int lookaheadPointer;
	private char lookahead;
	
	public Analyser(String input) {
		this.input = input;	
		if (input.length() > 0) {
			lookahead = this.input.charAt(0);
			lookaheadPointer = 0;
		}
	};

	public void expr() {
		term();
		rest();
	}

	public void term(){
		if ( lookahead >= '0' && lookahead <= '9') {
			char t = lookahead;
			match(lookahead);
			System.out.print(t);
		}
		
	}

	public void rest(){
		if ( lookahead == '+') {
			match('+');
			term();
			System.out.print('+');
			rest();
		} else if ( lookahead == '-') {
			match('-');
			term();
			System.out.print('-');
			rest();

		}

	}

	private void match(char in){
		if ( lookahead == in ) {
			lookaheadPointer++;
			if ( lookaheadPointer < input.length() )
				lookahead = input.charAt(lookaheadPointer); 

		} else {
			System.out.println("Syntax Error.");
			System.out.println("Expect " + in + " While get " + lookahead + ".");
		}
	}
}


