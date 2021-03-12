package geometries;

import primitives.Point3D;
import primitives.Vector;

public class Plane implements Geometry {
    Point3D _q0;
    Vector _normal;

    // Constructor
    public Plane(Point3D pt1, Point3D pt2, Point3D pt3) {
        _q0 = pt1;
        _normal = null;
    }

    //Getters
    public Point3D getQ0() {
        return _q0;
    }

    public Vector getNormal() {
        return _normal;
    }

    @Override
    public Vector getNormal(Point3D point3D) {
        return null;
    }
}