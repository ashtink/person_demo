package learn.springboot.demo.api;

import java.util.List;
import learn.springboot.demo.Service.PersonService;
import learn.springboot.demo.model.Person;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RequestMapping("api/v1/person")
@RestController
@RequiredArgsConstructor (onConstructor = @__(@Autowired))
public class PersonController {

  private final PersonService service;

  @PostMapping
  public void addPerson(@RequestBody Person person){
    service.addPerson(person);
  }

  @GetMapping
  public List<Person> getAllPersons(){
    return service.getAllPersons();
  }
}
