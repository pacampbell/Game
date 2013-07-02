package test.framework;

import game.framework.Vector2;
import junit.framework.Assert;
import org.junit.Test;

/**
 * Unit test for Vector2.
 */
public class Vector2Test {
    @Test
    public void testAdd() throws Exception {
        // Two initial Vectors
        Vector2 a = new Vector2(1,2);
        Vector2 b = new Vector2(3,4);
        // The sum of what a + b should equal
        Vector2 ab = new Vector2(4,6);
        // Perform the add operation
        Vector2 c = a.add(b);
        Vector2 d = Vector2.add(a,b);
        Vector2 e = a.add(3,4);
        Vector2 f = a.add(3.0f, 4.0f);
        // Check to make sure none of the variables are null
        Assert.assertNotNull(a);
        Assert.assertNotNull(b);
        Assert.assertNotNull(c);
        Assert.assertNotNull(d);
        Assert.assertNotNull(e);
        Assert.assertNotNull(f);
        Assert.assertNotNull(ab);
        // Validate the answers for Vec2_A + Vec2_b
        Assert.assertEquals(ab, c);
        Assert.assertEquals(ab, d);
        // Validate Answers for Vec2_A.add(3,4)
        Assert.assertEquals(ab, e);
        Assert.assertEquals(ab, f);
    }

    @Test
    public void testAddX() throws Exception {
        // Initial Vector
        Vector2 a = new Vector2(1,1);
        // Expected result
        Vector2 aa = new Vector2(2,1);
        // Operations
        Vector2 b = a.addX(1);
        Vector2 c = a.addX(1.0f);
        // Make sure no variables are null
        Assert.assertNotNull(a);
        Assert.assertNotNull(b);
        Assert.assertNotNull(c);
        Assert.assertNotNull(aa);
        // Validate Answers
        Assert.assertEquals(aa, b);
        Assert.assertEquals(aa, c);
    }

    @Test
    public void testAddY() throws Exception {
        // Initial Vector
        Vector2 a = new Vector2(1,1);
        // Expected result
        Vector2 aa = new Vector2(1,2);
        // Operations
        Vector2 b = a.addY(1);
        Vector2 c = a.addY(1.0f);
        // Make sure no variables are null
        Assert.assertNotNull(a);
        Assert.assertNotNull(b);
        Assert.assertNotNull(c);
        Assert.assertNotNull(aa);
        // Validate Answers
        Assert.assertEquals(aa, b);
        Assert.assertEquals(aa, c);
    }

    @Test
    public void testBarycentric() throws Exception {

    }

    @Test
    public void testCatmullRom() throws Exception {

    }

    @Test
    public void testClamp() throws Exception {

    }

    @Test
    public void testDirectionAlpha() throws Exception {

    }

    @Test
    public void testDirectionBeta() throws Exception {

    }

    @Test
    public void testDistance() throws Exception {

    }

    @Test
    public void testDistanceSquared() throws Exception {

    }

    @Test
    public void testDivide() throws Exception {

    }

    @Test
    public void testDotProduct() throws Exception {

    }

    @Test
    public void testEquals() throws Exception {
        Vector2 a = new Vector2(1,1);
        Vector2 b = new Vector2(1,1);
        Vector2 c = new Vector2(-1,-1);
        // Assert for null
        Assert.assertNotNull(a);
        Assert.assertNotNull(b);
        Assert.assertNotNull(c);
        // Check the object equal
        Assert.assertTrue(a.equals(b));
        Assert.assertTrue(!a.equals(c));
        Assert.assertTrue(!b.equals(c));
        // Check the static equal
        Assert.assertTrue(Vector2.equals(a,b));
        Assert.assertTrue(!Vector2.equals(c,a));
        Assert.assertTrue(!Vector2.equals(c,b));
    }

    @Test
    public void testHermite() throws Exception {

    }

    @Test
    public void testLerp() throws Exception {

    }

    @Test
    public void testMagnitude() throws Exception {

    }

    @Test
    public void testMagnitudeSquared() throws Exception {

    }

    @Test
    public void testMax() throws Exception {

    }

    @Test
    public void testMin() throws Exception {

    }

    @Test
    public void testMultiply() throws Exception {

    }

    @Test
    public void testNegate() throws Exception {

    }

    @Test
    public void testNormalize() throws Exception {

    }

    @Test
    public void testPerpendicular() throws Exception {

    }

    @Test
    public void testScalarProjection() throws Exception {

    }

    @Test
    public void testVectorProjection() throws Exception {

    }

    /*
    TODO: Fix the implementation of random
    @Test
    public void testRandom() throws Exception {

    }
    */

    @Test
    public void testReflect() throws Exception {

    }

    @Test
    public void testSmoothStep() throws Exception {

    }

    @Test
    public void testOne() throws Exception {
        // Expected Value
        Vector2 a = new Vector2(1,1);
        // Make sure Vectors are not null
        Assert.assertNotNull(a);
        Assert.assertNotNull(Vector2.one());
        // Test The value
        Assert.assertEquals(a, Vector2.one());
    }

    @Test
    public void testUnitX() throws Exception {

    }

    @Test
    public void testUnitY() throws Exception {

    }

    @Test
    public void testZero() throws Exception {

    }

    @Test
    public void testSubtract() throws Exception {

    }

    @Test
    public void testSubtractX() throws Exception {

    }

    @Test
    public void testSubtractY() throws Exception {

    }

    @Test
    public void testToString() throws Exception {

    }

    /*
    TODO: Need to implement transform before being able to test it :)
    @Test
    public void testTransform() throws Exception {

    }
    */

    @Test
    public void testWedgeProduct() throws Exception {

    }
}
