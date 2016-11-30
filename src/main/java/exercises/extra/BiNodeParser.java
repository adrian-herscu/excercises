/**
 * 
 */
package exercises.extra;

import java.util.*;

/**
 * 
 *
 * @author aherscu
 *
 */
public class BiNodeParser {

    public static class Token {
        public enum Type {
            VALUE, COMMA, LPAREN, RPAREN;
        }

        public final Type   type;
        public final String value;

        public Token(final Type type, final String value) {
            this.type = type;
            this.value = value;
        }

        public Token(final Type type) {
            this(type, null);
        }
    }

    /**
     * @param tree
     * @return
     */
    public static String serialized(final BiNode expression) {
        return expression.value
            + (expression.left != null
                ? "(" + serialized(expression.left)
                    + (expression.right != null
                        ? "," + serialized(expression.right)
                        : "")
                    + ")"
                : "");
    }

    /**
     * @param string
     * @return
     */
    public static BiNode parsed(final String string) {
        if (string == null || string.length() == 0)
            return null;
        
        final BiNode tree;
        
        for (final Token token : tokenized(string)) {
            switch(token.type) {
            case VALUE:
                break;
            case COMMA:
            case LPAREN:
            case RPAREN:
            default:
                break;
            }
        }
        return tree;
    }

    private static List<Token> tokenized(final String string) {
        final List<Token> tokens = new LinkedList<>();
        final StringBuffer valueBuffer = new StringBuffer();
        for (int index = 0; index < string.length(); index++) {
            switch (string.charAt(index)) {
            case '(':
                if (valueBuffer.length() > 0)
                    tokens.add(
                        new Token(Token.Type.VALUE, valueBuffer.toString()));
                tokens.add(new Token(Token.Type.LPAREN));
                valueBuffer.setLength(0);
                break;
            case ')':
                if (valueBuffer.length() > 0)
                    tokens.add(
                        new Token(Token.Type.VALUE, valueBuffer.toString()));
                tokens.add(new Token(Token.Type.RPAREN));
                valueBuffer.setLength(0);
                break;
            case ',':
                if (valueBuffer.length() > 0)
                    tokens.add(
                        new Token(Token.Type.VALUE, valueBuffer.toString()));
                tokens.add(new Token(Token.Type.COMMA));
                valueBuffer.setLength(0);
                break;
            default:
                valueBuffer.append(string.charAt(index));
            }
        }
        return tokens;
    }
}
