package lexer;

import java.io.IOException;
import java.util.Hashtable;

public class CommentLexer extends Lexer {

    protected void skipWhitespace() {

        for (; ; peek = getNextInput()) {
            if (Character.isWhitespace(peek)) {
                if (peek == '\n') {
                    line++;
                }
            } else if (peek == '/') {
                peek = getNextInput();
                if (peek == '/') {
                    peek = getNextInput();
                    while (peek != '\n') {
                        peek = getNextInput();
                    }
                } else if (peek == '*') {
                    while (true) {
                        peek = getNextInput();

                        if (peek == '*') {
                            peek = getNextInput();
                            if (peek == '/') {
                                break;
                            }
                        }
                    }
                }

            } else {
                break;
            }
        }

    }

}
