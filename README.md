# NewPipe-UITests 

This repository contains UI Tests for NewPipe Android App using Appium with Java.

## Getting Started

These instructions will get you a copy of the project up and running on your local machine.

## Installation

### Fork

- Fork this repo to your github account using https://github.com/ArunSelvam11/NewPipe-UITests.git

### Clone

- Clone the forked repo to your local machine

### Setup

> install the maven package, if not installed already on your local machine

```shell
$ brew install maven
```

## Desired Capabilities

Before running the test, set your device's DesiredCapabilities accordingly in the TestBase.

```
* src\main\java\base\TestBase.java

* DEVICE_NAME
* UDID 
* PLATFORM_VERSION
```

Then install the NewPipe Android app in your android device from [NewPipe](https://github.com/TeamNewPipe/NewPipe/releases)

## Running the tests

To run the test 

```
$ cd path/to/your/project
$ mvn clean test 
```

## Contributing

Your contributions are always welcome! Please have a look at the [contribution guidelines](CONTRIBUTING.md) first. :tada:
