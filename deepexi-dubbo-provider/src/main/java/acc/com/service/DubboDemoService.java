package acc.com.service;

import acc.com.api.model.PageDemo;
import acc.com.api.model.dto.DubboDemoDTO;
import acc.com.api.model.query.DubboDemoQuery;

public interface DubboDemoService {

    PageDemo<DubboDemoDTO> listPage(DubboDemoQuery query);

    DubboDemoDTO get(String id);

}
