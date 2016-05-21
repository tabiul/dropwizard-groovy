import com.fasterxml.jackson.annotation.JsonProperty
import org.hibernate.validator.constraints.Length

/**
 * Created by tabiul on 21 May 2016.
 */
class Saying {
    @JsonProperty
    private long id;

    @Length(max = 3)
    @JsonProperty
    private String content;

    def Saying(long id, String content) {
        this.id = id;
        this.content = content;
    }

}
