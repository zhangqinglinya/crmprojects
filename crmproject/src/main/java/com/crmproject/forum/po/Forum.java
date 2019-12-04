package com.crmproject.forum.po;

public class Forum {
    private String forumId;

    private String postId;

    private String hits;

    private String replyId;

    public String getForumId() {
        return forumId;
    }

    public void setForumId(String forumId) {
        this.forumId = forumId == null ? null : forumId.trim();
    }

    public String getPostId() {
        return postId;
    }

    public void setPostId(String postId) {
        this.postId = postId == null ? null : postId.trim();
    }

    public String getHits() {
        return hits;
    }

    public void setHits(String hits) {
        this.hits = hits == null ? null : hits.trim();
    }

    public String getReplyId() {
        return replyId;
    }

    public void setReplyId(String replyId) {
        this.replyId = replyId == null ? null : replyId.trim();
    }
}