package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.util.Util;


import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        Util.getSessionFactory();
        UserDao userDao = new UserDaoHibernateImpl();
        //userDao.saveUser("xcvcx","gr",(byte) 2);
        //userDao.getAllUsers();
        //userDao.cleanUsersTable();
        //userDao.removeUserById(2L);
        //userDao.dropUsersTable();

    }
}
