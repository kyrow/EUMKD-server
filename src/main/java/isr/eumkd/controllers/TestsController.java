package isr.eumkd.controllers;

import isr.eumkd.models.Answer;
import isr.eumkd.models.Result;
import isr.eumkd.services.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/tests")
public class TestsController {

    @Autowired
    private TestService service;

    @GetMapping(value = {"/{id}"}, produces = "application/json")
    @ResponseBody
    @ResponseStatus(value = HttpStatus.OK)
    public Result checkTest(@PathVariable int id, @RequestBody Answer[] answers) throws Exception {
        return service.checkTest(id, answers);
    }

    @ExceptionHandler(Exception.class)
    @ResponseStatus(value= HttpStatus.INTERNAL_SERVER_ERROR)
    public String  notFound(Exception exception) {
        return exception.getCause() + "\n" +exception.getMessage();
    }
}
