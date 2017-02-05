import java.util.ArrayList;
import java.util.List;




public class Html implements Element {

  private List<Element> elements = new ArrayList<>();

  public String print() {
    StringBuilder buf = new StringBuilder();

    for (Element element : elements) {
      buf.append(element.print());
    }

    return buf.toString();
  }

  public Html add(Element element) {
    this.elements.add(element);
    return this;
  }
}
