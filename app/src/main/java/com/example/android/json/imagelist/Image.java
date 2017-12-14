package com.example.android.json.imagelist;

/**
 * Created by pc on 12/14/2017.
 */

public class Image {
    public String likes;
    public String favourites;
    public String tags;
    public String pageUrl;

    public String previewURL;
    public String webFormatUrl;
    public String userImageUrl;

    public Image(String webFormatUrl) {
        this.webFormatUrl = webFormatUrl;
    }

    public String getLikes() {
        return likes;
    }

    public void setLikes(String likes) {
        this.likes = likes;
    }

    public String getFavourites() {
        return favourites;
    }

    public void setFavourites(String favourites) {
        this.favourites = favourites;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getPageUrl() {
        return pageUrl;
    }

    public void setPageUrl(String pageUrl) {
        this.pageUrl = pageUrl;
    }

    public String getPreviewURL() {
        return previewURL;
    }

    public void setPreviewURL(String previewURL) {
        this.previewURL = previewURL;
    }

    public String getWebFormatUrl() {
        return webFormatUrl;
    }

    public void setWebFormatUrl(String webFormatUrl) {
        this.webFormatUrl = webFormatUrl;
    }

    public String getUserImageUrl() {
        return userImageUrl;
    }

    public void setUserImageUrl(String userImageUrl) {
        this.userImageUrl = userImageUrl;
    }
}
