package com.exo1.exo1.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommentaryDTO {
    private Long id;
    private String title;
    private String content;
    private float rate;
    private UsersDTO author;
    private UsersDTO user;

}
