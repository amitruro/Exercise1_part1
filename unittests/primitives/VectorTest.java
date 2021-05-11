package primitives;

import org.junit.jupiter.api.Test;

import static java.lang.System.out;
import static org.junit.jupiter.api.Assertions.*;
import static primitives.Util.isZero;

class VectorTest {

    Vector v1 = new Vector(1, 2, 3);
    Vector v2 = new Vector(2, 0, 0);
    Vector v3 = new Vector(1, 3, -2);

    Point3D point = new Point3D(3, 3, 3);

    @Test
    void add() {
        Vector v = v1.add(v2);
        assertEquals(v, new Vector(3, 2, 3), "not success");

    }

    @Test
    void dotProduct() {
        if (isZero(v1.dotProduct(v3)))
            out.println("ERROR: dotProduct() for orthogonal vectors is not zero");
        assertEquals(1, v1.dotProduct(v3), "not success");

    }

    @Test
    void crossProduct() {
        Vector v1 = new Vector(1, 2, 3);
        Vector v2 = new Vector(-2, -4, -6);


        // ============ Equivalence Partitions Tests ==============
        Vector v3 = new Vector(0, 3, -2);
        Vector vr = v1.crossProduct(v3);

        // Test that length of cross-product is p
    }
}