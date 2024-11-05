package store.message;

public enum ErrorMessage {
    INVALID_INPUT_ERROR("잘못된 입력입니다. 다시 입력해 주세요.");

    private static final String ERROR_FLAG = "[ERROR] ";

    private String message;
    ErrorMessage(String message) {
        this.message = message;
    }

    public String getMessage(){
        return String.format(ERROR_FLAG + message);
    }
}
