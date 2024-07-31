package dio.ApiRest.services;

import java.util.List;

import dio.ApiRest.domain.model.User;

public interface servicesUser {

    public List<User> buscarTodos();
    public User buscarPorId(Long id);
    public void alterarUser(Long id, User user);
    public void deletarUser(Long id);
    public User inserirUser(User user);
}
