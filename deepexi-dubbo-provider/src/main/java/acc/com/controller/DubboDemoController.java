package acc.com.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import acc.com.api.DubboDemoRemoteServiceApi;
import acc.com.api.model.PageDemo;
import acc.com.api.model.dto.DubboDemoDTO;
import acc.com.api.model.query.DubboDemoQuery;
import acc.com.extension.web.Payload;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("demo/dubbo")
@Payload
public class DubboDemoController {

    @Reference(version = "1.0")
    private DubboDemoRemoteServiceApi service;

    @GetMapping("call")
    public PageDemo<DubboDemoDTO> listPage() {
        DubboDemoQuery query = new DubboDemoQuery();
        query.setSize(20);
        return service.listPage(query);
    }

    @GetMapping("fallback")
    public DubboDemoDTO get() {
        return service.get("1");
    }

}
