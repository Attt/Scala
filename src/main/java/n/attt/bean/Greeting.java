package n.attt.bean;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2016/9/27.
 */
public class Greeting {
    private final long id;
    private final String content;
    private final Map<String,Object> map;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
        this.map = new HashMap<>();
    }
    public Greeting(long id,String content,Map<String,Object> objectMap){
        this.id = id;
        this.content = content;
        this.map = objectMap;
    }
    public long getId() {
        return id;
    }
    public String getContent() {
        return content;
    }
}
