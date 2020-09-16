package Domain;

public class Report {
    private int repostsCount;
    private boolean canRepost;
    private boolean canPublish;
    private boolean userReposted;

    public int getRepostsCount() {

        return repostsCount;
    }

    public void setRepostsCount(int repostsCount) {

        this.repostsCount = repostsCount;
    }

    public boolean isCanRepost() {

        return canRepost;
    }

    public void setCanRepost(boolean canRepost) {

        this.canRepost = canRepost;
    }

    public boolean isCanPublish() {

        return canPublish;
    }

    public void setCanPublish(boolean canPublish) {

        this.canPublish = canPublish;
    }

    public boolean isUserReposted() {

        return userReposted;
    }

    public void setUserReposted(boolean userReposted) {
        this.userReposted = userReposted;

    }
}

