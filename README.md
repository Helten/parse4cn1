Build Status (master): [![Build Status (master)](https://travis-ci.org/sidiabale/parse4cn1.svg?branch=master)](https://travis-ci.org/sidiabale/parse4cn1)

Build Status (develop): [![Build Status (develop)](https://travis-ci.org/sidiabale/parse4cn1.svg?branch=develop)](https://travis-ci.org/sidiabale/parse4cn1)

# Parse4CN1 - Codename One Library for [Parse](https://parse.com) #

**This library is a port of Parse's [REST API](https://www.parse.com/docs/rest) to [CodenameOne](http://www.codenameone.com/) (and by extension to Java).**

<!-- START doctoc generated TOC please keep comment here to allow auto update -->
<!-- DON'T EDIT THIS SECTION, INSTEAD RE-RUN doctoc TO UPDATE -->


- [Synopsis](#synopsis)
- [License](#license)
- [Requirements](#requirements)
- [Installation](#installation)
- [Coverage](#coverage)
  - [Release Planning](#release-planning)
- [Usage Examples](#usage-examples)
- [Contributing](#contributing)
- [Credits](#credits)

<!-- END doctoc generated TOC please keep comment here to allow auto update -->


## Synopsis ##
The Parse platform provides a complete backend solution for your mobile application. Parse provides a REST API as well as libraries for different mobile platforms like Android and iOS. CodenameOne (CN1 for short) on the other hand is a great framework for cross-platform mobile application development. Although some of the functionality provided by Parse is offered to *paying* CN1 users, integration of third-party libraries is allowed and even encouraged in CN1. This project aims at making the Parse platform available to CN1 apps thereby giving developers more options for cloud-based backend solutions in CN1. In order to maximize platform support, this library aims at implementing the REST API specification rather than, for instance, integrating the existing Parse native libraries for various platforms to achieve the same functionality. Of course, where possible, advanced features that go beyond the REST API (e.g., background operations) will also be supported by this library preferably in a generic manner. Since CN1 is written in Java, this library can also be used in pure Java projects as illustrated [here](https://github.com/sidiabale/parse4cn1/wiki/Usage-Examples#using-parse4cn1-in-a-regular-java-project).

## License ##
Apache License, [Version 2.0](http://www.apache.org/licenses/LICENSE-2.0.html)

## Requirements ##
1. Codename One 1.0 or higher (tested with the CN1 Netbeans plugin but should work with others)
2. CN1JSON library (delivered along with this library for compatibility; see the Installation section below)

## Installation ##
1. Download the dist/parse4cn1.cn1lib and dist/CN1JSON.cn1lib files and copy them into your Codename One Application's "lib" directory.
2. Refresh project libs, if applicable, for the added cn1libs to be picked up (e.g. by right-click on your application's icon in the project explorer, and selecting "Codename One" >> "Refresh cn1lib files" in Netbeans or "CodenameOne" >> "Refresh Libs" in Eclipse).

## Coverage ##
The Parse RESTAPI is quite extensive. As such, we maintain an overview of the functionality that is currently covered. Developers are most welcome to work on pending functionality. Note that some of the functionality marked as pending below may actually be present in the source code inherited from Parse4J. However, the status here reflects what has been tested and verified to work with CN1. Any functionality not marked as implemented below may be used at own risk :)

| API | Status | Remarks 	|
|:-------:	|:-------:	|:-------:	|
| Objects	| IMPLEMENTED | |
| Queries | IMPLEMENTED | |
| Users | IMPLEMENTED | Still pending: (1) Linking users (Facebook, Twitter, etc.) (2) Security (ACLs) |
| Sessions | Pending | |
| Roles | Pending | |
| Files | IMPLEMENTED | |
| Analytics | Pending | |
| Config | IMPLEMENTED | |
| Push Notifications* | IMPLEMENTED| |
| Installations | IMPLEMENTED| |
| Cloud Code | IMPLEMENTED | |
| GeoPoints | IMPLEMENTED | |
\*Advanced feature that cannot be realized using REST API only; involves native code integration. See the CN1 Parse push [guide](https://github.com/sidiabale/parse4cn1/wiki/Push-Notifications-Overview) for more details.

| Advanced Features | Remarks |
|:-------:	|:-------: |
| Serialization	| Realized via CN1's Externalizable interface. See example [here](https://github.com/sidiabale/parse4cn1/wiki/Usage-Examples#serializing-parseobjects) |
| User-defined ParseObject subclasses | See example [here](https://github.com/sidiabale/parse4cn1/wiki/Usage-Examples#registering-custom-sub-classes) |

### Release Planning ###
_Unscheduled_ (read: Feel free to contribute!)
* Analytics
* Roles
* Sessions
* Linking users
* Background operations (e.g. saving, fetching)
* Pinning items (offline mode)
* Expose [cloud modules](https://parse.com/docs/cloudcode/guide#cloud-code-modules) like Twilio and Mailgun via cloud code

## Usage Examples ##
See [Usage examples](https://github.com/sidiabale/parse4cn1/wiki/Usage-Examples)

## Contributing ##
Contributing to this project is most welcome; the more, the merrier! Simply fork the master branch, implement a feature / bug fix and initiate a pull request. Please bear the following in mind though to ensure smooth and timely integration of your changes:

1. The public interface of this API is as much as possible aligned to the [official Parse Android SDK](http://www.parse.com/docs/android/api/index.html?com/). When implementing functionality already present there, please try to use the same method names and structure where possible. This just makes it consistent and easier to follow.

    Of course, there may be cases where you really think a different name for a given functionality or different semantics for the same method name are much better. That's fine. Just try to make the deviations clear in the method documentation, which leads me to the next point.


1. Document at least all public facing methods with comments that add value (not simply boilerplate comments that state the obvious).
1. Write tests for added functionality (see the [test directory](https://github.com/sidiabale/parse4cn1/tree/master/test) for some inspiration if needed).
1. Make sure all tests are passing in both the [Java test application](https://github.com/sidiabale/parse4cn1/tree/master/test/JavaTestApplication) (run on travis) and the [CN1 test app](https://github.com/sidiabale/parse4cn1/tree/master/test/CN1TestApp) before issuing a pull request.

Furthermore, it's handy, at the time you pick up a feature, to mention it so that others can see what's in progress and efforts can be consolidated (there's little or no value in having multiple implementations of the same feature going on in parallel). So update the coverage table above with what you're working on as well as an estimate of when you expect it to be done. If you can't update this page directly, just create a ticket with the information and this page will be updated for you. Thanks!

## Credits ##
1. Thiago Locatelli's [Parse4J](https://github.com/thiagolocatelli/parse4j) project [(version 1.3)](https://github.com/thiagolocatelli/parse4j/releases/tag/parse4j-1.3) from which the initial design and implementation of Parse4CN1 were adapted.
2. Steve Hannah's [CN1JSON library](https://github.com/shannah/CN1JSON).
