package com.kob.backend.controller.service.impl.user.account;

import com.kob.backend.controller.service.impl.utils.UserDetailsImpl;
import com.kob.backend.controller.service.user.account.InfoService;
import com.kob.backend.pojo.User;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class InfoServiceImpl implements InfoService {

    @Override
    public Map<String, String> getinfo() {
        UsernamePasswordAuthenticationToken authentication =
                (UsernamePasswordAuthenticationToken) SecurityContextHolder.getContext().getAuthentication();
        //取出用户信息
        UserDetailsImpl loginUser = (UserDetailsImpl) authentication.getPrincipal();
        User user = loginUser.getUser();

        Map<String,String> map = new HashMap<>();
        map.put("error_message","success");
        map.put("id",user.getId().toString());
        map.put("username",user.getUsername());
        map.put("photo",user.getPhoto());
        return map;
    }
}
