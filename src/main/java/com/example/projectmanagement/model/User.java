package com.example.projectmanagement.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import org.jspecify.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String fullName;
    private String email;

    private String password;
    @JsonIgnore
    @OneToMany(mappedBy = "assignee", cascade = CascadeType.ALL)
    private List<issue> assignedIssue = new ArrayList<>();

    private int projectSize;

    public String getfullName() {return  this.fullName;}

    public String getEmail() { // This method needs to exist
        return this.email;
    }

    public String getPassword() { // This method needs to exist
        return this.password;
    }

    public void setPassword(@Nullable String encode){
    }

    public void setEmail(String email) {
    }
    public void setfullName(String fullName) {
    }


}
