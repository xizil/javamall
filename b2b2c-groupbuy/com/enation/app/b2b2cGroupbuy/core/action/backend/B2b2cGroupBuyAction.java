package com.enation.app.b2b2cGroupbuy.core.action.backend;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.springframework.stereotype.Component;

import com.enation.framework.action.WWAction;
/**
 * 多商户团购管理类
 * @author fenlongli
 * @date 2015-7-13 下午2:17:31
 */
@ParentPackage("shop_default")
@Namespace("/b2b2c/admin")
@Results({
	 @Result(name="list",type="freemarker", location="/b2b2c/admin/groupbuy/act_list.html"),
})

@Action("groupBuy")
@Component
public class B2b2cGroupBuyAction extends WWAction{

	public String list(){
		return "list";
	}
}
