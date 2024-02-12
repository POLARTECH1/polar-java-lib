import java.util.ArrayList;

/**
 * Allow to get the result of a string operation like "1+2+5" and give 8 as answer.
 * @author Laine Valery Cedric
 * @version 1.0
 */
public class StringCalculator {
    private ArrayList<String> elements;
    private ArrayList<String> operators;
    private String operation;
    private String invalidChars = "[^0-9A-Fa-f+]";

    /**
     *
     * @param operation the operation string;
     */
    public StringCalculator(String operation) {
        this.operation = operation;
    }
    public StringCalculator(String operation, int outputBase) {
        this.operation = operation;
    }
}

