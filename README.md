# amazon-mws-reports-maven
Mavenized version of Amazon MWS Report API

[![](https://jitpack.io/v/ChameleonTartu/amazon-mws-reports-maven.svg)](https://jitpack.io/#ChameleonTartu/amazon-mws-reports-maven)
[![](https://travis-ci.org/ChameleonTartu/amazon-mws-reports-maven.svg?branch=master)](https://travis-ci.org/travis-ci/travis-web)


# How to use into Maven (pom.xml)

At the moment, this library is not available at Maven Central.
Therefore, you need to add additional repository to fetch it from.

```
<repositories>
    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>
</repositories>
```

Dependency itself:
```
<dependency>
    <groupId>com.github.ChameleonTartu</groupId>
    <artifactId>amazon-mws-reports-maven</artifactId>
    <version>v1.0.2</version>
</dependency>
```

In case you want to have the latest updates you can specify `version` as `master-SNAPSHOT`.
```
<dependency>
    <groupId>com.github.chameleontartu</groupId>
    <artifactId>amazon-mws-reports-maven</artifactId>
    <version>master-SNAPSHOT</version>
</dependency>
```

# Inspiration

This project was inspired by [ext-lib-amazon-mws-products](https://github.com/trifonnt/ext-lib-amazon-mws-products)

# Project supporter

This project was supported by ![](https://hiccasoft.io/static/img/hiccasoft_new.png)
