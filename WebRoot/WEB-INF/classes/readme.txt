0100:
本版本实现SSH(按顺序)三大框架的搭建 数据库的连接建立在Hibernate框架搭建之前；
0200:
鲜花礼品网一对一共享主键映射配置 
 一对一共享主键关系在建立数据库时的注意事项
 Hibernate 关系映射的基本操作步骤
 一对一共享主键映射配置
 常见故障分析及处理
0300:
鲜花礼品网一对一唯一外键映射配置   
 一对一唯一外键关系在建立数据库时的注意事项
 guashi 表和 user 表对应 POJO 类的修改
 ORM 映射文件的修改
 常见故障分析及处理
0400:
鲜花礼品网一对多关系映射配置
 一对多关系在建立数据库时的注意事项
 orders 表和 orderitem  表一对多关系的配置及相关文件修改
 其它一对多关系映射简述与总结
 常见故障分析及处理
0500:
鲜花礼品网项目结构及首页布局
项目结构设计
利用 Div + CSS 对首页进行布局
0600:
显示所有鲜花分类
 CatalogDAO 文件书写
 flowerAction 文件及分类方法实现
 在 applicationContext.xml 及 struts.xml 中配置 action
 在 JSP 页面直接执行 action 并将结果显示在当前页面
 常见故障分析及处理
0700:
显示新入库鲜花
DAO 文件、Action 文件书写、修改及配置
获取指定数量的 Hibernate 查询结果
常见故障分析及处理
0800:
分类别分页显示鲜花
 根据鲜花类别查询得到对应的鲜花
 Pager 类设计
 分页显示对应类别的鲜花
 常见故障分析及处理
0900:
用户注册
 综合使用 Struts 各类标签完成注册页面的书写
 Action、 DAO 等相关文件书写
 在 applicationContext.xml 及 struts.xml 中完成相关文件配置
 常见故障分析及处理
1000:
用户登录及注销
 登录页面及相关文件的书写及配置
 根据用户名、密码、角色，利用 HQL 语句验证用户是否合法
 根据不同角色进入不同功能界面
 注销
 常见故障分析及处理
1100:
用户个人信息管理
 修改密码页面书写及并利用 js 对密码进行非空等限制
 根据用户名、密码、角色，利用 HQL 语句验证用户是否合法
 将用户个人信息显示在 JSP 页面
 利用 saveOrUpdate 方法完成用户信息的修改
 常见故障分析及处理
1200：
购物车设计
 购物车总体设计
 增加方法实现“添加花品到购物车”功能
 增加方法实现“更新购物车商品”
 增加方法实现“结账”
 常见故障分析及处理
1300:
 在Action 文件中书写添加花品到购物车方法
 在 applicationContext.xml 及 struts.xml 中完成相关文件配置
 常见故障分析及处理
1400:
 在 JSP 页面显示已经添加的商品信息，并根据情况修改
 在 Action 中书写更新购物车商品方法
 完成相关文件配置
 常见故障分析及处理
1500:
 提交订单时验证用户是否登录，未登录的跳转至登录界面完成用户登录
 提交订单涉及到的各个类及方法的书写
 完成相关文件配置
 常见故障分析及处理
1600:
增加花品
 综合运用 SHS 框架技术完成添加花品页面的书写
 花品分类动态显示
 花品图片上传
 相关文件书写及配置
 常见故障分析及处理
1700:
修改花品
SHS 框架技术综合运用
在 JSP 页面显示所有花品信息，并加入修改和删除按钮
在 JSP 页面显示花品的详细信息，准备下一步修改
花品信息的更新
常见故障分析及处理
1800:
 删除花品
 SHS 框架技术综合运用
 在 JSP 页面传递参数到 action 
 根据 JSP 页面传递的参数查询得到要删除的花品
 删除花品
 常见故障分析及处理
1900:
挂失账号及解除挂失
 SHS 框架技术综合运用
 在 JSP 页面选择不同按钮跳转到不同 action 
 根据 JSP 页面传递的参数对指定账号挂失或解挂
 常见故障分析及处理
2000:
应用拦截器拦截已挂失账号
 SHS 框架技术综合运用
 定义拦截器，在拦截器中调用DAO文件
 将不同类型的 action 放入不同的 package
 配置应用拦截器
 常见故障分析及处理
2100:
应用拦截器拦截未经登录的访问
 SHS 框架技术综合运用
 定义拦截器，根据用户是否登录返回不同的结果
 配置应用拦截器，对未经登录的访问进行限制
 常见故障分析及处理

 
