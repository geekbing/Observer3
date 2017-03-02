package observer;

import subject.Subject;

/**
 * Author: bing
 * Date: 2017-03-02 18:16
 * Email: dhuzbb@163.com
 */
public interface Observer {
    void update(Subject o, Object arg);
}
