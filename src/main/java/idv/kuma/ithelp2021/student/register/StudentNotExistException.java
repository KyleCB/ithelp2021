package idv.kuma.ithelp2021.student.register;

public class StudentNotExistException extends Exception {
    public StudentNotExistException(String message) {
        super(message);
    }

    public StudentNotExistException(String message, DataNotFoundException e) {
        super(message, e);
    }
}
