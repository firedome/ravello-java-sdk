# ravello-java-sdk

Implementation of [Oracle Ravello Rest API](https://www.ravellosystems.com/ravello-api-doc/) in Java

## Usage
Add to you gradle dependencies:
```gradle
compile group: 'com.firedome', name: 'ravello-java-sdk', version: '0.0.1-SNAPSHOT'
```
Init the `RavelloClient`:
```java
RavelloClient client = new RavelloClient(new RavelloConfig("username","password"));
```

## Build
```bash
gradlew build publishToMavenLocal
```

## Endpoints implemented
### Applications
* [Get Application](https://www.ravellosystems.com/ravello-api-doc/#get-application)
* [Publish Application](https://www.ravellosystems.com/ravello-api-doc/#publish-application)
* [Create Application](https://www.ravellosystems.com/ravello-api-doc/#create-application)
* [Execute Application Action](https://www.ravellosystems.com/ravello-api-doc/#execute-application-action)
* [Set Application Expiration Time](https://www.ravellosystems.com/ravello-api-doc/#set-application-expiration-time)
* [Get VM](https://www.ravellosystems.com/ravello-api-doc/#get-vm)
* [Update VM](https://www.ravellosystems.com/ravello-api-doc/#update-vm)
* [Execute Single VM Action](https://www.ravellosystems.com/ravello-api-doc/#execute-single-vm-action)
### Blueprints
* [Get Blueprints List](https://www.ravellosystems.com/ravello-api-doc/#get-blueprints-list)
* [Create Blueprint](https://www.ravellosystems.com/ravello-api-doc/#create-blueprint)
### Images
* [Get Images List](https://www.ravellosystems.com/ravello-api-doc/#get-images-list)
* [Get Image](https://www.ravellosystems.com/ravello-api-doc/#get-image)
* [Delete Image](https://www.ravellosystems.com/ravello-api-doc/#delete-image)
