package acc.com.api.impl;

import com.alibaba.dubbo.config.annotation.Service;
import acc.com.api.DubboDemoRemoteServiceApi;
import acc.com.api.model.PageDemo;
import acc.com.api.model.dto.DubboDemoDTO;
import acc.com.api.model.query.DubboDemoQuery;
import acc.com.service.DubboDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Service(version = "1.0")
public class DubboDemoRemoteServiceApiImpl implements DubboDemoRemoteServiceApi {

    @Autowired
    DubboDemoService service;

    @Override
    public PageDemo<DubboDemoDTO> listPage(DubboDemoQuery query) {
        return service.listPage(query);
    }

    @Override
    public DubboDemoDTO get(String id) {
        return service.get(id);
    }

}
