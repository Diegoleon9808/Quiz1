/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Vo.Tabla;
import Vo.Unidad1;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author JCBOT
 */
public class Crud_unidad {

    public List<Unidad1> findAll() throws SQLException {
        List<Unidad1> departamentos = null;
        String query = "SELECT * FROM Unidad_Abstracta_de_informacion";
        Connection connection = Conexion.getConnection();
        try {
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(query);
            int id = 0;
            String nombre = null;
            int id2 = 0;
            int id3 = 0;

            while (rs.next()) {
                if (departamentos == null) {
                    departamentos = new ArrayList<Unidad1>();
                }

                Unidad1 registro = new Unidad1();
                id = rs.getInt("Idunidad");
                registro.setIdUnidad(id);

                nombre = rs.getString("Name");
                registro.setNameUnidad(nombre);

                id2 = rs.getInt("Idtabla");
                registro.setIdtabla(id2);

                id3 = rs.getInt("Idcontexto2");
                registro.setDecision(id3);

                departamentos.add(registro);
            }
            st.close();

        } catch (SQLException e) {
            System.out.println("Problemas al obtener la lista de Departamentos");
            e.printStackTrace();
        }

        return departamentos;
    }

    public boolean insert(Unidad1 t) throws SQLException, IOException, ClassNotFoundException {
        boolean result = false;
        Connection connection = Conexion.getConnection();
        String query = " insert into Unidad_Abstracta_de_informacion (Idunidad,Name,Idtabla,Idcontexto2) " + "values (?,?,?,?)";
        PreparedStatement preparedStmt = null;
        Conexion cox = new Conexion();

        try {
            preparedStmt = connection.prepareStatement(query);
            preparedStmt.setInt(1, t.getIdUnidad());
            preparedStmt.setString(2, t.getNameUnidad());
            preparedStmt.setInt(3, t.getIdtabla());
            preparedStmt.setInt(4, cox.leer2());
            

            result = preparedStmt.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

//    public boolean update(Tabla t) throws SQLException {
//        boolean result = false;
//        Connection connection = Conexion.getConnection();
//        String query = "update tablee set NameTable = ? where IdTable = ?";
//        PreparedStatement preparedStmt = null;
//        try {
//            preparedStmt = connection.prepareStatement(query);
//            preparedStmt.setString(1, t.getNameTabla());
//            preparedStmt.setInt(2, t.getIdTabla());
//            if (preparedStmt.executeUpdate() > 0) {
//                result = true;
//            }
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//
//        return result;
//    }
//
//    public boolean delete(Tabla t) throws SQLException {
//        boolean result = false;
//        Connection connection = Conexion.getConnection();
//        String query = "delete from tablee where IdTable = ?";
//        PreparedStatement preparedStmt = null;
//        try {
//            preparedStmt = connection.prepareStatement(query);
//            preparedStmt.setInt(1, t.getIdTabla());
//            result = preparedStmt.execute();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//
//        return result;
//    }
}
