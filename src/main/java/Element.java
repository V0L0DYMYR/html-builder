


public interface Element {

  String print();
  Element add(Element inner);
  Element addAttr(String name, String value);
  Element addValue(String value);
}
