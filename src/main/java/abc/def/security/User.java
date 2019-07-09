package abc.def.security;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
@Builder
@ToString
public class User {

    @Id
    private String id;

    private String username;

    private String password;
}
