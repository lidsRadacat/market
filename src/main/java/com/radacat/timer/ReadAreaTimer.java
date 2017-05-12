package com.radacat.timer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.radacat.service.AreaService;

/**
 * @Description: TODO
 * @author: 李大双
 * @date: 2017年5月8日 下午8:27:08
 * @version: V1.0
 */
@Component
public class ReadAreaTimer {
	
	@Autowired
	AreaService areaService;
    
    
//	SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
//
//    @Scheduled(fixedRate = 3000)
//    public void timerRate() {
//        System.out.println(sdf.format(new Date()));
//    }
    
    @Scheduled(fixedRate = 6000000)
    public void readArea(){
    	areaService.findInMySQL();
    }
}
