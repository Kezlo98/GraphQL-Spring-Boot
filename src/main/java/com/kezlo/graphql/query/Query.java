package com.kezlo.graphql.query;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class Query {

    @QueryMapping
    public String firstQuery() {
        return "Hello World!";
    }

    @QueryMapping
    public String secondQuery() {
        return "Hello World! x 2";
    }

    @QueryMapping
    public String fullname(@Argument String firstName, @Argument String lastName) {
        return firstName + " " + lastName;
    }
}
