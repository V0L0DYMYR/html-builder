
public class HtmlBuilder {

  private StringBuilder html = new StringBuilder();

  private HtmlBuilder(){

  }

  public HtmlBuilder addBody() {
    html.append("<body></body>");
    return this;
  }

  public String build() {
    html.insert(0, "<html>");
    html.append("</html>");
    return html.toString();
  }

  public static HtmlBuilder newBuilder() {
    return new HtmlBuilder();
  }
}
