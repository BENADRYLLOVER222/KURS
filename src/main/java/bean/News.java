package bean;

import java.io.Serializable;
import java.util.Objects;

public class News implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    private String title;
    private String brief;
    private String imageUrl; 
    
    // Конструкторы
    public News() {
    }
    
    public News(String title, String brief, String imageUrl) {
        super();
        this.title = title;
        this.brief = brief;
        this.imageUrl = imageUrl;
    }
    
    // Методы геттер и сеттер для title, brief и imageUrl
    public String getTitle() {
        return title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public String getBrief() {
        return brief;
    }
    
    public void setBrief(String brief) {
        this.brief = brief;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(brief, title, imageUrl);
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        News other = (News) obj;
        return Objects.equals(brief, other.brief) && 
               Objects.equals(title, other.title) && 
               Objects.equals(imageUrl, other.imageUrl);
    }
    
    @Override
    public String toString() {
        return "News [title=" + title + ", brief=" + brief + ", imageUrl=" + imageUrl + "]";
    }
}