package geometries;

import primitives.Point3D;
import primitives.Vector;

import java.util.ArrayList;

// Constructor
public class Triangle extends Polygon {
    public Triangle(Point3D pt1, Point3D pt2, Point3D pt3) {
        super(pt1, pt2, pt3);
    }

    @Override
    public Vector getNormal(Point3D point3D) {
        return null;
    }
}