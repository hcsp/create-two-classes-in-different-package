package com.github.hcsp;

import com.github.hcsp.pet2.Cat;
import org.junit.jupiter.api.Test;

public class HomeTest {
    @Test
    public void homeHasCatAndDog() {
        Home home = new Home();
        home.cat1 = new Cat();
        home.cat2 = new Cat();
    }
}
