package service;

import model.*;
import repository.*;

import java.sql.*;

public class ApplicationViewService {
    private ApplicationViewRepository applicationViewRepository;
    public ApplicationViewService() {
        this.applicationViewRepository = new ApplicationViewRepository();
    }

    //��ѯ������Ϣ��ͼ
    public ResultSet select(User user, String ap_type, String application_state) {
        return applicationViewRepository.select(user,ap_type,application_state);
    }
}
