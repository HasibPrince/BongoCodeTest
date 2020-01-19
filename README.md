# BongoCodeTest
I have tried to give all answers in a android project.

First test is answered in a file named AnagramChecker.kt.

Second test is answered in a package named vehicle.

Third test is answered in a package named player and composing of the VideoPlayer object has been done in a ViewModel.

# Test 1:
I have tried to solve the problem in two ways. First one i have tried using map, second one using sorting. 
Unit test has been added.

# Test 2
We had a interface called Vehicle. We have to create Two objects, Car And Plane.
Here Two classes, Car And plane are implemented. Both of them implements Vehicle Interface.
To create objects of a particular type, Factory pattern has been introduced. Here the logics of creation of these objects are encapsulated in a class. If we spread the logic of these object creation within the whole projects, and if we need to change the process of object creation, we have to change in whole application. It will make hard to maintain and apply any changes in the code base.

If any extended version of an object is needed to introduce, suppose Car with Ac. We can modify the existing class car to add the ac Support. But it clearly breaks OPEN CLOSED PRINICPLE. Here we can introduce decorator pattern. We can extend existing Car class to implement a Ac supported car. That' what is done here.

Now we can see that the creation of CarWithAc is little bit complex. This complexity is being spreaded in VehicleFactory. To avoid this, building this complex object can be encapulated in a class what is actually Builder pattern.

Unit test has been implemented to test the created objects

# Test 3
We have to create a video player which is capable to play,forward,rewind. To solve this a Player interface can be introduced where play,forward and rewind methods are available. A class called VideoPlayer can be created which will actually implement Player interface. VideoPlayer class can have a MediaPlayer property which will actually control the video depending on calling of methods in Player interface.

Now app is Video Playable. User can watch a video, rewind and forward. MVVM and DI are also introduced. VideoPlayer object has been shifted to ViewModel. ViewModel helps his caller to control the video with this VideoPlayer object. MainActivity has a object of ViewModel. MainActivity controls the video through this viewmodel object.

