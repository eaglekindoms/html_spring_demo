package com.learn.learnspring.service;

import com.learn.learnspring.dao.LearnInfoDao;
import com.learn.learnspring.entity.LearnInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Service
public class LearnService {
    private static final Logger logger = LoggerFactory.getLogger(LearnService.class);

    @Autowired
    private LearnInfoDao requestMapper;

    public String provideService(Map<String, String> map) {
        String action = map.get("action");
        String resp = null;
        Integer id = 0;
        LearnInfo learnInfo = new LearnInfo();
        switch (action) {
            case "add":
                learnInfo.setUserData(map.toString());
                learnInfo.setUserName(map.get("name"));
                learnInfo.setUserAction(map.get("action"));
                resp = add(learnInfo);
                break;
            case "update":
                learnInfo.setUserData(map.toString());
                learnInfo.setUserName(map.get("name"));
                learnInfo.setUserAction(map.get("action"));
                resp = update(learnInfo);
                break;
            case "find":
                id = Integer.valueOf(map.get("id"));
                resp = find(id);
                break;
            case "delete":
                id = Integer.valueOf(map.get("id"));
                resp = delete(id);
                break;
            default:
                break;
        }
        return resp;
    }

    public String add(LearnInfo requestInfo) {

        requestInfo.setUserData(requestInfo.toString());
        int result = requestMapper.insert(requestInfo);
        logger.info(requestInfo.toString());
        if (result > 0) {
            return "Success";
        } else {
            return "Failure";
        }
    }

    public String update(LearnInfo requestInfo) {

        int result = requestMapper.updateByPrimaryKeySelective(requestInfo);
        logger.info(requestInfo.toString());
        if (result > 0) {
            return "Success";
        } else {
            return "Failure";
        }
    }

    public String find(Integer id) {

        LearnInfo result = requestMapper.selectByPrimaryKey(id);

        if (result != null) {
            return result.toString();
        } else {
            return "Failure";
        }
    }

//    @GetMapping("/query")
//    public String query(@RequestBody LearnInfo requestInfo) {
//
//        List<LearnInfo> result = requestMapper.query(requestInfo);
//
//        if (result != null) {
//            return result.toString();
//        } else {
//            return "Failure";
//        }
//    }

    public String delete(Integer id) {

        int result = requestMapper.deleteByPrimaryKey(id);
        logger.info("=========" + id.toString());
        if (result > 0) {
            return "Success";
        } else {
            return "Failure";
        }
    }
}
