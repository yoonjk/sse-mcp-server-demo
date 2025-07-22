package com.example.sse_mcp_server_demo.tool;

import com.example.sse_mcp_server_demo.domain.Product;
import org.springframework.ai.tool.annotation.Tool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class ProductService {

    private RestTemplate restTemplate = new RestTemplate();

    @Tool(description = "Get all product in databases")
    public List<Product> getAllProduct() {
        ParameterizedTypeReference<List<Product>> paramsTypeRef = new ParameterizedTypeReference<List<Product>>() {};
        ResponseEntity<List<Product>> responseEntity = restTemplate.exchange("http://localhost:8060/products", HttpMethod.GET, null, paramsTypeRef);

        List<Product> products = responseEntity.getBody();

        return products;
    }
}
