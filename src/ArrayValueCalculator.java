public class ArrayValueCalculator {
    public static int doCalc(String[][] array) throws ArrayDataException, ArraySizeException {
        int sum = 0;
        int numX = 0;
        int numY = 0;
        try {
            if (array.length != 4) {
                throw new ArraySizeException("This is not 4x4 array.");
            } else {
                for (numX = 0; numX < 4; numX++) {
                    if (array[numX].length != 4) {
                        throw new ArraySizeException("This is not 4x4 array.");
                    } else {
                        for (numY = 0; numY < 4; numY++) {
                            sum = sum + Integer.parseInt(array[numX][numY]);
                        }
                    }
                }
            }
        } catch (NumberFormatException formatException) {
            throw new ArrayDataException(numX, numY, formatException.getMessage());
        }
        return sum;
    }
}