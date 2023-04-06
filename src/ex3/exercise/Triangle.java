package ex3.exercise;

public class Triangle {
  double width, height;

  public Triangle(double width, double height) {
    this.width = width;
    this.height = height;
  }

  public double findArea(){
    return getHeight() * getWidth() / 2;
  }
  public double getWidth() {
    return width;
  }

  public void setWidth(double width) {
    this.width = width;
  }

  public double getHeight() {
    return height;
  }

  public void setHeight(double height) {
    this.height = height;
  }
}
