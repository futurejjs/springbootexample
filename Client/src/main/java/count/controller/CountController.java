package count.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import service.DealCountService;

import com.alibaba.dubbo.config.annotation.Reference;

@RestController
public class CountController {
	
	@Reference
	 private DealCountService dealCountService;
	
	@RequestMapping("/home")
    public String home(@RequestParam Map<String, Object> params) {
        return dealCountService.addNumber(1, 2)+"";
    }
}