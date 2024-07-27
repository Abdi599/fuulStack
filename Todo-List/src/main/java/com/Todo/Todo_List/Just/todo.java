package com.Todo.Todo_List.Just;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class todo {
    private String name;
    private Date date;
    private String description;

}
