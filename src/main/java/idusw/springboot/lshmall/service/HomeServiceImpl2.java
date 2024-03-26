package idusw.springboot.lshmall.service;


import org.springframework.stereotype.Service;

@Service
public class HomeServiceImpl implements  HomeService {

    @Override
    public void sayHello() {
        System.out.println("service - say hello");
    }
}
