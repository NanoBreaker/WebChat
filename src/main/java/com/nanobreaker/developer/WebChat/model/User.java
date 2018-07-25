package com.nanobreaker.developer.WebChat.model;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class User {

    @Id
    @GeneratedValue
    private Long id;

    @NonNull
    private String userName;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Message> messageList = new ArrayList<>();

}
