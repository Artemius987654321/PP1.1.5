package jm.task.core.jdbc.dao;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.util.Util;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

//public class UserDaoHibernateImpl implements UserDao {
//    private Session HibernateSessionFactoryUtil;
//
//    public UserDaoHibernateImpl() {
//
//    }
//
//
//    @Override
//    public void createUsersTable() {
//        Transaction transaction = null;
//        try (Session session = Util.getSessionFactory().openSession()) {
//            transaction = session.beginTransaction();
//            //session.save(User);
//            transaction.commit();
//        } catch (Exception e) {
//            if (transaction != null) {
//                transaction.rollback();
//            }
//            e.printStackTrace();
//        }
//
//    }
//
//    @Override
//    public void dropUsersTable() {
//
//    }
//
//    @Override
//    public void saveUser(String name, String lastName, byte age) {
//
//    }
//
//    @Override
//    public void removeUserById(long id) {
//
//    }
//
//    @Override
//    public List<User> getAllUsers() {
//        try (Session session = Util.getSessionFactory().openSession()) {
//            return session.createQuery("from User", User.class).list();
//        }
//    }
//
//    @Override
//    public void cleanUsersTable() {
//
//    }
//}
