package impl;

import dto.*;
import executor.*;
import result.ResultModel;
import service.TodoService;
import user.LoginDTO;
import vo.*;

/**
 * @author Wilson
 * @description: TODO
 * @date 2022/11/26 14:32
 */
public class TodoServiceImpl implements TodoService {

    private AddTodoExe addTodoExe;
    private DeleteTodoExe deleteTodoExe;
    private QueryAllTodoListExe queryAllTodoListExe;
    private QueryClassificationTodoListExe queryClassificationTodoListExe;
    private UpdateTodoExe updateTodoExe;
    private LoginExe loginExe;
    @Override
    public ResultModel<AddTodoVO> addTodo(AddTodoDTO addTodoDTO) {
        addTodoExe = new AddTodoExe(addTodoDTO);
        return addTodoExe.execute();
    }

    @Override
    public ResultModel<DeleteTodoVO> deleteTodo(DeleteTodoDTO deleteTodoDTO) {
        deleteTodoExe = new DeleteTodoExe(deleteTodoDTO);
        return deleteTodoExe.execute();
    }

    @Override
    public ResultModel<QueryAllTodoListVO> queryAllTodoList(QueryAllTodoListDTO QueryAllTodoListDTO) {
        queryAllTodoListExe = new QueryAllTodoListExe(QueryAllTodoListDTO);
        return queryAllTodoListExe.execute();
    }

    @Override
    public ResultModel<QueryClassificationTodoListVO> queryClassificationTodoList(QueryClassificationTodoListDTO queryClassificationTodoListDTO) {
        queryClassificationTodoListExe = new QueryClassificationTodoListExe(queryClassificationTodoListDTO);
        return queryClassificationTodoListExe.execute();
    }

    @Override
    public ResultModel<UpdateTodoVO> updateTodo(UpdateTodoDTO updateTodoDTO) {
        updateTodoExe = new UpdateTodoExe(updateTodoDTO);
        return updateTodoExe.execute();
    }

    @Override
    public ResultModel<LoginResultVO> loginTodo(LoginDTO loginDTO) {
        loginExe = new LoginExe(loginDTO);
        return loginExe.execute();
    }
}
