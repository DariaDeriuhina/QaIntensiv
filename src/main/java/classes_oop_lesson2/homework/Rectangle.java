package classes_oop_lesson2.homework;

public class Rectangle {

    private int length;
    private int width;

    public Rectangle(int length, int width){
        if(length<=0 || width<=0){
            throw new IllegalArgumentException("Width and length can't be zero or negative");
        }
        this.length = length;
        this.width = width;
    }

    public int calculateArea(){
        return width*length;
    }

    public int calculatePerimeter(){
        return (length+width)*2;
    }
}
