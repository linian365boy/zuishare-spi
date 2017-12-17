package top.zuishare.spi.model;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;

/**
 * @author niange
 * @ClassName: ArticleCategory
 * @desp:   文章分类
 * @date: 2017/12/1 下午11:24
 * @since JDK 1.7
 */
public class ArticleCategory implements Serializable {

    private static final long serialVersionUID = 937109376996041090L;

    private int id;
    /**
     * 分类名称
     */
    private String name;
    private long createTime;
    /**
     * 优先级，排序用
     * 越大，排序越前
     */
    private int priority;
    /**
     * 分类的状态
     * 0=锁定；1=正常；2=逻辑删除
     */
    private int status;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(long createTime) {
        this.createTime = createTime;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
}
