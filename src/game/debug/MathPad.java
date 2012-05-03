package game.debug;

import game.framework.*;

/**
 * Place to test out Math classes without launching a Game Window.
 * @author paul
 */
public class MathPad 
{
    public static void main(String[] args)
    {
        // Tests out Vector2 methods and prints the results.
        //MathPad.vector2Test();
        // Tests out Vector3 methods and prints the results.
        //MathPad.vector3Test();
        // Tests out Matrix methods and prints the results.
        //MathPad.matrixTest();
        // Tests out Matrix3 methods and prints the results.
        //MathPad.matrix4Test();
        
        for(int i = 0; i < 10; ++i)
                System.out.println(MathHelper.random());
        
        for(int i = 0; i < 1000; i++)
            System.out.println(Vector2.random());
        
    }
    
    //<editor-fold defaultstate="collapsed" desc="Vector2 Unit Test">
    public static void vector2Test()
    {
        Vector2 a = new Vector2(1, 2);
        Vector2 b = new Vector2(3, 4);
        
        Vector2 c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v;
        float s1, s2, s3, s4, s5;
        
        // Add the two vectors together
        c = Vector2.add(a, b);
        // Subtract the two vectors from each other
        d = Vector2.subtract(b, c);
        // multiply two vectors
        e = Vector2.multiply(d, -1);
        // dot product
        s1 = Vector2.dotProduct(a, b);
        // Distance
        s2 = Vector2.distance(a, b);
        // Distance squared
        s3 = Vector2.distanceSquared(a, b);
        // Magnitude
        s4 = Vector2.magnitude(e);
        // Magnitude squared
        s5 = Vector2.magnitudeSquared(e);
        // Normalize/Unit Vector
        f = Vector2.normalize(e);
        // Equality Test
        g = new Vector2(-1, -1);
        h = new Vector2(1, 1);
        boolean equals1 = Vector2.equals(g, h);
        boolean equals2 = Vector2.equals(g, g);
        // Min and Max Test
        i = new Vector2(100, -100);
        j = new Vector2(-100, 100);
        k = Vector2.max(i, j);
        l = Vector2.min(i, j);
        // Reflect
        m = Vector2.reflect(a, b);
        // Barycentric
        n = Vector2.barycentric(a, b, c, 3, 4);
        // Scalar Division (Should = Infinity)
        o = a.divide(0.0f);
        p = Vector2.divide(a, 5.0f);
        q = Vector2.divide(a, b);
        // Lerp, Barycentric, Catmull-Rom
        r = Vector2.lerp(a, b, 0.5f);
        s = Vector2.barycentric(a, b, c, 0.7f, 0.2f);
        t = Vector2.catmullRom(a, b, c, d, 0.314f);
        // Hermite, and Smooth Step
        u = Vector2.hermite(a, b, c, d, 0.6f);
        v = Vector2.smoothStep(a, b, 0.35f);
        
        System.out.println("a + b = " + c);
        System.out.println("b - c = " + d);
        System.out.println("-1 * d = " + e);
        System.out.println("a dot b = " + s1);
        System.out.println("Distance between a and b: " + s2);
        System.out.println("Distance squared between a and b: " + s3);
        System.out.println("Magnitude of e = " + s4);
        System.out.println("Magnitude squared of e = " + s5);
        System.out.println("Unit Vector of e: " + f);
        System.out.println("is g == h? " + equals1);
        System.out.println("is g == g? " + equals2);
        System.out.println("Max of i & j is " + k);
        System.out.println("Min of i & j is " + l);
        System.out.println("Reflection of a and b: " + m);
        System.out.println("Barycentric a, b, c, 3, 4: " + n);
        System.out.println("a / 0 = " + o);
        System.out.println("a / 5.0f = " + p);
        System.out.println("a / b = " + q);
        System.out.println("Lerp: " + r);
        System.out.println("Barycentric: " + s);
        System.out.println("Catmull-Rom: " + t);
        System.out.println("Hermite: " + u);
        System.out.println("Smooth Step: " + v);
        
        System.out.println("SmoothStep a -> b: " + MathHelper.smoothStep(3.0f, 55.0f, 0.35f));
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Vector3 Unit Test">
    /**
     * Test Method; Performs some operations
     * To check results
     */
    public static void vector3Test()
    {
        Vector3 a = new Vector3(1, 2, 0);
        Vector3 b = new Vector3(3, 4, 0);
        
        Vector3 c, d, e, f, g, h, i, j, k, l, m, n, o, p, q;
        float s1, s2, s3, s4, s5;
        
        // Add the two vectors together
        c = Vector3.add(a, b);
        // Subtract the two vectors from each other
        d = Vector3.subtract(b, c);
        // multiply two vectors
        e = Vector3.multiply(d, -1);
        // dot product
        s1 = Vector3.dotProduct(a, b);
        // Distance
        s2 = Vector3.distance(a, b);
        // Distance squared
        s3 = Vector3.distanceSquared(a, b);
        // Magnitude
        s4 = Vector3.magnitude(e);
        // Magnitude squared
        s5 = Vector3.magnitudeSquared(e);
        // Normalize/Unit Vector
        f = Vector3.normalize(e);
        // Equality Test
        g = new Vector3(-1, -1, 0);
        h = new Vector3(1, 1, 0);
        boolean equals1 = Vector3.equals(g, h);
        boolean equals2 = Vector3.equals(g, g);
        // Min and Max Test
        i = new Vector3(100, -100, 0);
        j = new Vector3(-100, 100, 0);
        k = Vector3.max(i, j);
        l = Vector3.min(i, j);
        // Reflect
        m = Vector3.reflect(a, b);
        // Barycentric
        //n = Vector3.barycentric(a, b, c, 3, 4);
        // Scalar Division (Should = Infinity)
        o = a.divide(0.0f);
        p = Vector3.divide(a, 5.0f);
        q = Vector3.divide(a, b);
        
        System.out.println("a + b = " + c);
        System.out.println("b - c = " + d);
        System.out.println("-1 * d = " + e);
        System.out.println("a dot b = " + s1);
        System.out.println("Distance between a and b: " + s2);
        System.out.println("Distance squared between a and b: " + s3);
        System.out.println("Magnitude of e = " + s4);
        System.out.println("Magnitude squared of e = " + s5);
        System.out.println("Unit Vector of e: " + f);
        System.out.println("is g == h? " + equals1);
        System.out.println("is g == g? " + equals2);
        System.out.println("Max of i & j is " + k);
        System.out.println("Min of i & j is " + l);
        System.out.println("Reflection of a and b: " + m);
        //System.out.println("Barycentric a, b, c, 3, 4: " + n);
        System.out.println("a / 0 = " + o);
        System.out.println("a / 5.0f = " + p);
        System.out.println("a / b = " + q);
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Matrix Unit Test">
    public static void matrixTest()
    {
        /*
        float[][] one = {
                            {1, 0, 1},
                            {1, 0, 1}
                        };
        
        float[][] two = {
            {5, 4, 3},
            {2, 1, 0}
        };
        
        float[][] three = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        
        float[][] four ={
            {1,2},
            {3,4},
            {5,6}
        };
        
        float[][] zeros ={
            {1, 2, 3, 4},
            {0, 0, 0, 0},
            {5, 6, 7, 8},
            {0, 0, 0, 0}
        };
        
        float[][] five ={
            {7, 2, 0, 1},
            {4, 9, 3, -3},
            {1, 1, 2, 3},
            {0, 0, 0, 0},
            {5, 8, 13, 21}
        };
        
        float[][] six = {
            {1, -1, 1, 3},
            {2, 1, -3, 5},
            {4, 1, -1, 11},
        };
        
        float[][] ex5 = {
            {2, 4, -1, 5, -2},
            {-4, -5, 3, -8, 1},
            {2, -5, -4, 1, 8},
            {-6, 0, 7, -3, 1}
        };
        
        Matrix a = new Matrix(one);
        Matrix b = new Matrix(two);
        Matrix c = new Matrix(three);
        Matrix d = new Matrix(four);
        Matrix z = new Matrix(zeros);
        Matrix e = new Matrix(five);
        Matrix f = new Matrix(six);
        Matrix example5 = new Matrix(ex5);
        
        System.out.println("A");
        System.out.println(a);
        System.out.println("B");
        System.out.println(b);
        System.out.println("A + B");
        System.out.println(a.add(b));
        System.out.println("B transpose");
        System.out.println(b.transpose());
        System.out.println("C * D");
        System.out.println(c.multiply(d));
        System.out.println("REF");
        System.out.println(f.ref());
        System.out.println("RREF");
        //System.out.println(f.rref());
        //System.out.println("Rank of f = " + f.rank());
        System.out.println("REF ex5");
        System.out.println(example5.ref());
        System.out.println("RREF");
        System.out.println(example5.rref());
        * 
        */
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Matrix3 Unit Test">
    /**
     * Tests out Matrix3 operations.
     */
    public static void matrix3Test()
    {
    }
    //</editor-fold>
}
