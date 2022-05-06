public class Error {

    private boolean active;
    private int status;
    private String message;

    public Error() {
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public static void main(String[] args) {
        Error error = new Error(true, 1, "Хорошо.");
        Error error1 = new Error(true, 10, "Отлично!");
        Error error2 = new Error(false, 0, "Ищите лучше!");
        error.printInfo();
        error1.printInfo();
        error2.printInfo();
    }

    public void printInfo() {
        System.out.println("Ошибки найдены - " + active + ". Всего ошибок - " + status + ". Оценка: " + message);
    }
}
