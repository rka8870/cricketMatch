package com.cricket.match.models;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Team {
    private String name;
    private List<Player> players;
    private Activity activity;
}
