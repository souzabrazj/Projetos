package br.com.fiap.bo;

import br.com.fiap.dao.DentistaDAO;
import br.com.fiap.entities.Dentista;

import java.sql.SQLException;
import java.util.ArrayList;

public class DentistaBO {

    DentistaDAO dentistaDAO;

    public static Object buscarPorID(int id) {

        return null;
    }

    // Selecionar
    public ArrayList<Dentista> selecionarBo() throws ClassNotFoundException, SQLException {
        dentistaDAO = new DentistaDAO();
        // Regra de negocios
        return (ArrayList<Dentista>) dentistaDAO.selecionar();
    }

    public Dentista buscarPorIdBo(int id) throws SQLException, ClassNotFoundException {
        DentistaDAO dentistaDao = new DentistaDAO();
        // Regra de negocios
        return dentistaDao.buscarPorID(id);
    }

    // Inserir
    public static void inserirBo(Dentista dentista) throws ClassNotFoundException, SQLException {
        DentistaDAO dentistaDao = new DentistaDAO();
        // Regra de negocios
        dentistaDao.inserir(dentista);
    }

    // Atualizar
    public void atualizarBo(Dentista dentista) throws ClassNotFoundException, SQLException {
        DentistaDAO dentistaDao = new DentistaDAO();
        // Regra de negocios
        dentistaDao.atualizar(dentista);
    }

    // Deletar
    public void deletarBo(int id) throws ClassNotFoundException, SQLException {
        DentistaDAO dentistaDao = new DentistaDAO();
        // Regra de negocios
        dentistaDao.deletar(id);
    }

}

