package com.example.codinglive.Entity;

import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Post {

    private int id;
    private int userId;
    private String title;
    private String body;
}
