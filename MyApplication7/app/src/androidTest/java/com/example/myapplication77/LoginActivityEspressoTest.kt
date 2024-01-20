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
class LoginActivityEspressoTest {

    @Rule
    @JvmField
    var mActivityScenarioRule = ActivityScenarioRule(LoginActivity::class.java)

    @Test
    fun loginActivityEspressoTest() {
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
        appCompatImageView3.perform(click())

        val appCompatImageView4 = onView(
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
        appCompatImageView4.perform(click())

        val appCompatImageView5 = onView(
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
        appCompatImageView5.perform(click())

        val appCompatImageView6 = onView(
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
        appCompatImageView6.perform(click())

        val bottomNavigationItemView2 = onView(
            allOf(
                withId(R.id.home), withContentDescription("Waterfalls"),
                childAtPosition(
                    childAtPosition(
                        withId(R.id.bottomNavigationView),
                        0
                    ),
                    0
                ),
                isDisplayed()
            )
        )
        bottomNavigationItemView2.perform(click())

        val bottomNavigationItemView3 = onView(
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
        bottomNavigationItemView3.perform(click())

        val appCompatImageView7 = onView(
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
        appCompatImageView7.perform(click())

        val appCompatImageView8 = onView(
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
        appCompatImageView8.perform(click())

        val appCompatImageView9 = onView(
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
        appCompatImageView9.perform(click())

        val appCompatImageView10 = onView(
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
        appCompatImageView10.perform(click())

        val appCompatImageView11 = onView(
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
        appCompatImageView11.perform(click())

        val appCompatImageView12 = onView(
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
        appCompatImageView12.perform(click())

        val appCompatImageView13 = onView(
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
        appCompatImageView13.perform(click())

        val bottomNavigationItemView4 = onView(
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
        bottomNavigationItemView4.perform(click())
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
