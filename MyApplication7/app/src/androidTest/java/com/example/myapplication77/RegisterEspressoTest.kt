package com.example.myapplication77


import android.view.View
import android.view.ViewGroup
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import org.hamcrest.Description
import org.hamcrest.Matcher
import org.hamcrest.Matchers.allOf
import org.hamcrest.TypeSafeMatcher
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@LargeTest
@RunWith(AndroidJUnit4::class)
class RegisterEspressoTest {

    @Rule
    @JvmField
    var mActivityScenarioRule = ActivityScenarioRule(LoginActivity::class.java)

    @Test
    fun registerEspressoTest() {
        val materialTextView = onView(
            allOf(
                withId(R.id.textView), withText("Don't have account? Register here"),
                childAtPosition(
                    childAtPosition(
                        withId(android.R.id.content),
                        0
                    ),
                    4
                ),
                isDisplayed()
            )
        )
        materialTextView.perform(click())

        val appCompatEditText = onView(
            allOf(
                withId(R.id.editTextTextEmailAddress),
                childAtPosition(
                    childAtPosition(
                        withId(android.R.id.content),
                        0
                    ),
                    0
                ),
                isDisplayed()
            )
        )
        appCompatEditText.perform(replaceText("veka@gmail.com"), closeSoftKeyboard())

        val appCompatEditText2 = onView(
            allOf(
                withId(R.id.editTextTextPassword),
                childAtPosition(
                    childAtPosition(
                        withId(android.R.id.content),
                        0
                    ),
                    1
                ),
                isDisplayed()
            )
        )
        appCompatEditText2.perform(replaceText("veka123"), closeSoftKeyboard())

        val appCompatEditText3 = onView(
            allOf(
                withId(R.id.editTextTextPassword2),
                childAtPosition(
                    childAtPosition(
                        withId(android.R.id.content),
                        0
                    ),
                    2
                ),
                isDisplayed()
            )
        )
        appCompatEditText3.perform(replaceText("veka123"), closeSoftKeyboard())

        val appCompatEditText4 = onView(
            allOf(
                withId(R.id.editTextTextEmailAddress),
                childAtPosition(
                    childAtPosition(
                        withId(android.R.id.content),
                        0
                    ),
                    0
                ),
                isDisplayed()
            )
        )
        appCompatEditText4.perform(replaceText("veka@gmail.com"), closeSoftKeyboard())

        val appCompatEditText5 = onView(
            allOf(
                withId(R.id.editTextTextPassword),
                childAtPosition(
                    childAtPosition(
                        withId(android.R.id.content),
                        0
                    ),
                    1
                ),
                isDisplayed()
            )
        )
        appCompatEditText5.perform(replaceText("veka123"), closeSoftKeyboard())

        val bottomNavigationItemView = onView(
            allOf(
                withId(R.id.profile), withContentDescription("App Info"),
                childAtPosition(
                    childAtPosition(
                        withId(R.id.bottomNavigationView),
                        0
                    ),
                    1
                ),
                isDisplayed()
            )
        )
        bottomNavigationItemView.perform(click())

        val appCompatImageView = onView(
            allOf(
                withId(R.id.img_usa), withContentDescription("Language change icon for English"),
                childAtPosition(
                    allOf(
                        withId(R.id.app),
                        childAtPosition(
                            withId(R.id.frame_layout),
                            0
                        )
                    ),
                    1
                ),
                isDisplayed()
            )
        )
        appCompatImageView.perform(click())

        val appCompatImageView2 = onView(
            allOf(
                withId(R.id.img_srb), withContentDescription("Language change icon for Serbian"),
                childAtPosition(
                    allOf(
                        withId(R.id.app),
                        childAtPosition(
                            withId(R.id.frame_layout),
                            0
                        )
                    ),
                    0
                ),
                isDisplayed()
            )
        )
        appCompatImageView2.perform(click())

        val appCompatImageView3 = onView(
            allOf(
                withId(R.id.img_srb), withContentDescription("Language change icon for Serbian"),
                childAtPosition(
                    allOf(
                        withId(R.id.app),
                        childAtPosition(
                            withId(R.id.frame_layout),
                            0
                        )
                    ),
                    0
                ),
                isDisplayed()
            )
        )
        appCompatImageView3.perform(click())

        val appCompatImageView4 = onView(
            allOf(
                withId(R.id.img_usa), withContentDescription("Language change icon for English"),
                childAtPosition(
                    allOf(
                        withId(R.id.app),
                        childAtPosition(
                            withId(R.id.frame_layout),
                            0
                        )
                    ),
                    1
                ),
                isDisplayed()
            )
        )
        appCompatImageView4.perform(click())

        val appCompatImageView5 = onView(
            allOf(
                withId(R.id.img_srb), withContentDescription("Language change icon for Serbian"),
                childAtPosition(
                    allOf(
                        withId(R.id.app),
                        childAtPosition(
                            withId(R.id.frame_layout),
                            0
                        )
                    ),
                    0
                ),
                isDisplayed()
            )
        )
        appCompatImageView5.perform(click())

        val bottomNavigationItemView2 = onView(
            allOf(
                withId(R.id.logout), withContentDescription("Log Out"),
                childAtPosition(
                    childAtPosition(
                        withId(R.id.bottomNavigationView),
                        0
                    ),
                    2
                ),
                isDisplayed()
            )
        )
        bottomNavigationItemView2.perform(click())

        val materialTextView2 = onView(
            allOf(
                withId(R.id.textView), withText("Don't have account? Register here"),
                childAtPosition(
                    childAtPosition(
                        withId(android.R.id.content),
                        0
                    ),
                    4
                ),
                isDisplayed()
            )
        )
        materialTextView2.perform(click())
    }

    private fun childAtPosition(
        parentMatcher: Matcher<View>, position: Int
    ): Matcher<View> {

        return object : TypeSafeMatcher<View>() {
            override fun describeTo(description: Description) {
                description.appendText("Child at position $position in parent ")
                parentMatcher.describeTo(description)
            }

            public override fun matchesSafely(view: View): Boolean {
                val parent = view.parent
                return parent is ViewGroup && parentMatcher.matches(parent)
                        && view == parent.getChildAt(position)
            }
        }
    }
}
