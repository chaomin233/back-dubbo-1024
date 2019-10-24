package acc.com.service.impl;

import acc.com.model.dto.DemoDTO;
import acc.com.service.DemoService;
import org.springframework.stereotype.Service;

@Service
public class DemoServiceImpl implements DemoService {

    @Override
    public String sayHello() {
        return "welcome!";
    }

    @Override
    public DemoDTO get() {
        return new DemoDTO("1","demo","demo-desc");
    }

}
