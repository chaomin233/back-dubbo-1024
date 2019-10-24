package acc.com.api;

import acc.com.api.model.PageDemo;
import acc.com.api.model.dto.DubboDemoDTO;
import acc.com.api.model.query.DubboDemoQuery;

public interface DubboDemoRemoteServiceApi {

    PageDemo<DubboDemoDTO> listPage(DubboDemoQuery query);

    DubboDemoDTO get(String id);

}
