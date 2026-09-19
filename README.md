<!-- Source: Best-README-Template BLANK_README (Unlicense) — https://github.com/othneildrew/Best-README-Template -->
<a id="readme-top"></a>

# Class2021_2022_1_Java_course

A personal collection of Java course exercises from 2021–2022 covering sorting algorithms, object-oriented programming, exceptions, and two calculator programs, each compiled directly with javac rather than a build tool.

**English** · [简体中文](README.zh-CN.md)

[![CI](https://github.com/anyingiit/Class2021_2022_1_Java_course/actions/workflows/ci.yml/badge.svg)](https://github.com/anyingiit/Class2021_2022_1_Java_course/actions/workflows/ci.yml)
[![License](https://img.shields.io/github/license/anyingiit/Class2021_2022_1_Java_course)](LICENSE)

[Report a bug](https://github.com/anyingiit/Class2021_2022_1_Java_course/issues/new?template=bug_report.yml) · [Request a feature](https://github.com/anyingiit/Class2021_2022_1_Java_course/issues/new?template=feature_request.yml)

<details>
  <summary>Table of Contents</summary>
  <ol>
    <li><a href="#about-the-project">About The Project</a></li>
    <li><a href="#getting-started">Getting Started</a></li>
    <li><a href="#usage">Usage</a></li>
    <li><a href="#contributing">Contributing</a></li>
    <li><a href="#license">License</a></li>
    <li><a href="#contact">Contact</a></li>
  </ol>
</details>

## About The Project

This repository is a personal record of exercises from a one-semester Java class, archived once the course ended. Each dated folder under `src/` is one independent assignment, compiled and run on its own: bubble and quick sort (`src/JClassHomework_21_10_27_8/QuickSort.java`), inheritance and simple class hierarchies (`src/JClassHomework_21_11_10_H_1/Student.java`), interfaces (`src/JClassHomework_21_12_18_1/IPower.java`), and exception handling (`src/JClassHomework_21_12_29_1/ExcepitionTest.java`), plus a console calculator (`src/S2_6/ConsoleCal.java`) and a Swing GUI calculator built with a NetBeans form (`src/S3_6/CalJFrame.java`, `src/S3_6/JFrameCal.form`). A PlantUML class diagram (`src/TestUml/1.puml`) sketches a small school-management class hierarchy that some of the later exercises build toward.

There is no `pom.xml`, `build.gradle`, or other manifest: `.vscode/settings.json` points a Java-aware editor at `src/` as a plain source root, and every exercise is meant to be compiled with a JDK's own `javac`.

See the [open issues](https://github.com/anyingiit/Class2021_2022_1_Java_course/issues) for planned features and known issues.

## Getting Started

### Prerequisites

- Git, to clone the repository
- A Java Development Kit (JDK); no minimum version is pinned in the project, and any current JDK compiles the sources without changes

### Installation

```sh
git clone https://github.com/anyingiit/Class2021_2022_1_Java_course.git
cd Class2021_2022_1_Java_course
javac -d out -encoding UTF-8 $(find src -name '*.java')
```

The compile step above builds every exercise at once into `out/`, mirroring the
package layout under `src/`.

## Usage

Run any single exercise by its package-qualified class name once it has been
compiled, for example the console calculator:

```sh
java -cp out S2_6.ConsoleCal
```

or a sorting exercise, which prints its input and output arrays to the console:

```sh
java -cp out JClassHomework_21_10_27_1.Main
```

## Contributing

Contributions are welcome. Read [CONTRIBUTING.md](CONTRIBUTING.md) for how to open an issue or a pull request, and [CODE_OF_CONDUCT.md](CODE_OF_CONDUCT.md) for the standards expected of everyone taking part.

Please do not report security issues in public issues or pull requests. [SECURITY.md](SECURITY.md) explains how to report them privately.

## License

Distributed under the MIT License. See [LICENSE](LICENSE) for details.

## Contact

Project link: [https://github.com/anyingiit/Class2021_2022_1_Java_course](https://github.com/anyingiit/Class2021_2022_1_Java_course)

<p align="right">(<a href="#readme-top">back to top</a>)</p>
