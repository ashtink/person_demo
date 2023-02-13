package learn.springboot.demo.Dao;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import learn.springboot.demo.model.Person;
import org.springframework.stereotype.Repository;

@Repository("fakeDao")
public class FakePersonDataAccessService implements PersonDao{

  private static List<Person> DB = new ArrayList<Person>();

  @Override
  public int insertPerson(UUID id, Person person) {
    DB.add(new Person(id,person.name()));
    return 1;
  }

  @Override
  public List<Person> getAllPersons() {
    return DB;
  }


}
