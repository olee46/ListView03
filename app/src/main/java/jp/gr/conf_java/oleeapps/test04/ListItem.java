package jp.gr.conf_java.oleeapps.test04;

/**
 * Created by orisa on 2018/01/26.
 */

public class ListItem {
    private long id = 0;
    private String content = null;
    private String timestamp = null;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }
}
