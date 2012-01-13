/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package game.debug;

import game.framework.Matrix;

/**
 *
 * @author Michael
 */
public class MatrixTest {
    
    public static void main(String[] args){
        
        float[][] f = {{0f,0f},{0f,0f}};
        
        //testing identity methods
        System.out.println("-----Testing identity methods.");
        Matrix mat = new Matrix(10,10);
        System.out.println(mat.identity().toString());        
        System.out.println(Matrix.identity(5));
        System.out.println(Matrix.identity(mat));
    }
    
}
