package com.kob.backend.controller.service.user.account;

import java.util.Map;

public interface LoginService {
    public Map<String,String> getToken(String username, String password);
}
