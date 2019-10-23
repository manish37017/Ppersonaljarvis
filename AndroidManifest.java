<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    package="com.ideotic.edioticideas.personaljarvis">

    <uses-permission android:name="com.android.alarm.permission.SET_ALARM" />
    <uses-permission android:name="android.permission.INTERNET" />
    <uses-permission android:name="android.permission.ACCESS_NETWORK_STATE" />
    <uses-permission android:name="android.permission.GET_ACCOUNTS" />
    <uses-permission android:name="android.permission.READ_SMS" />
    <uses-permission android:name="android.permission.READ_CALL_LOG" />
    <uses-permission android:name="android.permission.CALL_PHONE" />
    <uses-permission android:name="android.permission.READ_CONTACTS" />
    <uses-permission android:name="android.permission.SEND_SMS" />
    <uses-permission android:name="android.permission.ACCESS_FINE_LOCATION" />
    <uses-permission android:name="android.permission.ACCESS_COARSE_LOCATION" />
    <uses-permission android:name="android.permission.READ_EXTERNAL_STORAGE" />


    <application
        android:allowBackup="true"
        android:icon="@drawable/personaljarvislogo"
        android:label="@string/app_name"
        android:name="android.support.multidex.MultiDexApplication"
        android:supportsRtl="true"
        android:theme="@style/AppTheme">
        //Splash Screen
        <activity
            android:name=".Splash"
            android:label="@string/app_name"
            android:screenOrientation="portrait"
            android:theme="@android:style/Theme.Black.NoTitleBar">
            <intent-filter>
                <action android:name="android.intent.action.MAIN" />

                <category android:name="android.intent.category.LAUNCHER" />
            </intent-filter>
        </activity>
        //Needs Activity
        <activity
            android:name=".Needs"
            android:label="Registration"
            android:screenOrientation="portrait" />

        //Main Activity
        <activity
            android:name=".MainActivity"
            android:screenOrientation="portrait" />

        //Gmail Module
        <activity
            android:name=".GmailModule"
            android:screenOrientation="portrait" />

        //Compose Mail
        <activity
            android:name=".ComposeMail"
            android:label="Mail"
            android:screenOrientation="portrait" />

        //Phone Module
        <activity
            android:name=".PhoneModule"
            android:screenOrientation="portrait" />

        //Reminder Module
        <activity
            android:name=".ReminderModule"
            android:screenOrientation="portrait" />
        <receiver android:name=".AlarmReciver" />

        //Map Module
        <activity
            android:name=".MapModule"
            android:screenOrientation="portrait" />
        <activity
            android:name=".myClass"
            android:screenOrientation="portrait" />
        <!--
             The API key for Google Maps-based APIs is defined as a string resource.
             (See the file "res/values/google_maps_api.xml").
             Note that the API key is linked to the encryption key used to sign the APK.
             You need a different API key for each encryption key, including the release key that is used to
             sign the APK for publishing.
             You can define the keys for the debug and release targets in src/debug/ and src/release/.
        -->
        <meta-data
            android:name="com.google.android.geo.API_KEY"
            android:value="@string/google_maps_key" />
        <meta-data
            android:name="preloaded_fonts"
            android:resource="@array/preloaded_fonts" />

        //Note Module
        <activity
            android:name=".NoteModule"
            android:screenOrientation="portrait" />

        <activity
            android:name=".NoteModule2"
            android:label="@string/title_activity_main2"
            android:screenOrientation="portrait" />

        //Music Module
        <activity
            android:name=".Music"
            android:screenOrientation="portrait" />


    </application>

</manifest>