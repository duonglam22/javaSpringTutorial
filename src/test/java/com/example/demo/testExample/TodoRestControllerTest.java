package com.example.demo.testExample;

import com.example.testExample.TodoRestController;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@WebMvcTest(TodoRestController.class)
public class TodoRestControllerTest {
    /**
     * Đối tượng MockMvc do Spring cung cấp
     * Có tác dụng giả lập request, thay thế việc khởi động Server
     */
//    @Autowired
//    private MockMvc mvc;
}
