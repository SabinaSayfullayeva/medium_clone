package org.example.dao;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.example.domain.User;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Transactional
@RequiredArgsConstructor
public class UserDao {
    private final SessionFactory session;
    public User getUserByUsername(final String username) {
        return session.getCurrentSession()

                .createNativeQuery("select * from users where name = ?1", User.class)
                .setParameter(1, username)
                .uniqueResult();
    }
    public User save(User user) {
        session.getCurrentSession()
                .persist(user);
        return user;
    }
    public User update(User user){
        return session.getCurrentSession()
                .merge(user);
    }
    public User getById(long id){
        return session.getCurrentSession()
                .get(User.class, id);
    }
    public void delete(long id){
        session.getCurrentSession()
                .remove(getById(id));
    }
    public List<User> getAll(){
        return session.getCurrentSession()
                .createQuery("from User", User.class)
                .list();
    }

}
