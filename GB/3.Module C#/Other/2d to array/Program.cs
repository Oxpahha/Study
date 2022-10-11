int MatrixToRow()
{
int[] array = new int[matrixArray.GetLength(0) * matrixArray.GetLength(1)];
int k = 0;
for (int i = 0; i < matrixArray.GetLength(0); i++)
    {
        for (int j = 0; j < matrixArray.GetLength(1); j++)
        {
            array[k] = matrixArray[i, j];
            k++;
        }
    }
return array;
}