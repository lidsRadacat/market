package com.radacat.utils;

import org.apache.shiro.crypto.RandomNumberGenerator;
import org.apache.shiro.crypto.SecureRandomNumberGenerator;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.radacat.domain.User;

/**
 * @Description: TODO
 * @author: 李大双
 * @date: 2017年4月17日 下午10:20:58
 * @version: V1.0
 */
@Service
public class ShiroPasswordHelper {
	private RandomNumberGenerator randomNumberGenerator = new SecureRandomNumberGenerator();  
	  
    @Value("${password.algorithmName}")  
    private String algorithmName;  
    @Value("${password.hashIterations}")  
    private int hashIterations;  
  
    public void encryptPassword(User user) {  
        user.setSalt(randomNumberGenerator.nextBytes().toHex());
        String newPassword = new SimpleHash(  
                algorithmName,    //加密算法  
                user.getPassword(),      //密码  
                ByteSource.Util.bytes(user.getSalt()),  //salt盐   username + salt  
                hashIterations   //迭代次数  
                ).toHex();
        user.setPassword(newPassword);  
    }
}
////password所需加密的参数  即  密码
//	//salt [盐] 一般为用户名 或 随机数
//	public static String md5(String password,String salt){
//      int hashIterations = 1;
//      //调用 org.apache.shiro.crypto.hash.Md5Hash.Md5Hash(Object source, Object salt, int hashIterations)构造方法实现MD5盐值加密
//      Md5Hash mh = new Md5Hash(password, salt, hashIterations);
//      //打印最终结果
//      System.out.println(mh.toString());
//      /*调用org.apache.shiro.crypto.hash.SimpleHash.SimpleHash(String algorithmName, Object source, Object salt, int hashIterations)
//       * 构造方法实现盐值加密  String algorithmName 为加密算法 支持md5 base64 等*/
//      SimpleHash sh = new SimpleHash("md5", password, salt, hashIterations);
//      //打印最终结果
//      System.out.println(sh.toString());
//      return mh.toString();
//	}