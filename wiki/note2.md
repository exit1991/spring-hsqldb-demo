# 途中からデータベースを有効にする（HSQLDB）

## 1. 必要なモジュールの追加
### 1-1. pom.xml編集

- `pom.xml` の `<dependencies>` 〜 `</dependencies>` の中に以下を追加する

```xml
    <dependency>
      <groupId>org.springframework.boot</groupId>
      <artifactId>spring-boot-starter-data-jpa</artifactId>
    </dependency>

    <dependency>
      <groupId>org.hsqldb</groupId>
      <artifactId>hsqldb</artifactId>
      <scope>runtime</scope>
    </dependency>
```

- 保存後、VSCodeの画面右下に
  「A build file was modified. Do you want to synchronize the Java classpath/configuration?」
  が表示されるので、「Yes」を押す。


## 2. プログラミング

- `@Repository` のクラスや `@Entity` のクラスを追加する


