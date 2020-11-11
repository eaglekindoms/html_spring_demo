package com.learn.learnspring.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * learn_info
 * @author 
 */
public class LearnInfo implements Serializable {
    /**
     * id
     */
    private Integer id;

    private String userName;

    private String userAction;

    private Date createTime;

    private String userData;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserAction() {
        return userAction;
    }

    public void setUserAction(String userAction) {
        this.userAction = userAction;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUserData() {
        return userData;
    }

    public void setUserData(String userData) {
        this.userData = userData;
    }

    @Override
    public String toString() {
        return "LearnInfo{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", userAction='" + userAction + '\'' +
                ", createTime=" + createTime +
                ", userData='" + userData + '\'' +
                '}';
    }
}