package com.example.lesson6;

import android.content.Context;

import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {

    @Rule
    public ActivityScenarioRule<MainActivity> activityRule =
            new ActivityScenarioRule<>(MainActivity.class);

    @Test
    public void addTest() {
        onView(withId(R.id.first_number)).perform(typeText("3"));
        onView(withId(R.id.second_number)).perform(typeText("3"));
        onView(withId(R.id.addition)).perform(click());
        onView(withId(R.id.result)).check(matches(withText("6")));
    }

    @Test
    public void subTest() {
        onView(withId(R.id.first_number)).perform(typeText("8"));
        onView(withId(R.id.second_number)).perform(typeText("2"));
        onView(withId(R.id.subtraction)).perform(click());
        onView(withId(R.id.result)).check(matches(withText("6")));
    }

    @Test
    public void multiTest() {
        onView(withId(R.id.first_number)).perform(typeText("2"));
        onView(withId(R.id.second_number)).perform(typeText("3"));
        onView(withId(R.id.multiply)).perform(click());
        onView(withId(R.id.result)).check(matches(withText("6")));
    }

    @Test
    public void divTest() {
        onView(withId(R.id.first_number)).perform(typeText("18"));
        onView(withId(R.id.second_number)).perform(typeText("3"));
        onView(withId(R.id.division)).perform(click());
        onView(withId(R.id.result)).check(matches(withText("6")));
    }
}