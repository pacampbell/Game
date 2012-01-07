package game.framework;

/**
 * Class needs to be evaluated.
 * Complete rewrite may be necessary.
 * @author paul
 */

public class Matrix
{
    private final int M; // Rows
    private final int N; // Columns
    private final double matrix[][]; // Memory reserved for a M X N matrix

    /**
     * Creates an Empty M x N matrix
     * @param M
     * @param N
     */
    public Matrix(int M, int N)
    {
        this.M = M;
        this.N = N;
        this.matrix = new double[M][N];
    }

    /**
     * Convert a 2D array into a Matrix
     * @param matrix
     */
    public Matrix(double[][] matrix)
    {
        this.M = matrix.length;
        this.N = matrix[0].length;
        this.matrix = new double[M][N];
        for(int i = 0; i < this.M; i++)
        {
            for(int j = 0; j < this.N; j++)
            {
                this.matrix[i][j] = matrix[i][j];
            }
        }
    }

    /**
     * Copy Constructor
     * @param A
     */
    private Matrix(Matrix A)
    {
        this(A.matrix);
    }

    /**
     * Returns an identity matrix of size n x n
     * @param N
     * @return
     */
    public static Matrix identity(int N)
    {
        Matrix I = new Matrix(N, N);
        for (int i = 0; i < N; i++)
        {
            I.matrix[i][i] = 1;
        }
        return I;
    }

    /**
     * Swaps rows i and j
     * @param i
     * @param j
     */
    private void swap(int i, int j)
    {
        double[] temp = this.matrix[i];
        this.matrix[i] = this.matrix[j];
        this.matrix[j] = temp;
    }

    /**
     * Creates a matrix transpose
     * @return
     */
    public Matrix transpose()
    {
        Matrix T = new Matrix(N, M);
        for (int i = 0; i < M; i++)
        {
            for (int j = 0; j < N; j++)
            {
                T.matrix[j][i] = this.matrix[i][j];
            }
        }
        return T;
    }

    /**
     * Add 1 matrix with this matrix
     * and return a new matrix.
     * A + B = C
     * @param b
     * @return
     */
    public Matrix add(Matrix b)
    {
        Matrix a = this;
        if(a.M != b.M || a.N != b.N) throw new RuntimeException("Matrices are not compatible");
        Matrix c = new Matrix(M, N);
        for(int i = 0; i < M; i++)
        {
            for(int j = 0; j < N; j++)
            {
                c.matrix[i][j] = a.matrix[i][j] + b.matrix[i][j];
            }
        }
        return c;
    }

    /**
     * Subtract 1 matrix with this matrix
     * and return a new matrix.
     * A - B = C
     * @param b
     * @return
     */
    public Matrix subtract(Matrix b)
    {
        Matrix a = this;
        if (b.M != a.M || b.N != a.N) throw new RuntimeException("Matrices are not compatible");
        Matrix c = new Matrix(M, N);
        for (int i = 0; i < M; i++)
        {
            for (int j = 0; j < N; j++)
            {
                c.matrix[i][j] = a.matrix[i][j] - b.matrix[i][j];
            }
        }
        return c;
    }

    /**
     * Multiples this matrix times b
     * A * B = C
     * @param b
     * @return
     */
    public Matrix multiply(Matrix b)
    {
        Matrix a = this;
        if (a.N != b.M) throw new RuntimeException("Matrices are not compatible");
        Matrix c = new Matrix(a.M, b.N);
        for (int i = 0; i < c.M; i++)
        {
            for (int j = 0; j < c.N; j++)
            {
                for (int k = 0; k < a.N; k++)
                {
                    c.matrix[i][j] += (a.matrix[i][k] * a.matrix[k][j]);
                }
            }
        }
        return c;
    }

    // return x = A^-1 b, assuming A is square and has full rank
    public Matrix solve(Matrix rhs)
    {
        if (M != N || rhs.M != N || rhs.N != 1) throw new RuntimeException("Illegal matrix dimensions.");

        // create copies of the data
        Matrix A = new Matrix(this);
        Matrix b = new Matrix(rhs);

        // Gaussian elimination with partial pivoting
        for (int i = 0; i < N; i++)
        {

            // find pivot row and swap
            int max = i;
            for (int j = i + 1; j < N; j++)
                if (Math.abs(A.matrix[j][i]) > Math.abs(A.matrix[max][i]))
                    max = j;
            A.swap(i, max);
            b.swap(i, max);

            // singular
            if (A.matrix[i][i] == 0.0) throw new RuntimeException("Matrix is singular.");

            // pivot within b
            for (int j = i + 1; j < N; j++)
                b.matrix[j][0] -= b.matrix[i][0] * A.matrix[j][i] / A.matrix[i][i];

            // pivot within A
            for (int j = i + 1; j < N; j++) {
                double m = A.matrix[j][i] / A.matrix[i][i];
                for (int k = i+1; k < N; k++) {
                    A.matrix[j][k] -= A.matrix[i][k] * m;
                }
                A.matrix[j][i] = 0.0;
            }
        }

        // back substitution
        Matrix x = new Matrix(N, 1);
        for (int j = N - 1; j >= 0; j--)
        {
            double t = 0.0;
            for (int k = j + 1; k < N; k++)
                t += A.matrix[j][k] * x.matrix[k][0];
            x.matrix[j][0] = (b.matrix[j][0] - t) / A.matrix[j][j];
        }
        return x;
    }
}
