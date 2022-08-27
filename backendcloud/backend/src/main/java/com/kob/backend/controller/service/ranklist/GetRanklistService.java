package com.kob.backend.controller.service.ranklist;

import com.alibaba.fastjson.JSONObject;

public interface GetRanklistService {
    JSONObject getList(Integer page);
}
