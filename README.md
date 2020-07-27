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
src\main\java\base\TestBase.java

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

## License
[![GNU GPLv3 Image](https://www.gnu.org/graphics/gplv3-127x51.png)](http://www.gnu.org/licenses/gpl-3.0.en.html)  

NewPipe-UITests is Free Software Test repo for NewPipe: You can use, study share and improve it at your
will. Specifically you can redistribute and/or modify it under the terms of the
[GNU General Public License](https://www.gnu.org/licenses/gpl.html) as
published by the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.  