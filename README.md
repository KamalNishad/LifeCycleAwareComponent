# LifeCycleAwareComponent

Handling Lifecycles with Lifecycle-Aware Components   

Lifecycle-aware components perform actions in response to a change in the lifecycle status of another component, such as activities and fragments. 
These components help you produce better-organized,and often lighter-weight code, that is easier to maintain.

A common pattern is to implement the actions of the dependent components in the lifecycle methods of activities and fragments. However, 
this pattern leads to a poor organization of the code and to the proliferation of errors. 
By using lifecycle-aware components,you can move the code of dependent components out of the lifecycle methods and into the components themselves.

The androidx.lifecycle package provides classes and interfaces that let you build lifecycle-aware components—which are components that can automatically adjust their behavior based on the current lifecycle state of an activity or fragment.

There are two types of lifecycle aware components:
1) Lifecycle Owner
2) Lifecycle Observer


LifecycleOwner(Lifecycle owner are activities, fragment.)

LifecycleOwner is a single method interface that denotes that the class has a Lifecycle. It has one method, getLifecycle(), which must be implemented by the class. If you're trying to manage the lifecycle of a whole application process instead, see ProcessLifecycleOwner.
This interface abstracts the ownership of a Lifecycle from individual classes, such as Fragment and AppCompatActivity, and allows writing components that work with them. Any custom application class can implement the LifecycleOwner interface.
Components that implement DefaultLifecycleObserver work seamlessly with components that implement LifecycleOwner because an owner can provide a lifecycle, which an observer can register to watch.
For the location tracking example, we can make the MyLocationListener class implement DefaultLifecycleObserver and then initialize it with the activity's Lifecycle in the onCreate() method. This allows the MyLocationListener class to be self-sufficient, meaning that the logic to react to changes in lifecycle status is declared in MyLocationListener instead of the activity. Having the individual components store their own logic makes the activities and fragments logic easier to manage.

Lifecycle Observer

Lifecycle Observer will observe the state of activities and fragments.
