package lexer;

public class TestLexer {
	public static void main(String[] args) {

		Lexer lexer = new Lexer(new Lexer.InputController() {

			@Override
			public char getNext() {
				return 0;
			}
		});

		System.out.println("Start");
		try {
			Token t = lexer.scan();

			if ( t instanceof Num ) {
				System.out.println(String.format("Number, value = %d", ((Num) t).value));
			} else if ( t instanceof Word ) {
				System.out.println(String.format("Word, value = %s", ((Word) t).lexeme));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
