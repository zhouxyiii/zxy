package com.oa.bean;

/**
 * Created by Teori on 2018/3/19.
 */
public class Notice {

    private Integer noticeId;

    private String noticeTitle;

    private String noticeContent;

    private String noticeStartTime;

    private String noticeEndTime;

    public String getNoticeContent() {
        return noticeContent;
    }

    public void setNoticeContent(String noticeContent) {
        this.noticeContent = noticeContent;
    }

    public String getNoticeEndTime() {
        return noticeEndTime;
    }

    public void setNoticeEndTime(String noticeEndTime) {
        this.noticeEndTime = noticeEndTime;
    }

    public Integer getNoticeId() {
        return noticeId;
    }

    public void setNoticeId(Integer noticeId) {
        this.noticeId = noticeId;
    }

    public String getNoticeStartTime() {
        return noticeStartTime;
    }

    public void setNoticeStartTime(String noticeStartTime) {
        this.noticeStartTime = noticeStartTime;
    }

    public String getNoticeTitle() {
        return noticeTitle;
    }

    public void setNoticeTitle(String noticeTitle) {
        this.noticeTitle = noticeTitle;
    }
}