package com.example.mkmk_otohime.test;

import com.example.mkmk_otohime.MainActivity;
import com.example.mkmk_otohime.R;
import android.test.ActivityInstrumentationTestCase2;
import static com.google.android.apps.common.testing.ui.espresso.Espresso.onData;  
import static com.google.android.apps.common.testing.ui.espresso.Espresso.onView;  
import static com.google.android.apps.common.testing.ui.espresso.Espresso.pressBack;  
import static com.google.android.apps.common.testing.ui.espresso.action.ViewActions.click;  
import static com.google.android.apps.common.testing.ui.espresso.action.ViewActions.closeSoftKeyboard;  
import static com.google.android.apps.common.testing.ui.espresso.action.ViewActions.typeText;  
import static com.google.android.apps.common.testing.ui.espresso.assertion.ViewAssertions.matches;  
import static com.google.android.apps.common.testing.ui.espresso.matcher.ViewMatchers.withId;  
import static com.google.android.apps.common.testing.ui.espresso.matcher.ViewMatchers.withText;  
import static org.hamcrest.Matchers.allOf;  
import static org.hamcrest.Matchers.containsString;  
import static org.hamcrest.Matchers.instanceOf;  
import static org.hamcrest.Matchers.is;  

public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity> {

	public MainActivityTest(Class<MainActivity> activityClass) {
		super(activityClass);
	}

	public MainActivityTest() {
		super(MainActivity.class);
	}

	@Override  
    public void setUp() throws Exception {  
        super.setUp();  
        // Espresso will not launch our activity for us, we must launch it via  
        // getActivity().  
        getActivity();  
    }  
    public void testdisplayName() {  
        // TextViewにメッセージが表示されるかチェック  
        onView(withId(R.id.textView1)).check(matches(withText("OTOHIME")));  
    }  

}
