# RootsnBlues on Google Cloud

## Setup Instructions

1. Clone the repository.
2. Open Android Studio. Choose "Open an Existing Android Studio Project".
3. Navigate to the download location of the repository, and open it in Android Studio. The project is ready to be built.
4. Press 'Make Project' (or press Command-F9) and the project will be built. You can now run it locally or deploy it on a server.


### Running the server locally

1. Next to the 'make project' button, there is a dropdown arrow for selecting build targets. Select the 'backend' one, and press the run button like you would with any Android project.
2. A local server will run on http://localhost:8080/ with local Datastore running. Go to http://localhost:8080/_ah/admin/datastore? to see the datastore.


### Hosting the server

1. In Android Studio, go to the 'Build' menu, then click 'Deploy Module to App Engine...', and you'll either get a menu for deploying, or a screen for logging in. Simply press 'Deploy' (if you're logged in) and you'll have released a new build of the server!


## More Resources
Keep in mind that we're using HTTP/REST, not the provided object serialization, when reading these resources.

* https://cloud.google.com/appengine/docs/java/endpoints/annotations
* https://cloud.google.com/appengine/docs/java/endpoints/getstarted/backend/code_walkthrough
* https://cloud.google.com/appengine/docs/java/endpoints/
