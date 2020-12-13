## Quarantine App

In order to understand the necessity of this application, you need to know the quarantine situation in Greece during covid-19. Right now, we're not allowed to exit our houses unless we send a text message to a certain number (13033).

The citizen who wishes to exit his/her house must declare in the SMS:

* his/her full name (First name, Last name),
* his/her home address (Road, Address Number, Region)
* the reason for leaving the house

The SMS must be in the form: **X blank NAME HOME_ADDRESS**
where X is the reason for leaving with the number 1, 2, 3, 4, 5, 6 corresponding to the reasons:

1. Go to a pharmacy or visit a doctor if recommended after contact
2. Go to an in-store supply of Food stores and essential goods
3. Go to the bank to the extent that electronic transaction is not possible
4. Move to help elderly / people in need
5. Movement of divorced parents or parents who are in a dimension, that is necessary to ensure communication between parents and children
6. Physical exercise outdoors or movement with a pet individually or in pairs.

After the successful sending of an SMS to 13033, the answer follows: "Move blank X blank name and home address".

In order to make this process easier, I created an app that lets you enter your needed personal information once, and save them in SharedPreferences so that you won't have to re-enter them after the application closes, and lets you choose the reason you want to leave the house by clicking one of the 6 images that illustrate each justified reason. Once you click on the image of your choice, the app takes you directly to the SMS app of your phone with the complete text message to 13033, ready to send.

This app makes it very easy to send these messages to 13033, especially for people who have trouble reading or writing in a mobile phone., since after the first use it only requires you to press 3 buttons in order to text 13033 with the right SMS message. Me and my family already started using it, and it has made our daily routine much easier.

The app is provided in 2 languages, English & Greek, since Greek users would probably prefer the Greek version.
Coded in Java.
