package org.top.circlecalculator.api.message;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ResultMessage {
    private Double perimeter;
    private Double square;
    private RadiusMessage radiusInfo;
}
