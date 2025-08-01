package org.top.circlecalculator.api.message;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ErrorMessage {
    private String type;
    private String message;
}
