package learn.springboot.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.UUID;
public record Person(@JsonProperty("id") UUID id,
                     @JsonProperty("name") String name) {

}
