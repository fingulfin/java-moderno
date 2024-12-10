package unidad5;

import org.jetbrains.annotations.NotNull;

import java.time.LocalDateTime;

public record User(@NotNull String username, boolean active, LocalDateTime lastLogin) {
}
