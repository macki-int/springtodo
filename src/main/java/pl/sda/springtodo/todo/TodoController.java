package pl.sda.springtodo.todo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/")
@Controller
public class TodoController {


    @ResponseBody
    String getTodos(){
        return "TODOs";
    }

    @RequestMapping("/todo")
    @ResponseBody
    String getTodo(){
        return "TODO";
    }


}
