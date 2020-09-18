package com.example.demo.testExample;

import com.example.testExample.Todo;
import com.example.testExample.TodoRepository;
import com.example.testExample.TodoService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TodoServiceTest {
/**
 * Cách này sử dụng @SpringBootTest
 * Nó sẽ load toàn bộ Bean trong app của bạn lên,
 * Giống với việc chạy App.java vậy
 */

    /**
     * Đối tượng TodoRepository sẽ được mock, chứ không phải bean trong context
     */

    @MockBean
    TodoRepository todoRepository;

    @Autowired
    private TodoService todoService;

    @Before
    public void setUp() {
        Mockito.when(todoRepository.findAll())
                .thenReturn(IntStream.range(0, 10)
                                    .mapToObj(i -> new Todo(i, "title-" + i, "detail-" +i))
                                    .collect(Collectors.toList()));
    }

    @Test
    public void testCount() {
        Assert.assertEquals(10, todoService.countTodo());
    }

}
