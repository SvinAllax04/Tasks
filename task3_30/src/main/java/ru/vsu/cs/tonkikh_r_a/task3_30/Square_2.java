package ru.vsu.cs.tonkikh_r_a.task3_30;

public class Square_2 {
    public double x0;
    public double y0;
    public double x1;
    public double y1;

    public Square_2(double x0, double y0, double x1, double y1) {
        this.x0 = x0;
        this.y0 = y0;
        this.x1 = x1;
        this.y1 = y1;
    }
    public boolean isPointInSquare(double x, double y){return (x > x0 && x < x1 && y < y0 && y > y1);}
}
