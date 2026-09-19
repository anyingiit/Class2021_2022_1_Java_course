[English](README.md) · **简体中文**

> 英文版是规范版本。本页与 [README.md](README.md) 不一致时，以英文版为准。

<!-- translation-of: README.md sha256:27edd6792f63c75a -->

<a id="readme-top"></a>

# Class2021_2022_1_Java_course

一份个人的 Java 课程练习合集（2021–2022 学年），涵盖排序算法、面向对象编程、异常处理和两个计算器程序，每个练习都直接用 javac 编译，不依赖任何构建工具。

[![CI](https://github.com/anyingiit/Class2021_2022_1_Java_course/actions/workflows/ci.yml/badge.svg)](https://github.com/anyingiit/Class2021_2022_1_Java_course/actions/workflows/ci.yml)
[![License](https://img.shields.io/github/license/anyingiit/Class2021_2022_1_Java_course)](LICENSE)

[报告缺陷](https://github.com/anyingiit/Class2021_2022_1_Java_course/issues/new?template=bug_report.yml) · [提出功能需求](https://github.com/anyingiit/Class2021_2022_1_Java_course/issues/new?template=feature_request.yml)

<details>
  <summary>目录</summary>
  <ol>
    <li><a href="#关于项目">关于项目</a></li>
    <li><a href="#快速开始">快速开始</a></li>
    <li><a href="#使用方法">使用方法</a></li>
    <li><a href="#贡献">贡献</a></li>
    <li><a href="#许可证">许可证</a></li>
    <li><a href="#联系方式">联系方式</a></li>
  </ol>
</details>

## 关于项目

这个仓库是某学期 Java 课程作业的个人存档，课程结束后已归档。`src/` 下每个带日期的文件夹都是一次独立的作业，各自单独编译运行：冒泡排序与快速排序（`src/JClassHomework_21_10_27_8/QuickSort.java`）、继承与简单类层次结构（`src/JClassHomework_21_11_10_H_1/Student.java`）、接口（`src/JClassHomework_21_12_18_1/IPower.java`）、以及异常处理（`src/JClassHomework_21_12_29_1/ExcepitionTest.java`），另外还有一个控制台计算器（`src/S2_6/ConsoleCal.java`）和一个基于 NetBeans 表单构建的 Swing 图形界面计算器（`src/S3_6/CalJFrame.java`、`src/S3_6/JFrameCal.form`）。一份 PlantUML 类图（`src/TestUml/1.puml`）勾勒了一个小型学校管理系统的类层次结构，后面部分作业正是朝这个方向练习的。

仓库里没有 `pom.xml`、`build.gradle` 或其他构建清单：`.vscode/settings.json` 把 `src/` 指定为纯源码目录，交给支持 Java 的编辑器识别，每个练习都应当用 JDK 自带的 `javac` 直接编译。

计划中的功能和已知问题见[未解决的 Issue](https://github.com/anyingiit/Class2021_2022_1_Java_course/issues)。

## 快速开始

### 前置条件

- Git，用于克隆本仓库
- 一套 Java 开发工具包（JDK）；项目没有固定最低版本要求，任何当前的 JDK 都能原样编译这些源码

### 安装

```sh
git clone https://github.com/anyingiit/Class2021_2022_1_Java_course.git
cd Class2021_2022_1_Java_course
javac -d out -encoding UTF-8 $(find src -name '*.java')
```

上面的编译命令会一次性把所有练习编译进 `out/`，目录结构与 `src/` 下的包结构一致。

## 使用方法

编译完成后，通过带包名的类名运行任意一个练习，例如控制台计算器：

```sh
java -cp out S2_6.ConsoleCal
```

或者某个排序练习，它会把输入和输出数组打印到控制台：

```sh
java -cp out JClassHomework_21_10_27_1.Main
```

## 贡献

欢迎任何形式的贡献。请阅读 [CONTRIBUTING.md](CONTRIBUTING.md) 了解如何提交 Issue 或 Pull Request，并阅读 [CODE_OF_CONDUCT.md](CODE_OF_CONDUCT.md) 了解参与者应遵守的行为准则。

请不要在公开的 Issue 或 Pull Request 中报告安全问题。具体的私下报告方式见 [SECURITY.md](SECURITY.md)。

## 许可证

基于 MIT 许可证发布，详见 [LICENSE](LICENSE)。

## 联系方式

项目地址：[https://github.com/anyingiit/Class2021_2022_1_Java_course](https://github.com/anyingiit/Class2021_2022_1_Java_course)

<p align="right">(<a href="#readme-top">回到顶部</a>)</p>
