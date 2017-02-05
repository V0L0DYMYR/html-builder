import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class AbstractElement implements Element{

  protected Map<String, String> attrs = new HashMap<>();
  protected List<Element> elements = new ArrayList<>();
  protected String tagName;
  private String value = "";

  protected AbstractElement(String tagName) {
    this.tagName = tagName;
  }

  @Override
  public Element addAttr(String name, String value) {
    attrs.put(name, value);
    return this;
  }

  @Override
  public Element addValue(String value) {
    this.value = value;

    return this;
  }

  public String print() {
    StringBuilder buf = new StringBuilder();
    buf.append("<").append(tagName);

    for (String attrName : attrs.keySet()) {
      buf.append(' ')
          .append(attrName)
          .append("=\"")
          .append(attrs.get(attrName))
          .append('"');
    }

    buf.append(">");

    for (Element element : elements) {
      buf.append(element.print());
    }

    return buf.append(value).append("</")
        .append(tagName)
        .append(">")
        .toString();
  }

  public Element add(Element element) {
    this.elements.add(element);
    return this;
  }

}
