package demo.spring.service;

import javax.jws.WebService;

@SuppressWarnings("restriction")
@WebService
public interface HelloWorld {
    String sayHi(String text);
}