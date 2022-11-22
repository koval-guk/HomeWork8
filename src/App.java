public class App {
    public static void main(String[] args) {
        String[][] array = {{"2", "2", "2", "2"}, {"2", "2", "2", "2"}, {"2", "2", "2", "2"}, {"2", "2", "2", "2"}};
        String[][] arrayWrong = {{"2", "WRONG", "2", "2"}, {"2", "2", "2", "2"}, {"2", "2", "2", "2"}, {"2", "2", "2", "2"}};
        String[][] arrayNull = new String[4][4];
        String[][] arrayBig = new String[4][5];
        String[][] arrayBroken = {{"2", "2", "2", "2"}, {"2", "2", "2"}, {"2", "2"}, {"2", "2", "2", "2"}};
        try {
            System.out.println("doCalc = " + ArrayValueCalculator.doCalc(array));
            System.out.println("doCalc = " + ArrayValueCalculator.doCalc(arrayWrong));
        } catch (ArrayDataException dataException) {
            System.out.println(dataException.getLocalizedMessage());
        } catch (ArraySizeException sizeException) {
            System.out.println(sizeException.getLocalizedMessage());
        } finally {
            try {
                System.out.println("doCalc = " + ArrayValueCalculator.doCalc(arrayNull));
            } catch (ArrayDataException dataException) {
                System.out.println(dataException.getLocalizedMessage());
            } catch (ArraySizeException sizeException) {
                System.out.println(sizeException.getLocalizedMessage());
            } finally {
                try {
                    System.out.println("doCalc = " + ArrayValueCalculator.doCalc(arrayBig));
                } catch (ArrayDataException dataException) {
                    System.out.println(dataException.getLocalizedMessage());
                } catch (ArraySizeException sizeException) {
                    System.out.println(sizeException.getLocalizedMessage());
                }
                try {
                    System.out.println("doCalc = " + ArrayValueCalculator.doCalc(arrayBroken));
                } catch (ArrayDataException dataException) {
                    System.out.println(dataException.getLocalizedMessage());
                } catch (ArraySizeException sizeException) {
                    System.out.println(sizeException.getLocalizedMessage());
                }
            }
        }
    }
}
