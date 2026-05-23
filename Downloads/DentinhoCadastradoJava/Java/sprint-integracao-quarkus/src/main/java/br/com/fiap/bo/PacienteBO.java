package br.com.fiap.bo;

import java.sql.SQLException;
import java.util.ArrayList;

import br.com.fiap.dao.PacienteDAO;
import br.com.fiap.entities.Paciente;
import br.com.fiap.exceptions.EnderecoNaoEncontradoException;

public class PacienteBO {

    PacienteDAO pacienteDAO;

    public static Object buscarPorID(int id) {

        return null;
    }

    // Selecionar
    public ArrayList<Paciente> selecionarBo() throws ClassNotFoundException, SQLException {
        pacienteDAO = new PacienteDAO();
        // Regra de negocios
        return (ArrayList<Paciente>) pacienteDAO.selecionar();
    }

    public Paciente buscarPorRmBo(int id) throws SQLException, ClassNotFoundException {
        PacienteDAO pacienteDao = new PacienteDAO();
        // Regra de negocios
        return pacienteDao.buscarPorID(id);
    }

    // Inserir
    public static void inserirBo(Paciente paciente) throws ClassNotFoundException, SQLException, EnderecoNaoEncontradoException {
        PacienteDAO pacienteDao = new PacienteDAO();
        // Regra de negocios
        pacienteDao.inserir(paciente);
    }

    // Atualizar
    public void atualizarBo(Paciente paciente) throws ClassNotFoundException, SQLException {
        PacienteDAO pacienteDao = new PacienteDAO();
        // Regra de negocios
        pacienteDao.atualizar(paciente);
    }

    // Deletar
    public void deletarBo(int id) throws ClassNotFoundException, SQLException {
        PacienteDAO pacienteDao = new PacienteDAO();
        // Regra de negocios
        pacienteDao.deletar(id);
    }

}
