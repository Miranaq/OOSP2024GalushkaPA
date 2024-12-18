import builder.HtmlBuilder;
import builder.HtmlTag;

public class Main {
    public static void main(String[] args) {
        HtmlBuilder builder = new HtmlBuilder();

        // Создание HTML-документа
        String htmlDocument = builder
                .addElement(HtmlTag.HTML)
                .addElement(HtmlTag.HEAD)
                .addElementWithContent(HtmlTag.TITLE, "My HTML Document")
                .addElement(HtmlTag.BODY)
                .addElementWithContent(HtmlTag.H1, "Welcome to My Page")
                .addElementWithAttributes(HtmlTag.P, "This is a paragraph.", "class='text'")
                .addElement(HtmlTag.DIV)
                .addElementWithContent(HtmlTag.SPAN, "This is a span inside a div.")
                .build()
                .toString();

        // Вывод HTML-документа
        System.out.println(htmlDocument);
    }
}
