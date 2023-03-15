package org.simple.designpatterns.factory;

public class Point {
    private double x;
    private double y;

    protected Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point(double a, double b, CoordinateSystem cs) {
        switch (cs) {
            case CARTESIAN -> {
                this.x = a;
                this.y = b;
                break;
            }

            case POLAR -> {
                this.x = a * Math.cos(b);
                this.y = a * Math.sin(b);
                break;
            }
        }
    }

    // singleton field
    public static final Point ORIGIN = new Point(0, 0);

    // factory method
    public static Point newCartesianPoint(double x, double y) {
        return new Point(x, y);
    }

    public static Point newPolarPoint(double rho, double theta) {
        return new Point(rho * Math.cos(theta),
                rho * Math.sin(theta));
    }

    public static class Factory {
        public static Point newCartesianPoint(double x,
                                              double y) {
            return new Point(x, y);
        }
    }



}
