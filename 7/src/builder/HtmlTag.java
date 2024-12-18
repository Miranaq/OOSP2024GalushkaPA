package builder;

public enum HtmlTag {
    HTML("html"),
    HEAD("head"),
    TITLE("title"),
    BODY("body"),
    H1("h1"),
    P("p"),
    DIV("div"),
    SPAN("span");

    private final String tag;

    HtmlTag(String tag) {
        this.tag = tag;
    }

    public String getTag() {
        return tag;
    }
}
