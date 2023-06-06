package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.util.Util;


import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
//        Util.getSessionFactory();
        UserDao userDao = new UserDaoJDBCImpl();
        userDao.getAllUsers();
        userDao.createUsersTable();
        userDao.saveUser("BFSAG", "GFfADGH" , (byte) 23);
//        userDao.removeUserById(1);
//        userDao.getAllUsers();
//        userDao.cleanUsersTable();
//        userDao.dropUsersTable();
    }
}
