package builder;

import java.util.ArrayList;
import java.util.List;

public class HtmlDocument {
    private final List<HtmlElement> elements;

    public HtmlDocument() {
        elements = new ArrayList<>();
    }

    public void addElement(HtmlElement element) {
        elements.add(element);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("<!DOCTYPE html>\n");
        for (HtmlElement element : elements) {
            sb.append(element.toString()).append("\n");
        }
        return sb.toString();
    }
}
