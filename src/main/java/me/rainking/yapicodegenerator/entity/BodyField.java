package me.rainking.yapicodegenerator.entity;

import com.alibaba.fastjson.JSONObject;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Rain
 * @date 2018/11/12
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BodyField {

	private String type;

	private String description;

	private BodyField items;

	private JSONObject properties;

	public String getJavaType(){
		switch (type){
			case "string":return "String";
			case "integer":return "Integer";
			case "number":return "Long";
			case "array": return "List<"+ items.getJavaType() +">";
			case "object":
			default: return "Object";
		}
	}
}
