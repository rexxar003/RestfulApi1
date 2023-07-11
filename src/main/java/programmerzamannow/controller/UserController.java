package programmerzamannow.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import programmerzamannow.model.RegisterUserRequest;
import programmerzamannow.model.WebResponse;
import programmerzamannow.service.UserService;

@RestController
public class UserController {
    
    @Autowired
    private UserService userService;

    @PostMapping(
        path = "/api/users",
        consumes = org.springframework.http.MediaType.APPLICATION_JSON_VALUE,
        produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE
    )
    public WebResponse<String> register(@RequestBody RegisterUserRequest request){
        userService.register(request);
        return WebResponse.<String>builder().data("OK").build();
    }
}
