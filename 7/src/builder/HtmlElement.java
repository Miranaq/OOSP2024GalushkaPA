package builder;

import java.util.ArrayList;
import java.util.List;

public class HtmlElement {
    private final HtmlTag tag;
    private final List<String> attributes;
    private final List<String> children;
    private String content;

    public HtmlElement(HtmlTag tag) {
        this.tag = tag;
        this.attributes = new ArrayList<>();
        this.children = new ArrayList<>();
        this.content = "";
    }

    public HtmlElement addAttribute(String attribute) {
        attributes.add(attribute);
        return this;
    }

    public HtmlElement addChild(String child) {
        children.add(child);
        return this;
    }

    public HtmlElement setContent(String content) {
        this.content = content;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("<").append(tag.getTag());

        for (String attribute : attributes) {
            sb.append(" ").append(attribute);
        }

        sb.append(">");
        if (!content.isEmpty()) {
            sb.append(content);
        }
        for (String child : children) {
            sb.append(child);
        }
        sb.append("</").append(tag.getTag()).append(">");
        return sb.toString();
    }
}
