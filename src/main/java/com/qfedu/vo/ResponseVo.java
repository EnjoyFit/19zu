package com.qfedu.vo;
//                       .::::.

//                     .::::::::.
//                    :::::::::::
//                 ..:::::::::::'
//              '::::::::::::'
//                .::::::::::
//           '::::::::::::::..
//                ..::::::::::::.
//              ``::::::::::::::::
//               ::::``:::::::::'        .:::.
//              ::::'   ':::::'       .::::::::.
//            .::::'      ::::     .:::::::'::::.
//           .:::'       :::::  .:::::::::' ':::::.
//          .::'        :::::.:::::::::'      ':::::.
//         .::'         ::::::::::::::'         ``::::.
//     ...:::           ::::::::::::'              ``::.
//    ```` ':.          ':::::::::'                  ::::..
//                       '.:::::'                    ':'````..
//
//

import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//使用泛型，支持各种对象的返回
@Component
@Scope("prototype")
public class ResponseVo<T> {

	private int code;

	private String msg;

	private long count;

	private String imgsrc;

	public long getCount() {
		return count;
	}

	public void setCount(long count) {
		this.count = count;
	}

	public String getImgsrc() {
		return imgsrc;
	}

	public void setImgsrc(String imgsrc) {
		this.imgsrc = imgsrc;
	}

	private List<T> data;

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public List<T> getData() {
		return data;
	}

	public void setData(List<T> data) {
		this.data = data;
	}

	public static ResponseVo OK() {
		ResponseVo vo = new ResponseVo();
		vo.setMsg("success");
		vo.setCode(0);
		return vo;
	}

	public static ResponseVo ERROR() {
		ResponseVo vo = new ResponseVo();
		vo.setMsg("error");
		vo.setCode(1);
		return vo;
	}

}
