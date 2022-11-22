public class ArrayDataException extends Exception{
    private String message;
    public ArrayDataException(int x, int y,String formatException) {
        message = "Data Exception in array["+x+"]["+y+"] "+formatException;
    }

    @Override
    public String getLocalizedMessage() {
        return message;
    }
}
