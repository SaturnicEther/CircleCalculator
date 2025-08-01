package org.top.circlecalculator.api.message;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RadiusMessage {
    private Double radius;
    private boolean isDiameter;

    public boolean getIsDiameter() {
        return isDiameter;
    }
}
