package com.sheGoesTech.LoginRegisterExample;


import static org.assertj.core.api.Assertions.assertThat;

import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(false)
public class UserRepositoryTests {
//    @Autowired
//    private UserRepository repo;
//
//    @Autowired
//    private TestEntityManager entityManager;
//
//    @Test
//    public void testCreateUser(){
//        User user = new User();
//        user.setEmail("liga@liga.com");
//        user.setFirstName("Liga");
//        user.setLastName("BBB");
//        user.setPassword("qwrerty");
//
//        User savedUser = repo.save(user);
//
//        User existUser = entityManager.find(User.class, savedUser.getUserId());
//
//        assertThat(existUser.getEmail()).isEqualTo(user.getEmail());
//    }
//@Test
//    public void testFindUserByEmail(){
//        String email ="es@ll.lv";
//        User user = repo.findByEmail(email);
//        assertThat(user).isNotNull();
//}

}
