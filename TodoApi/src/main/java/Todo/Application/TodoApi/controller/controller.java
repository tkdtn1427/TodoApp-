package Todo.Application.TodoApi.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class controller {

    @GetMapping("/")
    public ResponseEntity getTest(){
        String result = " To-do Application !";
        return new ResponseEntity(result, HttpStatus.OK);
    }
}
