package flyweight.exercise;

public class Cell {
  private final int row;
  private final int column;
  private String content;
  private FontFamily fontFamily;
  private int fontSize;
  private boolean isBold;

  public Cell(int row, int column) {
    this.row = row;
    this.column = column;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public FontFamily getFontFamily() {
    return fontFamily;
  }

  public void setFontFamily(FontFamily fontFamily) {
    this.fontFamily = fontFamily;
  }

  public int getFontSize() {
    return fontSize;
  }

  public void setFontSize(int fontSize) {
    this.fontSize = fontSize;
  }

  public boolean isBold() {
    return isBold;
  }

  public void setBold(boolean bold) {
    isBold = bold;
  }

  public void render() {
    System.out.printf("(%d, %d): %s [%s]\n", row, column, content, fontFamily.getFontName());
  }
}
