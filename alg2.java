Step 1: Matrix Input

    Prompt the user to input the dimensions (number of rows and columns) for the first matrix.
    Create a 2D array matrix1 of size r1 x c1 (rows x columns).
    Input the elements of the first matrix (matrix1) row by row.
    Prompt the user to input the dimensions (number of rows and columns) for the second matrix.
    Create a 2D array matrix2 of size r2 x c2.
    Input the elements of the second matrix (matrix2) row by row.

Step 2: Matrix Addition

    Check for matrix addition compatibility:
        Ensure that the number of rows (r1) and columns (c1) of the first matrix match the number of rows (r2) and columns (c2) of the second matrix.
        If r1 == r2 and c1 == c2, matrix addition is possible.
        If not, display the message "Matrix Addition not possible. Dimensions must match."
    Matrix Addition:
        Create a new matrix sum of size r1 x c1.
        For each element in the matrix, add the corresponding elements from both matrices:
            sum[i][j] = matrix1[i][j] + matrix2[i][j] for all i and j.
    Display the result of matrix addition:
        Print the matrix sum.

Step 3: Matrix Multiplication

    Check for matrix multiplication compatibility:
        Matrix multiplication is possible if the number of columns in the first matrix (c1) matches the number of rows in the second matrix (r2).
        If c1 == r2, matrix multiplication is possible.
        If not, display the message "Multiplication not possible. Dimensions must match."
    Matrix Multiplication:
        Create a new matrix product of size r1 x c2 to store the result.
        For each element in the product matrix, compute the dot product of the corresponding row of the first matrix and column of the second matrix:
            product[i][j] = sum(matrix1[i][k] * matrix2[k][j] for k=0 to c1-1), for all i from 0 to r1-1 and j from 0 to c2-1.
    Display the result of matrix multiplication:
        Print the matrix product.

Step 4: End of Program

    Close the scanner object to release resources.
