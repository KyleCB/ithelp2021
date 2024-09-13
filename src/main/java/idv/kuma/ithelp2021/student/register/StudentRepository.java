package idv.kuma.ithelp2021.student.register;

import idv.kuma.ithelp2021.scholarship.command.usecase.RepositoryAccessDataFailException;
import idv.kuma.ithelp2021.student.Student;

import java.util.Optional;

public interface StudentRepository {
    void register(RegisterRequest request) throws DataNotFoundException;

    Optional<Student> find(long studentId) throws RepositoryAccessDataFailException;
}
