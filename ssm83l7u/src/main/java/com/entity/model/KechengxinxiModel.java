package com.entity.model;

import com.entity.KechengxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 课程信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-05-25 11:36:12
 */
public class KechengxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 课程类型
	 */
	
	private String kechengleixing;
		
	/**
	 * 班级
	 */
	
	private String banji;
		
	/**
	 * 课程内容
	 */
	
	private String kechengneirong;
		
	/**
	 * 课程视频
	 */
	
	private String kechengshipin;
		
	/**
	 * 开课时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date kaikeshijian;
		
	/**
	 * 结课时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date jiekeshijian;
		
	/**
	 * 课程图片
	 */
	
	private String kechengtupian;
		
	/**
	 * 教师工号
	 */
	
	private String jiaoshigonghao;
		
	/**
	 * 教师姓名
	 */
	
	private String jiaoshixingming;
		
	/**
	 * 用户id
	 */
	
	private Long userid;
				
	
	/**
	 * 设置：课程类型
	 */
	 
	public void setKechengleixing(String kechengleixing) {
		this.kechengleixing = kechengleixing;
	}
	
	/**
	 * 获取：课程类型
	 */
	public String getKechengleixing() {
		return kechengleixing;
	}
				
	
	/**
	 * 设置：班级
	 */
	 
	public void setBanji(String banji) {
		this.banji = banji;
	}
	
	/**
	 * 获取：班级
	 */
	public String getBanji() {
		return banji;
	}
				
	
	/**
	 * 设置：课程内容
	 */
	 
	public void setKechengneirong(String kechengneirong) {
		this.kechengneirong = kechengneirong;
	}
	
	/**
	 * 获取：课程内容
	 */
	public String getKechengneirong() {
		return kechengneirong;
	}
				
	
	/**
	 * 设置：课程视频
	 */
	 
	public void setKechengshipin(String kechengshipin) {
		this.kechengshipin = kechengshipin;
	}
	
	/**
	 * 获取：课程视频
	 */
	public String getKechengshipin() {
		return kechengshipin;
	}
				
	
	/**
	 * 设置：开课时间
	 */
	 
	public void setKaikeshijian(Date kaikeshijian) {
		this.kaikeshijian = kaikeshijian;
	}
	
	/**
	 * 获取：开课时间
	 */
	public Date getKaikeshijian() {
		return kaikeshijian;
	}
				
	
	/**
	 * 设置：结课时间
	 */
	 
	public void setJiekeshijian(Date jiekeshijian) {
		this.jiekeshijian = jiekeshijian;
	}
	
	/**
	 * 获取：结课时间
	 */
	public Date getJiekeshijian() {
		return jiekeshijian;
	}
				
	
	/**
	 * 设置：课程图片
	 */
	 
	public void setKechengtupian(String kechengtupian) {
		this.kechengtupian = kechengtupian;
	}
	
	/**
	 * 获取：课程图片
	 */
	public String getKechengtupian() {
		return kechengtupian;
	}
				
	
	/**
	 * 设置：教师工号
	 */
	 
	public void setJiaoshigonghao(String jiaoshigonghao) {
		this.jiaoshigonghao = jiaoshigonghao;
	}
	
	/**
	 * 获取：教师工号
	 */
	public String getJiaoshigonghao() {
		return jiaoshigonghao;
	}
				
	
	/**
	 * 设置：教师姓名
	 */
	 
	public void setJiaoshixingming(String jiaoshixingming) {
		this.jiaoshixingming = jiaoshixingming;
	}
	
	/**
	 * 获取：教师姓名
	 */
	public String getJiaoshixingming() {
		return jiaoshixingming;
	}
				
	
	/**
	 * 设置：用户id
	 */
	 
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	
	/**
	 * 获取：用户id
	 */
	public Long getUserid() {
		return userid;
	}
			
}
