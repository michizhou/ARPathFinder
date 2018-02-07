# ARPathFinder

![alt-text](https://challengepost-s3-challengepost.netdna-ssl.com/photos/production/software_photos/000/589/896/datas/gallery.jpg)

Inspiration

After arriving for PennApps, two of our team members found themselves wandering around Philadelphia and the UPenn Campus for over an hour. This was due to the often confusing nature of navigation in both Apple and Google which can confuse users as to which street they are supposed to turn onto or which direction they are facing. Our app improves these difficulties by providing a simpler and more intuitive navigation interface.

Application Function and Profile

We designed an Android application that routes users to a destination. However, unlike most mapping and navigation applications, after finding directions, users have the option to view their route in AR. This shows the route augmented on the roads using blue dots. This makes navigation simpler, especially for users that have difficulty interpreting maps. Instead, all they have to do is follow the trail of blue dots.
The mapping and routing portion of the application was built using the Google Maps API. We used ARCore, an augmented reality framework for Android by Google that is currently in developer preview for augmenting the route.

![alt-text-1](https://challengepost-s3-challengepost.netdna-ssl.com/photos/production/software_photos/000/589/897/datas/gallery.jpg)

Technical Challenges

This was an ambitious project that had a long series of roadblocks we had to surmount. Recreating a Google Maps type app was very time consuming and we spent hours troubleshooting authentication issues. The hardest part was properly rendering the dots. No one on our team had any graphics experience, so much time was spent learning the various coordinate systems, matrices, and their transformations involved in rendering objects in OpenGL. There was also the issue of rendering the dots in the proper location so they appear on the street. While we made progress on this issue, it could still use more work. This is due to the imprecise nature of GPS and compass on smartphones.

Most Notable Accomplishments

It was quite satisfying to see the visuals of our app improve as we learned OpenGL. Our team celebrated every time we managed to achieve another step in rendering the overly. We are also proud of the clean interface and user interface design.
Bringing it all together, integration was definitely a big milestone for the team as we all came from different backgrounds and only familiarized ourselves with each other a few days ago after meeting online last week. Furthermore considering our different skill sets, we are proud of the level of cohesion our team had.

![alt-text-2](https://challengepost-s3-challengepost.netdna-ssl.com/photos/production/software_photos/000/589/898/datas/gallery.jpg)

Lessons Learned

During the course of 36 hours, our team has grown from vague acquaintances to close friends who will continue to connect with each other in the future. We have learned immensely in the technical sense from each other. Exchange of information between our team members has led into us teaching each other about GitHub, Google APIs, ARCore, OpenGL, Blender and other technologies we were previously unfamiliar to. Having complementaryskill sets, we were able to fill in the gaps in each other's knowledge. We learned how to display markers on a map, generating objects, and about obj files and the principle of how they are used to 3D model in the AR scene. We gained an enhanced understanding of listeners from Stack Overflow, and truly furthered our technical and general knowledge.

Future Work and Next Steps

As the Augmented and Virtual Reality scene is very new in modern development, and in a largely experimental phase, our work is far from over. Our journey through this technology has made us realize how lacking this area is of good libraries and easily accessible methods. We would like to continue development on this and improve placement of the route overlay, by combining location information, compass, accelerometer, and information from the camera to have more precise tracking of moment through space and better overlay placement.

![alt text](https://challengepost-s3-challengepost.netdna-ssl.com/photos/production/software_photos/000/589/895/datas/gallery.jpg)
