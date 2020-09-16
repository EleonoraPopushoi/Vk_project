package Domain;

public class User {
    private int userId;
    private String name;
    private boolean commentsAllowed;
    private boolean liked;
    private boolean repostAllowed;

    public int getUserId() {

        return userId;
    }

    public void setUserId(int userId) {

        this.userId = userId;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public boolean isCommentsAllowed() {

        return commentsAllowed;
    }

    public void setCommentsAllowed(boolean commentsAllowed) {

        this.commentsAllowed = commentsAllowed;
    }

    public boolean isLiked() {

        return liked;
    }

    public void setLiked(boolean liked) {

        this.liked = liked;
    }

    public boolean isRepostAllowed() {

        return repostAllowed;
    }

    public void setRepostAllowed(boolean repostAllowed) {

        this.repostAllowed = repostAllowed;

    }
}

