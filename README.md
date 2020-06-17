# Dubbo Telnet Command (Invoke) PlayGround

Dubbo Telnet Commands 是一个令人兴奋的特性，但限于官方文档的只言片语，对 `invoke` 的命令一直没法形成系统化的使用。

本仓库提供了大量常见的服务化请求方法与参数类型，可以作为 **PlayGround** 供大家使用。对于每个方法的有效触发方式，请参考文档

## 下载

```shell script
git clone https://github.com/ffutop/dubbo-telnet-playground
```

## 本地运行

```shell script
cd ${YOUR_PROGRAM_DIRECTORY}
mvn clean package
java -jar target/dubbo-telnet-playground.jar
```

## 本地 Dubbo Telnet 调试

```shell script
telnet 127.0.0.1 20880
```