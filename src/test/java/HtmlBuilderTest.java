



import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class HtmlBuilderTest {

  @Test
  public void simple() {
    String html = HtmlBuilder.newBuilder().addBody().build();
    assertThat(html, is("<html><body></body></html>"));
  }

  @Test
  public void elements() {
    String html = new Html()
        .add(new Button())
        .add(new Input())
        .print();
    assertThat(html, is("<html><button></button><input></html>"));
  }

  @Test
  public void attributes() {
    String html = new Html()
        .add(new Button().addAttr("class", "btn btn-primary"))
        .add(new Input().addAttr("name", "emailField"))
        .print();

    assertThat(html, is("<html><button class=\"btn btn-primary\"></button><input></html>"));
  }

  @Test
  public void addCssFile() {
    String html = new Html()
        .add(new Head()
          .add(new Link()
              .addAttr("href", "https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css")
              .addAttr("rel", "stylesheet")))
        .add(new Body()
          .add(new Button()
              .addValue("Press Me")
              .addAttr("onclick", "alert('Hello!')")
              .addAttr("class", "btn btn-primary")))
        .print();

    System.out.println(html);
  }
}
