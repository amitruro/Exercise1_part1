package geometries;

import org.junit.jupiter.api.Test;
import primitives.Point3D;
import primitives.Vector;

import static org.junit.jupiter.api.Assertions.*;

class PlaneTest {

    Point3D p1  = new Point3D(-1,2,1);
    Point3D p2  = new Point3D(0,-3,2);
    Point3D p3  = new Point3D(1,1,-4);

    @Test
    void getNormal() {
        // ============ Equivalence Partitions Tests ==============
        // TC01: There is a simple single test here
        Plane pl = new Plane(new Point3D(-1,2,1), new Point3D(0,-3,2), new Point3D(1,1,-4)
        );

        assertEquals(new Vector(26,7,9).normalize(),
                pl.getNormal(),
                "Bad normal to trinagle");

    }

    @Test
    void findIntersections() {
    }
}


