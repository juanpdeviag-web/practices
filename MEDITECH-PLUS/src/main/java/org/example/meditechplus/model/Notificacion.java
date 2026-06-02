package org.example.meditechplus.model;

import java.time.LocalDateTime;

public record Notificacion(String mensaje, LocalDateTime fecha, String tipoAlerta) {
}
