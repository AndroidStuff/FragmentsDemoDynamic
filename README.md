# FragmentsDemoDynamic

## About

This project is about experimenting with Dynamic Fragments in code and application.

## Dynamic Fragments
* Static fragments are fairly simple. Just have the Fragment implementation and add the `<fragment>` element to where you want to have the fragment appear in your activity’s layout. And you're done! For more see [sample project - FragmentsDemoBasics](https://github.com/AndroidStuff/FragmentsDemoBasics)
* With Dynamic fragments you don't use `<fragment>` element in the xml layout. Instead you make use of `FragmentManager` to get `FragmentTransaction` to add the fragment at runtime programmatically.
* Typical code snippet to add a dynamic fragment looks as below:
    ```Java
    if (getFragmentManager().findFragmentById(android.R.id.content) == null) {
        getFragmentManager().beginTransaction()
                            .add(android.R.id.content, new OtherFragment())
                            .commit();        
    }
    ```
* To work with a FragmentTransaction, you need the FragmentManager. This object knows about all of the fragments that exist in your activity.
* Given a FragmentManager, you can start a FragmentTransaction by calling beginTransaction(), which returns the FragmentTransaction object. FragmentTransaction operates on the builder pattern, so most methods on FragmentTransaction return the FragmentTransaction itself, so you can chain a series of method calls one after the next.
* We call two methods on our FragmentTransaction: add()/replace() and commit().


## References
* [Google Docs](http://developer.android.com/training/basics/fragments/fragment-ui.html)
* [Busy Coder's guide to Android Development](https://commonsware.com/Android/) This one is heck of a fantastic resource guide. Get this one for yourself and attain bliss.  