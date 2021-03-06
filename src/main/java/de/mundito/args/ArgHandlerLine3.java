package de.mundito.args;

/**
 * User: webbasan Date: 23.04.15 Time: 22:35
 */
public final class ArgHandlerLine3
        extends ArgHandler
{
    static final Factory FACTORY = new Factory() {
        @Override
        public Parameter getParameter() {
            return Parameter.LINE3;
        }

        public ArgHandlerLine3 create(final String... values) {
            return new ArgHandlerLine3(values);
        }
    };

    private String textLine;

    private ArgHandlerLine3(final String... values) {
        super(values);
    }

    public String getTextLine() {
        return textLine;
    }

    /**
     * The "line3" argument is valid, if the given text is not null.
     *
     * @return true, if the given value is valid.
     */
    @Override
    public boolean isValid() {
        return this.textLine != null;
    }

    @Override
    public String getInvalidValueMessage() {
        return "Invalid values for parameter " + getParameter().name() + "."
                + " Valid values are: " + Parameter.LINE3.getDescription();
    }

    @Override
    protected void parse(final String... values) {
        this.textLine = values[0] != null ? values[0] : "";
    }

    @Override
    public Parameter getParameter() {
        return FACTORY.getParameter();
    }
}
