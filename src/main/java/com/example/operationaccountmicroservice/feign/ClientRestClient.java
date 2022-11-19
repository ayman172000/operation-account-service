package com.example.operationaccountmicroservice.feign;

import com.example.operationaccountmicroservice.model.Client;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface ClientRestClient {
    @GetMapping("clients/{id}")
    Client getClientById(@PathVariable(name = "id") Long id);

    @GetMapping("clients")
    List<Client> getAllClient();
/*    @GetMapping("clients")
    PagedModel<Client> getAllClient(@RequestParam(name = "page") int page,
                                    @RequestParam(name = "size") int size);*/
}
