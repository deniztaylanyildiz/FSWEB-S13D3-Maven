package org.example;

public class Wall {

private double width;
    private double height;

public Wall(double height,double width){
    this.height=height;
    this.width=width;

}

    public double getWidth(){

    return  width;


    }
    public double getHeight(){

        return  height;


    }

    public void  setWidth(double width) {

        this.width = width < 0 ? 0 : width;
    }
    public void  setHeight(double height){
    this.height=height<0?0:height;
    }

    public double getArea(){
    return width*height;


    }

}
