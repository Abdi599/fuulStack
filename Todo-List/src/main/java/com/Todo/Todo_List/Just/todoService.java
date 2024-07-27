package com.Todo.Todo_List.Just;

import lombok.AllArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class todoService {
    private  final JdbcTemplate template;

    public List<todo> getAlltodoes(){

        String sql="select*from  GroupA";
        return  template.query(sql,(rs,row)-> new todo(

                rs.getString("Name"),
                rs.getDate("Date"),
                rs.getString("Description")

        ) );

    }



}
