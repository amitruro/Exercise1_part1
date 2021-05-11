package geometries;

import org.junit.jupiter.api.Test;
import primitives.Point3D;
import primitives.Vector;

import static org.junit.jupiter.api.Assertions.*;

class SphereTest {

    Sphere sp = new Sphere(new Point3D(-1,2,1),5);
    Point3D p = new Point3D(1,2,3);


    @Test
    void testToString() {

    }


    @Test
    void getNormal() {
        Sphere sp = new Sphere(new Point3D(0, 0, 1), 1);
        var normal = sp.getNormal(new Point3D(1, 0, 1));
        assertEquals(new Vector(1,0,0), normal);
    }
}

