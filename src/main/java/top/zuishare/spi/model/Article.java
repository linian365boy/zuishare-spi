package top.zuishare.spi.model;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;

/**
 * @author niange
 * @ClassName: Article
 * @desp: 文章实体
 * @date: 2017/12/1 下午11:09
 * @since JDK 1.7
 */
public class Article implements Serializable {

    private static final long serialVersionUID = 7268092984716007070L;

    /**
     文章id
     */
    private long id;
    /**
    标题
     */
    private String title;
    /**
     * 创建时间，long类型的unixtime，到s
     */
    private long createTime;
    /**
     * 文章内容类型，目前分为图文类型跟快讯（快讯没有图片标题）
     * 默认0=图文类型；1=快讯
     */
    private int contentType;
    /**
     * 图文类型的文字有图片标题，在列表页会显示，跟文字标题一起展示
     * 图片标题的图片path
     */
    private String imgTitlePath;
    /**
     * 文章的类别id，比如电影推荐还是购物网赚等
     */
    private int categoryId;
    /**
     * 冗余字段，文章分类的名称
     */
    private String categoryName;
    /**
     * 修改时间
     */
    private long updateTime;
    /**
     * 作者
     */
    private String author;
    /**
     * 文章内容
     */
    private String content;
    /**
     * 文章发布日期
     */
    private long publishTime;
    /**
     * 文章的状态
     * 0=锁定；1=正常；2=逻辑删除
     */
    private int status;
    /**
     * 阅读量
     */
    private int viewNum;
    /**
     * 主题文章摘要，content截取字段，去除html代码
     */
    private String introduce;


    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(long createTime) {
        this.createTime = createTime;
    }

    public int getContentType() {
        return contentType;
    }

    public void setContentType(int contentType) {
        this.contentType = contentType;
    }

    public String getImgTitlePath() {
        return imgTitlePath;
    }

    public void setImgTitlePath(String imgTitlePath) {
        this.imgTitlePath = imgTitlePath;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(long updateTime) {
        this.updateTime = updateTime;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public long getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(long publishTime) {
        this.publishTime = publishTime;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getViewNum() {
        return viewNum;
    }

    public void setViewNum(int viewNum) {
        this.viewNum = viewNum;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
}
