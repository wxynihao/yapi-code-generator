# yapi-code-generator
根据Yapi的json生成java代码

## 进度说明

目前仅支持单层object json

## 使用说明

### Input
```
curl -X POST \
  http://localhost:1111/generator \
  -d '{
  "type": "object",
  "title": "empty object",
  "properties": {
    "id": {
      "type": "string",
      "description": "编号"
    },
    "username": {
      "type": "string",
      "description": "用户名"
    },
    "email": {
      "type": "string",
      "description": "邮箱"
    }
  },
  "required": [
    "id",
    "username",
    "email"
  ]
}'
```

### Output

```java
/**
 * 编号
 */
private String id;

/**
 * 邮箱
 */
private String email;

/**
 * 用户名
 */
private String username;

```