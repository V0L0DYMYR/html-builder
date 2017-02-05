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
        .toString();
    assertThat(html, is("<html><button></button></html>"));
  }
}
