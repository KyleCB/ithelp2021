package idv.kuma.ithelp2021.scholarship.command.adapter;

import idv.kuma.ithelp2021.scholarship.command.entity.Application;
import idv.kuma.ithelp2021.scholarship.command.usecase.ApplicationRepository;
import org.springframework.stereotype.Component;

@Component
public class ApplicationRepositoryImpl implements ApplicationRepository {
    @Override
    public void create(ApplicationForm application) {
        // do nothing
    }

    @Override
    public void create(Application application) {
        // do nothing
    }
}
