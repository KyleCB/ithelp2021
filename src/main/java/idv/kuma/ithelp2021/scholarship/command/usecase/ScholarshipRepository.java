package idv.kuma.ithelp2021.scholarship.command.usecase;

import idv.kuma.ithelp2021.scholarship.command.entity.Scholarship;

import java.util.Optional;

public interface ScholarshipRepository {
    Scholarship find(long scholarshipId);

    Optional<Scholarship> findOptional(long scholarshipId) throws RepositoryAccessDataFailException;
}
