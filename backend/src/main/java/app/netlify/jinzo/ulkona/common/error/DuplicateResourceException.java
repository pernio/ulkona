package app.netlify.jinzo.ulkona.common.error;

import jakarta.validation.constraints.NotNull;

public class DuplicateResourceException extends RuntimeException {

    public DuplicateResourceException(@NotNull String message) {
        super(message);
    }
}
