package ua.kiev.prog;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Film {
    @Id
    @GeneratedValue
    private long id;

    private Integer LikeCount;
    private Integer DislikeCount;

    public Film(Integer LikeCount, Integer DislikeCount) {
        this.LikeCount = LikeCount;
        this.DislikeCount = DislikeCount;
    }

    public Film() {}

    public Integer getLike() {
        return LikeCount;
    }

    public void setLike(Integer LikeCount) {
        this.LikeCount = LikeCount;
    }

    public Integer getDislike() {
        return DislikeCount;
    }

    public void setDislike(Integer DislikeCount) {
        this.DislikeCount = DislikeCount;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


}
