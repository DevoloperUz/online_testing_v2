package model;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Question {
    private Integer id;
    private String text;
    private Subject subject;
}
