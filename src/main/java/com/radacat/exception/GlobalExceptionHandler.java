package com.radacat.exception;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.radacat.api.RestApi;
import com.radacat.api.StatusCode;

@ControllerAdvice
public class GlobalExceptionHandler {

	public static final String DEFAULT_ERROR_VIEW = "500";
	
    @ExceptionHandler(value = Exception.class)
    public ModelAndView defaultErrorHandler(HttpServletRequest req, Exception e) throws Exception {
    	e.printStackTrace();
        ModelAndView mav = new ModelAndView();
        mav.addObject("exception", e);
        mav.addObject("url", req.getRequestURL());
        mav.setViewName(DEFAULT_ERROR_VIEW);
        return mav;
    }
    
    @ExceptionHandler(value = RuntimeException.class)
    public ModelAndView defaultRuntimeErrorHandler(HttpServletRequest req, Exception e) throws Exception {
    	e.printStackTrace();
        ModelAndView mav = new ModelAndView();
        mav.addObject("exception", e);
        mav.addObject("url", req.getRequestURL());
        mav.setViewName(DEFAULT_ERROR_VIEW);
        return mav;
    }
    
    @ExceptionHandler(value = MyCheckedException.class)
    public ModelAndView MyCheckedErrorHandler(HttpServletRequest req, Exception e) throws Exception {
    	e.printStackTrace();
        ModelAndView mav = new ModelAndView();
        mav.addObject("exception", e);
        mav.addObject("url", req.getRequestURL());
        mav.setViewName(DEFAULT_ERROR_VIEW);
        return mav;
    }
    
    @ExceptionHandler(value = MyRuntimeException.class)
    public ModelAndView MyRuntimeErrorHandler(HttpServletRequest req, Exception e) throws Exception {
    	e.printStackTrace();
        ModelAndView mav = new ModelAndView();
        mav.addObject("exception", e);
        mav.addObject("url", req.getRequestURL());
        mav.setViewName(DEFAULT_ERROR_VIEW);
        return mav;
    }

    @ExceptionHandler(value = MyJsonRuntimeException.class)
    @ResponseBody
    public RestApi<String> jsonRuntimeErrorHandler(HttpServletRequest req, Exception e) throws Exception{
    	e.printStackTrace();
    	return new RestApi<String>(StatusCode._10000.getCode());
    }
    
    @ExceptionHandler(value = MyJsonCheckedException.class)
    @ResponseBody
    public RestApi<String> jsonErrorHandler(HttpServletRequest req, MyCheckedException e) throws Exception {
    	e.printStackTrace();
    	return new RestApi<String>(StatusCode._10000.getCode());
    }

}

