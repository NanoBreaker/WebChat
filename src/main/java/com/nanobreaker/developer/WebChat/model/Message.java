package com.nanobreaker.developer.WebChat.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class Message {

    @Id
    @GeneratedValue
    private Long id;

    @NonNull
    private String text;

    @NonNull
    private LocalDate creationDate;

    @ManyToOne
    @JsonIgnore
    private User user;

}
