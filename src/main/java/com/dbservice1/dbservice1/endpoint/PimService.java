package com.dbservice1.dbservice1.endpoint;

import com.dbservice1.dbservice1.mongo.model.Product;
import com.dbservice1.dbservice1.repository.ProductRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rest/pim/db")
public class PimService {

    private static final Logger log = LoggerFactory.getLogger(PimService.class);

    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/products")
    public List<Product> getAllProd() {
        log.info("db-service : getAllProd - before");
        List<Product> prodList =  productRepository.findAll();
        log.info("db-service : getAllProd - after");
        return prodList;
    }
}
