package Domain;

public class Post {
    private int postId;
    private int ownerId;
    private int fromId;
    private int createdBy;
    private int data;
    private int count;
    private String text;
    private int replyOwnerId;
    private int replyPostId;
    private int singerId;
    private boolean friendsOnly;
    private String comments;
    private String copyrights;
    private String postType;
    private int views;
    private int postSources;
    private boolean canPost;
    private boolean canEdit;
    private boolean canDelete;
    private boolean canPin;
    private boolean likes;
    private boolean reposts;
    private boolean isPinned;
    private boolean markedAsAds;
    private boolean isFavourite;
    private boolean postponedId;


    public int getPostId() {

        return postId;
    }

    public void setPostId(int postId) {

        this.postId = postId;
    }

    public int getOwnerId() {

        return ownerId;
    }

    public void setOwnerId(int ownerId) {

        this.ownerId = ownerId;
    }

    public int getFromId() {

        return fromId;
    }

    public void setFromId(int fromId) {

        this.fromId = fromId;
    }

    public int getCreatedBy() {

        return createdBy;
    }

    public void setCreatedBy(int createdBy) {

        this.createdBy = createdBy;
    }

    public int getData() {

        return data;
    }

    public void setData(int data) {

        this.data = data;
    }

    public String getText() {

        return text;
    }

    public void setText(String text) {

        this.text = text;
    }

    public int getReplyOwnerId() {

        return replyOwnerId;
    }

    public void setReplyOwnerId(int replyOwnerId) {

        this.replyOwnerId = replyOwnerId;
    }

    public int getReplyPostId() {

        return replyPostId;
    }

    public void setReplyPostId(int replyPostId) {

        this.replyPostId = replyPostId;
    }

    public int getSingerId() {

        return singerId;
    }

    public void setSingerId(int singerId) {

        this.singerId = singerId;
    }

    public boolean isFriendsOnly() {

        return friendsOnly;
    }

    public void setFriendsOnly(boolean friendsOnly) {

        this.friendsOnly = friendsOnly;
    }

    public String getComments() {

        return comments;
    }

    public void setComments(String comments) {

        this.comments = comments;
    }

    public String getCopyrights() {

        return copyrights;
    }

    public void setCopyrights(String copyrights) {

        this.copyrights = copyrights;
    }

    public String getPostType() {

        return postType;
    }

    public void setPostType(String postType) {

        this.postType = postType;
    }

    public int getViews() {

        return views;
    }

    public void setViews(int views) {

        this.views = views;
    }

    public int getPostSources() {

        return postSources;
    }

    public void setPostSources(int postSources) {

        this.postSources = postSources;
    }

    public boolean isCanPost() {

        return canPost;
    }

    public void setCanPost(boolean canPost) {

        this.canPost = canPost;
    }

    public boolean isCanEdit() {

        return canEdit;
    }

    public void setCanEdit(boolean canEdit) {

        this.canEdit = canEdit;
    }

    public boolean isCanDelete() {

        return canDelete;
    }

    public void setCanDelete(boolean canDelete) {

        this.canDelete = canDelete;
    }

    public boolean isCanPin() {

        return canPin;
    }

    public void setCanPin(boolean canPin) {

        this.canPin = canPin;
    }

    public boolean isLikes() {

        return likes;
    }

    public void setLikes(boolean likes) {

        this.likes = likes;
    }

    public boolean isReposts() {

        return reposts;
    }

    public void setReposts(boolean reposts) {

        this.reposts = reposts;
    }

    public boolean isPinned() {

        return isPinned;
    }

    public void setPinned(boolean pinned) {

        isPinned = pinned;
    }

    public boolean isMarkedAsAds() {

        return markedAsAds;
    }

    public void setMarkedAsAds(boolean markedAsAds) {

        this.markedAsAds = markedAsAds;
    }

    public boolean isFavourite() {

        return isFavourite;
    }

    public void setFavourite(boolean favourite) {

        isFavourite = favourite;
    }

    public boolean isPostponedId() {

        return postponedId;
    }

    public void setPostponedId(boolean postponedId) {

        this.postponedId = postponedId;
    }

    public int getCount() {

        return count;
    }

    public void setCount(int count) {

        this.count = count;

    }
}
