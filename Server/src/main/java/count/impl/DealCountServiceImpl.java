package count.impl;

import service.DealCountService;

import com.alibaba.dubbo.config.annotation.Service;
@Service 
public class DealCountServiceImpl implements DealCountService{
	
	@Override
	public int addNumber(int a, int b) {
		return a+b;
	}

}
