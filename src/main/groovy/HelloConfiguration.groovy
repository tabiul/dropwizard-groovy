import com.fasterxml.jackson.annotation.JsonProperty
import io.dropwizard.Configuration

/**
 * Created by tabiul on 21 May 2016.
 */
class HelloConfiguration extends Configuration{
    @JsonProperty
    private template;

    @JsonProperty
    private defaultName;
}
