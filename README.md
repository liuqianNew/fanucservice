# fornet service

>提供接口服务供平台调用，实现平台与SAP之间的信息交互

## 参数&约定

+ 接口以resful-api风格提供服务，并以json作为传输格式；

+ 编码规则默认为 UTF-8

+ 日期格式为 yyyy-MM-dd

+ 时间格式为 HHmmSS

+ URL编码规则：待定

+ 返回格式

  ```json
  {
      "code":"",
      "message":"",
      "data":""
  }
  ```

  

  | 属性    | 说明                            | 是否可空 |
  | ------- | ------------------------------- | -------- |
  | code    | 状态值，0标识成功，其他标识失败 | 否       |
  | message | 返回消息                        | 否       |
  | data    | 操作结果的封装                  | 是       |

  

  

## 功能说明

+ 提供物料服务

    - 物料主数据服务：平台传入同步标识等于N，sap返回未同步物料。
    
    - 物料库存信息服务：平台传入条件参数，SAP根据条件查询物料库存信息。

+ 提供销售订单服务

    - 添加接口：平台推送销售订单信息至SAP
    
    - 取消服务：平台推送订单取消信息至SAP
  
+ 提供销售交货服务：平台推送交货信息至SAP

+ 其他服务
  
    - 欠款查询服务：平台传入条件，SAP根据条件返回订单信息

    - 账目明细服务：平台传入条件，SAP根据条件返回相应发票信息

## 详细说明



***身份校验***：待定



### 1、物料服务

#### 1.1查询新增或更新物料

 平台调用接口查询SAP B1中U_IsSync（标识）字段为N的物料信息，SAP B1提供查询结果后将标识更新为Y。

+ 请求地址：***http://localhost:8082/item/edi/sap/v1/material***
+ 请求协议：***get***
+ 请求参数：***暂无***


+ 相应报文格式：

  ```json
  {
      "code":"0",
      "message":"OK",
      "data":[
        {
          "itemcode":"111111",
          "itemname":"2019 Macbook Pro",
          "groupcode":"1",
          "groupname":"笔记本电脑",
          "packunit":"台"
      }
    ]
  }

  ```

#### 1.2 查询物料库存信息

平台传入条件查询对应的库存价格信息。

- 请求地址：***http://localhost:8082/item/edi/sap/v1/materialinventory***

- 请求协议：***get***

- 请求参数：

  | 查询参数  | 参数描述               | 是否可空 |
  | --------- | ---------------------- | -------- |
  | itemCode  | 物料编码               | 可空     |
  | whsCode   | 仓库代码               | 可空     |
  | groupCode | 物料组编码             | 可空     |
  | pageIndex | 页码（默认第一页）     | 可空     |
  | pageSize  | 页大小（默认30条记录） | 可空     |

- 相应报文格式：

  ```json
  {
      "code":"0",
      "message":"OK",
      "data":[
        {
          "itemcode":"111111",
          "itemname":"2019 Macbook Pro",
          "groupcode":"1",
          "groupname":"笔记本电脑",
          "packunit":"台"
      }
    ]
  }
  ```

  



### 2、销售订单服务

#### 2.1 添加销售订单

 + 请求地址：***http://localhost:8082/sales/edi/sap/v1/salesorder***

 + 请求协议：***post***

 + 请求参数：

   ```json
   {
   	"carcode": "C001",
   	"docdate": "2019-07-03",
   	"note": "this is test",
   	"billno": "1211",
   	"extend2": "1",
   	"extend3": "2",
   	"extend4": "3",
   	"extend5": "4",
   	"items": [{
   			"itemcode": "121212",
   			"quantity": 12,
   			"whscode": "BJKJ",
   			"price": 12.32,
   			"extend1": "test1",
   			"extend2": "test2",
   			"extend3": "test3",
   			"extend4": "test4",
   			"extend5": "test5"
   		}, {
   			"itemcode": "232323",
   			"quantity": 10,
   			"whscode": "SHKJ",
   			"price": 12.34,
   			"extend1": "test1",
   			"extend2": "test2",
   			"extend3": "test3",
   			"extend4": "test4",
   			"extend5": "test5"
   		}
   	]
   }
   ```

 + 响应结果:

   ```json
   {
       "code": "0",
       "message": "OK",
       "data": {
           "docEntry": 799173536841216,
           "note": "this is test",
           "extend2": "1",
           "extend3": "2",
           "extend4": "3",
           "extend5": "4",
           "sapdocEntry": null,
           "carcode": "C001",
           "docdate": "2019-07-03",
           "billno": "1211",
           "items": [
               {
                   "docEntry": 799173536841216,
                   "lineId": 0,
                   "quantity": 12,
                   "price": 12.32,
                   "extend1": "test1",
                   "extend2": "test2",
                   "extend3": "test3",
                   "extend4": "test4",
                   "extend5": "test5",
                   "whscode": "BJKJ"
               },
               {
                   "docEntry": 799173536841216,
                   "lineId": 1,
                   "quantity": 10,
                   "price": 12.34,
                   "extend1": "test1",
                   "extend2": "test2",
                   "extend3": "test3",
                   "extend4": "test4",
                   "extend5": "test5",
                   "whscode": "SHKJ"
               }
           ]
       }
   }
   ```

   

   *注意* ：响应中的docEntry字段为SAP中间表的订单号，如果平台需要撤销该销售订单，需

#### 2.2 撤销销售订单

- 请求地址：***http://localhost:8082/sales/edi/sap/v1/salesorder/{billno}***
- 请求协议：***patch***
- 请求参数：url中指定平台传递的销售订单单据编号的值

- 响应结果:

  ```json
  {
      "code":"0",
      "message":"ok"
  }
  ```

  



### 3、销售交货服务

+ 请求地址：***http://localhost:8082/delivery/edi/sap/v1/salesdelivery***

+ 查询参数

  | 参数名称  | 参数描述                                     | 是否可空 |
  | --------- | -------------------------------------------- | -------- |
  | cardCode  | 业务伙伴（默认查询所有）                     | 可       |
  | docDate   | 单据过账日期（yyyy-MM-dd，默认查询当天日期） | 可       |
  | billNo    | 平台销售订单编号（默认查询所有）             | 可       |
  | pageIndex | 页码（默认第一页）                           | 可       |
  | pageSize  | 页大小（默认20）                             | 可       |

  

+ 请求协议：***get***

+ 响应结果：

  ```json
  {
      "code":"0",
      "message":"",
      "data":[
          {
              
          }
      ]
  }
  ```

  



### 4、其他服务

#### 4.1 欠款查询

- 请求地址：***待定***
- 请求协议：***get***
- 请求参数：待定
- 响应结果：待定

#### 4.2 欠款明细查询

- 请求地址：***待定***
- 请求协议：***get***
- 请求参数：待定
- 响应结果：待定

