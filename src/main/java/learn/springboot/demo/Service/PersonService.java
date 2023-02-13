package learn.springboot.demo.Service;

import java.util.List;
import learn.springboot.demo.Dao.PersonDao;
import learn.springboot.demo.model.Person;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor (onConstructor = @__(@Autowired))
public class PersonService {

  private final @Qualifier("fakeDao")
  PersonDao personDao;

  public int addPerson(Person person){
    return personDao.insertPerson(person);
  }

  public List<Person> getAllPersons(){
    return personDao.getAllPersons();
  }
}
