package com.javafortesters.chap014JUnitExplored;

import com.javafortesters.domainentities.User;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

/**
 * Created by jss on 13-2-16.
 */
public class AssertsTest {
    @Test
    public void allAssertsFromTheList(){
        User user_a = new User();
        User user_b = new User();

        User userArray1[] = new User[] {user_a, user_b};
        User userArray2[] = new User[] {user_a, user_b};

        assertEquals("bob", "bob");
        assertFalse(1 == 2);
        assertTrue(1 == 1);
        assertArrayEquals(userArray1, userArray2);
        assertNotNull(5);
        assertNotSame(user_a, user_b);
        assertNull(null);
        assertSame(user_a, user_a);
    }

        @Test
        public void allAssertsThatsFromTheList(){
            User user_a = new User();
            User user_b = new User();

            User userArray1[] = new User[] {user_a, user_b};
            User userArray2[] = new User[] {user_a, user_b};

            assertThat("bob", is("bob"));
            assertThat(1 == 2, is(false));
            assertThat(1 == 1, is(true));
            assertThat(userArray1, equalTo(userArray2));
            assertThat(5, is(not(nullValue())));
            assertThat(user_a, not(equalTo(user_b)));
            assertThat(null, is(nullValue()));
            assertThat(user_a, equalTo(user_a));
        }

    @Test
    public void moreHamcrest(){
        String bob = "bob";

        assertThat("bladibobida", containsString(bob));
        assertThat(bob, endsWith("ob"));
        assertThat(bob, startsWith("bo"));
    }
}
