package com.enation.app.advbuy.core.model;

import com.enation.framework.database.NotDbField;
import com.enation.framework.database.PrimaryKeyField;
import com.enation.framework.util.DateUtil;

/**
 * 预售活动 
 * @author kingapex
 *2014-12-16上午10:04:59
 * @author fenlongli
 *2015-3-29
 */
public class AdvBuyActive {
	private int act_id; //活动Id
	private String act_name;	//活动名称
	private long start_time;	//活动开启时间
	private long end_time;		//预售结束时间
	private int act_status; 	//0.未开始.1.已开始.2.已结束
	private long add_time;		//预售添加时间
	private int act_tag_id;		//预售活动标签Id
	private long join_end_time; //预售报名截止时间
	
	@PrimaryKeyField
	public int getAct_id() {
		return act_id;
	}
	public void setAct_id(int act_id) {
		this.act_id = act_id;
	}
	public String getAct_name() {
		return act_name;
	}
	public void setAct_name(String act_name) {
		this.act_name = act_name;
	}
	
	
	public long getStart_time() {
		return start_time;
	}

	/**
	 * 获取日期字串，非数据库字段
	 * @return
	 */
	@NotDbField
	public String getStart_time_str() {
		
		return  DateUtil.toString(start_time, "yyyy-MM-dd");
	}
	
	public void setStart_time(long start_time) {
		this.start_time = start_time;
	}
	
	public long getEnd_time() {
		return end_time;
	}
	
	/**
	 * 获取日期字串，非数据库字段
	 * @return
	 */
	@NotDbField
	public String getEnd_time_str() {
		return  DateUtil.toString(end_time, "yyyy-MM-dd");
	}
	
	
	public void setEnd_time(long end_time) {
		this.end_time = end_time;
	}
	public int getAct_status() {
	    // 2015/10/30 humaodong
	    // 2015/11/4 disable if (end_time < DateUtil.getDateline()) return 2;
		return act_status;
	}
	public void setAct_status(int act_status) {
		this.act_status = act_status;
	}
	
	public long getAdd_time() {
		return add_time;
	}
	/**
	 * 获取日期字串，非数据库字段
	 * @return
	 */
	@NotDbField
	public String getAdd_time_str() {
		return  DateUtil.toString(add_time, "yyyy-MM-dd");
	}
	
	public void setAdd_time(long add_time) {
		this.add_time = add_time;
	}

	@NotDbField
	public String getAct_status_text(){
		String act_status_text="";
		int status = getAct_status();
		if(status==0){
			act_status_text= "未开始";
		}else if(status==1){
			act_status_text= "已开始";
		}else if(status==2){
			act_status_text= "已结束";
		}
		return act_status_text;
	}
	public int getAct_tag_id() {
		return act_tag_id;
	}
	public void setAct_tag_id(int act_tag_id) {
		this.act_tag_id = act_tag_id;
	}
	public long getJoin_end_time() {
		return join_end_time;
	}
	public void setJoin_end_time(long join_end_time) {
		this.join_end_time = join_end_time;
	}
}
