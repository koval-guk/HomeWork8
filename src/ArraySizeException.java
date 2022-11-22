public class ArraySizeException extends Exception {
    private String message;

    public ArraySizeException(String message) {
        this.message = message;
    }

    @Override
    public String getLocalizedMessage() {
        return message;
    }
}
