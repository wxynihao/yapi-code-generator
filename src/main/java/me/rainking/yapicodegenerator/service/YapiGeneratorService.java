package me.rainking.yapicodegenerator.service;

import com.alibaba.fastjson.JSONObject;
import me.rainking.yapicodegenerator.entity.BodyField;
import org.springframework.stereotype.Service;

/**
 * @author Rain
 * @date 2018/11/12
 */
@Service
public class YapiGeneratorService {
    public String generate(String yapiJsonStr){
        JSONObject jsonObject = JSONObject.parseObject(yapiJsonStr);
        JSONObject properties = jsonObject.getJSONObject("properties");

        StringBuilder javaCode = new StringBuilder();
        for(String key : properties.keySet()){
            BodyField bodyField = JSONObject.parseObject(properties.get(key).toString(), BodyField.class);
            javaCode.append("/**\n");
            javaCode.append(" * " + bodyField.getDescription());
            javaCode.append("\n */\n");
            javaCode.append("private " + bodyField.getJavaType() + " " + key + ";\n\n");
        }
        return javaCode.toString();
    }
}
