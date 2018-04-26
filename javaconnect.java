/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.management.system;

/**
 *
 * @author eiwes
 */

import java.sql.*;
import javax.swing. JOptionPane;

public class javaconnect {
  Connection conn;

public static Connection ConnecrDb(){
try{
Class.forName("org.sqlite.JDBC");
Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\eiwes\\Documents\\NetBeansProjects\\Library Management System\\LibraryNew.sqlite");
return conn;
}catch(Exception e ){
JOptionPane.showMessageDialog(null, e);
return null;
}
}  
}
