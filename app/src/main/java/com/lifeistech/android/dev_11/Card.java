package com.lifeistech.android.dev_11;

/**
 * Created by owner on 2018/04/14.
 */

public class Card {
    public int imageId;
    public String title;
    public String content;
    public int likeNum=0;

    public String meaning;

    public Card(int imageId,String title,String content,String meaning){
        this.imageId=imageId;
        this.title=title;
        this.content=content;
        this.meaning=meaning;
    }
}
