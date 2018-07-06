package com.udacity.gradle.builditbigger;

import android.support.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

import static java.util.concurrent.TimeUnit.SECONDS;
import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertTrue;

public class JokeTaskTest {
    @Rule
    public ActivityTestRule<MainActivity> mainActivityActivityTestRule =
            new ActivityTestRule<>(MainActivity.class);

    @Test
    public void doInBackground() throws InterruptedException, ExecutionException, TimeoutException{
        JokeTask jokeAsyncTask=new JokeTask(mainActivityActivityTestRule.getActivity().getApplicationContext());
        jokeAsyncTask.execute();
        try {
            String result=jokeAsyncTask.get(30, SECONDS);
            assertNotNull(result);
            assertTrue(result.length() > 0);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (TimeoutException e) {
            e.printStackTrace();
        }
    }
}