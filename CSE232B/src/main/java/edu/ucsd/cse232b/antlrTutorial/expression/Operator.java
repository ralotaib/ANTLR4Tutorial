package edu.ucsd.cse232b.antlrTutorial.expression;

/**
 * Operator
 */
public enum Operator {
    ADD("+"),
    MULTI("*"),
    DIV("/");

    /* The string representation of an operator. */
    private final String str;

    Operator(final String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return str;
    }

    /**
     * Retern enum type of a given string operator
     *
     * @param operator
     * @return Operator
     */
    public static Operator fromString(final String operator) {
        for (Operator b : Operator.values()) {
            if (b.str.equalsIgnoreCase(operator)) {
                return b;
            }
        }
        return null;
    }
}
