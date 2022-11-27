package executor;

import dto.AddTodoDTO;
import mapper.TodoMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.legacy.PowerMockRunner;
import result.ResultModel;
import vo.AddTodoVO;

/**
 * @author Wilson
 * @description: TODO
 * @date 2022/11/27 14:57
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest(ResultModel.class)
public class AddTodoTest {
    @InjectMocks
    private AddTodoExe addTodoExe;
    @Mock
    private TodoMapper todoMapper;
    @Test
    public void addTodoTest() {
        AddTodoDTO addTodoDTO = new AddTodoDTO();
        addTodoDTO.setTodoName("todoName");
        addTodoDTO.setDescription("this is test");
        addTodoDTO.setIsImportant(true);
        AddTodoVO addTodoVO = new AddTodoVO();
        addTodoVO.setAddResult(true);
        Mockito.when(todoMapper.addTodo(addTodoDTO)).thenReturn(addTodoVO);
        Assert.assertEquals(addTodoVO.getAddResult(),addTodoExe.execute().getResultValue().getAddResult());
    }
}
