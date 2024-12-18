package builder;

public class HtmlBuilder {
    private final HtmlDocument document;

    public HtmlBuilder() {
        document = new HtmlDocument();
    }

    public HtmlBuilder addElement(HtmlTag tag) {
        HtmlElement element = new HtmlElement(tag);
        document.addElement(element);
        return this;
    }

    public HtmlBuilder addElementWithContent(HtmlTag tag, String content) {
        HtmlElement element = new HtmlElement(tag).setContent(content);
        document.addElement(element);
        return this;
    }

    public HtmlBuilder addElementWithAttributes(HtmlTag tag, String content, String... attributes) {
        HtmlElement element = new HtmlElement(tag).setContent(content);
        for (String attribute : attributes) {
            element.addAttribute(attribute);
        }
        document.addElement(element);
        return this;
    }

    public HtmlDocument build() {
        return document;
    }
}
