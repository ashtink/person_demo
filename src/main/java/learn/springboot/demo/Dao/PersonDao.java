package learn.springboot.demo.Dao;

import java.util.List;
import java.util.UUID;
import learn.springboot.demo.model.Person;

public interface PersonDao {

  int insertPerson(UUID id, Person person);
  default int insertPerson(Person person){

    final var uuid = UUID.randomUUID();
    return insertPerson(uuid,person);

  }
  List<Person> getAllPersons();

}
