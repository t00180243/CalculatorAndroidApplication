package devops.aoifehorgan.me.calculatorandroidapplication;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)

public class CalcInstrumentedTest {

    @Test
    public void useAppContext() throws Exception {



    }

    @Rule
    public ActivityTestRule<CalcActivity> mActivityRule =
            new ActivityTestRule<>(CalcActivity.class);

    @Test
    public void testAddition() {
        // Type text and then press the button.
        onView(withId(R.id.button2)).perform(click());
        onView(withId(R.id.buttonAdd)).perform(click());
        onView(withId(R.id.button2)).perform(click());
        onView(withId(R.id.textViewAns)).check(matches(withText("2+2")));
        onView(withId(R.id.buttonEql)).perform(click());
        onView(withId(R.id.textViewAns)).check(matches(withText("4")));
    }

    @Test
    public void testSubtraction() {
        // Type text and then press the button.
        onView(withId(R.id.button6)).perform(click());
        onView(withId(R.id.buttonSub)).perform(click());
        onView(withId(R.id.button1)).perform(click());
        onView(withId(R.id.textViewAns)).check(matches(withText("6-1")));
        onView(withId(R.id.buttonEql)).perform(click());
        onView(withId(R.id.textViewAns)).check(matches(withText("5")));
    }


    @Test
    public void testMultiply() {
        // Type text and then press the button.
        onView(withId(R.id.button3)).perform(click());
        onView(withId(R.id.buttonMul)).perform(click());
        onView(withId(R.id.button1)).perform(click());
        onView(withId(R.id.textViewAns)).check(matches(withText("3x1")));
        onView(withId(R.id.buttonEql)).perform(click());
        onView(withId(R.id.textViewAns)).check(matches(withText("3")));
    }

    @Test
    public void testDivision() {
        // Type text and then press the button.
        onView(withId(R.id.button8)).perform(click());
        onView(withId(R.id.buttonDiv)).perform(click());
        onView(withId(R.id.button4)).perform(click());
        onView(withId(R.id.textViewAns)).check(matches(withText("8/4")));
        onView(withId(R.id.buttonEql)).perform(click());
        onView(withId(R.id.textViewAns)).check(matches(withText("2")));
    }

}


