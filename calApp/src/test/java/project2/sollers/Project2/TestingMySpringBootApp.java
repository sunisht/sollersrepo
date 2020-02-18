package project2.sollers.Project2;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.sollers.cal.CalApp;
import com.sollers.cal.domain.Person;
import com.sollers.cal.persistence.CustomerRepository;
import com.sollers.cal.persistence.PersonRepository;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;

import java.util.List;
import java.util.Optional;


@RunWith(SpringRunner.class)
@SpringBootTest(classes=CalApp.class)
//@AutoConfigureMockMvc
//@DataJpaTest
class TestingMySpringBootApp {
	
//	@Autowired
//	private MockMvc mockMvc;

	
 
    @Autowired
    private PersonRepository personRepository;
    
   @Test
    public void testSavePerson() {


        try {
			Person person = new Person(1,"minh", "nguyen", true,true,"admin@gmail.com");
			personRepository.save(person);
			Optional<Person> optionalPerson = personRepository.findById(1);
			Person newPerson =optionalPerson.get();
			
			assertNotNull(newPerson);
			assertEquals(newPerson.getFirstName(), person.getFirstName());
			assertEquals(newPerson.getLastName(), person.getLastName());
			assertEquals(newPerson.getEmail(), person.getEmail());

			assertEquals(newPerson.isSupervisor(), person.isSupervisor());

			assertEquals(newPerson.isAdmin(), person.isAdmin());

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
  }
   
   @Test
   public void testDelete() {


       try {
			Person person = new Person(2,"minh", "nguyen", true,true,"admin@gmail.com");
			personRepository.save(person);
			
			personRepository.delete(person);									

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 }
   
   @Test
   public void testFindAll() {


       try {
			Person person = new Person(3,"minh", "nguyen", true,true,"admin@gmail.com");
			personRepository.save(person);
			List<Person> listPerson = personRepository.findAll();
			
			assertNotNull(listPerson);
			

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 }
   
   
    
   
    

}
