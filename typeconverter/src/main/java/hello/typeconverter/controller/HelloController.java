package hello.typeconverter.controller;


import hello.typeconverter.type.IpPort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
public class HelloController {

    @GetMapping("/hello-v1")
    public String helloV1(HttpServletRequest request){
        String data = request.getParameter("data");//문자 조회
        Integer intValue = Integer.valueOf(data); // 숫자타입으로 전환
        System.out.println("intValue = " + intValue);

        return "ok";
    }

    @GetMapping("/hello-v2")
    public String helloV2(@RequestParam Integer data){
        System.out.println("data = " + data);
        return "ok";
    }

    @GetMapping("/ip-port")
    public String ipPort(@RequestParam IpPort ipPort){
        System.out.println("ipPort ip = " + ipPort.getIp());
        System.out.println("ipPort port = " + ipPort.getPort());
        return "ok";
    }
}
