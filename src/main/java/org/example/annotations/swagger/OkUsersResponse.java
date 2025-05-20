package org.example.annotations.swagger;

import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.ExampleObject;
import io.swagger.v3.oas.annotations.responses.ApiResponse;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@ApiResponse(
    responseCode = "200",
    description = "All users were found",
    content = @Content(examples = @ExampleObject(
            value = """
                    {
                          {
                            "id": 1,
                            "name": "John Doe",
                            "email": "John1@example.ru",
                            "age": 23,
                            "createdAt": "2025-05-11T16:33:42.289201"
                          },
                          {
                            "id": 2,
                            "name": "Joe Doe",
                            "email": "Joe2@example.ru",
                            "age": 24,
                            "createdAt": "2025-05-12T13:16:24.775222"
                          }
                    }
                    """
            )
    )
)
public @interface OkUsersResponse {}
