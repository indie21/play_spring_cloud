https://spring.io/guides/gs/routing-and-filtering/

# 反向代理

-------------------------------------------------------------------------------

gateway需要设置路由

```
zuul.routes.book.path=/books/**
zuul.routes.book.url=http://localhost:8090

ribbon.eureka.enabled=false

server.port=8080
```

之后可以在gateway访问 /books/available




# 增加过滤器

-------------------------------------------------------------------------------

过滤器有几种类型

+ pre: filters are executed before the request is routed,
+ routing: filters can handle the actual routing of the request,
+ post: filters are executed after the request has been routed, and
+ error: filters execute if an error occurs in the course of handling the request.


SimpleFilter.java


