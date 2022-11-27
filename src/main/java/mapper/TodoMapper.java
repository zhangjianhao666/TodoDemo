package mapper;

import dto.*;
import user.LoginDTO;
import vo.*;

/**
 * @author Wilson
 * @description: TODO
 * @date 2022/11/26 15:55
 */
public class TodoMapper {

    /**
     * 向数据库添加todo
     * @param addTodoDTO
     * @return
     */
    public AddTodoVO addTodo(AddTodoDTO addTodoDTO) {
        String SQL = "insert into todo_table values(xxx)";
        return new AddTodoVO();
    }
    public DeleteTodoVO deleteTodo(DeleteTodoDTO deleteTodoDTO) {
        String SQL = "update todo_table set is_deleted = 'y' where id = deletedTodoId";
        return new DeleteTodoVO();
    }
    public QueryAllTodoListVO queryAllTodoList(QueryAllTodoListDTO queryAllTodoListDTO) {
        String SQL = "select * from todo_table where userId = ''";
        return new QueryAllTodoListVO();
    }
    public QueryClassificationTodoListVO queryClassificationTodoList(QueryClassificationTodoListDTO queryClassificationTodoListDTO) {
        String SQL = "select * from todo_table where userId = '' and todoType = ''";
        return new QueryClassificationTodoListVO();
    }
    public UpdateTodoVO updateTodo(UpdateTodoDTO updateTodoDTO) {
        String SQL = "update todo_table set xx = xx where todoId = ''";
        return new UpdateTodoVO();
    }
    public LoginResultVO loginCheck(LoginDTO loginDTO) {
        String SQL = "select * from user_table where login_id = '' and login_password = ''";
        return new LoginResultVO();
    }
}
