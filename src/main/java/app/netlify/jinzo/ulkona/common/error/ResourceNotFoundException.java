package app.netlify.jinzo.ulkona.common.error;

import jakarta.validation.constraints.NotNull;

public class ResourceNotFoundException extends RuntimeException {

    public ResourceNotFoundException(@NotNull String message) {
        super(message);
    }
}
