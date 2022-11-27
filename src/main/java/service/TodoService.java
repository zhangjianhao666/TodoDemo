package service;

import dto.*;
import result.ResultModel;
import user.LoginDTO;
import user.Pvg;
import vo.*;

/**
 * @author Wilson
 * @description: Service层
 * @date 2022/11/25 16:13
 */
public interface TodoService {
    /**
     * 添加一条todo
     * @param addTodoDTO
     * @return
     */
    public ResultModel<AddTodoVO> addTodo(AddTodoDTO addTodoDTO);

    /**
     * 删除一条todo
     * @param deleteTodoDTO
     * @return
     */
    public ResultModel<DeleteTodoVO> deleteTodo(DeleteTodoDTO deleteTodoDTO);

    /**
     * 查询该用户所有todo
     * @param QueryAllTodoListDTO
     * @return
     */
    public ResultModel<QueryAllTodoListVO> queryAllTodoList(QueryAllTodoListDTO QueryAllTodoListDTO);

    /**
     * 按分类查询用户todo
     * @param queryClassificationTodoListDTO
     * @return
     */
    public ResultModel<QueryClassificationTodoListVO> queryClassificationTodoList(QueryClassificationTodoListDTO queryClassificationTodoListDTO);
    /**
     * 更新todo
     */
    public ResultModel<UpdateTodoVO> updateTodo(UpdateTodoDTO updateTodoDTO);
    /**
     * 登录
     */
    public ResultModel<LoginResultVO> loginTodo(LoginDTO loginDTO);
}
